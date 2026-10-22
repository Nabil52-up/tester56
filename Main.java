public class Main {
    public static void main(String[] args) {

        // Transaksi parkir motor
        Kendaraan motor = new Motor("B 1234 ABC");
        Pembayaran bayarMotor = new PembayaranTunai();

        TransaksiParkir transaksi1 =
            new TransaksiParkir(motor, 3, bayarMotor);

        transaksi1.prosesTransaksi();

        // Transaksi parkir mobil
        Kendaraan mobil = new Mobil("D 5678 XYZ");
        Pembayaran bayarMobil = new PembayaranTunai();

        TransaksiParkir transaksi2 =
            new TransaksiParkir(mobil, 2, bayarMobil);

        transaksi2.prosesTransaksi();

        // Jumlah transaksi
        System.out.println(
            "Jumlah transaksi: "
            + TransaksiParkir.getJumlahTransaksi()
        );
    }
}