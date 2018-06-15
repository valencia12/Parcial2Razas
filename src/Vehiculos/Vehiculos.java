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
public interface Vehiculos {
    void CrearVehiculos(String name,int vida, int damage, int faseCreo);
   String getName();
   int getLifePoints();
   void setLifePoints(int vida);
   int getDamage();
   void setDamage(int damage);
   int getMonedas();
   //Vehiculos
   void setVida(int vida);
   int getVida();
   void setVelocidad(int time);
}
