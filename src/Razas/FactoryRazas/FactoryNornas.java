/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.FactoryRazas;

import Edificaciones.Edificacion;
import Edificaciones.Edificaciones;
import Razas.Elfos;
import Razas.Nornas;
import Razas.Valquirias;
import gustavomiranda.sworld.AbstractFactory;

/**
 *
 * @author Jorge
 */
public class FactoryNornas implements AbstractFactory{

    @Override
    public Elfos getElfos(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Nornas getNornas(String type) {
        switch (type) {
            case "TorreDeControlValquirias":
                return new Nornas();
            default:
                System.out.println("Ingrese algo correcto");
        }
        return null;
    }

    @Override
    public Valquirias getValquirias(String type) {
        return null;
       
        
    }

    @Override
    public Edificaciones getEdificacion(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
