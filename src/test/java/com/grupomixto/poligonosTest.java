package com.grupomixto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream; 
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

/** Inicio codificación: LAE 14/02/2022 **/
public class poligonosTest { 
    
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach  //se ejecuta antes que otros métodos de prueba
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos, opción cuadrado(1)")
    public void poligonoTestCuadrado() {
       
        provideInput("3\n1\n5\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("25.0cm2" ));
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos, opción triangulo(2)")
    public void poligonoTestTriangulo() {
       
        provideInput("3\n2\n5\n4\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("10cm2" ));
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos, opción círculo(3)")
    public void poligonoTestCirculo() {
       
        provideInput("3\n3\n5\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("78.53981633974483cm2" ));
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos, opción hexágono(4)")
    public void poligonoTestHexagono() {
       
        provideInput("3\n4\n5\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("64.95cm2" ));
        
    }

    @Test
    @DisplayName("Test entrada a Menú de Polígonos, opción rectangulo(5)")
    public void poligonoTestRectangulo() {
       
        provideInput("3\n5\n6\n5\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("30.0cm2" ));
        
    }


    

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }



}

/** Fin codificación: LAE 14/02/2022 **/