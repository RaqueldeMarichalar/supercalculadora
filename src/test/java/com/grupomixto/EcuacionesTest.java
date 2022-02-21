
package com.grupomixto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream; 
import java.io.InputStream;
import java.io.PrintStream;

import com.grupomixto.Supercalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class EcuacionesTest {

    
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
    @DisplayName("Test entrada a Menú de ecuaciones, opción ecuaciones primer grado (1)")
    public void ecuacion1Test() {
       
        provideInput("4\n1\n10\n20\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El resultado es: -0.5"));
        
    }

    @Test
    @DisplayName("Test entrada a Menú de ecuaciones, opción ecuaciones segundo grado (2)")
    public void ecuacion2Test() {
       
        provideInput("4\n2\n1\n5\n4\n5");
        
        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("El resultado es: -3.5"));
        assertThat(getOutput(), containsString("Y también: -6.5"));
    }


    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }



}
    

