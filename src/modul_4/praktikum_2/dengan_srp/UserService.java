package modul_4.praktikum_2.dengan_srp;

public class UserService {
    public class EmailService{
        public void sendWelcomeEmail(User user){
            System.out.println("\nMengirirm email ke "+ user.getEmail()+ "...");
            System.out.println("Halo "+ user.getName()+ user.getName()+ ", selamat datang dissitem kami!\n");
        }
    }
}
