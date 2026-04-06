package modul_3.bagian_3_pewarisan.Latihan;

public class Laptop {
    private Processor processor;
    private RAM ram;

    public Laptop() {
        this.processor = new Processor();
        this.ram = new RAM();
    }

    public void nyalakan() {
        System.out.println("Menyalakan Laptop...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
        System.out.println("Laptop siap digunakan.");
    }

    public static void main(String[] args) {
        Laptop laptopSaya = new Laptop();
        laptopSaya.nyalakan();
    }
}