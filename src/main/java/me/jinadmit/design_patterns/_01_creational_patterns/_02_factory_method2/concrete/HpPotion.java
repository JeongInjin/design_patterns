package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.concrete;

import me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework.Item;

public class HpPotion implements Item {
    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
