package modul_5.Praktikum_3.dengan_ocp;

public class SMSNotifier implements Notifier{
    public void send(String message){
        System.out.println("Seding SMS: "+ message);
    }
}
