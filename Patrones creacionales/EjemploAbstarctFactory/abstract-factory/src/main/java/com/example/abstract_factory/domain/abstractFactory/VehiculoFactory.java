package com.example.abstract_factory.domain.abstractFactory;

import com.example.abstract_factory.domain.IAutomovil;
import com.example.abstract_factory.domain.IScooter;

public interface VehiculoFactory {

    IScooter getScooter();
    IAutomovil getAutomovil();

}
