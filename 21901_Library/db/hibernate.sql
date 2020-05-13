-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2020 at 05:38 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hibernate`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(10) NOT NULL,
  `Title` varchar(30) NOT NULL,
  `PublishingHouse` varchar(30) NOT NULL,
  `PublicationDate` date NOT NULL,
  `Author` varchar(30) NOT NULL,
  `Pages` int(5) NOT NULL,
  `Category` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `Title`, `PublishingHouse`, `PublicationDate`, `Author`, `Pages`, `Category`) VALUES
(1, 'Lio', 'AUCA', '2020-05-02', 'Mugisha', 10, 130),
(2, 'Mink Coat', 'Black', '2020-05-01', 'James', 300, 127),
(3, 'Glasses', 'HGs', '2020-05-02', 'NF', 5, 128);

-- --------------------------------------------------------

--
-- Table structure for table `bookscategory`
--

CREATE TABLE `bookscategory` (
  `CategoryId` int(10) NOT NULL,
  `CategoryName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookscategory`
--

INSERT INTO `bookscategory` (`CategoryId`, `CategoryName`) VALUES
(126, 'Horror'),
(127, 'Thriller'),
(128, 'Educaional'),
(129, 'Romace'),
(130, 'Comedy'),
(131, 'drama'),
(132, 'Fairy Tales');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `RegNo` int(10) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `PhoneNo` varchar(15) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `photo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`RegNo`, `FirstName`, `LastName`, `PhoneNo`, `Email`, `Category`, `photo`) VALUES
(1, 'Mose', 'Ntwari', '788546321', 'mose@gmail.com', 'STUDENT', 'C:\\Users\\USER\\Desktop\\Hibernate\\My.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `operation`
--

CREATE TABLE `operation` (
  `id` int(11) NOT NULL,
  `ClientID` int(10) NOT NULL,
  `BookName` varchar(30) NOT NULL,
  `Author` varchar(30) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `ReturnDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `operation`
--

INSERT INTO `operation` (`id`, `ClientID`, `BookName`, `Author`, `Status`, `ReturnDate`) VALUES
(3, 1, 'Lio', 'Mugisha', 'Check in', '2020-05-07'),
(4, 1, 'Lio', 'Mugisha', 'Check out', '2020-05-05');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `Category` (`Category`);

--
-- Indexes for table `bookscategory`
--
ALTER TABLE `bookscategory`
  ADD PRIMARY KEY (`CategoryId`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`RegNo`);

--
-- Indexes for table `operation`
--
ALTER TABLE `operation`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `operation`
--
ALTER TABLE `operation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `books_ibfk_1` FOREIGN KEY (`Category`) REFERENCES `bookscategory` (`CategoryId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
