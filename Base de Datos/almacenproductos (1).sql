-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 26, 2017 at 01:24 AM
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
-- Database: `almacenproductos`
--

-- --------------------------------------------------------

--
-- Table structure for table `cantidadcelulares`
--

CREATE TABLE `cantidadcelulares` (
  `Id` int(10) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` int(10) NOT NULL,
  `Empresa` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cantidadcelulares`
--

INSERT INTO `cantidadcelulares` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG KJ', 718, ''),
(2, 'LG KJAAA', 8000, ''),
(4, 'LG HY', 1350, ''),
(6, 'LG JUI', 7647, ''),
(12, 'LG QSA', 55645, ''),
(20, 'LG RT 56', 2300, ''),
(23, 'LG TG', 2000, ''),
(32, 'LG TG QWW', 6200, ''),
(44, 'LG TR 23', 700, ''),
(46, 'LG ERTR', 4000, 'Almacen de Remates S.A.'),
(47, 'LG ER uu', 4000, 'Almacen de Remates S.A.');

-- --------------------------------------------------------

--
-- Table structure for table `celularesregistrados`
--

CREATE TABLE `celularesregistrados` (
  `Id` int(10) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` int(10) NOT NULL,
  `Empresa` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `celularesregistrados`
--

INSERT INTO `celularesregistrados` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG KJ', 90, 'Industrias A'),
(2, 'LG KJAAA', 90, 'Industrias B'),
(3, 'LG KJ', 90, 'Empresa C'),
(4, 'LG QWE', 1000, 'Industrias B'),
(5, 'LG QWE', 50, 'Industrias A'),
(6, 'LG ABC', 1456, 'Industrias h'),
(7, 'LG ABC', 2912, 'Empresa C'),
(8, 'LG KJAAA', 90, 'Industrias A'),
(9, 'LG KJAAA', 180, 'Industrias B'),
(10, 'LG QWEaaaaaaaaa', 1050, 'Industrias A'),
(11, 'LG QWE', 2100, 'Industrias A'),
(12, 'LG KJzaqxswcde', 180, 'Industrias B'),
(13, 'LG QWE', 56, 'Industrias A'),
(14, 'LG QWE', 4256, 'Industrias TH'),
(15, 'LG KJzaqxswcde', 180, 'Industrias A'),
(16, 'LG ABC', 5824, 'Industrias A'),
(17, 'LG KJzaqxswcde', 360, 'Empresa C'),
(18, 'LG ABC', 11648, 'Industrias h'),
(19, 'LHG', 17024, 'Empresa C'),
(20, 'LG RT 56', 1000, 'COMPANY A'),
(21, 'LG RT 56', 1000, 'COMPANY A'),
(22, 'LG KJ', 180, 'COMPANY A'),
(23, 'LG TG', 2000, 'Empresa C'),
(24, 'LHG', 3404, 'Industrias B'),
(25, 'LHG', 30643, 'Empresa C'),
(26, 'LG KJzaqxswcde', 20, 'Industrias h'),
(27, 'LG KJzaqxswcde', 50, 'Industrias B'),
(28, 'LG ABC', 23296, 'Empresa C'),
(29, 'LG KJAAA', 6764, 'Empresa C'),
(30, 'LG HY', 675, 'COMPANY A'),
(31, 'LG KJzaqxswcde', 8987, 'Industrias A'),
(32, 'LG TG QWW', 5000, 'Industrias TH'),
(33, 'LG TG QWW', 500, 'Industrias A'),
(34, 'LG KJAAA', 6, 'Empresa C'),
(35, 'LG TG QWW', 500, 'Industrias h'),
(36, 'LG KJ', 1, 'Empresa C'),
(37, 'LG KJ', 359, 'Industrias B'),
(38, 'LG KJAAA', 2340, 'Industrias A'),
(39, 'LG JUI', 2342, 'Industrias A'),
(40, 'LG QSA', 17974, 'Empresa C'),
(41, 'LG KJAAA', 2340, 'Empresa C'),
(42, 'LG JUI', 2332, 'Industrias A'),
(43, 'LG JUI', 2332, 'Empresa C'),
(44, 'LG TR 23', 500, 'Empresa C'),
(45, 'LG TR 23', 200, 'Industrias B'),
(46, 'LG TG QWW', 900, 'Industrias A'),
(47, 'LG KJAAA', 2000, 'Industrias A'),
(48, 'LG RT 56', 500, 'Industrias A'),
(49, 'LG RT 56', 200, 'Industrias h'),
(50, 'LG RT 56', 1000, 'Industrias B'),
(51, 'LG RT 56', 500, 'Industrias ABC'),
(52, 'LG RT 56', 500, 'Industrias ABC'),
(53, 'LG HY', 675, 'Industrias B'),
(54, 'LG KJAAA', 4000, 'Industrias B'),
(55, 'LG QSA', 1, 'Industrias B'),
(56, 'LG TG QWW', 3100, 'Industrias A'),
(57, 'LG KJAAA', 44, 'Industrias A');

-- --------------------------------------------------------

--
-- Table structure for table `celulares_agregados`
--

CREATE TABLE `celulares_agregados` (
  `Id` int(10) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `celulares_agregados`
--

INSERT INTO `celulares_agregados` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG KJAAA', '2345', 'Industrias A'),
(2, 'LG JUI', '2342', 'Industrias A'),
(3, 'LG QSA', '17974', 'Empresa C'),
(4, 'LG KJAAA', '2340', 'Empresa C'),
(5, 'LG JUI', '2332', 'Empresa C'),
(6, 'LG JUI', '7647', ''),
(7, 'LG QSA', '55644', ''),
(8, 'LG TR 23', '200', 'Industrias B'),
(9, 'LG KJAAA', '2000', 'Industrias A'),
(10, 'LG RT 56', '501', 'Industrias B'),
(11, 'LG RT 56', '501', 'Industrias B'),
(12, 'LG HY', '675', 'Industrias B'),
(13, 'LG KJAAA', '4000', ''),
(14, 'LG KJAAA', '4000', 'Industrias B'),
(15, 'LG QSA', '1', 'Industrias B'),
(16, 'LG TG QWW', '3100', 'Industrias A'),
(17, 'LG KJAAA', '44', 'Industrias A');

-- --------------------------------------------------------

--
-- Table structure for table `celulares_pedidos`
--

CREATE TABLE `celulares_pedidos` (
  `Id` int(10) NOT NULL,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `celulares_pedidos`
--

INSERT INTO `celulares_pedidos` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG JUI', '2332', 'Industrias A'),
(2, 'LG TG QWW', '900', 'Industrias A'),
(3, 'LG KJAAA', '2000', 'Empresa C'),
(4, 'LG RT 56', '201', 'Industrias T'),
(5, '', '', ''),
(6, 'LG RT 56', '500', 'Industrias ABC'),
(7, 'LG RT 56', '500', 'Industrias ABC');

-- --------------------------------------------------------

--
-- Table structure for table `nombre_edad`
--

CREATE TABLE `nombre_edad` (
  `Id` int(10) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Edad` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nombre_edad`
--

INSERT INTO `nombre_edad` (`Id`, `Nombre`, `Edad`) VALUES
(3, 'S', 23),
(4, 'WE', 23),
(33, 'WEm', 1),
(335, 'S', 23),
(3355, 'WE', 23);

-- --------------------------------------------------------

--
-- Table structure for table `registrousuarios`
--

CREATE TABLE `registrousuarios` (
  `Id` int(10) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Telefono` int(12) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  `Pais` varchar(30) NOT NULL,
  `Empresa` varchar(50) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Email` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrousuarios`
--

INSERT INTO `registrousuarios` (`Id`, `Nombre`, `Apellido`, `Telefono`, `Usuario`, `Pass`, `Pais`, `Empresa`, `Tipo`, `Email`) VALUES
(36, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Industrias Aqq', 'Administrador', '2222'),
(38, 'max', 'aqqqq', 123456, '123456', '123456', '123456', 'COMPANY SF', 'Administrador', '1233@.fgf.com'),
(39, 'Juan', 'Suarez', 4565766, 'xsw', '232', 'olanda', 'SACdf', 'Usuario', 'fgd@vb.comg'),
(40, 'aqaaa', 'aq', 21, '12', '12', '545', '3', 'Administrador', '34');

-- --------------------------------------------------------

--
-- Table structure for table `registrousuarios1`
--

CREATE TABLE `registrousuarios1` (
  `Id` int(10) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Telefono` int(12) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  `Pais` varchar(30) NOT NULL,
  `Empresa` varchar(50) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Email` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrousuarios1`
--

INSERT INTO `registrousuarios1` (`Id`, `Nombre`, `Apellido`, `Telefono`, `Usuario`, `Pass`, `Pais`, `Empresa`, `Tipo`, `Email`) VALUES
(20, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Company ALL', 'Usuario', 'mn@tg.com'),
(35, 'Juan', 'Rodriguez', 4565675, 'hello', 'walking', 'ecuador', 'company', 'Item 2', '22222'),
(36, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Industrias Aqq', 'Item 2', '2222'),
(38, 'max', 'aqqqq', 123456, '123456', '123456', '123456', '1234', 'Administrador', '1233@');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cantidadcelulares`
--
ALTER TABLE `cantidadcelulares`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `celularesregistrados`
--
ALTER TABLE `celularesregistrados`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `celulares_agregados`
--
ALTER TABLE `celulares_agregados`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `celulares_pedidos`
--
ALTER TABLE `celulares_pedidos`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `nombre_edad`
--
ALTER TABLE `nombre_edad`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `registrousuarios`
--
ALTER TABLE `registrousuarios`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `registrousuarios1`
--
ALTER TABLE `registrousuarios1`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cantidadcelulares`
--
ALTER TABLE `cantidadcelulares`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;
--
-- AUTO_INCREMENT for table `celularesregistrados`
--
ALTER TABLE `celularesregistrados`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;
--
-- AUTO_INCREMENT for table `celulares_agregados`
--
ALTER TABLE `celulares_agregados`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `celulares_pedidos`
--
ALTER TABLE `celulares_pedidos`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `nombre_edad`
--
ALTER TABLE `nombre_edad`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3356;
--
-- AUTO_INCREMENT for table `registrousuarios`
--
ALTER TABLE `registrousuarios`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT for table `registrousuarios1`
--
ALTER TABLE `registrousuarios1`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
