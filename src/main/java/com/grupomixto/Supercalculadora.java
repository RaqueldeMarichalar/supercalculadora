package com.grupomixto;

import java.util.Scanner;

/** Inicio codificación: RMA 10/02/2022 **/

public class Supercalculadora {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            // Variables
            double res;
            double numA, numB, numC;
            String signo;
            int opcion = 0, opcionEcuaciones = 0;

            // Menú
            while (opcion != 5) {

                System.out.println("BIENVENIDO A LA SUPERCALCULADORA");
                System.out.println("========================================");
                System.out.println("Elige entre las siguientes opciones: ");
                System.out.println("1-> Aritmética Básica");
                System.out.println("2-> Teorema de Pitágoras");
                System.out.println("3-> Área de Polígonos Regulares");
                System.out.println("4-> Resolución de Ecuaciones");
                System.out.println("5->Salir");
                opcion = s.nextInt();

                // opciones
                switch (opcion) {

                    case 1:

                        System.out.println("introduce el primer número:  ");
                        numA = s.nextDouble();
                        System.out.println("introduce el segundo número: ");
                        numB = s.nextDouble();
                        System.out.println(
                                "¿Qúé operación quieres realizar suma(+),resta(-),division(/) o multiplicación(*)?");
                        signo = s.next();

                        switch (signo) {

                            case "+":
                                res = numA + numB;
                                System.out.println("Resultado: " + res);
                                break;

                            case "-":
                                res = numA - numB;
                                System.out.println("Resultado: " + res);
                                break;

                            case "*":
                                res = numA * numB;
                                System.out.println("Resultado: " + res);
                                break;

                            case "/":
                                res = numA / numB;
                                System.out.println("Resultado: " + res);
                                break;

                            default:

                                System.out.println("Lo siento, no has introducido un signo correcto.");

                        }

                        break;

                    /** Inicio codificación: LAE 10/02/2022 **/
                    case 2:
                        System.out.println("Introduce las medidas de los catetos para averiguar la hipotenusa: ");
                        System.out.println("Introduce medidas del cateto A: ");
                        numA = s.nextDouble();

                        System.out.println("Introduce medidas del cateto B: ");
                        numB = s.nextDouble();

                        numC = Math.pow(numA, 2) + Math.pow(numB, 2);
                        res = Math.sqrt(numC);

                        System.out.println("El resultado es: " + res);
                        break;

                    case 3:
                        System.out.println("Elige entre los siguientes polígonos para conocer su área: ");
                        System.out.println("Cuadrado (1), triángulo (2),círculo (3),hexágono(4),rectángulo (5)");

                        break;

                    case 4:
                        System.out.println("Qué tipo de ecuación quieres resolver:  ");
                        System.out.println("Primer grado (1) o segundo grado (2)");

                        switch (opcionEcuaciones) {

                            case 1:

                                System.out.println(" Escribe el primer valor: ");
                                numA = s.nextDouble();
                                System.out.println(" Escribe el segundo valor: ");
                                numB = s.nextDouble();

                                res = -numB / numA;

                                break;

                            case 2:

                                System.out.println(" Escribe el primer valor: ");
                                numA = s.nextDouble();
                                System.out.println(" Escribe el segundo valor: ");
                                numB = s.nextDouble();
                                System.out.println(" Escribe el tercer valor: ");
                                numC = s.nextDouble();

                                res = Math.pow(numB, 2) - (4 * numA * numC);
                                if (res < 0) {
                                    System.out.println("No existe solución posible.");

                                } else {

                                    res = -numB + Math.sqrt(res) / (2 * numA);
                                    System.out.println("El resultado es : " + res);

                                    res = Math.pow(numB, 2) - (4 * numA * numC);
                                    res = -numB - Math.sqrt(res) / (2 * numA);

                                    System.out.println("Y también: " + res);

                                }

                                /** Fin codificación:RMA 10/02/2022 **/
                                /** Fin codificación:LAE 10/02/2022 **/

                        }

                }

            }
        }
    }

}
