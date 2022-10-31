package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.concrete;

import me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework.Item;
import me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework.ItemCreator;

public class Main
{
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
