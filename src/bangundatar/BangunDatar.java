package bangundatar;

public abstract class BangunDatar {
    // Atribut yang bisa diturunkan ke anak
    protected String nama;

    // Constructor
    public BangunDatar(String nama) {
        this.nama = nama;
    }

    // Method abstract -> WAJIB di-override di class anak
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    // Method konkret yang diwariskan ke anak
    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("===== " + nama + " =====");
        System.out.printf("Luas      : %.2f%n", hitungLuas());
        System.out.printf("Keliling  : %.2f%n", hitungKeliling());
        System.out.println();
    }
}