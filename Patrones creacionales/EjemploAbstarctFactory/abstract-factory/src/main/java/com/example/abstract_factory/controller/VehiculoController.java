package com.example.abstract_factory.controller;


import com.example.abstract_factory.domain.IAutomovil;
import com.example.abstract_factory.domain.IScooter;
import com.example.abstract_factory.domain.ScooterGasolina;
import com.example.abstract_factory.services.ServiceVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class VehiculoController {

    @Autowired
    private ServiceVehiculo servicio;

    @GetMapping("/Scooter/")
    public String getScooter(@RequestParam String type){
        IScooter scooter = servicio.getScooter(type);
        return scooter.getInfoScooter();
    }

    @GetMapping("Automovil/")
    public String getAutomovil(@RequestParam String type){
        IAutomovil auto = servicio.getAutomovil(type);
        return auto.getInfoAutomovil();
    }

}
