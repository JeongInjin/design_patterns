package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

public class SingleTon1 {

    private static SingleTon1 instance;
    private SingleTon1(){}


    public static SingleTon1 getInstance() {
        if(instance == null) instance = new SingleTon1();

        return instance;
    }
}
