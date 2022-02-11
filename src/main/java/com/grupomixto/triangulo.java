package com.grupomixto;

public class triangulo {

    private double base;
    private double altura;
    

    triangulo(double base, double altura){

     this.base=base;
     this.altura=altura;
    }

    public double area(){

    return ((this.base*this.altura)/2);

    }
    
}
