#include "PetShop.cpp"

class Aksesoris : public PetShop {
private:
    string jenis, bahan, warna;

public:
    Aksesoris() {}

    Aksesoris(string id, string nama, string brand, double harga, int stok, string jenis, string bahan, string warna)
        : PetShop(id, nama, brand, harga, stok), jenis(jenis), bahan(bahan), warna(warna) {}

    void tampilkanData() override {
        PetShop::tampilkanData();
        cout << setw(10) << jenis << " | "
             << setw(8) << bahan << " | "
             << setw(8) << warna << " | ";
    }
};
