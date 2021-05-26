package PruebaMap;

import java.util.*;

public class PruebaHashMap {
    public static void main(String[] args) {
        
        Estudiante oE1 = new Estudiante("123", "Pedro", 18);
        Estudiante oE2 = new Estudiante("135", "Maria", 20);
        Estudiante oE3 = new Estudiante("156", "Luis", 19);
        
        HashMap<String, Estudiante> tablahash = new HashMap<String, Estudiante>();
        
        tablahash.put(oE1.getId(), oE1);
        tablahash.put(oE2.getId(), oE2);
        tablahash.put(oE3.getId(), oE3);
        
        System.out.println("\nReporte1");
        Iterator<String> itr = tablahash.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println("Clave: "+key+ "-> Valor: "+tablahash.get(key));
        }
        
        System.out.println("\nReporte2");
        for (String key : tablahash.keySet()) {
            System.out.println("Clave: "+key+ "-> Valor: "+tablahash.get(key));
        }
    }
    
}
