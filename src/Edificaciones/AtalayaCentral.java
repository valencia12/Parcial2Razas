/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

import java.util.jar.Attributes.Name;

/**
 *
 * @author Jorge
 */
public class AtalayaCentral implements Edificaciones{
    int vida;
    int damage;
    int coins;
    String Name;

    @Override
    public void CreatEdificacion(String name, int vida, int damage) {
        this.Name = name;
        this.damage = damage;
        this.vida = vida;
        
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getLifePoints() {
        return vida;
    }

    @Override
    public void setLifePoints(int vida) {
        this.vida = vida;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getMonedas() {
        return 0;
    }

    @Override
    public void setVida(int vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVelocidad(int time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
