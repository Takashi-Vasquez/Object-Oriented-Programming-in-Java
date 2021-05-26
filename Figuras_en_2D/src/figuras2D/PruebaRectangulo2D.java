
package figuras2D;
import java.io.*;

public class PruebaRectangulo2D {
static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));  
    public static void main(String[] args)  throws IOException
            
    {
       double x1, y1,x2,y2;
       
       
       System.out.println("PUNTO 1");
       x1=puntoX();
       y1=puntoY();
       Punto2D p1= new Punto2D(x1, y1);
       
       
       System.out.println("PUNTO 2");
       do{
       x2=puntoX();
       }while(x1<x2);
       
       do{
       y2=puntoY();
       }while(y2>y1);
       
       Punto2D p2= new Punto2D(x2, y2);

  
        //Crear Objeto Rectangulo
        Rectangulo2D oR1 = new Rectangulo2D(p1, p2);
    
     //Imprimir los puntos del rectángulo

     System.out.println(""+ oR1.toString() );
    
    //Imprimir el Largo y Ancho
    System.out.println("Largo: "+ oR1.calcularLargo());
    System.out.println("Ancho: "+ oR1.calcularAncho());
    
    //Imprimir el área y el perímetro del rectángulo
     
     System.out.println("Area: " +oR1.calcularArea());
     System.out.println("Perimetro: " +oR1.calcularPerimetro());
     
    //Imprimir la longitud de la diagonal del rectángulo
        System.out.println("Distancia: " + p1.calcularDistancia(p2));
    
     }
    static double puntoX() throws IOException{
        double x;
        System.out.print("Ingrese x: ");
        x= Double.parseDouble(br.readLine());
      
        return x;
     }
       
     
     static double puntoY()throws IOException{
         double y;
        System.out.print("Ingrese y: ");
        y= Double.parseDouble(br.readLine());
       
        return y;
         
     }
       
}
