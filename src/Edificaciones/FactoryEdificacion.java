/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import Razas.Elfos;
import Razas.Nornas;
import Razas.Valquirias;
import gustavomiranda.sworld.AbstractFactory;

/**
 *
 * @author Jorge
 */
public class FactoryEdificacion implements AbstractFactory{

    @Override
    public Elfos getElfos(String type) {
        return null;
    }

    @Override
    public Nornas getNornas(String type) {
        return null;
    }

    @Override
    public Valquirias getValquirias(String type) {
        return null;
    }

    @Override
    public Edificaciones getEdificacion(String type) {
        switch(type){
            case "AtalayaCentral":
                return new AtalayaCentral();
            case "AtalayaDeControl":
                return new AtalayaDeControl();
            case "AtalayaDeProfundidad":
                return new AtalayaDeProfundidad();
            case "AutoMovilDamage":
                return new ConstructorUnicornios();
            case "AutomovilLf":
                return new ContructorBrunildas();
            case "Ejercito":
                return new Ejercito();
            case "MegaElfo":
                return new MegaElfo();
            case "MegaNornas":
                return new MegaNornas();
            case "MegaValquiria":
                return new MegaValquiria();
            default:
                System.out.println("Ingrese algo correcto");
        }//String name, int vida, int damage
        return null;
    }

     

    @Override
    public Elfos getRazaElfos(String torreDeMandoElfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nornas getRazaNornas(String torreDeMandoNornas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Valquirias getRazaValquirias(String torreDeMandoValquirias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
