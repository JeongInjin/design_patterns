package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

/**
 * 이른 초기화 사용하기(eager initialization)
 * 쓰레드 세이프하지만
 * 미리 만들어서 단점이 될 수 있다.
 *  해당 인스턴스의 생성이 오래걸리고 메모리를 많이 사용하여 만들어 놓았지만 애플리케이션이 사용하지 않는다면, 리소스 낭비.
 */
public class Singleton3 {

    private static final Singleton3 INSTANCE = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}
