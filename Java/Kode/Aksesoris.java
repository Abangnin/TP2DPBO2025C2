public class Aksesoris extends petshop {
    private String jenis, bahan, warna;

    public Aksesoris() {}

    public Aksesoris(String id, String nama, String brand, double harga, int stok, String jenis, String bahan, String warna) {
        super(id, nama, brand, harga, stok);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.printf("%-10s | %-8s | %-8s | ", jenis, bahan, warna);
    }
}