package modul_4.praktikum_2.dengan_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama Pengguna: ");
        String name = scanner.nextLine();

        System.out.println("Masukkan Email Pengguna: ");
        String email = scanner.nextLine();

        User user = new User(name, email);

        UserRepository userRepository = new UserRepository();
        userRepository.save(user);

        UserService userService = new UserService();
        UserService.EmailService emailService = userService.new EmailService();

        emailService.sendWelcomeEmail(user);
    }
}