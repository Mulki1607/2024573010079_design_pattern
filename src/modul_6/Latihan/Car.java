package modul_6.Latihan;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car starts engine");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating Car route to " + destination);
    }
}