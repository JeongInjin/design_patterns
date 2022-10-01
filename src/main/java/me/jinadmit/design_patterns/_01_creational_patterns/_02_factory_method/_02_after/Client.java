package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method._02_after;

import me.jinadmit.design_patterns._01_creational_patterns._02_factory_after._01_before.Ship;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "injin@emaul.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "injin@emaul.com");
        System.out.println(blackShip);

    }

}
