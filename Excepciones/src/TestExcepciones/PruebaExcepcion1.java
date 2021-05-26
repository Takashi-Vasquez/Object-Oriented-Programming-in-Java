
package TestExcepciones;

public class PruebaExcepcion1 {

    public static void main(String[] args) {
        
        //Creacion del arreglo
        String docentes[]= new String[5];
        
        //Asignacion de elementos al arreglo
        try {
            docentes[0]="Freddy";
            docentes[1]="Faloly";
            docentes[2]="Johan";
            docentes[3]="Heiner";
            docentes[4]="Segundo";
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error> "+e.getMessage());
        }
        
        
        
        //Reportede elementos del arreglo
        try {
            for (int i = 0; i < docentes.length; i++) {
            System.out.println("["+i+"]: "+docentes[i]);
            }
        } catch (Exception e) {
            System.out.println("Error> "+e.getMessage());
        }
        System.out.println("No hay mas elementos en el arreglo....");
        
    }
    
}
