package PruebaSet;
import java.util.*;
public class PruebaTreeSet {

    public static void main(String[] args) {
        
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("135", "Maria", 20);
        Estudiante oE3 = new Estudiante("156", "Luis", 19);
        
        TreeSet<Estudiante> tst = new TreeSet<Estudiante>();
        
        tst.add(oE3);
        tst.add(oE1);
        tst.add(oE2);
        tst.add(oE1);
        
        System.out.println("\nReporte1");
        Iterator<Estudiante> itr = tst.iterator();
        while (itr.hasNext()) {
            Estudiante oE = itr.next();
            System.out.println(oE.toString());
        }
        
        System.out.println("\nReporte2");
        for (Estudiante oE : tst) {
            System.out.println(oE.toString());
        }
    }
    
}
