package org.example.Ejercicio1;

public class AvionComercial extends Avion {
    public AvionComercial(int capacidadCombustible, int consumoCombustible) {
        super(capacidadCombustible, consumoCombustible);
    }

    public int volar(int distancia) {
        return distancia * consumoCombustible;
    }
}
