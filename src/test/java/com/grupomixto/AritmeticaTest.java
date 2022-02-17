package com.grupomixto;

import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach // con esto se ejecuta antes de cada test de una suite
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
    @DisplayName("Test entrada a Menú de Aritmética, opción suma ")
    public void AritmeticaTestSuma() {

        provideInput("1\n10\n33\n+\n5");

        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 43"));
        //
    }

    @Test
    @DisplayName("Test entrada a Menú de Aritmética, opción resta")
    public void AritmeticaTestResta() {

        provideInput("1\n30\n10\n-\n5");

        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 20"));
        //
    }

    @Test
    @DisplayName("Test entrada a Menú de Aritmética, opción multiplicación")
    public void AritmeticaTestMultiplicacion() {

        provideInput("1\n9\n1\n*\n5");

        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 9"));
        //
    }

    @Test
    @DisplayName("Test entrada a Menú de Aritmética, opción division")
    public void AritmeticaTestDivision() {

        provideInput("1\n10\n2\n/\n5");

        Supercalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 5"));
        //
    }
}