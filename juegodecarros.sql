-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3308
-- Tiempo de generación: 09-08-2021 a las 03:10:13
-- Versión del servidor: 5.7.28
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juegodecarros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE IF NOT EXISTS `carro` (
  `id_carro` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(280) COLLATE utf8_spanish_ci NOT NULL,
  `color` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id_carro`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `carro`
--

INSERT INTO `carro` (`id_carro`, `nombre`, `color`) VALUES
(1, 'Maserati 250F', 'Rojo'),
(2, 'McLaren F1 GTR', 'Blanco'),
(3, 'Tyrrell P34', 'Azul'),
(4, 'Porsche 911', 'Negro'),
(5, 'McLaren MP4/4', 'Blanco'),
(6, 'Audi Quattro', 'Amarillo'),
(7, 'Mercedes-Benz W196', 'Gris'),
(8, 'Ferrari F2004', 'Rojo'),
(9, 'Lancia Stratos', 'Negro'),
(10, 'Volvo 850 T5 Estate', 'Azul');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductores`
--

DROP TABLE IF EXISTS `conductores`;
CREATE TABLE IF NOT EXISTS `conductores` (
  `id_conductor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(280) COLLATE utf8_spanish_ci NOT NULL,
  `vecesGanadas` int(7) NOT NULL,
  `id_carro` int(11) NOT NULL,
  PRIMARY KEY (`id_conductor`),
  KEY `id_carro` (`id_carro`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `conductores`
--

INSERT INTO `conductores` (`id_conductor`, `nombre`, `vecesGanadas`, `id_carro`) VALUES
(1, 'Homero Simpson', 1, 6),
(2, 'Bart Simpson', 3, 1),
(3, 'Marge Simpson', 0, 2),
(4, 'Lisa Simpson', 1, 3),
(5, 'Pato Lucas', 0, 4),
(6, 'Pato Donald', 0, 5),
(7, 'Droppy', 1, 7),
(8, 'Popeye', 0, 8),
(9, 'Patricio Estrella', 2, 9),
(10, 'Bob Esponja', 0, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego`
--

DROP TABLE IF EXISTS `juego`;
CREATE TABLE IF NOT EXISTS `juego` (
  `id_juego` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `id_pista` int(11) NOT NULL,
  PRIMARY KEY (`id_juego`),
  KEY `id_pista5` (`id_pista`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `juego`
--

INSERT INTO `juego` (`id_juego`, `fecha`, `id_pista`) VALUES
(1, '7/8/2021', 8),
(2, '7/8/2021', 1),
(3, '7/8/2021', 5),
(4, '7/8/2021', 10),
(5, '7/8/2021', 8),
(6, '7/8/2021', 5),
(7, '7/8/2021', 2),
(8, '7/8/2021', 2),
(9, '7/8/2021', 3),
(10, '7/8/2021', 3),
(11, '7/8/2021', 3),
(12, '7/8/2021', 8),
(13, '7/8/2021', 9),
(14, '7/8/2021', 3),
(15, '7/8/2021', 9),
(16, '7/8/2021', 9),
(17, '8/8/2021', 1),
(18, '8/8/2021', 1),
(19, '8/8/2021', 1),
(20, '8/8/2021', 1),
(21, '8/8/2021', 1),
(22, '8/8/2021', 2),
(23, '8/8/2021', 3),
(24, '8/8/2021', 3),
(25, '8/8/2021', 1),
(26, '8/8/2021', 3),
(27, '8/8/2021', 3),
(28, '8/8/2021', 4),
(29, '8/8/2021', 4),
(30, '8/8/2021', 4),
(31, '8/8/2021', 4),
(32, '8/8/2021', 10),
(33, '8/8/2021', 3),
(34, '8/8/2021', 4),
(35, '8/8/2021', 3),
(36, '8/8/2021', 8),
(37, '8/8/2021', 9),
(38, '8/8/2021', 3),
(39, '8/8/2021', 1),
(40, '8/8/2021', 10),
(41, '8/8/2021', 10),
(42, '8/8/2021', 10),
(43, '8/8/2021', 8),
(44, '8/8/2021', 8),
(45, '8/8/2021', 9),
(46, '8/8/2021', 9),
(47, '8/8/2021', 8),
(48, '8/8/2021', 3),
(49, '8/8/2021', 4),
(50, '8/8/2021', 3),
(51, '8/8/2021', 10),
(52, '8/8/2021', 6),
(53, '8/8/2021', 10),
(54, '8/8/2021', 10),
(55, '8/8/2021', 8),
(56, '8/8/2021', 10),
(57, '8/8/2021', 4),
(58, '8/8/2021', 9),
(59, '8/8/2021', 2),
(60, '8/8/2021', 3),
(61, '8/8/2021', 10),
(62, '8/8/2021', 5),
(63, '8/8/2021', 9),
(64, '8/8/2021', 10),
(65, '8/8/2021', 9),
(66, '8/8/2021', 6),
(67, '8/8/2021', 8),
(68, '8/8/2021', 9),
(69, '8/8/2021', 9),
(70, '8/8/2021', 8),
(71, '8/8/2021', 8),
(72, '8/8/2021', 8),
(73, '8/8/2021', 6),
(74, '8/8/2021', 4),
(75, '8/8/2021', 9),
(76, '8/8/2021', 9),
(77, '8/8/2021', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juego_jugadores`
--

DROP TABLE IF EXISTS `juego_jugadores`;
CREATE TABLE IF NOT EXISTS `juego_jugadores` (
  `id_juego_jugadores` int(11) NOT NULL AUTO_INCREMENT,
  `id_juego` int(11) NOT NULL,
  `id_jugador` int(11) NOT NULL,
  `posicion` int(11) NOT NULL,
  PRIMARY KEY (`id_juego_jugadores`),
  KEY `id_juego` (`id_juego`),
  KEY `id_jugador` (`id_jugador`)
) ENGINE=InnoDB AUTO_INCREMENT=164 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `juego_jugadores`
--

INSERT INTO `juego_jugadores` (`id_juego_jugadores`, `id_juego`, `id_jugador`, `posicion`) VALUES
(1, 10, 35, 1),
(2, 10, 34, 2),
(3, 11, 36, 1),
(4, 12, 40, 0),
(5, 12, 39, 0),
(6, 13, 43, 0),
(7, 13, 41, 0),
(8, 13, 42, 0),
(9, 14, 46, 0),
(10, 14, 44, 0),
(11, 14, 45, 0),
(12, 15, 49, 0),
(13, 15, 47, 0),
(14, 15, 48, 0),
(15, 16, 57, 0),
(16, 16, 59, 0),
(17, 16, 53, 0),
(18, 16, 50, 0),
(19, 16, 51, 0),
(20, 16, 52, 0),
(21, 16, 56, 0),
(22, 16, 58, 0),
(23, 16, 54, 0),
(24, 16, 55, 0),
(25, 17, 60, 0),
(26, 17, 61, 0),
(27, 18, 62, 0),
(28, 18, 63, 0),
(29, 19, 65, 0),
(30, 19, 64, 0),
(31, 20, 66, 0),
(32, 20, 67, 0),
(33, 21, 68, 0),
(34, 21, 69, 0),
(35, 22, 70, 0),
(36, 22, 71, 0),
(37, 23, 72, 0),
(38, 25, 77, 0),
(39, 25, 76, 0),
(40, 26, 78, 0),
(41, 27, 79, 0),
(42, 28, 80, 0),
(43, 29, 81, 0),
(44, 30, 82, 0),
(45, 31, 83, 0),
(46, 32, 84, 0),
(47, 33, 85, 0),
(48, 34, 86, 0),
(49, 34, 87, 0),
(50, 35, 88, 0),
(51, 35, 89, 0),
(52, 36, 90, 0),
(53, 36, 91, 0),
(54, 36, 92, 0),
(55, 37, 93, 0),
(56, 37, 94, 0),
(57, 38, 95, 0),
(58, 38, 96, 0),
(59, 39, 97, 0),
(60, 39, 98, 0),
(61, 40, 100, 0),
(62, 40, 99, 0),
(63, 41, 102, 0),
(64, 41, 101, 0),
(65, 41, 103, 0),
(66, 42, 104, 0),
(67, 43, 105, 0),
(68, 43, 106, 0),
(69, 44, 108, 0),
(70, 44, 107, 0),
(71, 45, 109, 0),
(72, 45, 111, 0),
(73, 45, 110, 0),
(74, 46, 113, 0),
(75, 46, 112, 0),
(76, 47, 114, 0),
(77, 47, 115, 0),
(78, 48, 117, 0),
(79, 48, 116, 0),
(80, 49, 120, 0),
(81, 49, 119, 0),
(82, 49, 118, 0),
(83, 50, 121, 0),
(84, 50, 123, 0),
(85, 50, 122, 0),
(86, 51, 124, 0),
(87, 51, 125, 0),
(88, 51, 126, 0),
(89, 52, 128, 0),
(90, 52, 127, 0),
(91, 52, 130, 0),
(92, 52, 131, 0),
(93, 52, 129, 0),
(94, 53, 134, 0),
(95, 53, 135, 0),
(96, 53, 133, 0),
(97, 53, 136, 0),
(98, 53, 132, 0),
(99, 54, 139, 0),
(100, 54, 138, 0),
(101, 54, 140, 0),
(102, 54, 141, 0),
(103, 54, 137, 0),
(104, 57, 152, 0),
(105, 57, 153, 0),
(106, 57, 155, 0),
(107, 57, 154, 0),
(108, 57, 156, 0),
(109, 58, 159, 0),
(110, 58, 157, 0),
(111, 58, 158, 0),
(112, 58, 160, 0),
(113, 58, 161, 0),
(114, 59, 162, 0),
(115, 59, 165, 0),
(116, 59, 163, 0),
(117, 59, 164, 0),
(118, 60, 171, 0),
(119, 60, 172, 0),
(120, 60, 173, 0),
(121, 60, 170, 0),
(122, 60, 169, 0),
(123, 61, 176, 0),
(124, 61, 178, 0),
(125, 61, 174, 0),
(126, 61, 177, 0),
(127, 61, 175, 0),
(128, 62, 180, 3200),
(129, 62, 181, 3000),
(130, 62, 179, 3200),
(131, 62, 182, 3000),
(132, 63, 185, 2),
(133, 63, 184, 4),
(134, 63, 183, 1),
(135, 63, 186, 3),
(136, 64, 188, 0),
(137, 64, 187, 0),
(138, 65, 189, 0),
(139, 65, 190, 0),
(140, 66, 191, 0),
(141, 66, 192, 0),
(142, 67, 193, 0),
(143, 67, 194, 0),
(144, 68, 196, 0),
(145, 68, 195, 0),
(146, 69, 198, 1),
(147, 69, 197, 2),
(148, 70, 207, 5),
(149, 70, 206, 2),
(150, 70, 204, 6),
(151, 70, 205, 4),
(152, 70, 202, 1),
(153, 70, 203, 3),
(154, 71, 211, 0),
(155, 71, 210, 0),
(156, 72, 213, 1),
(157, 72, 212, 2),
(158, 73, 214, 3),
(159, 73, 215, 4),
(160, 74, 216, 1),
(161, 75, 217, 1),
(162, 76, 218, 1),
(163, 77, 219, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores`
--

DROP TABLE IF EXISTS `jugadores`;
CREATE TABLE IF NOT EXISTS `jugadores` (
  `id_Jugador` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(280) COLLATE utf8_spanish_ci NOT NULL,
  `id_condu` int(11) NOT NULL,
  PRIMARY KEY (`id_Jugador`),
  KEY `id_conductor` (`id_condu`)
) ENGINE=InnoDB AUTO_INCREMENT=220 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `jugadores`
--

INSERT INTO `jugadores` (`id_Jugador`, `nombre`, `id_condu`) VALUES
(1, '', 2),
(2, '', 2),
(3, '', 2),
(4, '', 2),
(5, '', 2),
(7, '', 1),
(9, '', 5),
(10, 'jhan', 7),
(11, 'jhan', 10),
(12, 'jorge', 7),
(13, '', 2),
(14, 'lulu', 1),
(15, 'julian', 7),
(16, 'mauricio', 6),
(17, 'carlos', 1),
(18, 'mauricio ', 1),
(19, 'jhan', 2),
(20, 'neider', 3),
(21, 'andres', 2),
(22, 'luis', 1),
(23, 'pedro', 3),
(24, 'jorge', 4),
(25, 'alberto', 7),
(26, 'daniela', 2),
(27, 'jhan', 9),
(28, 'flor', 2),
(29, 'carlos', 3),
(30, 'yuly', 3),
(31, 'jhan', 6),
(32, 'jhan', 3),
(33, 'lola', 1),
(34, 'jhan', 6),
(35, 'lola', 1),
(36, 'jhan', 2),
(37, 'jhan', 10),
(38, 'luis', 2),
(39, 'jorge', 2),
(40, 'patricio', 3),
(41, 'mauricio', 5),
(42, 'lui', 6),
(43, 'diana', 2),
(44, 'mireya', 3),
(45, 'david', 3),
(46, 'mauro', 10),
(47, 'julian', 2),
(48, 'bbb', 4),
(49, 'll', 6),
(50, 'jhan', 1),
(51, 'mauricio', 2),
(52, 'negra', 3),
(53, 'flor', 4),
(54, 'yuly', 5),
(55, 'giovanny', 6),
(56, 'carlos', 7),
(57, 'patricia', 8),
(58, 'andres', 9),
(59, 'angela', 10),
(60, 'luis', 1),
(61, 'carlos', 3),
(62, 'jhan', 2),
(63, 'mauricio', 4),
(64, 'lolo', 2),
(65, 'lola', 5),
(66, 'leandro', 2),
(67, 'lola', 5),
(68, 'jhan', 3),
(69, 'jor', 5),
(70, 'juan', 4),
(71, 'jorge', 9),
(72, 'la', 2),
(73, 'ji', 2),
(74, 'jpj', 8),
(75, 'ja', 8),
(76, 'alex', 4),
(77, 'jose', 9),
(78, 'jhan', 2),
(79, 'ja', 2),
(80, 'lola', 3),
(81, 'ala', 3),
(82, 'df', 3),
(83, 'ariana', 3),
(84, 'juana', 4),
(85, 'jhan', 3),
(86, 'carlos', 4),
(87, 'mauricio', 2),
(88, 'luis', 3),
(89, 'carlos', 2),
(90, 'andrea', 3),
(91, 'carlos', 5),
(92, 'ingrid', 8),
(93, 'jhan', 4),
(94, 'luis', 4),
(95, 'carlos', 3),
(96, 'jorge', 9),
(97, 'carlos', 1),
(98, 'luis', 9),
(99, 'jhan', 1),
(100, 'luis', 9),
(101, 'juan', 1),
(102, 'andres', 2),
(103, 'luis', 4),
(104, 'ja', 2),
(105, 'jhan', 2),
(106, 'andres', 4),
(107, 'jhan', 2),
(108, 'daniel', 9),
(109, 'andres', 10),
(110, 'luis', 8),
(111, 'fernando', 4),
(112, 'andres', 2),
(113, 'luis', 4),
(114, 'jhan', 3),
(115, 'jorge', 4),
(116, 'jhan', 4),
(117, 'luis', 8),
(118, 'jhan', 8),
(119, 'luis', 10),
(120, 'vanesa', 2),
(121, 'jhan', 3),
(122, 'luis', 6),
(123, '9', 10),
(124, 'andres', 3),
(125, 'luis', 9),
(126, 'daniel', 5),
(127, 'jhan', 4),
(128, 'luis', 10),
(129, 'pedro', 6),
(130, 'daniel', 8),
(131, 'francisco', 3),
(132, 'daniel', 4),
(133, 'luis', 3),
(134, 'jorge', 6),
(135, 'mauricio', 8),
(136, 'andres', 5),
(137, 'jhan', 3),
(138, 'luis', 10),
(139, 'fernando', 9),
(140, 'andres', 2),
(141, 'fabio', 2),
(142, 'jhan', 1),
(143, 'mauricio', 2),
(144, 'diaz', 3),
(145, 'pico', 4),
(146, 'sierra', 6),
(147, 'jhan', 1),
(148, 'mauricio', 2),
(149, 'diaz', 3),
(150, 'pico', 4),
(151, 'juan', 5),
(152, 'jhan', 2),
(153, 'mauricio', 3),
(154, 'diaz', 5),
(155, 'pico', 6),
(156, 'negro', 9),
(157, 'jhan', 1),
(158, 'mauricio', 2),
(159, 'diaz', 3),
(160, 'pico', 5),
(161, 'lulu', 2),
(162, 'jhan', 2),
(163, 'mauricio', 2),
(164, 'diaz', 3),
(165, 'pico', 4),
(166, 'luis', 1),
(167, 'jhan', 2),
(168, 'jhan2', 3),
(169, 'jhan1', 1),
(170, 'jhan2', 2),
(171, 'jhan3', 4),
(172, 'jhan4', 5),
(173, 'jhan5', 9),
(174, 'jhan1', 2),
(175, 'jhan2', 3),
(176, 'jhan3', 4),
(177, 'jhan4', 5),
(178, 'jhan5', 6),
(179, 'jhan', 1),
(180, 'mauricio', 2),
(181, 'diaz', 3),
(182, 'pico', 4),
(183, 'luane', 3),
(184, 'lola', 4),
(185, 'maritza', 10),
(186, 'diana', 2),
(187, 'jhan', 1),
(188, 'mauricio', 3),
(189, 'jhan', 3),
(190, 'mauricio', 5),
(191, 'jhan', 3),
(192, 'carlos', 5),
(193, 'sd', 4),
(194, 'cc', 6),
(195, 'sd', 5),
(196, 'df', 6),
(197, 'JSS', 3),
(198, 'SDSD', 4),
(199, 'jhan1', 1),
(200, 'jhan2', 2),
(201, 'jhan3', 3),
(202, 'jhan1', 1),
(203, 'jhan2', 2),
(204, 'jhan3', 3),
(205, 'jhan4', 4),
(206, 'jhan5', 5),
(207, 'jhan6', 6),
(208, 'jhan', 8),
(209, 'jhan', 9),
(210, 'jhan', 2),
(211, 'mauricio', 4),
(212, 'jhan', 3),
(213, 'luis', 9),
(214, 'jorge', 1),
(215, 'daniel', 9),
(216, 'daniel', 2),
(217, 'jhan', 2),
(218, 'jhan', 2),
(219, 'jd', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pista`
--

DROP TABLE IF EXISTS `pista`;
CREATE TABLE IF NOT EXISTS `pista` (
  `id_pista` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(280) COLLATE utf8_spanish_ci NOT NULL,
  `ubicacion` varchar(280) COLLATE utf8_spanish_ci NOT NULL,
  `limite_distancia` int(11) NOT NULL,
  PRIMARY KEY (`id_pista`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pista`
--

INSERT INTO `pista` (`id_pista`, `nombre`, `ubicacion`, `limite_distancia`) VALUES
(1, 'Silverstone ', 'Reino Unido', 30),
(2, 'Mónaco ', 'Mónaco', 30),
(3, 'Interlagos ', 'Brasil', 30),
(4, 'Nurburgring ', 'Alemania', 30),
(5, 'Monza ', 'italia', 30),
(6, 'Spa-Francorchamps', 'Belgica', 30),
(7, 'Suzuka ', 'Japon', 30),
(8, 'Watkins Glen', 'Estados unidos', 30),
(9, 'Reims ', 'Francia', 30),
(10, 'Zandvoort ', 'Holanda', 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pista_carro`
--

DROP TABLE IF EXISTS `pista_carro`;
CREATE TABLE IF NOT EXISTS `pista_carro` (
  `id_pistacarro` int(11) NOT NULL AUTO_INCREMENT,
  `id_carro` int(11) NOT NULL,
  `id_pista` int(11) NOT NULL,
  `carril` int(11) NOT NULL,
  PRIMARY KEY (`id_pistacarro`),
  KEY `id_pista4` (`id_pista`),
  KEY `id_carro4` (`id_carro`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pista_carro`
--

INSERT INTO `pista_carro` (`id_pistacarro`, `id_carro`, `id_pista`, `carril`) VALUES
(1, 5, 9, 1),
(2, 6, 9, 2),
(3, 5, 9, 3),
(4, 3, 3, 1),
(5, 10, 3, 2),
(6, 3, 3, 3),
(7, 1, 9, 1),
(8, 5, 9, 2),
(9, 3, 9, 3),
(10, 2, 9, 1),
(11, 6, 9, 2),
(12, 7, 9, 3),
(13, 10, 9, 4),
(14, 9, 9, 5),
(15, 8, 9, 6),
(16, 3, 9, 7),
(17, 1, 9, 8),
(18, 5, 9, 9),
(19, 4, 9, 10),
(20, 2, 1, 1),
(21, 6, 1, 2),
(22, 3, 1, 1),
(23, 1, 1, 2),
(24, 1, 1, 1),
(25, 4, 1, 2),
(26, 4, 1, 1),
(27, 1, 1, 2),
(28, 4, 1, 1),
(29, 2, 1, 2),
(30, 9, 2, 1),
(31, 3, 2, 2),
(32, 1, 3, 1),
(33, 3, 1, 1),
(34, 9, 1, 2),
(35, 1, 3, 1),
(36, 1, 3, 1),
(37, 2, 4, 1),
(38, 2, 4, 1),
(39, 2, 4, 1),
(40, 2, 4, 1),
(41, 3, 10, 1),
(42, 2, 3, 1),
(43, 1, 4, 1),
(44, 3, 4, 2),
(45, 1, 3, 1),
(46, 2, 3, 2),
(47, 8, 8, 1),
(48, 4, 8, 2),
(49, 2, 8, 3),
(50, 3, 9, 1),
(51, 3, 9, 2),
(52, 9, 3, 1),
(53, 2, 3, 2),
(54, 9, 1, 1),
(55, 6, 1, 2),
(56, 6, 10, 1),
(57, 9, 10, 2),
(58, 1, 10, 1),
(59, 3, 10, 2),
(60, 6, 10, 3),
(61, 1, 10, 1),
(62, 3, 8, 1),
(63, 1, 8, 2),
(64, 1, 8, 1),
(65, 9, 8, 2),
(66, 3, 9, 1),
(67, 10, 9, 2),
(68, 8, 9, 3),
(69, 1, 9, 1),
(70, 3, 9, 2),
(71, 3, 8, 1),
(72, 2, 8, 2),
(73, 3, 3, 1),
(74, 8, 3, 2),
(75, 8, 4, 1),
(76, 10, 4, 2),
(77, 1, 4, 3),
(78, 10, 3, 1),
(79, 2, 3, 2),
(80, 5, 3, 3),
(81, 4, 10, 1),
(82, 9, 10, 2),
(83, 2, 10, 3),
(84, 8, 6, 1),
(85, 2, 6, 2),
(86, 10, 6, 3),
(87, 3, 6, 4),
(88, 5, 6, 5),
(89, 5, 10, 1),
(90, 2, 10, 2),
(91, 8, 10, 3),
(92, 3, 10, 4),
(93, 4, 10, 5),
(94, 9, 10, 1),
(95, 1, 10, 2),
(96, 10, 10, 3),
(97, 2, 10, 4),
(98, 1, 10, 5),
(99, 1, 4, 1),
(100, 2, 4, 2),
(101, 5, 4, 3),
(102, 4, 4, 4),
(103, 9, 4, 5),
(104, 2, 9, 1),
(105, 6, 9, 2),
(106, 1, 9, 3),
(107, 4, 9, 4),
(108, 1, 9, 5),
(109, 1, 2, 1),
(110, 3, 2, 2),
(111, 1, 2, 3),
(112, 2, 2, 4),
(113, 3, 3, 1),
(114, 4, 3, 2),
(115, 9, 3, 3),
(116, 1, 3, 4),
(117, 6, 3, 5),
(118, 3, 10, 1),
(119, 5, 10, 2),
(120, 1, 10, 3),
(121, 4, 10, 4),
(122, 2, 10, 5),
(123, 1, 5, 1),
(124, 2, 5, 2),
(125, 6, 5, 3),
(126, 3, 5, 4),
(127, 10, 9, 1),
(128, 3, 9, 2),
(129, 2, 9, 3),
(130, 1, 9, 4),
(131, 2, 10, 1),
(132, 6, 10, 2),
(133, 2, 9, 1),
(134, 4, 9, 2),
(135, 2, 6, 1),
(136, 4, 6, 2),
(137, 3, 8, 1),
(138, 5, 8, 2),
(139, 5, 9, 1),
(140, 4, 9, 2),
(141, 3, 9, 1),
(142, 2, 9, 2),
(143, 5, 8, 1),
(144, 4, 8, 2),
(145, 2, 8, 3),
(146, 3, 8, 4),
(147, 6, 8, 5),
(148, 1, 8, 6),
(149, 3, 8, 1),
(150, 1, 8, 2),
(151, 9, 8, 1),
(152, 2, 8, 2),
(153, 6, 6, 1),
(154, 9, 6, 2),
(155, 1, 4, 1),
(156, 1, 9, 1),
(157, 1, 9, 1),
(158, 7, 8, 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `conductores`
--
ALTER TABLE `conductores`
  ADD CONSTRAINT `id_carro` FOREIGN KEY (`id_carro`) REFERENCES `carro` (`id_carro`);

--
-- Filtros para la tabla `juego`
--
ALTER TABLE `juego`
  ADD CONSTRAINT `id_pista5` FOREIGN KEY (`id_pista`) REFERENCES `pista` (`id_pista`);

--
-- Filtros para la tabla `juego_jugadores`
--
ALTER TABLE `juego_jugadores`
  ADD CONSTRAINT `id_juego` FOREIGN KEY (`id_juego`) REFERENCES `juego` (`id_juego`),
  ADD CONSTRAINT `id_jugador` FOREIGN KEY (`id_jugador`) REFERENCES `jugadores` (`id_Jugador`);

--
-- Filtros para la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD CONSTRAINT `id_conductor` FOREIGN KEY (`id_condu`) REFERENCES `conductores` (`id_conductor`);

--
-- Filtros para la tabla `pista_carro`
--
ALTER TABLE `pista_carro`
  ADD CONSTRAINT `id_carro4` FOREIGN KEY (`id_carro`) REFERENCES `carro` (`id_carro`),
  ADD CONSTRAINT `id_pista4` FOREIGN KEY (`id_pista`) REFERENCES `pista` (`id_pista`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
