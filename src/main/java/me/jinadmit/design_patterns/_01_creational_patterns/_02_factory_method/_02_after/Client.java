package me.jinadmit.design_patterns._01_creational_patterns._02_factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "injin@email.com");
        client.print(new BlackShipFactory(), "blackShip", "injin@email.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
        System.out.println("=============================================================================");
    }

}
