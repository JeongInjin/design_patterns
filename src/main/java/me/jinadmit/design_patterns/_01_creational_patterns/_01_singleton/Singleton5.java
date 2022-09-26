package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

/**
 * static inner 클래스 사용하기
 * 권장하는 패턴 중 하나이다.
 * 쓰레드 세이프 하며, getInstance() 가 호출될때 INSTANCE 가 호출된다.(지연 로딩)
 * SingletonHolder 는 Singleton 클래스가 Load 될 때에도 Load 되지 않다가 getInstance()가 호출됐을 때 비로소 JVM 메모리에 로드되고, 인스턴스를 생성하게 됩니다.
 */
public class Singleton5 implements Serializable {

    private Singleton5(){}

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance()
    {
        return SingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
