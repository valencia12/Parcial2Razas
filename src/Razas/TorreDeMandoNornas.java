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
public class TorreDeMandoNornas implements Razas {
    int capLeve1;
    int capLeve2;
    int capLeve3;
    int LifePointsNornas;

    public int getCapLeve1() {
        return capLeve1;
    }

    public int getCapLeve2() {
        return capLeve2;
    }

    public int getCapLeve3() {
        return capLeve3;
    }

    public int getLifePointsElfo() {
        return LifePointsNornas;
    }

    public void setCapLeve1(int capLeve1) {
        this.capLeve1 = capLeve1;
    }

    public void setCapLeve2(int capLeve2) {
        this.capLeve2 = capLeve2;
    }

    public void setCapLeve3(int capLeve3) {
        this.capLeve3 = capLeve3;
    }

    public void setLifePointsNornas (int LifePointsNornas) {
        this.LifePointsNornas = LifePointsNornas;
    }

    @Override
    public void Atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createTown(int Capacity, int LifePoints) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MostrarRecursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpgrateTown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getlifePointsTown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLifePointsTown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creaTorreDeMandoElfo(int capacity, int vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void creaTorreDeMandoNornas(int capacity, int vida) {
        System.out.println("La Torre De control Nornas esta creada");  
        this.capLeve1 = capacity;
        this.capLeve2 = capacity;
        this.capLeve3 = capacity;
        this.LifePointsNornas = vida;
    
    }

    @Override
    public void creaTorreDeMandoValquirias(int capacity, int vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
