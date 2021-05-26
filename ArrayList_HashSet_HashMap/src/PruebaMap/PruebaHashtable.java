package PruebaMap;
import java.util.*;
public class PruebaHashtable {

   
    public static void main(String[] args) {
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("135", "Maria", 20);
        Estudiante oE3 = new Estudiante("156", "Luis", 19); 
        
        Hashtable<String, Estudiante> tablaHash = new Hashtable<String, Estudiante>();
        
        
        tablaHash.put(oE1.getId(), oE1);
        tablaHash.put(oE2.getId(), oE2);
        tablaHash.put(oE3.getId(), oE3);
        
        Enumeration<String> enume=tablaHash.keys();
        
        System.out.println("\nReporte1");
        while (enume.hasMoreElements()==true) {
            String key = enume.nextElement();
            System.out.println("Clave: "+key+ "-> Valor: "+tablaHash.get(key));
        }
        
        System.out.println("\nReporte2");
        Iterator<String> itr = tablaHash.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("Clave: "+key+ "-> Valor: "+tablaHash.get(key));
        }
    }
    
}
