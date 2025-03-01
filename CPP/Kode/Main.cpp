#include "Baju.cpp"

#include <iostream>
#include <fstream>
#include <vector>
using namespace std;

vector<Baju> daftarProduk = {
    Baju("Z001", "Kostum Kucing", "MeowBrand", 185000, 20, "Baju", "Katun", "Merah", "Kucing", "M", "MeowBrand"),
    Baju("Z002", "Kalung Anjing", "DoggyLux", 45000, 35, "Aksesoris", "Kulit", "Kuning", "Anjing", "L", "DoggyLux"),
    Baju("Z003", "Jaket Anjing", "JacketDog", 250000, 18, "Baju", "Denim", "Biru", "Anjing", "XL", "JacketDog"),
    Baju("Z004", "Topi Anjing", "PawDog", 100000, 12, "Aksesoris", "Wol", "Abu-abu", "Anjing", "L", "PawDog"),
    Baju("Z005", "Kerah Kucing", "MeowWear", 199000, 20, "Baju", "Katun", "Putih", "Kucing", "S", "MeowWear")
};

void nampilkanTabel() {
    cout << "\n\n+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+" << endl;
    cout << "|   ID   |     Nama Produk    |     Brand     |   Harga  | Stok |   Jenis    |   Bahan  |   Warna  |   Untuk  | Size |      Merk     |" << endl;
    cout << "+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+" << endl;
    for (const auto& produk : daftarProduk) {
        produk.tampilkanData();
    }
    cout << "+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+" << endl;
}

void addProductManual() {
    string id, nama, brand, jenis, bahan, warna, untuk, size, merk;
    double harga;
    int stok;

    cout << "ID: "; cin >> id;
    cout << "Nama Produk: "; cin.ignore(); getline(cin, nama);
    cout << "Brand: "; getline(cin, brand);
    cout << "Harga: "; cin >> harga;
    cout << "Stok: "; cin >> stok;
    cout << "Jenis: "; cin.ignore(); getline(cin, jenis);
    cout << "Bahan: "; getline(cin, bahan);
    cout << "Warna: "; getline(cin, warna);
    cout << "Untuk (Kucing/Anjing): "; getline(cin, untuk);
    cout << "Size: "; getline(cin, size);
    cout << "Merk: "; getline(cin, merk);

    daftarProduk.push_back(Baju(id, nama, brand, harga, stok, jenis, bahan, warna, untuk, size, merk));
    cout << "\n\n+================================+" << endl;
    cout << "Produk berhasil ditambah Abangkuu!" << endl;
    cout << "+================================+" << endl;
}

void menu() {
    int pilihan;
    do {
        cout << "\n+========================+" << endl;
        cout << "|=====   Abangnin   =====|" << endl;
        cout << "|=====   PET SHOP   =====|" << endl;
        cout << "+========================+" << endl;
        cout << "| 1. Lihat Data Produk   |" << endl;
        cout << "| 2. Tambah Produk       |" << endl;
        cout << "| 3. Keluar              |" << endl;
        cout << "+========================+" << endl;
        cout << "Pilihan: ";
        cin >> pilihan;

        switch (pilihan) {
            case 1:
                nampilkanTabel();
                break;
            case 2:
                addProductManual();
                break;
            case 3:
                cout << "\n\n+==========================+" << endl;
                cout << "|  Terima kasih Abangkuu!  |" << endl;
                cout << "+==========================+" << endl;
                cout << "|  Silahkan datang kembali |" << endl;
                cout << "+==========================+" << endl;
                return;
            default:
                cout << "\nPilihan tidak valid Abangkuu!" << endl;
        }
    } while (true);
}

int main() {
    menu();
    return 0;
}
