
package ejercicio_01;

public class Prueba_rectangulo {

  //Metodo principal
    public static void main(String[] args) {
            
         //Crear objetos de la clase Rectangulo
         Rectangulo Obj1 = new Rectangulo(5,10);
         Rectangulo Obj2 = new Rectangulo(20,40);
         Rectangulo Obj3 = new Rectangulo(30,60);
         Rectangulo Obj4 = new Rectangulo();
         
         //****************Creacion de Objetos en dos lineas**************//
            //1.-Declarar un Objeto
                Rectangulo Obj5;

            //2.-Crea un Objeto
            Obj5= new Rectangulo(40, 80);
            
         //Ejemplo de intanciar objetos de forma implicita
            new Rectangulo(50,100);


         //Mostrar Area y Perimetro del Obj(1,2,3,4):
         System.out.println("Reporte Obj1: " +Obj1.reporte());
         System.out.println("Area Obj1: " +Obj1.CalcularArea());
         System.out.println("Perimetro Obj1: " +Obj1.CalcularPerimetro()+"\n");
         
         
         System.out.println("Reporte Obj2: " +Obj2.reporte());
         System.out.println("Area Obj2: " +Obj2.CalcularArea());
         System.out.println("Perimetro Obj2: " +Obj2.CalcularPerimetro()+"\n");
         
         System.out.println("Reporte Obj3: " +Obj3.reporte());
         System.out.println("Area Obj3: " +Obj3.CalcularArea());
         System.out.println("Perimetro Obj3: " +Obj3.CalcularPerimetro()+"\n");
         
         System.out.println("Reporte Obj4: " +Obj4.reporte());
         System.out.println("Area Obj4: " +Obj4.CalcularArea());
         System.out.println("Perimetro Obj4: " +Obj4.CalcularPerimetro()+"\n");
         
    }
    
}
