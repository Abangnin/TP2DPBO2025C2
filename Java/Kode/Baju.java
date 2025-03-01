public class Baju extends Aksesoris {
    private String untuk;
    private String size;
    private String merk;
    
    // Constructor
    public Baju(String id, String namaProduk, String brand, double hargaProduk, 
               int stokProduk, String jenis, String bahan, String warna,
               String untuk, String size, String merk) {
        super(id, namaProduk, brand, hargaProduk, stokProduk, jenis, bahan, warna);
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }
    
    // Default constructor
    public Baju() {
        super();
        this.untuk = "";
        this.size = "";
        this.merk = "";
    }
    
    // Getter and setter for untuk
    public String getUntuk() {
        return untuk;
    }
    
    public void setUntuk(String untuk) {
        this.untuk = untuk;
    }
    
    // Getter and setter for size
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    // Getter and setter for merk
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Override method to display data
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.printf("%-8s | %-4s | %-13s |\n", untuk, size, merk);
    }
}