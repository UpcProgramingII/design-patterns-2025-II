/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.openclosed.bad;

import java.time.LocalTime;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        Vehicle car = new Vehicle("ABC", "Car");
        System.out.println("Parking cost: " + ParkingManager.calculateParkingCost(car, LocalTime.now(), LocalTime.now().plusMinutes(60)));
    }
    
}
