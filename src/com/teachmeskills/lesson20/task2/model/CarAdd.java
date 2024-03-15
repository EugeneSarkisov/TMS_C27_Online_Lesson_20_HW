package com.teachmeskills.lesson20.task2.model;

import static com.teachmeskills.lesson20.task2.consts.StationParameters.STATION_ADD_PARAMETER;

/**
 * Contain pattern for car adder.
 */

public class CarAdd extends Thread{

    private final ServiceStation serviceStation;

    public CarAdd(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        addCarToStation();
    }
    private void addCarToStation(){
        for (int i = 1; i < STATION_ADD_PARAMETER; i++){
            serviceStation.getCar();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
