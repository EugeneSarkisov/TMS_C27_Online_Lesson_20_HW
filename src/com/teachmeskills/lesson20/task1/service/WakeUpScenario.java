package com.teachmeskills.lesson20.task1.service;

import com.teachmeskills.lesson20.task1.threds.BreakfastTest;
import com.teachmeskills.lesson20.task1.threds.CoffeeTest;
import com.teachmeskills.lesson20.task1.threds.MorningTest;

/**
 * Contain main method which starting wake up scenario
 */

public class WakeUpScenario {
    public static void startScenario(){
        MorningTest mt = new MorningTest();
        BreakfastTest bt = new BreakfastTest();
        CoffeeTest ct = new CoffeeTest();
        mt.start();
        ct.start();
    }
}
