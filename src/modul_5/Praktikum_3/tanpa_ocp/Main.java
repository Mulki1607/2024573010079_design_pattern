package modul_5.Praktikum_3.tanpa_ocp;

public class Main {
    public static void main(String[] args){
        NotivicationService service = new NotivicationService();
        service.sendNotification("Email", "Hello via Email!");
        service.sendNotification("SMS", "Hello Via SMS!");
    }
}
