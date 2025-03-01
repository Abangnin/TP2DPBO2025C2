import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private static ArrayList<baju> daftarProduk = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        daftarProduk.add(new baju("A001", "Kemeja Kucing", "MeowBrand", 170000, 15, "Baju", "Katun", "Merah", "Kucing", "S", "MeowStyle"));
        daftarProduk.add(new baju("A002", "Kalung Anjing", "DoggyLux", 90000, 25, "Aksesoris", "Kulit", "Hitam", "Anjing", "M", "DoggyLux"));
        daftarProduk.add(new baju("A003", "Jaket Anjing", "FurryWear", 300000, 9, "Baju", "Denim", "Biru", "Anjing", "L", "FurryCoat"));
        daftarProduk.add(new baju("A004", "Topi Kucing", "PawHat", 70000, 17, "Aksesoris", "Wol", "Abu-abu", "Kucing", "S", "PawHat"));
        daftarProduk.add(new baju("A005", "Kaos Kucing", "MeowWear", 100000, 13, "Baju", "Katun", "Putih", "Kucing", "M", "MeowWear"));
    }

    private static void printHeader() {
        System.out.println("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
        System.out.println("| ID     | Nama Produk        | Brand         | Harga    | Stok | Jenis      | Bahan    | Warna    | Untuk    | Size | Merk          |");
        System.out.println("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
    }

    private static void printFooter() {
        System.out.println("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
    }

    private static void showData() {
        printHeader();
        for (baju produk : daftarProduk) {
            produk.tampilkanData();
        }
        printFooter();
    }

    private static void addProduct() {
        String id, nama, brand, jenis, bahan, warna, untuk, size, merk;
        double harga;
        int stok;

        System.out.println("\nMasukkan data produk baru bwanggg:");
        System.out.print("ID: ");
        id = scanner.nextLine();
        
        System.out.print("Nama Produk: ");
        nama = scanner.nextLine();
        
        System.out.print("Brand: ");
        brand = scanner.nextLine();
        
        System.out.print("Harga: ");
        harga = scanner.nextDouble();
        
        System.out.print("Stok: ");
        stok = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Jenis: ");
        jenis = scanner.nextLine();
        
        System.out.print("Bahan: ");
        bahan = scanner.nextLine();
        
        System.out.print("Warna: ");
        warna = scanner.nextLine();
        
        System.out.print("Untuk (Kucing/Anjing): ");
        untuk = scanner.nextLine();
        
        System.out.print("Size: ");
        size = scanner.nextLine();
        
        System.out.print("Merk: ");
        merk = scanner.nextLine();

        // Add to product list
        daftarProduk.add(new baju(id, nama, brand, harga, stok, jenis, bahan, warna, untuk, size, merk));

        System.out.println("\nProduk berhasil ditambahkan ya bwanggg!");
    }

    private static void menu() {
        int pilihan;
        do {
            System.out.println("\n+=======================+");
            System.out.println("|         MENU          |");
            System.out.println("|        PETSHOP        |");
            System.out.println("+=======================+");
            System.out.println("| 1. Lihat Data Produk  |");
            System.out.println("| 2. Tambah Produk      |");
            System.out.println("| 3. Keluar             |");
            System.out.println("+=======================+");
            System.out.print("Monggo bisa dipilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    showData();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    System.out.println("Terimakasih, Jangan lupa dateng kembali yahh :)");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid ya bwanggg!");
            }
        } while (pilihan != 3);
    }

    public static void main(String[] args) {
        menu();
    }
}