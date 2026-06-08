package modul_5.praktikum_1.tanpa_ocp;

public class PaymentProcessor {
    public void processPayment(String paymentType, double amount){
        if (paymentType.equals("CreditCard")){
            System.out.println("Processing Credit Card paymet of "+ amount);
        } else if (paymentType.equals("EWallet")){
            System.out.println("Processing E-Wallet payment of"+ amount);
        } else{
            System.out.println("Invsalid payment method");
        }
    }
}
