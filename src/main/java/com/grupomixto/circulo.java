package com.grupomixto;

public class circulo {

    private double radio;

    circulo(double radio){
        this.radio = radio;
    }

    public double area() {
        return (Math.PI * Math.pow(this.radio, 2));
    } 
    
    
}
