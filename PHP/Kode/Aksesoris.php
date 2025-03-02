<?php
require_once 'Petshop.php';

class Aksesoris extends petshop {
    private $jenis;
    private $bahan;
    private $warna;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    public function getData() {
        $data = parent::getData();
        $data['jenis'] = $this->jenis;
        $data['bahan'] = $this->bahan;
        $data['warna'] = $this->warna;
        return $data;
    }
}
?>