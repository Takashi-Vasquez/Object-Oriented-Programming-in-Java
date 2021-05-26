package PruebaMap;
import java.util.*;
public class PruebaTreeMap {

    public static void main(String[] args) {
        
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("135", "Maria", 20);
        Estudiante oE3 = new Estudiante("156", "Luis", 19); 
        
        TreeMap<String, Estudiante> tmp = new TreeMap<String,Estudiante>();
        
        tmp.put(oE1.getId(), oE1);
        tmp.put(oE2.getId(), oE2);
        tmp.put(oE3.getId(), oE3);
        
        System.out.println("\nReporte1");
        Iterator<String> itr = tmp.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("Clave: "+key+ "-> Valor: "+tmp.get(key));
        }
        
        System.out.println("\nReporte2");
        for (String key : tmp.keySet()) {
            System.out.println("Clave: "+key+ "-> Valor: "+tmp.get(key));
        }
    }
    
}
