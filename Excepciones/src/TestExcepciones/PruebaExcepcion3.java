
package TestExcepciones;

import java.io.*;

public class PruebaExcepcion3 {

    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException, FraccionException {
        
        int N=0; //num=Numerador; den=Denominador; pos=Posición
        char res='N';
        double suma[]= new double[50];
        double resta[]= new double[50];
        double multiplicacion[]= new double[50];
        double dividir[]= new double[50];
        double fraccion[]= new double[50];
       
       //        Ingreso de datos
        do {            
            System.out.println("Ingreso datos");
            System.out.println("--------------");
            
            System.out.print("Numerador: ");
            int num=Integer.parseInt(br.readLine());
            
            System.out.print("\nDenominador: ");
            int den=Integer.parseInt(br.readLine());
            
            System.out.print("\nPosición: ");
            int pos=Integer.parseInt(br.readLine());
       
//        Division de 2 numeros, el resultado se almacena en el arreglo
           fraccion[pos]=fracciones(num,den);
           suma[pos]=sumar(num,den);
           resta[pos]=restar(num,den);
           multiplicacion[pos]=multiplicar(num,den);
           dividir[pos]=dividir(num,den);
           
           

//        Mostrar Resultado
            System.out.print("\nResultado suma: " +suma[pos]);
            System.out.print("\nResultado resta: " +resta[pos]);
            System.out.print("\nResultado multiplicacion: " +multiplicacion[pos]);
            System.out.print("\nResultado fraccion: " +fraccion[pos]);
            
           
//            Preguntar si desea continuar
            System.out.print("\nDesea Continuar S/N?> ");
            res=br.readLine().toUpperCase().charAt(0);
        } while (res=='S');
       
       
    }
    static int sumar(int f1,int f2)throws FraccionException{
        return f1+f2;
    }
    static int restar(int f1,int f2)throws FraccionException{
        return f1-f2;
    }
    static int multiplicar(int f1,int f2)throws FraccionException{
        return f1+f2;
    }
    static double dividir(int f1,int f2)throws FraccionException{
        return f1/f2;
    }
    static double fracciones(int f1,int f2)throws FraccionException{
        return f1/f2;
    }
}
