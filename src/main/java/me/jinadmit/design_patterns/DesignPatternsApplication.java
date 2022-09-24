package me.jinadmit.design_patterns;

import me.jinadmit.design_patterns._01_creational_patterns._01_singleton.SingleTon1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SingleTon1 singleTon1 = SingleTon1.getInstance();
        SingleTon1 singleTon2 = SingleTon1.getInstance();

        System.out.println(singleTon1 == singleTon2); //true


    }

}
