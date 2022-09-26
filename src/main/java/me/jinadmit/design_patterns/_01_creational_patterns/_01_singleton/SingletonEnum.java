package me.jinadmit.design_patterns._01_creational_patterns._01_singleton;

/**
 * 직렬화, 역직렬화에 대응되며,
 * 리플렉션에 대응된다.
 * 하지만 미리 만들어 진다는 단점이 있다.
 * 상속이 불가하다는 단점 도 있다.
 * 기타: enum 은 Serializable 을 내부적으로 상속을 받고있다.(ByteCode 로 보면 나옴)
 */
public enum SingletonEnum {
    INSTANCE,
    ;

    SingletonEnum() {
        System.out.println("SingletonEnum constructor");
    }

}
