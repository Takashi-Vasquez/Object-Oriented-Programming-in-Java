
package Figura3D;

import Figura2D.Figura3D;

public class Cono extends Figura3D{
    
    private double h;
    private double a;
    final double PI= 3.1415;

    public Cono( int x, int y, int z, double h, double a, double radio) {
        super(x, y, z, radio);
        this.h = h;
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calcularArea() {
        return PI*super.getRadio()*(a+super.getRadio());
    }
    
    @Override
    public double calcularVolumen() {
        return (PI*Math.pow(super.getRadio(), 2)*h)/3;
    }
 

    @Override
    public String toString() {
        return "\nX: " + super.x + "\nY: "+super.y+"\nZ: "+super.getZ()+ "\naltura: " + h + "\ngeneratriz: " + a + "\nradio:" + super.getRadio();
    }

   
    
    
    
    
}
