package modul_5.Praktikum_3.dengan_ocp;

public class Main {
    public static void main(String[] args){
        NotificationService service = new NotificationService();

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        service.sendotification(emailNotifier, "Hello via Email!");
        service.sendotification(smsNotifier, "Hello via SMS!");
    }
}
