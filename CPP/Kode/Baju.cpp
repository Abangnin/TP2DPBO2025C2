#include "Aksesoris.cpp"

class Baju : public Aksesoris {
private:
    string untuk, size, merk;

public:
    Baju() {}

    Baju(string id, string nama, string brand, double harga, int stok, string jenis, string bahan, string warna, string untuk, string size, string merk)
        : Aksesoris(id, nama, brand, harga, stok, jenis, bahan, warna), untuk(untuk), size(size), merk(merk) {}

    void tampilkanData() override {
        Aksesoris::tampilkanData();
        cout << setw(8) << untuk << " | "
             << setw(4) << size << " | "
             << setw(13) << merk << " |" << endl;
    }
};
