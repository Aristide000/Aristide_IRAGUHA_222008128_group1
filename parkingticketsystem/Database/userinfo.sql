-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 12:37 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userinfo`
--

-- --------------------------------------------------------

--
-- Table structure for table `parkingticketinfo`
--

CREATE TABLE `parkingticketinfo` (
  `Ticket ID` int(50) NOT NULL,
  `IssueDate&Time` varchar(50) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Violation type` varchar(50) NOT NULL,
  `FineAmount` int(50) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkingticketinfo`
--

INSERT INTO `parkingticketinfo` (`Ticket ID`, `IssueDate&Time`, `Location`, `Violation type`, `FineAmount`, `Status`) VALUES
(0, '2024/02/18  08:00', 'Parking lot 1', 'Double Parking Violation', 60000, 'pending'),
(1, '2024/02/18  08:00', 'parking lot 2', 'Not Paying for metered parking', 57749, 'Active'),
(3, '2024/02/18  08:00', 'Parking lot 8', 'Parking in One Spot for More than 24 Hours', 60000, 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `paymentinfo`
--

CREATE TABLE `paymentinfo` (
  `PaymentID` int(50) NOT NULL,
  `PaymentMethod` varchar(50) NOT NULL,
  `AmountPaid` int(50) NOT NULL,
  `PaymentDate&Time` varchar(50) NOT NULL,
  `TransactionID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `paymentinfo`
--

INSERT INTO `paymentinfo` (`PaymentID`, `PaymentMethod`, `AmountPaid`, `PaymentDate&Time`, `TransactionID`) VALUES
(0, 'BankAcc.', 30000, '2024/02/18  08:00', 6498430),
(1, 'BankAcc.', 4000, '2024/02/18  08:00', 650003438),
(2, 'BankAcc.', 30000, '2024/02/18  08:00', 75973993),
(3, 'BankAcc.', 19000, '2024/02/18  08:00', 648757839);

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `id` int(50) NOT NULL,
  `Firstname` varchar(50) NOT NULL,
  `Lastname` varchar(50) NOT NULL,
  `Telephone` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `VehicleID` varchar(50) NOT NULL,
  `LicensePlate` varchar(50) NOT NULL,
  `Model` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`id`, `Firstname`, `Lastname`, `Telephone`, `Address`, `VehicleID`, `LicensePlate`, `Model`) VALUES
(1, 'Mugisha', 'Salomon', '+250782979568', 'Remera', '783gf920bcye', 'RAE380E', ' Hyundai Kona'),
(2, 'KAGABO', 'Methode', '+250788888888', 'Kayonza', '783gf920bzzzz', 'RAE888E', 'Hyundai Tucson'),
(3, 'Mugisha', 'Danny', '+25070000000', 'Kimironko', '783gbbvbfhd', 'RAE000E', 'Hyundai Santa Fe'),
(4, '', '', '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `parkingticketinfo`
--
ALTER TABLE `parkingticketinfo`
  ADD PRIMARY KEY (`Ticket ID`);

--
-- Indexes for table `paymentinfo`
--
ALTER TABLE `paymentinfo`
  ADD PRIMARY KEY (`PaymentID`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `userinfo`
--
ALTER TABLE `userinfo`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
