/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectop2;

/**
 *
 * @author Enriq
 */
public class ProyectoP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrilatero figura;
        figura =  new Trapecio(7, 3, 4);
        System.out.println(figura.getClass());
        System.out.println("Area tarpecio: "+figura.getArea());
        figura = new Rectangulo(7, 3);
        System.out.println(figura.getClass());
        System.out.println("Area rectangulo: "+figura.getArea());
        figura =  new Cuadrado(7);
        System.out.println(figura.getClass());
        System.out.println("Area cuadrado: "+figura.getArea());
    }
    
}
