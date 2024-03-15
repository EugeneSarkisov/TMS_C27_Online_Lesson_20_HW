package com.teachmeskills.lesson20.task1.threds;

import com.teachmeskills.lesson20.task1.util.ParametersGetter;

public class CoffeeTest extends Thread {

    public CoffeeTest() {
        setName(ParametersGetter.setParameterName("data/coffeeParam.txt"));
        setPriority(ParametersGetter.setParameterPriority("data/coffeeParam.txt"));
    }

    @Override
    public void run() {
        coffeeScenario();
    }

    private void coffeeScenario(){
        System.out.println(getName() +  ": Putting coffee to the cup...");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(getName() +  ": Adding hot water...");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(getName() +  ": Making first sip...");
    }
}
