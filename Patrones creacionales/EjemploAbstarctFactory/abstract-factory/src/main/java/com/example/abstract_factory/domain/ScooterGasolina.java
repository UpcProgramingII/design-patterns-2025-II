package com.example.abstract_factory.domain;

public class ScooterGasolina implements IScooter {

    private double capacidaTanque;

    public ScooterGasolina(double capacidaTanque) {
        this.capacidaTanque = capacidaTanque;
    }

    @Override
    public String getInfoScooter() {
        return "Ha seleecionado una Scooter a gasolina con" +
                " capacidad de tanque: " + this.capacidaTanque;
    }

    public double getCapacidaTanque() {
        return capacidaTanque;
    }

    public void setCapacidaTanque(double capacidaTanque) {
        this.capacidaTanque = capacidaTanque;
    }
}
