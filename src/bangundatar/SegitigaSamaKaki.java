package bangundatar;

public class SegitigaSamaKaki extends BangunDatar {
    private double alas;
    private double tinggi;

    public SegitigaSamaKaki(double alas, double tinggi) {
        super("Segitiga Sama Kaki");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Sisi miring (kaki) dihitung dari Pythagoras
    public double getSisiMiring() {
        return Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + 2 * getSisiMiring();
    }
}