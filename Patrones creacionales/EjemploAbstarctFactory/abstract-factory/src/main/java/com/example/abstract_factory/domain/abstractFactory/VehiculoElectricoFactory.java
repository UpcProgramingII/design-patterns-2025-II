package com.example.abstract_factory.domain.abstractFactory;

import com.example.abstract_factory.domain.AutomovilElectrico;
import com.example.abstract_factory.domain.IAutomovil;
import com.example.abstract_factory.domain.IScooter;
import com.example.abstract_factory.domain.ScooterElectrica;
import org.springframework.stereotype.Component;

@Component
public class VehiculoElectricoFactory implements VehiculoFactory{
    @Override
    public IScooter getScooter() {
        return new ScooterElectrica(200);
    }

    @Override
    public IAutomovil getAutomovil() {
        return new AutomovilElectrico(500);
    }
}
