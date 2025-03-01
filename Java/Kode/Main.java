import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Daftar produk
    private static ArrayList<Baju> daftarProduk = new ArrayList<>();
    
    // Scanner untuk input
    private static Scanner scanner;
    
    // Inisialisasi data awal
    private static void dataAwal() {
        daftarProduk.add(new Baju("Z001", "Kostum Kucing", "MeowBrand", 185000, 20, "Baju", "Katun", "Merah", "Kucing", "M", "MeowBrand"));
        daftarProduk.add(new Baju("Z002", "Kalung Anjing", "DoggyLux", 45000, 35, "Aksesoris", "Kulit", "Kuning", "Anjing", "L", "DoggyLux"));
        daftarProduk.add(new Baju("Z003", "Jaket Anjing", "JacketDog", 250000, 18, "Baju", "Denim", "Biru", "Anjing", "XL", "JacketDog"));
        daftarProduk.add(new Baju("Z004", "Topi Anjing", "PawDog", 100000, 12, "Aksesoris", "Wol", "Abu-abu", "Anjing", "L", "PawDog"));
        daftarProduk.add(new Baju("Z005", "Kerah Kucing", "MeowWear", 199000, 20, "Baju", "Katun", "Putih", "Kucing", "S", "MeowWear"));
    }
    
    // Fungsi untuk mencetak header tabel
    private static void printHeader() {
        System.out.println("\n\n+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
        System.out.println("| ID     | Nama Produk        | Brand         | Harga    | Stok | Jenis      | Bahan    | Warna    | Untuk    | Size | Merk          |");
        System.out.println("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
    }
    
    // Fungsi untuk mencetak footer tabel
    private static void printFooter() {
        System.out.println("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+");
    }
    
    // Fungsi untuk menampilkan semua data
    private static void tampilData() {
        printHeader();
        for (Baju produk : daftarProduk) {
            produk.tampilkanData();
        }
        printFooter();
    }
    
    // Fungsi untuk menambahkan data baru
    private static void nambahProduk() {
        System.out.println("\n\nMasukkan data produk baru:");
        
        System.out.print("ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Nama Produk: ");
        String nama = scanner.nextLine();
        
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        
        double harga = 0;
        int stok = 0;
        
        try {
            System.out.print("Harga: ");
            harga = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Stok: ");
            stok = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Harga dan stok harus berupa angka!");
            return;
        }
        
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        
        System.out.print("Bahan: ");
        String bahan = scanner.nextLine();
        
        System.out.print("Warna: ");
        String warna = scanner.nextLine();
        
        System.out.print("Untuk (Kucing/Anjing): ");
        String untuk = scanner.nextLine();
        
        System.out.print("Size: ");
        String size = scanner.nextLine();
        
        System.out.print("Merk: ");
        String merk = scanner.nextLine();
        
        // Membuat objek baru dan menambahkannya ke daftar produk
        Baju produkBaru = new Baju(id, nama, brand, harga, stok, jenis, bahan, warna, untuk, size, merk);
        daftarProduk.add(produkBaru);
        
        System.out.println("\n\n+====================================+");
        System.out.println("| Produk berhasil ditambahkan ngabb! |");
        System.out.println("+====================================+");
    }
    
    // Menu utama
    private static void menu() {
        boolean running = true;
        
        while (running) {
            System.out.println("\n+========================+");
            System.out.println("+=== Abangnin PETSHOP ===+");
            System.out.println("+========================+");
            System.out.println("| 1. Lihat Data Produk   |");
            System.out.println("| 2. Tambah Produk       |");
            System.out.println("| 3. Keluar              |");
            System.out.println("+========================+");
            
            System.out.print("Mangga dipilih: ");
            
            try {
                int pilihan = Integer.parseInt(scanner.nextLine());
                
                switch (pilihan) {
                    case 1:
                        tampilData();
                        break;
                    case 2:
                        nambahProduk();
                        break;
                    case 3:
                        System.out.println("\n\n+==============================+");
                        System.out.println("|     Terima kasih ngabb       |");
                        System.out.println("| Jangan lupa dateng kembali y |");
                        System.out.println("+==============================+");
                        running = false;
                        break;
                    default:
                        System.out.println("\nPilihan tidak valid ngabb!");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nMasukkan angka yang valid ngabb!");
            } catch (Exception e) {
                if (scanner.hasNextLine()) {
                    System.out.println("\nTerjadi kesalahan: " + e.getMessage());
                } else {
                    System.out.println("\nInput file selesai dibaca.");
                    running = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // Inisialisasi data awal
        dataAwal();
        
        // Inisialisasi scanner dan menjalankan menu
        if (args.length > 0 && args[0].equals("file")) {
            // Mode file input
            try {
                scanner = new Scanner(new File("input.txt"));
                System.out.println("Menggunakan input dari file input.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File input.txt tidak ditemukan! Menggunakan input manual.");
                scanner = new Scanner(System.in);
            }
        } else {
            // Mode input manual
            scanner = new Scanner(System.in);
        }
        
        menu();
        
        // Tutup scanner
        scanner.close();
    }
}