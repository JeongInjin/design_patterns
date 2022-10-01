package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method._02_after;

import me.jinadmit.design_patterns._01_creational_patterns._02_factory_after._01_before.Ship;

public class BlackShip extends Ship{
    public BlackShip() {
        setName("blackship");
        setColor("black");
        setLogo("⚓");
    }
}