package com.example.abstract_factory.domain;

public class AutomovilElectrico implements IAutomovil{

    private double autonomiaKms;

    public AutomovilElectrico(double autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }

    @Override
    public String getInfoAutomovil() {
        return "Ha seleccionado un automovil electrico  con " +
                "autonomia de: "+this.autonomiaKms + " kms";
    }
}
