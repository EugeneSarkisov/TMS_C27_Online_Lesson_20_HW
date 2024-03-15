package com.teachmeskills.lesson20.task2.model;

import static com.teachmeskills.lesson20.task2.consts.StationParameters.STATION_GIVE_PARAMETER;

/**
 * Contain pattern for car remover.
 */

public class CarRemove extends Thread {

    private final ServiceStation serviceStation;

    public CarRemove(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        removeCar();
    }

    private void removeCar(){
        for(int i = 1; i < STATION_GIVE_PARAMETER; i++){
            serviceStation.giveCar();
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}
