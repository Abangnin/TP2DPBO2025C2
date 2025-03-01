#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

class PetShop {
private:
    string id, nama_produk, brand;
    double harga_produk;
    int stok_produk;

public:
    PetShop() {}

    PetShop(string id, string nama, string brand, double harga, int stok)
        : id(id), nama_produk(nama), brand(brand), harga_produk(harga), stok_produk(stok) {}

    virtual void tampilkanData() {
        cout << "| " << left << setw(6) << id << " | "
             << setw(18) << nama_produk << " | "
             << setw(13) << brand << " | "
             << setw(8) << harga_produk << " | "
             << setw(4) << stok_produk << " | ";
    }
};
