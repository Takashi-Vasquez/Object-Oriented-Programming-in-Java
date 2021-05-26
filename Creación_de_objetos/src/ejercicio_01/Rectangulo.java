package ejercicio_01;

public class Rectangulo {
   
    //Atributos -> Variables de instancia
    double largo = 10;
    double ancho = 8;
    
    Rectangulo(){
      largo=0;
      ancho=0;
    }
    
    Rectangulo(double la, double an){
      largo=la;
      ancho=an;
  } 
 //********Constructor con parametros
    double CalcularArea(){
      
   
      return largo*ancho; 

  }
  //*********Metodos Adicionales*************
  double CalcularPerimetro(){

      return (largo+ancho)*2;
  }
  
  String reporte(){
      return "Largo: " +largo+ "  Ancho: " +ancho;
  }
  
}
