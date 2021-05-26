
package Figura3D;

import Figura2D.Figura3D;

public class Cilindro extends Figura3D{
    
    private double h;

    final double PI= 3.1415;
    
    public Cilindro(int x, int y, int z, double radio, double h) {
        super(x, y, z, radio);
        this.h = h;
        
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return 2*this.PI*super.getRadio()*(super.getRadio()+this.h);
    }

    @Override
    public double calcularVolumen() {
        return this.PI*Math.pow(super.getRadio(), 2)*this.h;
    }

    @Override
    public String toString() {
        return "\nX: " + super.x + "\nY: "+super.y+ "\nZ: "+super.getZ()+  "\naltura: " + h  + "\nradio:" + super.getRadio();
    }
    
    
}
