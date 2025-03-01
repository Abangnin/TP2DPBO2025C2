#include "Baju.cpp"
#include <vector>
#include <iomanip>
#include <iostream>

using namespace std;

vector<Baju> daftarProduk = {
    {"A001", "Kemeja Kucing", "MeowBrand", 150000, 10, "Baju", "Katun", "Merah", "Kucing", "M", "MeowStyle"},
    {"B002", "Kalung Anjing", "DoggyLux", 50000, 20, "Aksesoris", "Kulit", "Hitam", "Anjing", "L", "DoggyLux"},
    {"C003", "Jaket Anjing", "FurryWear", 200000, 5, "Baju", "Denim", "Biru", "Anjing", "XL", "FurryCoat"},
    {"D004", "Topi Kucing", "PawHat", 75000, 15, "Aksesoris", "Wol", "Abu-abu", "Kucing", "S", "PawHat"},
    {"E005", "Kaos Kucing", "MeowWear", 120000, 12, "Baju", "Katun", "Putih", "Kucing", "L", "MeowWear"}
};

// Fungsi untuk mencetak header tabel
void printHeader() {
    cout << "+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+\n";
    cout << "| ID     | Nama Produk        | Brand         | Harga    | Stok | Jenis      | Bahan    | Warna    | Untuk    | Size | Merk          |\n";
    cout << "+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+\n";
}

// Fungsi untuk mencetak footer tabel
void printFooter() {
    cout << "+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+\n";
}

// Fungsi untuk menampilkan semua data
void showData() {
    printHeader();
    for (auto &produk : daftarProduk) {
        produk.tampilkanData();
    }
    printFooter();
}

// Fungsi untuk menambahkan data baru
void addProduct() {
    string id, nama, brand, jenis, bahan, warna, untuk, size, merk;
    double harga;
    int stok;

    cout << "\nMasukkan data produk baru:\n";
    cout << "ID: ";
    cin >> id;
    cin.ignore(); 
    cout << "Nama Produk: ";
    getline(cin, nama);
    cout << "Brand: ";
    getline(cin, brand);
    cout << "Harga: ";
    cin >> harga;
    cout << "Stok: ";
    cin >> stok;
    cin.ignore();
    cout << "Jenis: ";
    getline(cin, jenis);
    cout << "Bahan: ";
    getline(cin, bahan);
    cout << "Warna: ";
    getline(cin, warna);
    cout << "Untuk (Kucing/Anjing): ";
    getline(cin, untuk);
    cout << "Size: ";
    cin >> size;
    cin.ignore();
    cout << "Merk: ";
    getline(cin, merk);

    // Menambahkan ke dalam vektor daftarProduk
    daftarProduk.push_back(Baju(id, nama, brand, harga, stok, jenis, bahan, warna, untuk, size, merk));

    cout << "\nProduk berhasil ditambahkan ngabb!\n";
}

void menu() {
    int pilihan;
    do {
        cout << "\n+==== Menu Pet Shop ====+\n";
        cout << "| 1. Lihat Data Produk  |\n";
        cout << "| 2. Tambah Produk      |\n";
        cout << "| 3. Keluar             |\n";
        cout << "+=======================+\n";
        cout << "Mangga dipilih: ";
        cin >> pilihan;

        switch (pilihan) {
            case 1:
                showData();
                break;
            case 2:
                addProduct();
                break;
            case 3:
                cout << "\nTerima kasih ngabb\n";
                cout << "Jangan lupa dateng kembali yahh\n";
                break;
            default:
                cout << "\nPilihan tidak valid ngabb!\n";
        }
    } while (pilihan != 3);
}

int main() {
    menu(); // Memanggil menu utama
    return 0;
}
