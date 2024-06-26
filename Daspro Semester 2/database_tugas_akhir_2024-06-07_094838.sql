-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: database_tugas_akhir
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id_admin` varchar(30) NOT NULL,
  `nama_admin` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `hak_akses` varchar(45) DEFAULT NULL,
  `tanggal_dibuat` datetime DEFAULT NULL,
  `status` enum('Aktif','Tidak Aktif') DEFAULT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

--
-- Table structure for table `detail_pesanan`
--

DROP TABLE IF EXISTS `detail_pesanan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_pesanan` (
  `id_detail_pesanan` varchar(15) NOT NULL,
  `id_pesanan` varchar(15) NOT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) NOT NULL,
  `jumlah` int(4) NOT NULL,
  `harga_satuan` double NOT NULL,
  PRIMARY KEY (`id_detail_pesanan`),
  KEY `id_pesanan` (`id_pesanan`,`id_produk`,`id_jasa`),
  KEY `id_jasa` (`id_jasa`),
  KEY `id_produk` (`id_produk`),
  CONSTRAINT `detail_pesanan_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`),
  CONSTRAINT `detail_pesanan_ibfk_2` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`),
  CONSTRAINT `detail_pesanan_ibfk_3` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_pesanan`
--

/*!40000 ALTER TABLE `detail_pesanan` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_pesanan` ENABLE KEYS */;

--
-- Table structure for table `diskon`
--

DROP TABLE IF EXISTS `diskon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diskon` (
  `id_diskon` varchar(15) NOT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) NOT NULL,
  `persentase_diskon` int(4) NOT NULL,
  `tanggal_mulai` datetime NOT NULL,
  `tanggal_berakhir` datetime NOT NULL,
  PRIMARY KEY (`id_diskon`),
  KEY `id_produk` (`id_produk`,`id_jasa`),
  KEY `id_jasa` (`id_jasa`),
  CONSTRAINT `diskon_ibfk_1` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`),
  CONSTRAINT `diskon_ibfk_2` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diskon`
--

/*!40000 ALTER TABLE `diskon` DISABLE KEYS */;
/*!40000 ALTER TABLE `diskon` ENABLE KEYS */;

--
-- Table structure for table `jasa`
--

