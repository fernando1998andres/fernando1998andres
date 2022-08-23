/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ferna
 */
public class Proroller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persianas per = new Persianas(100, 110, "madera", false);
        System.out.println(per.toString());
        System.out.println(per.calcularPrecio());
    }
    
}
