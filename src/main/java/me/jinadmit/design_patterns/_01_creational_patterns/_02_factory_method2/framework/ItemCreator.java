package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method2.framework;

public abstract class ItemCreator {

    public Item create() {

        Item item;

        requestItemInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    abstract protected void requestItemInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();
}
