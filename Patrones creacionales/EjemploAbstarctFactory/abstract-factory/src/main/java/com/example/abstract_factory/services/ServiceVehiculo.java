package com.example.abstract_factory.services;

import com.example.abstract_factory.domain.*;
import com.example.abstract_factory.domain.abstractFactory.VehiculoFactory;
import com.example.abstract_factory.domain.abstractFactory.VehiculoFactoryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceVehiculo {

    @Autowired
    private VehiculoFactoryProvider providerFactory;
    private VehiculoFactory factory;

    public ServiceVehiculo(VehiculoFactoryProvider providerFactory) {
        this.providerFactory = providerFactory;
    }

    public IScooter getScooter(String type){
        this.factory =providerFactory.getFactory(type);
        return factory.getScooter();
    }

    public IAutomovil getAutomovil(String type){

        this.factory =providerFactory.getFactory(type);
        return factory.getAutomovil();


    }

}
