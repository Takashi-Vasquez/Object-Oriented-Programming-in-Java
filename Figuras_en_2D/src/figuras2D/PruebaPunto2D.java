package figuras2D;
import java.io.*;
public class PruebaPunto2D {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));        
        //Variables
        double x, y;
        //1er Obj. Punto
        Punto2D a = new Punto2D(50, 100);
        System.out.println("Punto a: "+ a.toString("a"));
        //2do Obj. Punto
        System.out.print("\n Ingrese la coordenada de punto b \n Ingrese x: ");
        x= Double.parseDouble(br.readLine());
        System.out.print(" Ingrese y: ");
        y= Double.parseDouble(br.readLine());                
        
        Punto2D b = new Punto2D(x, y);
        //Muestra si son iguales o no
        System.out.println( a.comparar2Puntos(b) );
        //Mostrar la distancia entre 2 puntos
        System.out.println("Distancia es:" + a.calcularDistancia(b) );
        
        //Reporte de los 2 puntos
        System.out.println( a.toString("a") );
        System.out.println( b.toString("b") );
        
    }    
}

