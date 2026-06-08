package modul_5.Praktikum_3.dengan_ocp;

public class EmailNotifier implements Notifier{
    public void send(String message){
        System.out.println("Sending Email: "+ message);
    }
}
