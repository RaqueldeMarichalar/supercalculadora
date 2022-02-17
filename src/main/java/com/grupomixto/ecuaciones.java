package com.grupomixto;

public class ecuaciones {

    public static int ecuacion1(int a,int b){

       return -a / b;

    }

    public static int ecuacion2(int a, int b, int c){
       
        double resultado;

        resultado = Math.pow(b, 2) - (4 * a* c);
        if (resultado < 0) {
            System.out.println("No existe solución posible.");

        } else {

            resultado =  (-b+ Math.sqrt(resultado) / (2 * a));
            System.out.println("El resultado es : " + resultado);

            resultado = Math.pow(b, 2) - (4 * a * c);
            resultado = -b - Math.sqrt(resultado) / (2 * a);

            System.out.println("Y también: " + resultado);

           

        }
        return (int) resultado;
    }
    
}
