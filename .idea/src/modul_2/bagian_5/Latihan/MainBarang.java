package modul_2.bagian_5.Latihan;

public class MainBarang {
    public static void main(String[] args) {
        // Menggunakan Default Constructor (Kosong)
        Barang barang1 = new Barang();

        // Menggunakan Parameterized Constructor (Langsung isi data)
        Barang barang2 = new Barang("Laptop Asus", 15000000.0);

        System.out.println("--- Info Barang 1 ---");
        barang1.tampilkanInfo();

        System.out.println("\n--- Info Barang 2 ---");
        barang2.tampilkanInfo();
    }
}