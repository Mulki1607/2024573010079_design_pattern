package modul_7.praktikum_3;

public class PushNotification implements NotificationStrategy{
    @Override
    public void send(String message) {
        System.out.println("Mengirim Notifikasi Push: "+ message);
    }
}
