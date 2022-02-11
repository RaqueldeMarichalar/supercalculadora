package com.grupomixto;

public class pentagono {

    private double lado;
    private double tangente = 1.45;

    pentagono(double lado){
        this.lado = lado;
        
    }

    public double area() {
        return (((5 * this.lado) * (this.lado / this.tangente))/2);
    } 
    
}
