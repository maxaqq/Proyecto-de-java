-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 10, 2017 at 06:02 AM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `almacenproductos`
--

-- --------------------------------------------------------

--
-- Table structure for table `cantidadcelulares`
--

CREATE TABLE IF NOT EXISTS `cantidadcelulares` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` int(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=45 ;

--
-- Dumping data for table `cantidadcelulares`
--

INSERT INTO `cantidadcelulares` (`Id`, `Modelo`, `Cantidad`) VALUES
(1, 'LG KJ', 718),
(2, 'LG KJAAA', 0),
(4, 'LG HY', 675),
(6, 'LG JUI', 7647),
(12, 'LG QSA', 55644),
(20, 'LG RT 56', 2300),
(23, 'LG TG', 2000),
(32, 'LG TG QWW', 3100),
(44, 'LG TR 23', 700);

-- --------------------------------------------------------

--
-- Table structure for table `celularesregistrados`
--

CREATE TABLE IF NOT EXISTS `celularesregistrados` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` int(10) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=50 ;

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
(49, 'LG RT 56', 200, 'Industrias h');

-- --------------------------------------------------------

--
-- Table structure for table `celulares_agregados`
--

CREATE TABLE IF NOT EXISTS `celulares_agregados` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `celulares_agregados`
--

INSERT INTO `celulares_agregados` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG KJAAA', '2340', 'Industrias A'),
(2, 'LG JUI', '2342', 'Industrias A'),
(3, 'LG QSA', '17974', 'Empresa C'),
(4, 'LG KJAAA', '2340', 'Empresa C'),
(5, 'LG JUI', '2332', 'Empresa C'),
(6, 'LG JUI', '7647', ''),
(7, 'LG QSA', '55644', ''),
(8, 'LG TR 23', '200', 'Industrias B'),
(9, 'LG KJAAA', '2000', 'Industrias A'),
(10, 'LG RT 56', '500', 'Industrias A');

-- --------------------------------------------------------

--
-- Table structure for table `celulares_pedidos`
--

CREATE TABLE IF NOT EXISTS `celulares_pedidos` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Modelo` varchar(45) NOT NULL,
  `Cantidad` varchar(45) NOT NULL,
  `Empresa` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `celulares_pedidos`
--

INSERT INTO `celulares_pedidos` (`Id`, `Modelo`, `Cantidad`, `Empresa`) VALUES
(1, 'LG JUI', '2332', 'Industrias A'),
(2, 'LG TG QWW', '900', 'Industrias A'),
(3, 'LG KJAAA', '2000', 'Empresa C'),
(4, 'LG RT 56', '200', 'Industrias h'),
(5, '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `nombre_edad`
--

CREATE TABLE IF NOT EXISTS `nombre_edad` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Edad` int(10) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3356 ;

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

CREATE TABLE IF NOT EXISTS `registrousuarios` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Telefono` int(12) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  `Pais` varchar(30) NOT NULL,
  `Empresa` varchar(50) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=42 ;

--
-- Dumping data for table `registrousuarios`
--

INSERT INTO `registrousuarios` (`Id`, `Nombre`, `Apellido`, `Telefono`, `Usuario`, `Pass`, `Pais`, `Empresa`, `Tipo`, `Email`) VALUES
(36, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Industrias Aqq', 'Administrador', '2222'),
(38, 'max', 'aqqqq', 123456, '123456', '123456', '123456', 'COMPANY SF', 'Administrador', '1233@'),
(39, 'Juan', 'Suarez', 4565766, 'xsw', '232', 'olanda', 'SACdf', 'Usuario', 'fgd@vb.comg'),
(40, 'aq', 'aq', 21, '12', '12', '545', '3', 'Administrador', '34');

-- --------------------------------------------------------

--
-- Table structure for table `registrousuarios1`
--

CREATE TABLE IF NOT EXISTS `registrousuarios1` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Telefono` int(12) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  `Pais` varchar(30) NOT NULL,
  `Empresa` varchar(50) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=39 ;

--
-- Dumping data for table `registrousuarios1`
--

INSERT INTO `registrousuarios1` (`Id`, `Nombre`, `Apellido`, `Telefono`, `Usuario`, `Pass`, `Pais`, `Empresa`, `Tipo`, `Email`) VALUES
(20, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Company ALL', 'Usuario', 'mn@tg.com'),
(35, 'Juan', 'Rodriguez', 4565675, 'hello', 'walking', 'ecuador', 'company', 'Item 2', '22222'),
(36, 'Max', 'Aqquepucho', 799999, 'holamundo', 'lalalla', 'Peru', 'Industrias Aqq', 'Item 2', '2222'),
(38, 'max', 'aqqqq', 123456, '123456', '123456', '123456', '1234', 'Administrador', '1233@');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
