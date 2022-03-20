-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2022 at 07:11 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movies`
--

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `Movie_Name` varchar(25) DEFAULT NULL,
  `Actor` varchar(25) DEFAULT NULL,
  `Actress` varchar(25) DEFAULT NULL,
  `Director` varchar(25) DEFAULT NULL,
  `Year_of_release` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`Movie_Name`, `Actor`, `Actress`, `Director`, `Year_of_release`) VALUES
('shershaah', 'sidharthmalohtra', 'kiaraadvani', 'vishnuvardhan', 2021),
('shershaah', 'sidharthmalohtra', 'kiaraadvani', 'vishnuvardhan', 2021),
('sardarudham', 'vickykaushal', 'banitasandhu', 'shoojitsircar', 2021),
('bellbottom', 'akshaykumar', 'humaqureshi', 'ranjittiwari', 2021),
('pushpa', 'alluarjun', 'rashmikamandanna', 'sukumar', 2021);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
