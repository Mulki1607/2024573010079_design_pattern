package modul_5.latihan;

public class TaxCalculator {
    public double calculateTax(VehicleTax vehicleTax, double price){
        return vehicleTax.calculate(price);
    }
}