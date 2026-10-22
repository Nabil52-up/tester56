public class PembayaranTunai implements Pembayaran {
    @Override
    public void bayar(double total) {
        System.out.println("Metode pembayaran : Tunai");
        System.out.printf("Total pembayaran  : Rp%.0f%n", total);
        System.out.println("Pembayaran berhasil!");
    }
}
