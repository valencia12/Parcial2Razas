/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gustavomiranda.sworld;

import Edificaciones.Edificacion;
import Edificaciones.Edificaciones;
import Razas.Elfos;
import Razas.Nornas;
import Razas.Valquirias;

/**
 *
 * @author Jorge
 */
public interface AbstractFactory {
    Elfos getElfos(String type);
    Nornas getNornas(String type);
    Valquirias getValquirias(String type);
    Edificaciones getEdificacion(String type);
    Elfos getRazaElfos(String torreDeMandoElfo);
    Nornas getRazaNornas(String torreDeMandoNornas);
    Valquirias getRazaValquirias(String torreDeMandoValquirias);
    
}
