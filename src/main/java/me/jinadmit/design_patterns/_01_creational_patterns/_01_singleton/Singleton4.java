package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

/**
 * double-checked locking 사용하기
 * 쓰레드 세이프하다.
 * volatile 키워드를 사용해야지, 실질적인 자바 1.5 이상부터 동작하 쓰레드가 완성된다.
 * volatile 키워드 및 코드가 깔끔한 편이 아닌 단점이 있다.
 */
public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance()
    {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}
