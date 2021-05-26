
package Figura2D;
import java.io.*;

public class PruebaHerencia {

    public static void main(String[] args)throws IOException {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
       //variables
       int x,y;
       double r;
       
       //****************************Ingreso de datos solo para circulo******************************//
        System.out.println("\nINGRESAR DATOS NUMERICOS");
        System.out.print("\nX: ");
        x=Integer.parseInt(br.readLine());
        System.out.print("\nY: ");
        y=Integer.parseInt(br.readLine());
        System.out.print("\nRadio: ");
        r=Double.parseDouble(br.readLine());
        //Crear Objeto Circulo
       Circulo c1= new Circulo(x, y, r);
       
       //Mostrardatos de circulo
        System.out.println("\n\tDatos Circulo"+c1.toString());
        //Mostrardatos area y perimetro de circulo
        System.out.println("Area: "+c1.calcularArea());
        System.out.println("Permetro: "+c1.calcularPerimetro());
       
       //****************************Ingreso de datos solo para rectangulo******************************//
       //crear Objeto Rectangulo
        Rectangulo r1= new Rectangulo(5, 7, 21, 13);

        //Mostrardatos de rectangulo
        System.out.println("\n\tDatos Rectangulo"+r1);
        //Mostrardatos area y perimetro de rectangulo
        System.out.println("Area: "+r1.calcularArea());
        System.out.println("Permetro: "+r1.calcularPerimetro());
       
        //****************************Ingreso de datos solo para CuadHRedondo******************************//
        //crear Objeto CuadHRedondo
        CuadHRedondo cuad= new CuadHRedondo(5, 7, 2, 20);
        //Mostrardatos de CuadHRedondo
        System.out.println("\n\tDatos Rectangulo"+cuad);
        //Mostrardatos area y perimetro de CuadHRedondo
        System.out.println("Area: "+cuad.calcularArea());
        System.out.println("Permetro: "+cuad.calcularPerimetro());
    }

    
}
