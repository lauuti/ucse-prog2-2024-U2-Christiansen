package org.example.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAvionComercial {
    private AvionComercial AvionComercialTesting;

    @BeforeEach
    void setup() {
        AvionComercialTesting = new AvionComercial(50000, 4000);

    }
    @Test
    void TestVolarDeberiaDevolver4000000(){
        int necesario = AvionComercialTesting.volar(1000);
        Assertions.assertEquals(4000000,necesario);
    }

}