/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import Edificaciones.Edificacion;
import Edificaciones.Edificaciones;
import Razas.Elfos;
import Razas.Nornas;
import Razas.Valquirias;
import gustavomiranda.sworld.AbstractFactory;
import gustavomiranda.sworld.FactoryProducer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 *
 * @author Jorge
 */
public class GetEdificacion {
    ArrayList<Edificacion> Jugador1 = new ArrayList<>();
   private static GetEdificacion  GetEdificacion;

    public GetEdificacion() {
    }
   
    public static GetEdificacion getInstance(){
        if (GetEdificacion == null){
            GetEdificacion = new GetEdificacion();
        }
        return GetEdificacion;
    }
    //Continuando pedir las edificaciones 
    
    public void Opcion(){
       System.out.println("      Edficiaciones que puede crear...   ");
       System.out.println("1. Crear atalaya central");
       System.out.println("2. Crear la atalaya de control");
       System.out.println("3. Crear la atalaya de profundidad");
       System.out.println("4. Crear Automovil para daño");
       System.out.println("5. Crear Automovil para vida");
       System.out.println("6. Crear Escuadron");
       System.out.println("7. Crear el Mega Soldado");
       System.out.println("Crear atalaya central");
    }
    public void RazasDisponibles(){
       System.out.println("       Razas disponibles     ");
       System.out.println("1. Elfos ");
       System.out.println("2. Nornas ");
       System.out.println("3. Valquirias ");
       System.out.println("4. SALIR ");
    }
    public void show(){
        Scanner read = new Scanner(System.in);
        int opc = 15;
        int opcRaza = 100;
        AbstractFactory factoryE, factoryElfo, factoryNornas, factoryValquirias;
        factoryE = FactoryProducer.getFactory("Edificacion");
        factoryElfo = FactoryProducer.getFactory("Elfos");
        factoryNornas = FactoryProducer.getFactory("Nornas");
        factoryValquirias = FactoryProducer.getFactory("Valquirias");
        
        ValidacionesEd life = new ValidacionesEd();
        Jugadores invocador1 = new Jugadores();
        Jugadores invocador2 = new Jugadores();
        
        for(int i=0; i<2; i++){
            RazasDisponibles();
            System.out.println("    Seleccion de raza  ");
            opcRaza = read.nextInt();
            invocador1.isFlag1();
            switch(opcRaza){
                case 1:
                    Elfos TorreDeMandoElfo = factoryElfo.getElfos("TorreDeMandoElfo");
                    TorreDeMandoElfo.creaTorreDeMandoElfo(1500, 3000);
                    if(invocador1.isFlag1()){
                    System.out.println(invocador1.getJugadorUno()+ "Pertenece a la Raza Elfo");
                    System.out.println("Ahora tienes una torre de mando de elfo");
                    invocador1.setFlag1(false);
                    break;
                    }
                    else{
                        System.out.println(invocador2.getJugadorDos()+ "Pertenece a la raza Elfo");
                        System.out.println("Ahora tienes una torre de mando de elfo");
                        break;
                    }
                case 2:
                    Nornas torreDeMandoNornas = factoryNornas.getNornas("TorreDeMandoNornas");
                    torreDeMandoNornas.creaTorreDeMandoNornas(1000, 1000);
                    if(invocador1.isFlag1()){
                        System.out.println("Turno del invocador 1");
                        System.out.print(invocador1.getJugadorUno() + "Pertenece a la raza de Nornas");
                        System.out.print("Ahora tienes una torre de mando de Nornas");
                        invocador1.setFlag1(false);
                        break;
                    }else{
                        System.out.println("Turno del invocador 1");
                        System.out.print(invocador2.getJugadorUno() + "Pertenece a la raza de Nornas");
                        System.out.print("Ahora tienes una torre de mando de Nornas");
                        invocador2.setFlag1(false);
                        break;
                    }
                case 3: 
                    Valquirias torreDeMandoValquirias = factoryValquirias.getValquirias("TorreDeMandoNornas");
                    torreDeMandoValquirias.creaTorreDeMandoValquirias(1000, 1000);
                    if(invocador1.isFlag1()){
                        System.out.println("Turno del invocador 1");
                        System.out.print(invocador1.getJugadorUno() + "Pertenece a la raza de Valquirias");
                        System.out.print("Ahora tienes una torre de mando de Valquirias");
                        invocador1.setFlag1(false);
                        break;
                    }else{
                        System.out.println("Turno del invocador 1");
                        System.out.print(invocador2.getJugadorUno() + "Pertenece a la raza de Valquirias");
                        System.out.print("Ahora tienes una torre de mando de Valquirias");
                        invocador2.setFlag1(false);
                        break;
                    
                    }
                case 4:
                    System.out.print("Sin seleccionar...");
                    System.exit(0);
                default:
                    System.out.println("Selecciona algo please");
                    
            }
        }
        
             
                int flag1 = 0;
                Opcion();
                System.out.println("Que hara?");
                opc = read.nextInt();
                invocador1.isFlag1();
                switch(opc){
                    case 1:
                        Edificaciones AtalayaCentral  = factoryE.getEdificacion("AtalayaCentral");
                        AtalayaCentral.CreatEdificacion("Atalaya Central", 200, 100);
                        
                        if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(AtalayaCentral);
                            invocador2.setFlag2(false);
                            break;
                        }
                        System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador2.add(AtalayaCentral);
                            invocador2.setFlag2(true);
                            break;
                    case 2:
                        Edificaciones AtalayaDeControl  = factoryE.getEdificacion("AtalayaCentral");
                        AtalayaDeControl.CreatEdificacion("Atalaya de Control", 200, 100);
                        if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(AtalayaDeControl);
                            invocador2.setFlag2(false);
                            break;
                        }
                        System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(AtalayaDeControl);
                            invocador2.setFlag2(true);
                            break;
                    case 3:
                        Edificaciones AtalayaDeProfundidad  = factoryE.getEdificacion("Atalaya De Profundidad");
                        AtalayaDeProfundidad.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                        if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(AtalayaDeProfundidad);
                            invocador2.setFlag2(false);
                            break;
                        }
                            System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(AtalayaDeProfundidad);
                            invocador2.setFlag2(true);
                            break;
                     case 4:
                          Edificaciones ConstructorUnicornios  = factoryE.getEdificacion("Atalaya De Profundidad");
                          ConstructorUnicornios.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(ConstructorUnicornios);
                            invocador2.setFlag2(false);
                            break;
                        }
                          System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(ConstructorUnicornios);
                            invocador2.setFlag2(true);
                            break;
                     case 5:
                         Edificaciones ConstructorBrunildas  = factoryE.getEdificacion("Atalaya De Profundidad");
                          ConstructorBrunildas.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(ConstructorBrunildas);
                            invocador2.setFlag2(false);
                            break;
                         }
                          System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(ConstructorBrunildas);
                            invocador2.setFlag2(true);
                            break;
                          
                     case 6:
                         Edificaciones Ejercito  = factoryE.getEdificacion("Atalaya De Profundidad");
                          Ejercito.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(Ejercito);
                            invocador2.setFlag2(false);
                            break;
                          }
                            System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(Ejercito);
                            invocador2.setFlag2(true);
                            break;
                     case 7:
                          Edificaciones MegaElfo  = factoryE.getEdificacion("Atalaya De Profundidad");
                          MegaElfo.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(MegaElfo);
                            invocador2.setFlag2(false);
                            break;
                          }
                            System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(MegaElfo);
                            invocador2.setFlag2(true);
                            break;
                     case 8:
                          Edificaciones MegaNornas  = factoryE.getEdificacion("Atalaya De Profundidad");
                          MegaNornas.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(MegaNornas);
                            invocador2.setFlag2(false);
                            break;
                          }
                            System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(MegaNornas);
                            invocador2.setFlag2(true);
                            break;
                     case 9:
                         Edificaciones Valquirias  = factoryE.getEdificacion("Atalaya De Profundidad");
                          Valquirias.CreatEdificacion("Atalaya De Profundidad", 200, 100);
                          if(invocador2.isFlag1()){
                            System.out.print("Recurso se agregado para: " + invocador1.getInvocador1());
                            invocador1.add(Valquirias);
                            invocador2.setFlag2(false);
                            break;
                          }
                            System.out.print("Recurso se agregado para: " + invocador2.getInvocador1());
                            invocador2.add(Valquirias);
                            invocador2.setFlag2(true);
                            break;
                }
        
    
    
    }