DROP TABLE IF EXISTS `jasa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jasa` (
  `id_jasa` varchar(15) NOT NULL,
  `nama_jasa` varchar(50) NOT NULL,
  `deskripsi` varchar(250) NOT NULL,
  `harga` double NOT NULL,
  `id_penjual` varchar(15) NOT NULL,
  `riwayat_penilaian_ulasan` varchar(45) NOT NULL,
  `id_keranjang` varchar(15) NOT NULL,
  `id_kategori` varchar(15) NOT NULL,
  PRIMARY KEY (`id_jasa`),
  KEY `id_penjual` (`id_penjual`,`id_keranjang`,`id_kategori`),
  KEY `id_keranjang` (`id_keranjang`),
  KEY `id_kategori` (`id_kategori`),
  CONSTRAINT `jasa_ibfk_1` FOREIGN KEY (`id_penjual`) REFERENCES `penjual` (`id_penjual`),
  CONSTRAINT `jasa_ibfk_2` FOREIGN KEY (`id_keranjang`) REFERENCES `keranjang` (`id_keranjang`),
  CONSTRAINT `jasa_ibfk_3` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jasa`
--

/*!40000 ALTER TABLE `jasa` DISABLE KEYS */;
/*!40000 ALTER TABLE `jasa` ENABLE KEYS */;

--
-- Table structure for table `kategori`
--

DROP TABLE IF EXISTS `kategori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kategori` (
  `id_kategori` varchar(15) NOT NULL,
  `nama_kategori` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kategori`
--

/*!40000 ALTER TABLE `kategori` DISABLE KEYS */;
/*!40000 ALTER TABLE `kategori` ENABLE KEYS */;

--
-- Table structure for table `keranjang`
--

DROP TABLE IF EXISTS `keranjang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `keranjang` (
  `id_keranjang` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) NOT NULL,
  `jumlah` int(4) NOT NULL,
  PRIMARY KEY (`id_keranjang`),
  KEY `id_pengguna` (`id_pengguna`,`id_produk`,`id_jasa`),
  CONSTRAINT `keranjang_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keranjang`
--

/*!40000 ALTER TABLE `keranjang` DISABLE KEYS */;
/*!40000 ALTER TABLE `keranjang` ENABLE KEYS */;

--
-- Table structure for table `layanan_pelanggan`
--

DROP TABLE IF EXISTS `layanan_pelanggan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `layanan_pelanggan` (
  `id_layanan_pelanggan` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `id_admin` varchar(15) NOT NULL,
  `topik` varchar(50) NOT NULL,
  `isi_pertanyaan` varchar(150) NOT NULL,
  `status_layanan` enum('Pengguna Baru','Pengguna Lama') NOT NULL,
  PRIMARY KEY (`id_layanan_pelanggan`),
  KEY `id_pengguna` (`id_pengguna`,`id_admin`),
  KEY `id_admin` (`id_admin`),
  CONSTRAINT `layanan_pelanggan_ibfk_1` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`),
  CONSTRAINT `layanan_pelanggan_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layanan_pelanggan`
--

/*!40000 ALTER TABLE `layanan_pelanggan` DISABLE KEYS */;
/*!40000 ALTER TABLE `layanan_pelanggan` ENABLE KEYS */;

--
-- Table structure for table `metode_pembayaran`
--

DROP TABLE IF EXISTS `metode_pembayaran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metode_pembayaran` (
  `id_metode_pembayaran` varchar(15) NOT NULL,
  `nama_metode` varchar(50) NOT NULL,
  `deskripsi` varchar(150) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  PRIMARY KEY (`id_metode_pembayaran`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `metode_pembayaran_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metode_pembayaran`
--

/*!40000 ALTER TABLE `metode_pembayaran` DISABLE KEYS */;
/*!40000 ALTER TABLE `metode_pembayaran` ENABLE KEYS */;

--
-- Table structure for table `metode_pengiriman`
--

DROP TABLE IF EXISTS `metode_pengiriman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `metode_pengiriman` (
  `id_metode_pengiriman` varchar(15) NOT NULL,
  `nama_metode` varchar(50) NOT NULL,
  `deskripsi` varchar(150) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  PRIMARY KEY (`id_metode_pengiriman`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `metode_pengiriman_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metode_pengiriman`
--

/*!40000 ALTER TABLE `metode_pengiriman` DISABLE KEYS */;
/*!40000 ALTER TABLE `metode_pengiriman` ENABLE KEYS */;

--
-- Table structure for table `notifikasi`
--

DROP TABLE IF EXISTS `notifikasi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `notifikasi` (
  `id_notifikasi` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `isi_notifikasi` varchar(150) NOT NULL,
  PRIMARY KEY (`id_notifikasi`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `notifikasi_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifikasi`
--

/*!40000 ALTER TABLE `notifikasi` DISABLE KEYS */;
/*!40000 ALTER TABLE `notifikasi` ENABLE KEYS */;

--
-- Table structure for table `pembayaran`
--

DROP TABLE IF EXISTS `pembayaran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(15) NOT NULL,
  `id_pesanan` varchar(15) NOT NULL,
  `id_metode_pembayaran` varchar(15) NOT NULL,
  `total_pembayaran` double NOT NULL,
  `status_pembayaran` enum('Belum Dibayar','Sudah Dibayar') NOT NULL,
  PRIMARY KEY (`id_pembayaran`),
  KEY `id_pesanan` (`id_pesanan`,`id_metode_pembayaran`),
  KEY `id_metode_pembayaran` (`id_metode_pembayaran`),
  CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`id_metode_pembayaran`) REFERENCES `metode_pembayaran` (`id_metode_pembayaran`),
  CONSTRAINT `pembayaran_ibfk_2` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pembayaran`
--

/*!40000 ALTER TABLE `pembayaran` DISABLE KEYS */;
/*!40000 ALTER TABLE `pembayaran` ENABLE KEYS */;

--
-- Table structure for table `pengaturan_akun`
--

DROP TABLE IF EXISTS `pengaturan_akun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pengaturan_akun` (
  `id_pengaturan_akun` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `preferensi_akun` varchar(100) NOT NULL,
  `pengaturan_keamanan` varchar(100) NOT NULL,
  PRIMARY KEY (`id_pengaturan_akun`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `pengaturan_akun_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengaturan_akun`
--

/*!40000 ALTER TABLE `pengaturan_akun` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengaturan_akun` ENABLE KEYS */;

--
-- Table structure for table `pengembalian_barang`
--

DROP TABLE IF EXISTS `pengembalian_barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pengembalian_barang` (
  `id_pengembalian` varchar(15) NOT NULL,
  `id_pesanan` varchar(15) NOT NULL,
  `alasan_pengembalian` varchar(100) NOT NULL,
  `status_pengembalian` enum('Diterima','Ditolak') NOT NULL,
  `tanggal_pengembalian` datetime NOT NULL,
  PRIMARY KEY (`id_pengembalian`),
  KEY `id_pesanan` (`id_pesanan`),
  CONSTRAINT `pengembalian_barang_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengembalian_barang`
--

/*!40000 ALTER TABLE `pengembalian_barang` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengembalian_barang` ENABLE KEYS */;

--
-- Table structure for table `pengguna`
--

DROP TABLE IF EXISTS `pengguna`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pengguna` (
  `id_pengguna` varchar(15) NOT NULL,
  `nama_pengguna` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `jalan` varchar(45) DEFAULT NULL,
  `kode_pos` int(5) DEFAULT NULL,
  `kota` varchar(45) DEFAULT NULL,
  `provinsi` varchar(35) DEFAULT NULL,
  `tanggal_dibuat` date DEFAULT NULL,
  `riwayat_transaksi` varchar(45) DEFAULT NULL,
  `riwayat_pencarian` varchar(45) DEFAULT NULL,
  `riwayat_interaksi` varchar(45) DEFAULT NULL,
  `riwayat_penilaian_ulasan` varchar(45) DEFAULT NULL,
  `status_akun` enum('Aktif','Tidak Aktif') DEFAULT NULL,
  PRIMARY KEY (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengguna`
--

/*!40000 ALTER TABLE `pengguna` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengguna` ENABLE KEYS */;

--
-- Table structure for table `pengiriman`
--

DROP TABLE IF EXISTS `pengiriman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pengiriman` (
  `id_pengiriman` varchar(15) NOT NULL,
  `id_pesanan` varchar(15) NOT NULL,
  `id_metode_pengiriman` varchar(15) NOT NULL,
  `nomor_resi` int(25) NOT NULL,
  `status_pengiriman` enum('Belum Dikirim','Masih Perjalanan','Sudah Dikirim') NOT NULL,
  PRIMARY KEY (`id_pengiriman`),
  KEY `id_pesanan` (`id_pesanan`,`id_metode_pengiriman`),
  KEY `id_metode_pengiriman` (`id_metode_pengiriman`),
  CONSTRAINT `pengiriman_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`),
  CONSTRAINT `pengiriman_ibfk_2` FOREIGN KEY (`id_metode_pengiriman`) REFERENCES `metode_pengiriman` (`id_metode_pengiriman`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengiriman`
--

/*!40000 ALTER TABLE `pengiriman` DISABLE KEYS */;
/*!40000 ALTER TABLE `pengiriman` ENABLE KEYS */;

--
-- Table structure for table `penjual`
--

DROP TABLE IF EXISTS `penjual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `penjual` (
  `id_penjual` varchar(15) NOT NULL,
  `nama_toko` varchar(100) DEFAULT NULL,
  `deskripsi_toko` varchar(250) DEFAULT NULL,
  `jalan` varchar(45) DEFAULT NULL,
  `kode_pos` int(5) DEFAULT NULL,
  `kota` varchar(45) DEFAULT NULL,
  `provinsi` varchar(35) DEFAULT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) DEFAULT NULL,
  `riwayat_transaksi` varchar(45) DEFAULT NULL,
  `riwayat_penilaian_ulasan` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_penjual`),
  KEY `id_jasa` (`id_jasa`),
  KEY `id_produk` (`id_produk`),
  CONSTRAINT `penjual_ibfk_1` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`),
  CONSTRAINT `penjual_ibfk_2` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penjual`
--

/*!40000 ALTER TABLE `penjual` DISABLE KEYS */;
/*!40000 ALTER TABLE `penjual` ENABLE KEYS */;

--
-- Table structure for table `pertanyaan`
--

DROP TABLE IF EXISTS `pertanyaan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pertanyaan` (
  `id_pertanyaan` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `isi_pertanyaan` varchar(100) NOT NULL,
  `tanggal_pertanyaan` datetime NOT NULL,
  `status_jawaban` enum('Belum Dibalas','Sudah Dibalas') NOT NULL,
  PRIMARY KEY (`id_pertanyaan`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `pertanyaan_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pertanyaan`
--

/*!40000 ALTER TABLE `pertanyaan` DISABLE KEYS */;
/*!40000 ALTER TABLE `pertanyaan` ENABLE KEYS */;

--
-- Table structure for table `pesanan`
--

DROP TABLE IF EXISTS `pesanan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pesanan` (
  `id_pesanan` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `tanggal_pesanan` datetime NOT NULL,
  `status_pesanan` enum('Dikemas','Dikirim','Selesai') NOT NULL,
  `id_metode_pembayaran` varchar(15) NOT NULL,
  `jalan` varchar(45) NOT NULL,
  `kode_pos` int(5) NOT NULL,
  `kota` varchar(45) NOT NULL,
  `provinsi` varchar(35) NOT NULL,
  `total_harga` double NOT NULL,
  `id_voucher` varchar(15) NOT NULL,
  PRIMARY KEY (`id_pesanan`),
  KEY `id_pengguna` (`id_pengguna`,`id_metode_pembayaran`,`id_voucher`),
  KEY `id_metode_pembayaran` (`id_metode_pembayaran`),
  KEY `id_voucher` (`id_voucher`),
  CONSTRAINT `pesanan_ibfk_1` FOREIGN KEY (`id_metode_pembayaran`) REFERENCES `metode_pembayaran` (`id_metode_pembayaran`),
  CONSTRAINT `pesanan_ibfk_2` FOREIGN KEY (`id_voucher`) REFERENCES `voucher` (`id_voucher`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pesanan`
--

/*!40000 ALTER TABLE `pesanan` DISABLE KEYS */;
/*!40000 ALTER TABLE `pesanan` ENABLE KEYS */;

--
-- Table structure for table `produk`
--

DROP TABLE IF EXISTS `produk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produk` (
  `id_produk` varchar(15) NOT NULL,
  `nama_produk` varchar(35) NOT NULL,
  `deskripsi` varchar(250) NOT NULL,
  `harga` double NOT NULL,
  `stok` int(4) NOT NULL,
  `gambar` blob NOT NULL,
  `id_kategori` varchar(15) NOT NULL,
  `id_penjual` varchar(15) NOT NULL,
  `riwayat_penilaian_ulasan` varchar(100) NOT NULL,
  `id_keranjang` varchar(15) NOT NULL,
  PRIMARY KEY (`id_produk`),
  KEY `id_kategori` (`id_kategori`,`id_penjual`,`id_keranjang`),
  KEY `id_keranjang` (`id_keranjang`),
  KEY `id_penjual` (`id_penjual`),
  CONSTRAINT `produk_ibfk_1` FOREIGN KEY (`id_keranjang`) REFERENCES `keranjang` (`id_keranjang`),
  CONSTRAINT `produk_ibfk_2` FOREIGN KEY (`id_penjual`) REFERENCES `penjual` (`id_penjual`),
  CONSTRAINT `produk_ibfk_3` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produk`
--

/*!40000 ALTER TABLE `produk` DISABLE KEYS */;
/*!40000 ALTER TABLE `produk` ENABLE KEYS */;

--
-- Table structure for table `promosi`
--

DROP TABLE IF EXISTS `promosi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promosi` (
  `id_promosi` varchar(15) NOT NULL,
  `nama_promosi` varchar(50) NOT NULL,
  `tanggal_mulai` datetime NOT NULL,
  `tanggal_berakhir` datetime NOT NULL,
  `syarat_ketentuan` varchar(250) NOT NULL,
  `id_penjual` varchar(15) NOT NULL,
  PRIMARY KEY (`id_promosi`),
  KEY `id_penjual` (`id_penjual`),
  CONSTRAINT `promosi_ibfk_1` FOREIGN KEY (`id_penjual`) REFERENCES `penjual` (`id_penjual`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promosi`
--

/*!40000 ALTER TABLE `promosi` DISABLE KEYS */;
/*!40000 ALTER TABLE `promosi` ENABLE KEYS */;

--
-- Table structure for table `rating_produk_jasa`
--

DROP TABLE IF EXISTS `rating_produk_jasa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rating_produk_jasa` (
  `id_rating` varchar(15) NOT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `penilaian` int(4) NOT NULL,
  `tanggal_penilaian` datetime NOT NULL,
  PRIMARY KEY (`id_rating`),
  KEY `id_produk` (`id_produk`,`id_jasa`,`id_pengguna`),
  KEY `id_jasa` (`id_jasa`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `rating_produk_jasa_ibfk_1` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`),
  CONSTRAINT `rating_produk_jasa_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  CONSTRAINT `rating_produk_jasa_ibfk_3` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rating_produk_jasa`
--

/*!40000 ALTER TABLE `rating_produk_jasa` DISABLE KEYS */;
/*!40000 ALTER TABLE `rating_produk_jasa` ENABLE KEYS */;

--
-- Table structure for table `refund`
--

DROP TABLE IF EXISTS `refund`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `refund` (
  `id_refund` varchar(15) NOT NULL,
  `id_pesanan` varchar(15) NOT NULL,
  `jumlah_refund` int(3) NOT NULL,
  `tanggal_refund` datetime NOT NULL,
  `metode_pengembalian_dana` varchar(50) NOT NULL,
  `status_refund` enum('Belum Menerima','Sudah Menerima') NOT NULL,
  PRIMARY KEY (`id_refund`),
  KEY `id_pesanan` (`id_pesanan`),
  CONSTRAINT `refund_ibfk_1` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `refund`
--

/*!40000 ALTER TABLE `refund` DISABLE KEYS */;
/*!40000 ALTER TABLE `refund` ENABLE KEYS */;

--
-- Table structure for table `ulasan_penilaian`
--

DROP TABLE IF EXISTS `ulasan_penilaian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ulasan_penilaian` (
  `id_ulasan_penilaian` varchar(15) NOT NULL,
  `id_produk` varchar(15) NOT NULL,
  `id_jasa` varchar(15) NOT NULL,
  `id_pengguna` varchar(15) NOT NULL,
  `penilaian` int(5) NOT NULL,
  `ulasan` varchar(100) NOT NULL,
  `tanggal_ulasan` datetime NOT NULL,
  PRIMARY KEY (`id_ulasan_penilaian`),
  KEY `id_produk` (`id_produk`,`id_jasa`,`id_pengguna`),
  KEY `id_pengguna` (`id_pengguna`),
  KEY `id_jasa` (`id_jasa`),
  CONSTRAINT `ulasan_penilaian_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  CONSTRAINT `ulasan_penilaian_ibfk_2` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`),
  CONSTRAINT `ulasan_penilaian_ibfk_3` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ulasan_penilaian`
--

/*!40000 ALTER TABLE `ulasan_penilaian` DISABLE KEYS */;
/*!40000 ALTER TABLE `ulasan_penilaian` ENABLE KEYS */;

--
-- Table structure for table `voucher`
--

DROP TABLE IF EXISTS `voucher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voucher` (
  `id_voucher` varchar(15) NOT NULL,
  `kode_voucher` varchar(10) NOT NULL,
  `potongan_harga` double NOT NULL,
  `batas_penggunaan` varchar(15) NOT NULL,
  PRIMARY KEY (`id_voucher`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voucher`
--

/*!40000 ALTER TABLE `voucher` DISABLE KEYS */;
/*!40000 ALTER TABLE `voucher` ENABLE KEYS */;

--
-- Dumping routines for database 'database_tugas_akhir'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-07  9:48:43
