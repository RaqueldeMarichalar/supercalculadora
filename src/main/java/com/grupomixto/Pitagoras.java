package com.grupomixto;

public class Pitagoras {

    public static int Teorema(int a, int b){
        
     int hipotenusa;
     int resultado;

      hipotenusa= (int) (Math.pow(a, 2) + Math.pow(b, 2));
      resultado=  (int) Math.sqrt(hipotenusa);

      return resultado;

    }
    
    
}
