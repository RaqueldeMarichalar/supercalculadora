package com.grupomixto;

import java.util.Scanner;

/** Inicio codificación: RMA 10/02/2022 **/

public class Supercalculadora {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            // Variables
            double Ec1,Ec2,Ec3;
            int numA, numB, numC;
            String signo;
            int opcion = 0, opcionEcuaciones = 0, opcionPoligonos = 0;
            double altura, area;

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
                        numA = s.nextInt();
                        System.out.println("introduce el segundo número: ");
                        numB = s.nextInt();
                        System.out.println(
                                "¿Qué operación quieres realizar suma(+),resta(-),division(/) o multiplicación(*)?");
                        signo = s.next();

                        switch (signo) {

                            case "+":
                                System.out.println("Resultado: " + aritmeticaBasica.suma(numA, numB));
                                break;

                            case "-":

                                System.out.println("Resultado: " + aritmeticaBasica.resta(numA, numB));
                                break;

                            case "*":

                                System.out.println("Resultado: " + aritmeticaBasica.multiplicacion(numA, numB));
                                break;

                            case "/":

                                System.out.println("Resultado: " + aritmeticaBasica.division(numA, numB));
                                break;

                            default:

                                System.out.println("Lo siento, no has introducido un signo correcto.");

                        }

                        break;

                    /** Inicio codificación: LAE 10/02/2022 **/
                    case 2:
                        System.out.println("Introduce las medidas de los catetos para averiguar la hipotenusa: ");
                        System.out.println("Introduce medidas del cateto A: ");
                        numA = s.nextInt();

                        System.out.println("Introduce medidas del cateto B: ");
                        numB = s.nextInt();

                        System.out.println("El resultado es: " + Pitagoras.Teorema(numA, numB));
                        break;

                    case 3:
                        System.out.println("Elige entre los siguientes polígonos para conocer su área: ");
                        System.out.println("Cuadrado (1), triángulo (2),círculo (3),hexágono(4),rectángulo (5)");
                        opcionPoligonos = s.nextInt();

                        switch (opcionPoligonos) {
                            case 1:
                                System.out.print("Introduce un valor para lado: ");
                                double ladoC = s.nextDouble();
                                cuadrado cuadradoC = new cuadrado(ladoC);
                                area = cuadradoC.area();
                                System.out.println("El cuadrado tiene un área de " + area + "cm2");
                                break;

                            case 2:
                                System.out.print("Introduce un valor para lado: ");
                                double ladoT = s.nextDouble();
                                System.out.print("Introduce un valor para altura: ");
                                altura = s.nextDouble();
                                triangulo trianguloT = new triangulo(ladoT, altura);
                                area = trianguloT.area();
                                System.out.println("El triángulo tiene un área de " + area + "cm2");
                                break;

                            case 3:
                                System.out.print("Introduce un valor para radio: ");
                                double radio = s.nextDouble();
                                circulo circuloC = new circulo(radio);
                                area = circuloC.area();
                                System.out.println("El círculo tiene un área de " + area + "cm2");
                                break;

                            case 4:
                                System.out.print("Introduce un valor para lado: ");
                                double ladoH = s.nextDouble();
                                hexagono hexagonoH = new hexagono(ladoH);
                                area = hexagonoH.area();
                                System.out.println("El hexágono tiene un área de " + area + "cm2");
                                break;

                            case 5:
                                System.out.print("Introduce un valor para lado: ");
                                double ladoR = s.nextDouble();
                                System.out.print("Introduce un valor para altura: ");
                                altura = s.nextDouble();
                                rectangulo rectanguloR = new rectangulo(ladoR, altura);
                                area = rectanguloR.area();
                                System.out.print("\nEl rectángulo tiene un área de " + area + "cm2");
                                break;

                            default:

                                System.out.println("Lo siento, no has introducido una opción existente.");
                        }

                        break;

                    case 4:
                        System.out.println("Qué tipo de ecuación quieres resolver:  ");
                        System.out.println("Primer grado (1) o segundo grado (2)");
                        opcionEcuaciones = s.nextInt();
                        switch (opcionEcuaciones) {

                            case 1:

                                System.out.println("Escribe el primer valor: ");
                                Ec1 = s.nextDouble();
                                System.out.println(" Escribe el segundo valor: ");
                                Ec2= s.nextDouble();
                                System.out.println("El resultado es: " + ecuaciones.ecuacion1(Ec1,Ec2));

                                break;

                            case 2:

                                System.out.println(" Escribe el primer valor: ");
                                Ec1 = s.nextDouble();
                                System.out.println(" Escribe el segundo valor: ");
                                Ec2 = s.nextDouble();
                                System.out.println(" Escribe el tercer valor: ");
                                Ec3 = s.nextDouble();
                                ecuaciones.ecuacion2(Ec1, Ec2, Ec3);

                                break;

                            /** Fin codificación:RMA 17/02/2022 **/
                            /** Fin codificación:LAE 10/02/2022 **/
                            default:
                                System.out.println("Lo siento, no has introducido un valor correcto.");

                        }
                }

            }
        }
    }

}
