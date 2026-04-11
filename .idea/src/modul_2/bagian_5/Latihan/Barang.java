package modul_2.bagian_5.Latihan;

public class Barang {
    String namaBarang;
    double harga;

    // 1. Default Constructor (Tanpa Parameter)
    public Barang() {
        this.namaBarang = "Belum ada nama";
        this.harga = 0.0;
    }

    // 2. Parameterized Constructor (Dengan Parameter)
    public Barang(String nama, double hargaBaru) {
        this.namaBarang = nama;
        this.harga = hargaBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang + " | Harga: " + harga);
    }
}