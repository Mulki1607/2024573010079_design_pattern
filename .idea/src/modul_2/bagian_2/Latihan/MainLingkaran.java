package modul_2.bagian_2.Latihan;

public class MainLingkaran {
    public static void main(String[] args) {
        // 1. Membuat Object dari class Lingkaran
        Lingkaran bundar = new Lingkaran();

        // 2. Mengisi nilai atribut jariJari
        bundar.jariJari = 10;

        // 3. Memanggil method hitungLuas() dan menyimpannya dalam variabel
        double hasilLuas = bundar.hitungLuas();

        // 4. Menampilkan hasil
        System.out.println("Jari-jari lingkaran: " + bundar.jariJari);
        System.out.println("Luas Lingkaran adalah: " + hasilLuas);
    }
}