#include "PetShop.cpp"

class Aksesoris : public Petshop {
protected:
    string jenis, bahan, warna;
public:
    Aksesoris(string id="", string nama="", string brand="", double harga=0, int stok=0,
              string jenis="", string bahan="", string warna="")
        : Petshop(id, nama, brand, harga, stok), jenis(jenis), bahan(bahan), warna(warna) {}

    string getJenis() { return jenis; }
    string getBahan() { return bahan; }
    string getWarna() { return warna; }

    void tampilkanData() const override {
        Petshop::tampilkanData();
        cout << setw(10) << jenis << " | " << setw(8) << bahan << " | " << setw(8) << warna << " | ";
    }
    
};