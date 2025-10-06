package com.example.abstract_factory.domain;

public class ScooterElectrica implements IScooter{

    private double autonomiaKms;

    public ScooterElectrica(double autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }

    @Override
    public String getInfoScooter() {
        return "Ha seleccionado una Scooter electrica con " +
                "autonomia de: "+this.autonomiaKms + " kms";
    }
}
