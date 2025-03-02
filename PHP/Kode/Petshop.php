<?php
class petshop {
    private $id;
    private $nama_produk;
    private $harga_produk;
    private $stok_produk;
    private $foto_produk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk) {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto_produk = $foto_produk;
    }

    public function getData() {
        return [
            'id' => $this->id,
            'nama' => $this->nama_produk,
            'harga' => $this->harga_produk,
            'stok' => $this->stok_produk,
            'foto' => $this->foto_produk
        ];
    }
}
?>