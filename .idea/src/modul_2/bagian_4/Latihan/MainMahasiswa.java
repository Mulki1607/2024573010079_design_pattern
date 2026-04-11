package modul_2.bagian_4.Latihan;

public class MainMahasiswa {
    public static void main(String[] args) {
        // 1. Membuat Object Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // 2. Mengisi nilai menggunakan SETTER (Bukan mhs.nama = ...)
        mhs.setNama("Mulki");
        mhs.setNim("2024573010079");

        // 3. Mengambil nilai menggunakan GETTER
        System.out.println("--- Data Mahasiswa ---");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("NIM  : " + mhs.getNim());
    }
}