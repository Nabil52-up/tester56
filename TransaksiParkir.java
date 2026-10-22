public class TransaksiParkir {
    private static int jumlahTransaksi = 0;

    private final Kendaraan kendaraan;
    private final int jam;
    private final Pembayaran pembayaran;

    public TransaksiParkir(
            Kendaraan kendaraan,
            int jam,
            Pembayaran pembayaran) {

        if (kendaraan == null || pembayaran == null) {
            throw new IllegalArgumentException(
                "Kendaraan dan pembayaran tidak boleh kosong."
            );
        }

        if (jam <= 0) {
            throw new IllegalArgumentException(
                "Lama parkir harus lebih dari 0 jam."
            );
        }

        this.kendaraan = kendaraan;
        this.jam = jam;
        this.pembayaran = pembayaran;
        jumlahTransaksi++;
    }

    public void prosesTransaksi() {
        double total = kendaraan.hitungBiaya(jam);

        System.out.println("\n===== STRUK PARKIR =====");
        System.out.println("Nomor transaksi   : " + jumlahTransaksi);
        System.out.println("Nomor plat        : "
                + kendaraan.getNomorPlat());
        System.out.println("Jenis kendaraan   : "
                + kendaraan.getJenis());
        System.out.println("Lama parkir       : " + jam + " jam");

        pembayaran.bayar(total);

        System.out.println("========================");
    }

    public static int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
}
