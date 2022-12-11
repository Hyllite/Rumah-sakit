-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2022 at 01:00 PM
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
('1', 'a', 'jl', '0192', 'Laki-Laki', 'e');

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
  `ket` varchar(50) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
('1', 'w', 'e', '12', 'Laki-Laki'),
('2', 'qw', 'qw', '12', 'Laki-Laki');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `kode_obat` varchar(50) DEFAULT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `jenis_obat` varchar(50) DEFAULT NULL,
  `expired` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
