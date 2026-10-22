public class Motor extends Kendaraan {
    public static final double TARIF_PER_JAM = 2000;

    public Motor(String nomorPlat) {
        super(nomorPlat, JenisKendaraan.MOTOR);
    }

    @Override
    public double hitungBiaya(int jam) {
        return jam * TARIF_PER_JAM;
    }
}
