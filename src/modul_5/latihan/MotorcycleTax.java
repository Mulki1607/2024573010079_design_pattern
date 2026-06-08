package modul_5.latihan;

public class MotorcycleTax implements VehicleTax {
    @Override
    public double calculate(double price) {
        return price * 0.05;
    }
}