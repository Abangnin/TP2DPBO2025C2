class petshop:
    def __init__(self, id="", nama="", brand="", harga=0, stok=0):
        self.__id = id
        self.__nama_produk = nama
        self.__brand = brand
        self.__harga_produk = harga
        self.__stok_produk = stok
    
    def get_id(self):
        return self.__id
    
    def set_id(self, id):
        self.__id = id
    
    def get_nama_produk(self):
        return self.__nama_produk
    
    def set_nama_produk(self, nama):
        self.__nama_produk = nama
    
    def get_brand(self):
        return self.__brand
    
    def set_brand(self, brand):
        self.__brand = brand
    
    def get_harga_produk(self):
        return self.__harga_produk
    
    def set_harga_produk(self, harga):
        self.__harga_produk = harga
    
    def get_stok_produk(self):
        return self.__stok_produk
    
    def set_stok_produk(self, stok):
        self.__stok_produk = stok
    
    def tampilkan_data(self):
        print(f"| {self.__id:<6} | {self.__nama_produk:<18} | {self.__brand:<13} | {self.__harga_produk:<8.0f} | {self.__stok_produk:<4} | ", end="")