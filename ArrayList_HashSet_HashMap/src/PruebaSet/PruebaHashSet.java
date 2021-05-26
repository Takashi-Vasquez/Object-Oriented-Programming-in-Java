package PruebaSet;
import java.util.*;
public class PruebaHashSet {

    public static void main(String[] args) {
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("135", "Maria", 20);
        Estudiante oE3 = new Estudiante("156", "Luis", 19); 
        
        HashSet<Estudiante> hst = new HashSet<Estudiante>();
        
        hst.add(oE3);
        hst.add(oE1);
        hst.add(oE2);
        hst.add(oE1);
        
        System.out.println("\nReporte1");
        Iterator<Estudiante> itr = hst.iterator();
        while (itr.hasNext()) {
            Estudiante oE = itr.next();
            System.out.println(oE.toString());
        }
        
        System.out.println("\nReporte2");
        for (Estudiante oE : hst) {
            System.out.println(oE.toString());
        }
    }
    
}
