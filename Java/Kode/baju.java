public class baju extends Aksesoris {
    private String untuk, size, merk;

    public baju() {}

    public baju(String id, String nama, String brand, double harga, int stok, String jenis, String bahan, String warna, String untuk, String size, String merk) {
        super(id, nama, brand, harga, stok, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.printf("%-8s | %-4s | %-13s |\n", untuk, size, merk);
    }
}