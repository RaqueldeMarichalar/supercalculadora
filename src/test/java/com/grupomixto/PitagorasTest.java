/** Inicio codificación: LAE 17/02/2022 **/

package com.grupomixto;

import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PitagorasTest{

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
@DisplayName("Test entrada a Teorema de Pitágoras")
public void TeoremaPitagorasTest() {

    provideInput("2\n4\n6\n5");

    Supercalculadora.main(new String[0]);
    assertThat(getOutput(), containsString("7"));

}

@AfterEach
public void restoreSystemInputOutput() {
    System.setIn(systemIn);
    System.setOut(systemOut);
}
}

/** Fin codificación: LAE 17/02/2022 **/