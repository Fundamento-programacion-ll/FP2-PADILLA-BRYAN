-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-02-2020 a las 05:14:29
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `poke`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `id_entre` varchar(12) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `fecha_nacimiento` varchar(30) NOT NULL,
  `numero_medallas` varchar(30) NOT NULL,
  `campeon_actual` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`id_entre`, `nombre`, `apellido`, `fecha_nacimiento`, `numero_medallas`, `campeon_actual`) VALUES
('001', 'Edison', 'Cayo', '18/09/200', '12', 'Verdaero'),
('002', 'Luis', 'Cayo', '12/06/2000', '9', 'Falso'),
('003', 'Martha', 'Quinde', '13/05/2000', '12', 'Falso'),
('100', 'Ruben', 'Quinde', '12/02/2000', '12', 'Falso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrepoke`
--

CREATE TABLE `entrepoke` (
  `cod_carnet` varchar(12) NOT NULL,
  `cod_materia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `entrepoke`
--

INSERT INTO `entrepoke` (`cod_carnet`, `cod_materia`) VALUES
('001', 15),
('002', 15),
('003', 15),
('100', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `id` int(11) NOT NULL,
  `numeropokemon` int(10) NOT NULL,
  `nombrepokemon` varchar(20) NOT NULL,
  `poderespecial1` varchar(30) NOT NULL,
  `poderespecial2` varchar(40) NOT NULL,
  `fechacaptura` varchar(30) NOT NULL,
  `nivel` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`id`, `numeropokemon`, `nombrepokemon`, `poderespecial1`, `poderespecial2`, `fechacaptura`, `nivel`) VALUES
(15, 0, 'Picachu', 'Electro Truenos', 'Caola de Hacero', '12/04/2019', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(10) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `contraseña` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `apellido`, `email`, `contraseña`) VALUES
(1, 'Edison', 'Cayo', 'edy@gmail.com', 0x61646d696e),
(2, 'Bryan', 'Padilla', 'bryan@gmail.com', 0x3132333435),
(4, 'Admin', 'Admin', 'admin@gmail.com', 0x61646d696e);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`id_entre`),
  ADD KEY `cod_tipodoc_idx` (`apellido`);

--
-- Indices de la tabla `entrepoke`
--
ALTER TABLE `entrepoke`
  ADD PRIMARY KEY (`cod_carnet`,`cod_materia`),
  ADD KEY `ctr_carnet_idx` (`cod_carnet`),
  ADD KEY `ctr_mat_idx` (`cod_materia`),
  ADD KEY `ctr_est_idx` (`cod_carnet`);

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entrepoke`
--
ALTER TABLE `entrepoke`
  ADD CONSTRAINT `ctr_est` FOREIGN KEY (`cod_carnet`) REFERENCES `entrenador` (`id_entre`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ctr_mat` FOREIGN KEY (`cod_materia`) REFERENCES `pokemon` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
