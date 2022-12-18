-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2022 at 12:53 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rskb_db`
--
CREATE DATABASE IF NOT EXISTS `rskb_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `rskb_db`;

-- --------------------------------------------------------

--
-- Table structure for table `form_dokter`
--

CREATE TABLE `form_dokter` (
  `kode_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `nohp` varchar(50) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `sp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_dokter`
--

INSERT INTO `form_dokter` (`kode_dokter`, `nama_dokter`, `alamat`, `nohp`, `jk`, `sp`) VALUES
('1221', 'Agus Mulyono', 'Jl. Arya Santika No.14', '0838998712', 'Laki-laki', 'Jantung'),
('1223', 'Handoko Jaya Nugra', 'Jl. Guna Berkah No.01', '0891237482', 'Laki-laki', 'Tulang'),
('1224', 'Yani Mustikasari', 'Jl. Wangsakara No.27', '0873291726', 'Perempuan', 'Mata'),
('1225', 'Sarah Budiman', 'Jl. Siliwangi No. 12', '0893715361', 'Perempuan', 'Kandungan'),
('1226', 'Jajang Nurzaman', 'Jl. Taman Astor No. 05', '0821628288', 'Laki-laki', 'Gigi');

-- --------------------------------------------------------

--
-- Table structure for table `form_pasien`
--

CREATE TABLE `form_pasien` (
  `kode_pasien` varchar(10) NOT NULL,
  `nama_pasien` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `tgl_berobat` date DEFAULT NULL,
  `nohp` varchar(10) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL,
  `pekerjaan` varchar(10) DEFAULT NULL,
  `jaminan` varchar(10) DEFAULT NULL,
  `keterangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_pasien`
--

INSERT INTO `form_pasien` (`kode_pasien`, `nama_pasien`, `alamat`, `tgl_berobat`, `nohp`, `jk`, `pekerjaan`, `jaminan`, `keterangan`) VALUES
('0351', 'Tunikem Kodirat', 'Jl. Kebun Raya Tangerang Selatan, No. 73, Tangeran', '2022-11-05', '0856123472', 'Laki-laki', 'Aparatur S', 'BPJS', ''),
('0352', 'Asep Surasep', 'Jl. Pasar Tengah Malem, Tangerang', '2022-09-22', '0877476489', 'Laki-laki', 'Konten Kre', 'Pribadi', ''),
('0353', 'Kosasih Margareth', 'Jl. H. Ibing Didu, Bandung', '2022-01-04', '0812889854', 'Perempuan', 'Ibu Rumah ', 'BPJS', ''),
('0354', 'Antorio Usep', 'Jl. Komodo Biawak, Jakarta Utara', '2022-04-15', '0896178497', 'Laki-laki', 'Pilot', 'BPJS', ''),
('0355', 'Anya Toyosaki', 'Jl. Kopi Bogor Wangi, Bogor', '2022-07-18', '0838978531', 'Perempuan', 'Translator', 'Pribadi', '');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kode_obat` varchar(10) DEFAULT NULL,
  `nama_obat` varchar(20) DEFAULT NULL,
  `jenis` varchar(20) DEFAULT NULL,
  `expired` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `ket` varchar(100) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kode_obat`, `nama_obat`, `jenis`, `expired`, `harga`, `ket`, `stok`) VALUES
('001', 'Paracetamol', 'Tablet', '2024-01-01', 10000, 'obat untuk meredakan demam dan nyeri', 20),
('002', 'Sanmol', 'Sirup', '2024-01-01', 15000, 'obat yang bermanfaat untuk meredakan demam, sakit ', 15),
('003', 'Omeprazole', 'Tablet', '2024-01-01', 10000, 'obat untuk menangani penyakit asam lambung', 10),
('004', 'Ambroxol', 'Tablet', '2024-01-01', 7000, ' obat untuk meredakan batuk berdahak akibat bebera', 5),
('005', 'Skizon', 'Salep', '2024-01-01', 20000, 'untuk meringankan inflamasi dermatosis yang responsif terhadap kortikosteroid bila terkomplikasi inf', 5);

-- --------------------------------------------------------

--
-- Table structure for table `perawat`
--

CREATE TABLE `perawat` (
  `kode_perawat` varchar(20) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `nohp` varchar(15) DEFAULT NULL,
  `jk` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perawat`
--

INSERT INTO `perawat` (`kode_perawat`, `nama`, `alamat`, `nohp`, `jk`) VALUES
('1321', 'Ristiani cahyo', 'Jl. Imam Bonjol No. 07', '083789701236', 'Perempuan'),
('1322', 'Fiona alfionita', 'Jl. Kampung gedong No. 22', '085756789654', 'Perempuan'),
('1323', 'Khairul Ikhwan', 'Jl. Wangsakara No.18', '081457852899', 'Perempuan'),
('1324', 'Imam musyrid', 'Jl. Siliwangi  jaya No. 11', '085725289967', 'Laki-laki'),
('1325', 'Dilan Rahmadi', 'Jl. Taman anggrek', '082242728672', 'Laki-laki');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` varchar(50) DEFAULT NULL,
  `tgl_pembelian` date DEFAULT NULL,
  `nama_pasien` varchar(50) DEFAULT NULL,
  `nama_dokter` varchar(50) DEFAULT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `ket_obat` varchar(100) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `tgl_pembelian`, `nama_pasien`, `nama_dokter`, `nama_obat`, `ket_obat`, `harga`, `qty`, `total`) VALUES
('1', '2022-12-08', 'Tunikem Kodirat', 'Agus Mulyono', 'Paracetamol', 'obat untuk meredakan demam dan nyeri', 10000, 1, 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `form_dokter`
--
ALTER TABLE `form_dokter`
  ADD PRIMARY KEY (`kode_dokter`);

--
-- Indexes for table `form_pasien`
--
ALTER TABLE `form_pasien`
  ADD PRIMARY KEY (`kode_pasien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
