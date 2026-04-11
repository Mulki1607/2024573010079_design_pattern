package modul_2.bagian_3.Latihan;

public class AkunBank {
    // Atribut PRIVATE (Hanya bisa diakses di dalam class AkunBank)
    private double saldo;

    // Constructor untuk mengisi saldo awal
    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method PUBLIC (Bisa dipanggil dari luar untuk melihat isi saldo)
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp" + this.saldo);
    }
}