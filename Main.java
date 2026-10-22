import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== SISTEM UANG PARKIR ===");
            System.out.println("1. Parkir Motor");
            System.out.println("2. Parkir Mobil");
            System.out.println("3. Lihat Jumlah Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                case 2:
                    System.out.print("Nomor plat kendaraan: ");
                    String plat = input.nextLine();

                    System.out.print("Lama parkir (jam): ");
                    int jam = input.nextInt();
                    input.nextLine();

                    if (jam <= 0) {
                        System.out.println(
                            "Lama parkir harus lebih dari 0 jam!"
                        );
                        break;
                    }

                    Kendaraan kendaraan;
                    if (pilihan == 1) {
                        kendaraan = new Motor(plat);
                    } else {
                        kendaraan = new Mobil(plat);
                    }

                    Pembayaran pembayaran = new PembayaranTunai();
                    TransaksiParkir transaksi =
                        new TransaksiParkir(
                            kendaraan, jam, pembayaran
                        );

                    transaksi.prosesTransaksi();
                    break;

                case 3:
                    System.out.println(
                        "Jumlah transaksi: "
                        + TransaksiParkir.getJumlahTransaksi()
                    );
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
