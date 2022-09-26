package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

/**
 * 보편적이 방법
 * 쓰레드세이프 하지 않다는 단점
 */
public class Singleton1 {

    private static Singleton1 instance;
    private Singleton1(){}


    public static Singleton1 getInstance() {
        if(instance == null) instance = new Singleton1();
        return instance;
    }
}
