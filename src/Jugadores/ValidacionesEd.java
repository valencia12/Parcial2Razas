/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import Edificaciones.Edificacion;
import Edificaciones.Edificaciones;
import gustavomiranda.sworld.AbstractFactory;
import gustavomiranda.sworld.FactoryProducer;

/**
 *
 * @author Jorge
 */
public class ValidacionesEd {
    public ValidacionesEd(){
    }
    
    public boolean ValidacionLfEjercito(){
       AbstractFactory FabricaEdificante;
       FabricaEdificante = FactoryProducer.getFactory("Edificacion");
       Edificaciones Ejercito = FabricaEdificante.getEdificacion("Ejercito");
       
       if(Ejercito.getLifePoints() != 0){
           return false;
       }
       return true;
    }
    
    public boolean ValidacionesLfAtalayaCentral(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones AtalayaCentral = FabricaEdificante.getEdificacion("AtalayaCentral");
        
        if(AtalayaCentral.getLifePoints() != 0){
            return false;
        }
        return true;
    }
    public boolean ValidacionesLfAtalayaDeControl(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones AtalayaDeControl = FabricaEdificante.getEdificacion("AtalayaDeControl");
        
        if(AtalayaDeControl.getLifePoints() != 0){
            return false;
        }
        return true;
        }
    public boolean ValidacionesLfAtalayaDeProfundida(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones AtalayaDeProfundidad = FabricaEdificante.getEdificacion("AtalataDePorundidad");
        
        if(AtalayaDeProfundidad.getLifePoints() != 0){
            return false;
        }
        return true;
    }
    public boolean ValidacionesLfConstructorUnicornios(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones ConstructorUnicornios = FabricaEdificante.getEdificacion("ConstructorUnicornios");
        
        if(ConstructorUnicornios.getLifePoints() != 0){
            return false;
        }
        return true;
    }
    public boolean ValidacionesLfConstructorBrunildas(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones ContructorBrunildas = FabricaEdificante.getEdificacion("ConstructorBrunildas");
        
        if(ContructorBrunildas.getLifePoints()!=0){
            return false;
        }
       return true;
    }
    public boolean ValidacionesLfMegaSoldadoElfo(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones MegaElfo = FabricaEdificante.getEdificacion("MegaElfo");
        
        if(MegaElfo.getLifePoints() != 0){
            return false;
        }
        return true;
    }
    public boolean ValidacionesLfMegaSoldadoNornas(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones MegaNornas = FabricaEdificante.getEdificacion("MegaNornas");
        
        if(MegaNornas.getLifePoints() != 0){
            return false;
        }
        return true;
    }
    public boolean ValidacionesLfMegaSoldadoValquirias(){
        AbstractFactory FabricaEdificante;
        FabricaEdificante = FactoryProducer.getFactory("Edificacion");
        Edificaciones MegaValquiria = FabricaEdificante.getEdificacion("MegaValquiria");
        
        if(MegaValquiria.getLifePoints() != 0){
            return false;
        }
        return true;
    }
 }

