package modul_5.Praktikum_3.dengan_ocp;

public class NotificationService {
    public void sendotification(Notifier notifier, String message){
        notifier.send(message);
    }
}
