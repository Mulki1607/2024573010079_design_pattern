package modul_5.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Motorcycle): ");
        String type = scanner.next();

        System.out.print("Enter vehicle price: ");
        double price = scanner.nextDouble();

        VehicleTax vehicleTax;

        if (type.equalsIgnoreCase("Car")){
            vehicleTax = new CarTax();
        } else if (type.equalsIgnoreCase("Motorcycle")){
            vehicleTax = new MotorcycleTax();
        } else {
            System.out.println("Invalid vehicle type");
            return;
        }

        TaxCalculator calculator = new TaxCalculator();
        double tax = calculator.calculateTax(vehicleTax, price);

        System.out.println("Calculated tax: " + tax);
    }
}