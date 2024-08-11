package org.example.Ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadorCombustible {
    private CalculadorCombustible calculadora;
    private AvionComercial Avion;
    @BeforeEach
    void setUp() {
        calculadora = CalculadorCombustible.getInstance();
        Avion = new AvionComercial(30000, 1000);
    }
    @Test
    void TestInstanciaDeberiaDevolverLaMismaCalculadora(){
         CalculadorCombustible calculadora2;
         calculadora2 = CalculadorCombustible.getInstance();
        Assertions.assertEquals(calculadora2, calculadora);
    }
    @Test
    void TestCalcularCombustible(){
        int success = calculadora.calcularCombustible(Avion, 300);
        Assertions.assertEquals(success, 300000);
    }
}
