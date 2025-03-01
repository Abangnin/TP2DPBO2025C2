from aksesoris import aksesoris

class baju(aksesoris):
    def __init__(self, id="", nama="", brand="", harga=0, stok=0, jenis="", bahan="", warna="", untuk="", size="", merk=""):
        super().__init__(id, nama, brand, harga, stok, jenis, bahan, warna)
        self.__untuk = untuk
        self.__size = size
        self.__merk = merk
    
    def get_untuk(self):
        return self.__untuk
    
    def set_untuk(self, untuk):
        self.__untuk = untuk
    
    def get_size(self):
        return self.__size
    
    def set_size(self, size):
        self.__size = size
    
    def get_merk(self):
        return self.__merk
    
    def set_merk(self, merk):
        self.__merk = merk
    
    def tampilkan_data(self):
        super().tampilkan_data()
        print(f"{self.__untuk:<8} | {self.__size:<4} | {self.__merk:<13} |")