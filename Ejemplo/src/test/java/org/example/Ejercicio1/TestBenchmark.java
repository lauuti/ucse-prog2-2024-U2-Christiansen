package org.example.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
public class TestBenchmark {
 private StreamBenchmark StreamTest;
 @BeforeEach
    void setUp() {
        StreamTest = new StreamBenchmark();
    }
@Test
    void TestCrearListaDeberiaDevolver10000000(){
        List<Integer> list = StreamTest.crearLista();
    Assertions.assertEquals(list.size(), 10000000);
}
@Test
    void TestTrabajoListaSecuencialDeberiaDevolverNotEmpty(){
        //List<Integer> list = StreamTest.crearLista();
        List<Integer> Testing = StreamTest.trabajoListaSecuencial();
        Assertions.assertFalse(Testing.isEmpty());
}
    @Test
    void trabajoListaParaleloDeberiaDevolverQueNoEstaVacia() {
        List<Integer> listaResultanteParalela = StreamTest.trabajoListaParalelo();
        Assertions.assertFalse(listaResultanteParalela.isEmpty());
    }
}
