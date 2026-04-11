package modul_2.latihan;

// Class utama untuk menjalankan program
public class latihan_1 {
    public static void main(String[] args) {
        // 1. Membuat Object dari class Buku
        Buku bukuSaya = new Buku();

        // 2. Mengisi nilai atribut (Properti)
        bukuSaya.judul = "Pemrograman Java Dasar";
        bukuSaya.pengarang = "Mulki";

        // 3. Menampilkan nilai atribut
        System.out.println("--- Informasi Buku ---");
        System.out.println("Judul     : " + bukuSaya.judul);
        System.out.println("Pengarang : " + bukuSaya.pengarang);
    }
}

// Class Buku diletakkan di luar class latihan_1 tapi dalam satu file
// Jangan gunakan kata 'public' di depan class Buku jika dalam satu file
class Buku {
    String judul;
    String pengarang;
}