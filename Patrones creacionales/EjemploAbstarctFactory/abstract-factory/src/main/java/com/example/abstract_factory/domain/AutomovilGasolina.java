package com.example.abstract_factory.domain;

public class AutomovilGasolina implements IAutomovil{

    private double capacidadTanque;

    public AutomovilGasolina(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getInfoAutomovil() {
        return "Ha seleccionado un automovil a gasolina con " +
                "capacidad de tanque: " + this.capacidadTanque + " gal";
    }
}
