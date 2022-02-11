package com.grupomixto;

public class hexagono {

    private double lado;
    final double TANGENTE=0.866;

     hexagono(double lado){
        this.lado=lado;
    }

    public double area(){
    double perimetro=this.perimetro();
    return perimetro*(this.lado*TANGENTE)/2;
    }
    public double perimetro(){
        return(6*this.lado);
    }
}


