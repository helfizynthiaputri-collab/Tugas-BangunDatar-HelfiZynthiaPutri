package bangundatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] daftar = {
            new SegitigaSamaKaki(6, 4),
            new PersegiPanjang(8, 5),
            new Lingkaran(7)
        };

        for (BangunDatar bd : daftar) {
            bd.tampilkanInfo();
        }
    }
}