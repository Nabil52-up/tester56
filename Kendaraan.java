public abstract class Kendaraan {
    private String nomorPlat;
    private JenisKendaraan jenis;

    public Kendaraan(String nomorPlat, JenisKendaraan jenis) {
        this.nomorPlat = nomorPlat;
        this.jenis = jenis;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public JenisKendaraan getJenis() {
        return jenis;
    }

    public abstract double hitungBiaya(int jam);
}
