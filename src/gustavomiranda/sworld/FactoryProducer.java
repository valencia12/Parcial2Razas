/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gustavomiranda.sworld;

import Edificaciones.FactoryEdificacion;
import Razas.FactoryRazas.FactoryElfos;
import Razas.FactoryRazas.FactoryNornas;
 
import Razas.FactoryRazas.FactoryValquirias;

/**
 *
 * @author Jorge
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Edificacion":
                return new FactoryEdificacion();
            case "Elfos": 
                return new FactoryElfos();
            case "Nornas":
                return new FactoryNornas();
            case "Valquirias":
                return new FactoryValquirias();
            default:
                
        }
        return null;
    }
}
