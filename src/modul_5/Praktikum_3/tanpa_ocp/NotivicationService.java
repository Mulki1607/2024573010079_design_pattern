package modul_5.Praktikum_3.tanpa_ocp;

public class NotivicationService {
    public void sendNotification(String type, String message){
        if (type.equals("Email")){
            System.out.println("Sending Email: "+ message);
        } else if (type.equals("SMS")) {
            System.out.println("Seding SMS: "+ message);
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
