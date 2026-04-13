package modul_4.praktikum_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Isi Laporan: ");
        String reportText = scanner.nextLine();

        System.out.println("Masukan Nama File Laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        reportManager.saveToFile(reportFileName + ".txt");
        reportManager.printReport();
    }
}