/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Jorge
 */
public interface Razas {
    //Metodos para las razas
    void Atacar();
    void createTown(int Capacity, int LifePoints);
    void MostrarRecursos();
    void UpgrateTown();
    int getlifePointsTown();
    void setLifePointsTown();
    
    void creaTorreDeMandoElfo(int capacity, int vida);
    void creaTorreDeMandoNornas(int capacity, int vida);
    void creaTorreDeMandoValquirias(int capacity, int vida);
     
    
    
   
}
