package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

/**
 * synchronized 키워드를 사용.
 * synchronized 키워드를 통해 쉽게 쓰레드 세이프한 객체생성 보장
 * 호출될시 매번 synchronized 키워드로 인하여 성능이 떨어질 수 있다.
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() {
        if(instance == null) instance = new Singleton2();
        return instance;
    }

}

