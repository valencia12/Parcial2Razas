/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import Edificaciones.Edificaciones;

/**
 *
 * @author Jorge
 */
public class Jugadores {
    public static String JugadorUno, JugadorDos;
    boolean flag1 = true;
    boolean flag2 = true;
    int turn;
    public Jugadores(){}

    public boolean isFlag1() {
        return flag1;
    }

    public boolean isFlag2() {
        return flag2;
    }

    public void setFlag1(boolean flag1) {
        this.flag1 = flag1;
    }

    public void setFlag2(boolean flag2) {
        this.flag2 = flag2;
    }

    public static String getJugadorDos() {
        return JugadorDos;
    }

    public static String getJugadorUno() {
        return JugadorUno;
    }

    public static void setJugadorDos(String JugadorDos) {
        Jugadores.JugadorDos = JugadorDos;
    }

    public static void setJugadorUno(String JugadorUno) {
        Jugadores.JugadorUno = JugadorUno;
    }
    
    public Jugadores(String invocador1, String invocador2){
        Jugadores.JugadorUno = invocador1;
        Jugadores.JugadorDos = invocador2;
    }

    String getInvocador1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(Edificaciones AtalayaCentral) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
