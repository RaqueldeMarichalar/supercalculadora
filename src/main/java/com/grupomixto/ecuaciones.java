package com.grupomixto;

public class ecuaciones {

    public static double ecuacion1(double a,double b){
      
        double resultado;
        
       resultado= -a / b;
       
       return resultado;

    }

    public static double ecuacion2(double a, double b, double c){
       
        double resultado;

        resultado = Math.pow(b, 2) - (4 * a* c);
        if (resultado < 0) {
            System.out.println("No existe solución posible.");

        } else {

            resultado =  (-b+ Math.sqrt(resultado) / (2 * a));
            System.out.println("El resultado es: " + resultado);

            resultado = Math.pow(b, 2) - (4 * a * c);
            resultado = -b - Math.sqrt(resultado) / (2 * a);

            System.out.println("Y también: " + resultado);

           

        }
        return resultado;
    }
    
}
