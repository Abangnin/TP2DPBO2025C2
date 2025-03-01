#include <iostream>
#include <iomanip>
using namespace std;

class Petshop {
protected:
    string id, nama, brand;
    double harga;
    int stok;
public:
    Petshop(string id="", string nama="", string brand="", double harga=0, int stok=0)
        : id(id), nama(nama), brand(brand), harga(harga), stok(stok) {}

    string getId() { return id; }
    string getNama() { return nama; }
    string getBrand() { return brand; }
    double getHarga() { return harga; }
    int getStok() { return stok; }

    virtual void tampilkanData() const {
        cout << "| " << setw(6) << id << " | " << setw(18) << nama << " | " << setw(13) << brand 
             << " | " << setw(8) << harga << " | " << setw(4) << stok << " | ";
    }
    
};