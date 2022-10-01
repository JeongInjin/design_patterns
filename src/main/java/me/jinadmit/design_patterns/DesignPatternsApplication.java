package me.jinadmit.design_patterns;

import lombok.SneakyThrows;
import me.jinadmit.design_patterns._01_creational_patterns._01_singleton.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.Constructor;

@SpringBootApplication
public class DesignPatternsApplication {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance() == Singleton1.getInstance());
        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
        System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
        System.out.println(Singleton5.getInstance() == Singleton5.getInstance());

        //리플렉션 사용하여 singleton 파괴하기.
        Singleton5 singleton = Singleton5.getInstance();
        Constructor<Singleton5> constructor = Singleton5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton5 newSingleton = constructor.newInstance();

        System.out.println("======================");
        System.out.println(singleton == newSingleton);

        //직렬화 & 역직렬화 사용하여 파괴하기.
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            out.writeObject(singleton);
        }

        System.out.println("======================");
        Singleton5 singletonIn = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            singletonIn = (Singleton5) in.readObject();
        }
        System.out.println(singleton);
        System.out.println(singletonIn);
        System.out.println(singleton == singletonIn);
        //역직렬화 대응 -> 역직렬화 할때 readResolve 를 사용하도록 한다.
        /* singleton class 안에 아래 메서드를 넣어주자.
            protected Object readResolve() {
                return getInstance();
        }*/

        System.out.println("======================");
        //enum 을 활용해 리플렉션 대응하기.
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println(singletonEnum == SingletonEnum.INSTANCE);

        //enum 을 이용한 직렬화 & 역직렬화

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singletonEnum.obj"))) {
            out.writeObject(singletonEnum);
        }

        SingletonEnum singletonEnumTest = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singletonEnum.obj"))) {
            singletonEnumTest = (SingletonEnum) in.readObject();
        }
        System.out.println("======================");
        System.out.println(singletonEnum == singletonEnumTest);

        //singleton 사용 예
        Runtime runtime = Runtime.getRuntime(); //runtime
        //스프링 application Context - 엄밀히 따지면 다르다.(싱글톤 패턴이라기보다 싱글톤 스코프)
        //다른 디자인 패턴(빌더, 파사드, 추상 팩토리 등) 구현체의 일부로 쓰이기도 한다.

    }

}
