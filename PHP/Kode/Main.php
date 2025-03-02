<?php
require_once 'Baju.php';
session_start();

spl_autoload_register(function ($class_name) {
    require_once $class_name . '.php';
});

$upload_dir = "uploads/";
if (!is_dir($upload_dir)) {
    mkdir($upload_dir, 0777, true);
}

// Data awal
if (!isset($_SESSION['products'])) {
    $_SESSION['products'] = [
        new Baju("A001", "Kalung Kucing Berlian", 50000, 15, "uploads/kalung_kucing.jpg", "Kalung", "Kulit Sintetis", "Merah", "Kucing", "M", "MeowyStyle"),
        new Baju("A002", "Gelang Kaki Anjing", 30000, 10, "uploads/gelang_anjing.jpeg", "Gelang", "Karet", "Biru", "Anjing", "S", "PawCharm"),
        new Baju("A003", "Topi Kucing Fashion", 45000, 5, "uploads/topi_kucing.jpeg", "Topi", "Kain", "Hijau", "Kucing", "S", "FurryFashion"),
        new Baju("A004", "Dasi Anjing Formal", 10000, 8, "uploads/dasi_anjing.jpeg", "Dasi", "Satin", "Merah", "Anjing", "M", "DogStyle"),
        new Baju("A005", "Kacamata Kucing ", 25000, 12, "uploads/kacamata_kucing.jpeg", "Kacamata", "Plastik", "Hitam", "Kucing", "S", "GlassCat")
    ];
}

// Penambahan produk baru
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Cek apakah file berhasil diunggah
    if (isset($_FILES['foto']) && $_FILES['foto']['error'] === UPLOAD_ERR_OK) {
        $upload_file = $upload_dir . basename($_FILES["foto"]["name"]);

        // Pindahkan file yang diunggah ke folder "uploads/"
        if (move_uploaded_file($_FILES["foto"]["tmp_name"], $upload_file)) {
            $new_product = new Baju(
                $_POST['id'], $_POST['nama'], $_POST['harga'], $_POST['stok'], $upload_file,
                $_POST['jenis'], $_POST['bahan'], $_POST['warna'], $_POST['untuk'], $_POST['size'], $_POST['merk']
            );
            $_SESSION['products'][] = $new_product;
            header('Location: ' . $_SERVER['PHP_SELF']);
            exit;
        } else {
            echo "Gagal mengunggah file.";
        }
    } else {
        echo "Harap pilih file gambar untuk diunggah.";
    }
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>PetShop 2.0</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
            text-align: center;
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
        }
        th {
            background-color: #f2f2f2;
        }
        img {
            width: 70px;
            height: 70px;
            object-fit: cover;
        }
        form {
            width: 50%;
            margin: auto;
            background: #f9f9f9;
            padding: 15px;
            border-radius: 5px;
        }
        input, select {
            padding: 8px;
            width: 100%;
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <h1 align="center">Welcome to PetShop Abangnin</h1>
    <h2 align="center">Show</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Nama Produk</th>
            <th>Harga</th>
            <th>Stok</th>
            <th>Jenis</th>
            <th>Bahan</th>
            <th>Warna</th>
            <th>Untuk</th>
            <th>Size</th>
            <th>Merk</th>
            <th>Foto</th>
        </tr>
        <?php foreach ($_SESSION['products'] as $product) { 
            $data = $product->getData();
        ?>
        <tr>
            <td><?= $data['id'] ?></td>
            <td><?= $data['nama'] ?></td>
            <td><?= $data['harga'] ?></td>
            <td><?= $data['stok'] ?></td>
            <td><?= $data['jenis'] ?? '-' ?></td>
            <td><?= $data['bahan'] ?? '-' ?></td>
            <td><?= $data['warna'] ?? '-' ?></td>
            <td><?= $data['untuk'] ?? '-' ?></td>
            <td><?= $data['size'] ?? '-' ?></td>
            <td><?= $data['merk'] ?? '-' ?></td>
            <td><img src="<?= $data['foto'] ?>" alt="Produk"></td>
        </tr>
        <?php } ?>
    </table>

    <h2 align="center">Tambah Produk Baru</h2>
    <form method="POST" enctype="multipart/form-data">
        ID: <input type="text" name="id" required><br>
        Nama Produk: <input type="text" name="nama" required><br>
        Harga: <input type="number" name="harga" required><br>
        Stok: <input type="number" name="stok" required><br>
        Jenis: <input type="text" name="jenis"><br>
        Bahan: <input type="text" name="bahan"><br>
        Warna: <input type="text" name="warna"><br>
        Untuk: <input type="text" name="untuk"><br>
        Size: <input type="text" name="size"><br>
        Merk: <input type="text" name="merk"><br>
        Foto: <input type="file" name="foto" accept="image/*" required><br>
        <button type="submit">Tambah</button>
    </form>
</body>
</html>
