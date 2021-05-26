
package Figura2D;

import Figura.Figura;

public abstract class Figura3D extends Figura{
    
    private int z;
    private double radio;
    public Figura3D(int x, int y,int z, double radio) {
        super(x, y);
        this.z=z;
        this.radio=radio;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

     public abstract double calcularVolumen();
}
