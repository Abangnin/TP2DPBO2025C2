public class Petshop {
    private String id;
    private String namaProduk;
    private String brand;
    private double hargaProduk;
    private int stokProduk;
    
    // Constructor
    public Petshop(String id, String namaProduk, String brand, double hargaProduk, int stokProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.brand = brand;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }
    
    // Default constructor
    public Petshop() {
        this("", "", "", 0, 0);
    }
    
    // Getter and setter for id
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    // Getter and setter for namaProduk
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    // Getter and setter for brand
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // Getter and setter for hargaProduk
    public double getHargaProduk() {
        return hargaProduk;
    }
    
    public void setHargaProduk(double hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
    
    // Getter and setter for stokProduk
    public int getStokProduk() {
        return stokProduk;
    }
    
    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }
    
    // Method to display data
    public void tampilkanData() {
        System.out.printf("| %-6s | %-18s | %-13s | %-8.0f | %-4d | ", id, namaProduk, brand, hargaProduk, stokProduk);
    }
}