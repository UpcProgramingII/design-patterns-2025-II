package com.mycompany.openclosed.bad;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ParkingManager {


    public static double calculateParkingCost(Vehicle v, LocalTime income, LocalTime exit){
        long hours = ChronoUnit.HOURS.between(income, exit);
        double rateParking=0;

        if(v.getType().equals("Motorcicle")){
            rateParking = 1500;
        }
        else if(v.getType().equals("Truck")){
            rateParking = 3000;
        }
        else if(v.getType().equals("Car")){
            rateParking=2000;
        }
        double cost = hours * rateParking;
        return  cost;
    }


}
