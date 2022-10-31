package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.concrete;

import me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework.Item;
import me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("데이터베이스에서 체력 물약의 정보를 가져옵니다");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 물약을 새로 생성 했습니다. " + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
