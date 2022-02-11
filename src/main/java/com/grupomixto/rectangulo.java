package com.grupomixto;

public class rectangulo {

    private double base;
    private double altura;
    
    rectangulo( double base, double altura){
        this.base= base;
        this.altura=altura;
    }
    public double area(){

        return (this.base*this.altura);
    }
    
}
