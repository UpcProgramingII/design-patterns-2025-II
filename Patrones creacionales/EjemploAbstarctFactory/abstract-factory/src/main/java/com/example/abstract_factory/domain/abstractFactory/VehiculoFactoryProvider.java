package com.example.abstract_factory.domain.abstractFactory;

import org.springframework.stereotype.Component;

@Component
public class VehiculoFactoryProvider {

    private VehiculoElectricoFactory factoryElectrico;
    private VehiculGasolinaFactory factoryGasolina;

    public VehiculoFactoryProvider(VehiculoElectricoFactory factoryElectrico, VehiculGasolinaFactory factoryGasolina) {
        this.factoryElectrico = factoryElectrico;
        this.factoryGasolina = factoryGasolina;
    }

    public VehiculoFactory getFactory(String type){

        if(type.equals("Electrico")){
            return this.factoryElectrico;
        }
        else{
            return this.factoryGasolina;
        }

    }
}
