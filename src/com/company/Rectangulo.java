package com.company;

public class Rectangulo {

    private double ancho = 1.0;
    private double alto = 1.0;

    public  Rectangulo (){
    }
    public  Rectangulo (double an,double al){
        this.ancho = an;
        this.alto = al;
    }

    public double getAncho() { return ancho; }

    public void setAncho(float ancho) { this.ancho = ancho; }

    public double getAlto() { return alto; }

    public void setAlto(double alto) { this.alto = alto; }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
}
