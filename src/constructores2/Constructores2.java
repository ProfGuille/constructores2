/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores2;


public class Constructores2 {

    
    String nombre;
    String apellido;
    int edad;
    int añonacim;
    String mesdecumpleañ;
    
    
public Constructores2 (String nom, String ap, int ed, int añna, String mecu) {
    
    
        this.nombre = nom;
        this.apellido = ap;
        this.edad= ed;
        this.añonacim= añna;
        this.mesdecumpleañ= mecu;
}

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Los datos relevados son los siguientes: ");
        
        Constructores2 alfa = new Constructores2 ("Pedro","Picapiedra", 41, 1977, "agosto");
        System.out.println(alfa.nombre);
        System.out.println(alfa.apellido);
        System.out.println(alfa.edad);
        System.out.println(alfa.añonacim);
        System.out.println(alfa.mesdecumpleañ);
                
        Constructores2 beta = new Constructores2 ("Pablo", "Mármol", 39, 1979, "julio");
        System.out.println(beta.nombre);
        System.out.println(beta.apellido);
        System.out.println(beta.edad);
        System.out.println(beta.añonacim);
        System.out.println(beta.mesdecumpleañ);
        
        Constructores2 gama = new Constructores2 ("Vilma", "Picapiedra", 30, 1988, "enero");
        System.out.println(gama.nombre);
        System.out.println(gama.apellido);
        System.out.println(gama.edad);
        System.out.println(gama.añonacim);
        System.out.println(gama.mesdecumpleañ);
        
        Constructores2 delta = new Constructores2 ("Betty", "Mármol", 31, 1989, "marzo");
        System.out.println(delta.nombre);
        System.out.println(delta.apellido);
        System.out.println(delta.edad);
        System.out.println(delta.añonacim);
        System.out.println(delta.mesdecumpleañ);
        
        Constructores2 epsilon = new Constructores2 ("Dino", "Saurio", 68, 1950, "octubre");
        System.out.println(epsilon.nombre);
        System.out.println(epsilon.apellido);
        System.out.println(epsilon.edad);
        System.out.println(epsilon.añonacim);
        System.out.println(epsilon.mesdecumpleañ);
        
        
        
        
    }
    
}
