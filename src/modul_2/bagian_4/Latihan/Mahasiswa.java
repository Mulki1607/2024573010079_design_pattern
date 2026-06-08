package modul_2.bagian_4.Latihan;

public class Mahasiswa {
    // Atribut dikunci (Private)
    private String nama;
    private String nim;

    // Getter untuk Nama (Pintu Keluar)
    public String getNama() {
        return nama;
    }

    // Setter untuk Nama (Pintu Masuk)
    public void setNama(String namaBaru) {
        this.nama = namaBaru;
    }

    // Getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Setter untuk NIM
    public void setNim(String nimBaru) {
        this.nim = nimBaru;
    }
}