
package Figura3D;
import Figura2D.Figura3D;
import java.io.*;

public class PruebaFigura2 {

    public static void main(String[] args)throws IOException {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //variables
       int x,y,z;
       double r,h,a;
       //Variable de referencia
        Figura3D f;
        
       
       //****************************Ingreso de datos solo para Cilindro******************************//
        System.out.println("\n\tCreando Objeto Cilindro "); 
        System.out.print("X: ");
        x=Integer.parseInt(br.readLine());
        System.out.print("Y: ");
        y=Integer.parseInt(br.readLine());
        System.out.print("Z: ");
        z=Integer.parseInt(br.readLine());
        System.out.print("Radio: ");
        r=Double.parseDouble(br.readLine());
        System.out.print("Altura: ");
        h=Double.parseDouble(br.readLine());
        //Crear Objeto Circulo
       Cilindro c1= new Cilindro(x, y, z, r, h);
       f=c1;   //Upcasting
       
       //Mostrardatos de circulo
        System.out.print("\n\tReporte Cilindro"+f.toString());
        //Mostrardatos area y perimetro de circulo
        System.out.print("\nArea: "+f.calcularArea());
        System.out.println("\nVolumen: "+f.calcularVolumen());
       
        //****************************Ingreso de datos solo para Cono******************************//
        System.out.println("\n\tCreando Objeto Cono "); 
        System.out.print("X: ");
        x=Integer.parseInt(br.readLine());
        System.out.print("Y: ");
        y=Integer.parseInt(br.readLine());
        System.out.print("Z: ");
        z=Integer.parseInt(br.readLine());
        System.out.print("Altura: ");
        h=Double.parseDouble(br.readLine());
        System.out.print("Radio: ");
        r=Double.parseDouble(br.readLine());
        System.out.print("Generatriz: ");
        a=Double.parseDouble(br.readLine());
        //Crear Objeto Cono
       Cono cono1= new Cono(x, y, z, h, a, r);
       f=cono1;   //Upcasting
       
       //Mostrardatos de Cono
        System.out.print("\n\tReporte Cono"+f.toString());
        //Mostrardatos area y perimetro de circulo
        System.out.print("\nArea: "+f.calcularArea());
        System.out.println("\nVolumen: "+f.calcularVolumen());
    }
    
}
