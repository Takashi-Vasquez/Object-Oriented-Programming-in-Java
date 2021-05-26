
package TestExcepciones;

import java.io.*;

public class PruebaExcepcion2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int num,den,pos,N=0;
        char res='N';
        
//        Cantidad de Numeros

            do { 
                try { System.out.print("\nCantidad de Numeros> ");
                    N=Integer.parseInt(br.readLine()); 
                } catch (NumberFormatException e) {
                    System.out.println("Error> "+e.getMessage());
                    System.out.println("Ingrese dato correcto");
               
                }
            } while (N<=0||N>100);
                
           
            
//        Creacion del arreglo
            double numeros[]=new double[N];
        
        
//        Ingreso de datos

        do {try {            
            System.out.println("Ingreso datos");
            System.out.println("--------------");
            
            System.out.print("Numerador: ");
            num=Integer.parseInt(br.readLine());
            
            System.out.print("\nDenominador: ");
            den=Integer.parseInt(br.readLine());
            
            System.out.print("\nPosición: ");
            pos=Integer.parseInt(br.readLine());
       
//        Division de 2 numeros, el resultado se almacena en el arreglo
            numeros[pos]=(double)num/den;

//        Mostrar Resultado
            System.out.print("Resultado: " +numeros[pos]);
            }catch (NumberFormatException | ArithmeticException | IndexOutOfBoundsException e) {
            
                System.out.println("Error> "+e.getMessage());
            }


        
//            Preguntar si desea continuar
            do {                
                System.out.print("\nDesea Continuar S/N?> ");
                res=br.readLine().toUpperCase().charAt(0);
            } while (res!='S'&&res!='N');
        } while (res=='S');
        
//        Reporte del arreglo
        System.out.println("\nReporte datos");
        System.out.println("--------------");
        try {
            for (int i = 0; i < N; i++) {
            System.out.println(numeros[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " +e.getMessage() );
        }
        
    }
    
}
