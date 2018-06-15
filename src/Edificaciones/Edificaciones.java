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
public interface Edificaciones {
   //Edificaciones
   void CreatEdificacion(String Name,int vida, int damage);
   String getName();
   int getLifePoints();
   void setLifePoints(int vida);
   int getDamage();
   void setDamage(int damage);
   int getMonedas();
   //MegaSoldado
   void setVida(int vida);
   int getVida();
   void setVelocidad(int time);
   
   
   
   //Vida
   //Espera
   //Velocidad
   //da;o
   //vida
   //fase en la que se creo
   //fase en la que se envio atacar
}
