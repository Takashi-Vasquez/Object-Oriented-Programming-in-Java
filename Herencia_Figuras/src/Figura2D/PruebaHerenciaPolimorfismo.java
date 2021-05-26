
package Figura2D;
import java.io.*;

public class PruebaHerenciaPolimorfismo {

    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        //variables
        int x,y;
        double r;
        //Variable de referencia
        Figura2D f;
        
        //****************************Circulo******************************//
        
        Circulo c1= new Circulo(5, 6, 10);
        f=c1;   //Upcasting
        
        //Mostrardatos de circulo
        System.out.println("\n\tDatos Circulo"+f.toString());
        //Mostrardatos area y perimetro de circulo
        System.out.println("Area: "+f.calcularArea());
        System.out.println("Permetro: "+f.calcularPerimetro());
        
        //****************************Rectangulo******************************//
        //crear Objeto Rectangulo
        Rectangulo r1= new Rectangulo(5, 7, 21, 13);
        f=r1; //upcasting
        
        //Mostrardatos de rectangulo
        System.out.println("\n\tDatos Rectangulo"+f);
        //Mostrardatos area y perimetro de rectangulo
        System.out.println("Area: "+f.calcularArea());
        System.out.println("Permetro: "+f.calcularPerimetro());
    }
    
}
