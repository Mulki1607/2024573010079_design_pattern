package modul_7.praktikum_3;

public class SMSNotification implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS"+ message);
    }
}
