/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificaciones;

/**
 *
 * @author Jorge
 */
public class MegaValquiria implements Edificaciones {
    int vida;
    int damage;
    String Nombre;
    int time;
    @Override
    public void CreatEdificacion(String Name, int vida, int damage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return Nombre;
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
     //MegaCaballero
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getVida() {
        return damage;
    }

    @Override
    public void setVelocidad(int time) {
        this.time = time;
    }
    
}
