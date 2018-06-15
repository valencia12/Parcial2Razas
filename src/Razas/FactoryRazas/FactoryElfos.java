/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas.FactoryRazas;

import Edificaciones.Edificacion;
import Razas.Elfos;
import Razas.Nornas;
import Razas.TorreDeMandoElfo;
import Razas.Valquirias;
import gustavomiranda.sworld.AbstractFactory;

/**
 *
 * @author Jorge
 */
public class FactoryElfos implements AbstractFactory {

    @Override
    public Elfos getElfos(String type) {
        switch(type){
            case "TorreDeControlElfo":
                return new Elfos();
            default:
                System.out.println("Ingrese Algo correcto");
        }
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
    public Edificacion getEdificacion(String type) {
        return null;
    }

    public Elfos getRaza(String torreDeMandoElfo) {
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
