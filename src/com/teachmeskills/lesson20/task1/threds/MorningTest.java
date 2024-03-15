package com.teachmeskills.lesson20.task1.threds;

import com.teachmeskills.lesson20.task1.util.ParametersGetter;

public class MorningTest extends Thread {

    public MorningTest() {
        setName(ParametersGetter.setParameterName("data/morningParam.txt"));
        setPriority(ParametersGetter.setParameterPriority("data/morningParam.txt"));
    }

    @Override
    public void run() {
        morningScenario();
    }

    private void morningScenario(){
        System.out.println(getName() +  ": Sunrise...");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(getName() +  ": Birds singing...");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(getName() +  ": Traffic jam noises...");
    }
}
