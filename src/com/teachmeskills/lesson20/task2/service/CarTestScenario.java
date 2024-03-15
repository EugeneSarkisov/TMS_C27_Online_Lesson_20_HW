package com.teachmeskills.lesson20.task2.service;

import com.teachmeskills.lesson20.task2.model.CarAdd;
import com.teachmeskills.lesson20.task2.model.CarRemove;
import com.teachmeskills.lesson20.task2.model.ServiceStation;

/**
 * Contain main method for running car station scenario.
 */

public class CarTestScenario {
    public static void runScenario(){
        ServiceStation serviceStation = new ServiceStation();
        CarAdd ca = new CarAdd(serviceStation);
        CarRemove cr = new CarRemove(serviceStation);

        ca.start();
        cr.start();
    }
}
