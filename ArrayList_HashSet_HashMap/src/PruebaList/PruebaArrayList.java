package PruebaList;
import java.util.*;
public class PruebaArrayList {
    public static void main(String[] args) {
        /*ArrayList es una lista de tamaño variable los elementos se almacenan de acuerdo como 
        se ahiga ingresado y puede contener elementos duplicados el primer resultado muestra 
        de tal manera porque se esta imrpimiendo los resultados del arraylist en la posicion 2
        la ventaja de esta coleccion es que es accesible mediante indices en el reporte 1 recorre
        el arraylist mediante metodo que ya viene implementado size(), en el resultado 2 
        
        eñ interator se esta imprimiendo cunado no sabemos q posicion se encuentra 
        
        
        
        */
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("456", "Maria", 20);
        Estudiante oE3 = new Estudiante("879", "Luis", 19);
        
        ArrayList<Estudiante> lista = new ArrayList<Estudiante>();
        
        lista.add(oE1);
        lista.add(oE2);
        lista.add(oE3);
        
        
        Estudiante e;
        e=lista.get(2);
        System.out.println(e.toString());
        
        System.out.println("\nReporte1");
        for (int i = 0; i < lista.size(); i++) {
            Estudiante oE = lista.get(i);
            System.out.println(oE.toString());
        }
        
        System.out.println("\nReporte2");
        for (Estudiante oE: lista) {
            System.out.println(oE.toString());
        }
        
        System.out.println("\nReporte3");
        Iterator<Estudiante> itr= lista.iterator();
        while (itr.hasNext()==true) {
            Estudiante oE = itr.next();
            System.out.println(oE.toString());
        }

    }
}