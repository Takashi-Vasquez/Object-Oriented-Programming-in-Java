package Figura2D;

import java.io.*;
public class PruebaPunto2D {

   
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        double x,y;
        
        //1er Obj. Punto con datos predeterminados
        Punto2D a = new Punto2D(50,100);
        
        //2er Obj. Punto(con ingreso de datos)
        System.out.print("Ingrese x: ");
        x=Double.parseDouble(br.readLine());
        
        System.out.print("Ingrese y: ");
        y=Double.parseDouble(br.readLine());
        
        Punto2D b = new Punto2D(x,y); //creando 2do objeto a traves de los datos ingresados
        
        //Muestra si son iguales o no
        System.err.println("Punto a y b "+a.comparar2Puntos(b));
        
        //Mostrar la distancia entre 2 puntos
        System.err.println("Distancia enrte dos puntos es: " + a.calcularDistancia(b));
        
        //Mostrar los dos puntos 
        System.err.println(a.toString("a"));
        System.err.println(b.toString("b"));
    }
    
}
