from baju import baju
import sys

# 5 data awal
daftar_produk = [
    baju("Z001", "Kostum Kucing", "MeowBrand", 185000, 20, "Baju", "Katun", "Merah", "Kucing", "M", "MeowBrand"),
    baju("Z002", "Kalung Anjing", "DoggyLux", 45000, 35, "Aksesoris", "Kulit", "Kuning", "Anjing", "L", "DoggyLux"),
    baju("Z003", "Jaket Anjing", "JacketDog", 250000, 18, "Baju", "Denim", "Biru", "Anjing", "XL", "JacketDog"),
    baju("Z004", "Topi Anjing", "PawDog", 100000, 12, "Aksesoris", "Wol", "Abu-abu", "Anjing", "L", "PawDog"),
    baju("Z005", "Kerah Kucing", "MeowWear", 199000, 20, "Baju", "Katun", "Putih", "Kucing", "S", "MeowWear")
]

# Fungsi untuk mencetak header tabel
def print_header():
    print("\n\n+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+")
    print("| ID     | Nama Produk        | Brand         | Harga    | Stok | Jenis      | Bahan    | Warna    | Untuk    | Size | Merk          |")
    print("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+")

# Fungsi untuk mencetak footer tabel
def print_footer():
    print("+--------+--------------------+---------------+----------+------+------------+----------+----------+----------+------+---------------+")

# Fungsi untuk menampilkan semua data
def show_data():
    print_header()
    for produk in daftar_produk:
        produk.tampilkan_data()
    print_footer()

# Fungsi untuk menambahkan data baru
def add_product():
    print("\n\nMasukkan data produk baru:")
    
    id = input("ID: ")
    nama = input("Nama Produk: ")
    brand = input("Brand: ")
    
    try:
        harga = float(input("Harga: "))
        stok = int(input("Stok: "))
    except ValueError:
        print("Harga dan stok harus berupa angka!")
        return
    
    jenis = input("Jenis: ")
    bahan = input("Bahan: ")
    warna = input("Warna: ")
    untuk = input("Untuk (Kucing/Anjing): ")
    size = input("Size: ")
    merk = input("Merk: ")

    # Membuat objek baru dan menambahkannya ke daftar produk
    produk_baru = baju(id, nama, brand, harga, stok, jenis, bahan, warna, untuk, size, merk)
    daftar_produk.append(produk_baru)

    print("\n\n+=====================================+")
    print("|  Produk berhasil ditambahkan ngabb  |")
    print("+=====================================+")

# Menu utama 
def menu():
    while True:
        print("\n+=== Abangnin PETSHOP ===+")
        print("+========================+")
        print("| 1. Lihat Data Produk   |")
        print("| 2. Tambah Produk       |")
        print("| 3. Keluar              |")
        print("+========================+")
        
        try:
            pilihan = int(input("Mangga dipilih: "))
            
            if pilihan == 1:
                show_data()
            elif pilihan == 2:
                add_product()
            elif pilihan == 3:
                print("\n\n+==============================+")
                print("|      Terima kasih ngabb      |")
                print("+==============================+")
                print("| Jangan lupa dateng kembali y |")
                print("+==============================+")
                break
            else:
                print("\nPilihan tidak valid ngabb!")
        except ValueError:
            print("\nMasukkan angka yang valid ngabb!")
        except EOFError:
            # Reached end of file if using file redirection
            print("\nInput file selesai dibaca.")
            break

# Menjalankan program
if __name__ == "__main__":
    menu()