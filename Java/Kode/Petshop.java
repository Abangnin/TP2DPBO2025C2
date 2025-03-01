public class Petshop {
    private String id;
    private String namaProduk;
    private String brand;
    private double hargaProduk;
    private int stokProduk;
    
    public Petshop(String id, String namaProduk, String brand, double hargaProduk, int stokProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.brand = brand;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }
    
    public Petshop() {
        this("", "", "", 0, 0);
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public double getHargaProduk() {
        return hargaProduk;
    }
    
    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
    
    public int getStokProduk() {
        return stokProduk;
    }
    
    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }
    
    public void tampilkanData() {
        System.out.printf("| %-6s | %-18s | %-13s | %-8.0f | %-4d | ", id, namaProduk, brand, hargaProduk, stokProduk);
    }
}