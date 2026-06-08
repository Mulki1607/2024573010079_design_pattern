package modul_3.bagian_2.Latihan;

public class MainMotor {
    public static void main(String[] args){
        Motor mtr1 = new Motor();
        mtr1.setMerk ("Yamaha");
        mtr1.setTahun (2026);

        System.out.println("Merk: "+ mtr1.getMerk());
        System.out.println("Tahun: "+ mtr1.getTahun());
    }
}
