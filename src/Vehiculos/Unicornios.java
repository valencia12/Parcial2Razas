/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Jorge
 */
public class Unicornios implements Vehiculos {

    int vida;
    int velocidad;
    int damage;
    int faseCreo, time;
    int faseEnvio;
    String name;
    
    @Override
    public void CrearVehiculos(String name, int vida, int damage, int faseCreo) {
        this.name = name;
        this.damage = damage;
        this.vida = vida;
        this.faseCreo = faseCreo;
    }

    @Override
    public String getName() {
        return name;
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
        this.vida = vida;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVelocidad(int time) {
        this.time = time;
    }

    
    
}
