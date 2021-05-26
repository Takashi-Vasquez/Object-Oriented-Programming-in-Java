
package Figura2D;

import Figura2D.Figura2D;

public class Circulo extends Figura2D {
   
    private double radio;
    final double PI= 3.1415;
    
    //Constructor

    public Circulo( int x, int y,double radio) {
        super(x, y);
        this.radio = radio;
    }

    
    
    //get y set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
//    Implementacion de metodos abstractos

    @Override
    public double calcularArea() {
        return Math.pow(this.radio, 2)*this.PI;
    }

    @Override
    public double calcularPerimetro() {
        return this.PI*this.radio*2;
    }
    
//    Metodo toString

    @Override 
    public String toString() {
        return "\nX: " + super.x + "\nY: "+super.y +"\nRadio: " + this.radio ;
    }
    
    
    
    
}
