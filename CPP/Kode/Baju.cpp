#include "Aksesoris.cpp"

class Baju : public Aksesoris {
    string untuk, size, merk;
public:
    Baju(string id="", string nama="", string brand="", double harga=0, int stok=0,
         string jenis="", string bahan="", string warna="", string untuk="", 
         string size="", string merk="")
        : Aksesoris(id, nama, brand, harga, stok, jenis, bahan, warna), 
          untuk(untuk), size(size), merk(merk) {}

    string getUntuk() { return untuk; }
    string getSize() { return size; }
    string getMerk() { return merk; }

    void tampilkanData() const override {
        Aksesoris::tampilkanData();
        cout << setw(8) << untuk << " | " << setw(4) << size << " | " << setw(13) << merk << " |" << endl;
    }
    
};