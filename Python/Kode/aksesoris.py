from petshop import petshop

class aksesoris(petshop):
    def __init__(self, id="", nama="", brand="", harga=0, stok=0, jenis="", bahan="", warna=""):
        super().__init__(id, nama, brand, harga, stok)
        self.__jenis = jenis
        self.__bahan = bahan
        self.__warna = warna
    
    def get_jenis(self):
        return self.__jenis
    
    def set_jenis(self, jenis):
        self.__jenis = jenis
    
    def get_bahan(self):
        return self.__bahan
    
    def set_bahan(self, bahan):
        self.__bahan = bahan
    
    def get_warna(self):
        return self.__warna
    
    def set_warna(self, warna):
        self.__warna = warna
    
    def tampilkan_data(self):
        super().tampilkan_data()
        print(f"{self.__jenis:<10} | {self.__bahan:<8} | {self.__warna:<8} | ", end="")