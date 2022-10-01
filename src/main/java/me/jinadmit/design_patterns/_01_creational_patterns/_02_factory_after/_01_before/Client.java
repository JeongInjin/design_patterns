package me.jinadmit.design_patterns._01_creational_patterns._02_factory_after._01_before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "injin@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "injin@mail.com");
        System.out.println(blackship);
    }

}
