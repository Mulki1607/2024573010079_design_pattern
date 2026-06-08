package modul_2.bagian_3.Latihan;

public class Main {
    public static void main(String[] args) {
        AkunBank dompet = new AkunBank(100000);

        // 1. Memanggil method PUBLIC (BERHASIL)
        dompet.tampilkanSaldo();

        // 2. MENCOBA AKSES ATRIBUT PRIVATE (AKAN ERROR/MERAH)
        // Jika kamu hapus tanda "//" di bawah, IntelliJ akan protes:
        // System.out.println(dompet.saldo);
    }
}