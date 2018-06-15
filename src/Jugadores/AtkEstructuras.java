/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

/**
 *
 * @author Jorge
 */
public class AtkEstructuras {
    private static AtkEstructuras atk;

    public AtkEstructuras() {
    }
    
    public static AtkEstructuras getInstance(){
        if(atk == null){
            atk = new AtkEstructuras();
        }
        return atk;
    }
    public void opcElfos(){
         System.out.println("Que estructura de Elfos desea atacar ");
          System.out.println("1. Atalaya Central");
          System.out.println("2. Atalaya De Profundidad");
          System.out.println("3. Atalaya de Control");
          System.out.println("4. Contructor De vehiculos");
          System.out.println("5. Atalaya de Control");
          System.out.println(". Cancelar Ataque");
          System.out.println(". Salir...");
    }
}
