package com.teachmeskills.lesson20.task1.threds;

import com.teachmeskills.lesson20.task1.util.ParametersGetter;

import static java.lang.Thread.sleep;

public class BreakfastTest implements Runnable{
    Thread thread;

    public BreakfastTest() {
        thread = new Thread(this);
        thread.setName(ParametersGetter.setParameterName("data/breakfastParam.txt"));
        thread.setPriority(ParametersGetter.setParameterPriority("data/breakfastParam.txt"));
        thread.start();
    }

    @Override
    public void run() {
        breakfastScenario();
    }

    private void breakfastScenario(){
        System.out.println(thread.getName() +  ": Breaking eggs...");
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(thread.getName() +  ": Putting fork...");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Something wrong...");
        }
        System.out.println(thread.getName() +  ": Eating...");
    }
}
