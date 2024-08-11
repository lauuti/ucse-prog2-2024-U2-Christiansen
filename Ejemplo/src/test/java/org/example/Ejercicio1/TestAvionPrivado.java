package org.example.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAvionPrivado {
    private AvionPrivado AvionPrivadoTesting;

    @BeforeEach
    void setup(){AvionPrivadoTesting = new AvionPrivado(30000, 1000);

    }
    @Test
    void TestVolarDeberiaDevolver315000(){
        int Success = AvionPrivadoTesting.volar(300);
        Assertions.assertEquals(315000, Success);
    }
}
