public class petshop {
    private String id, namaProduk, brand;
    private double hargaProduk;
    private int stokProduk;

    public petshop() {}

    public petshop(String id, String nama, String brand, double harga, int stok) {
        this.id = id;
        this.namaProduk = nama;
        this.brand = brand;
        this.hargaProduk = harga;
        this.stokProduk = stok;
    }

    public void tampilkanData() {
        System.out.printf("| %-6s | %-18s | %-13s | %-8.0f | %-4d | ", 
                id, namaProduk, brand, hargaProduk, stokProduk);
    }
}