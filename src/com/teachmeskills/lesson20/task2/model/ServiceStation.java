package com.teachmeskills.lesson20.task2.model;

import static com.teachmeskills.lesson20.task2.consts.StationParameters.STATION_MAX_SIZE;

/**
 * Contain pattern for service station.
 */

public class ServiceStation {

    private int carCounter = 0;

    public synchronized void getCar(){
        while (carCounter >= STATION_MAX_SIZE){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
        carCounter++;
        System.out.println("Station gets 1 broken car");
        System.out.println("Cars on station: " + carCounter);
        notify();
    }

    public synchronized void giveCar(){
        while (carCounter < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
        carCounter--;
        System.out.println("Station gives 1 repaired car");
        System.out.println("Cars on station: " + carCounter);
        notify();
    }
}
