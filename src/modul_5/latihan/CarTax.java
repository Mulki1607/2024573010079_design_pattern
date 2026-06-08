package modul_5.latihan;

public class CarTax implements VehicleTax {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}