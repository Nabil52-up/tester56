public class Mobil extends Kendaraan {
    public static final double TARIF_PER_JAM = 5000;

    public Mobil(String nomorPlat) {
        super(nomorPlat, JenisKendaraan.MOBIL);
    }

    @Override
    public double hitungBiaya(int jam) {
        return jam * TARIF_PER_JAM;
    }
}
