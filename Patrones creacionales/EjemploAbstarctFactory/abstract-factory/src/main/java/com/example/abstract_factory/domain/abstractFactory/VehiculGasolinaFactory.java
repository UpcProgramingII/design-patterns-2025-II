package com.example.abstract_factory.domain.abstractFactory;

import com.example.abstract_factory.domain.AutomovilGasolina;
import com.example.abstract_factory.domain.IAutomovil;
import com.example.abstract_factory.domain.IScooter;
import com.example.abstract_factory.domain.ScooterGasolina;
import org.springframework.stereotype.Component;

@Component
public class VehiculGasolinaFactory implements VehiculoFactory {
    @Override
    public IScooter getScooter() {
        return new ScooterGasolina(20);
    }

    @Override
    public IAutomovil getAutomovil() {
        return new AutomovilGasolina(40);
    }
}
