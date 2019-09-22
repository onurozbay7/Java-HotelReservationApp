-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 31 May 2019, 19:39:02
-- Sunucu sürümü: 10.1.40-MariaDB
-- PHP Sürümü: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `musteri`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `oda`
--

CREATE TABLE `oda` (
  `id` int(11) NOT NULL,
  `odaNumarasi` int(11) NOT NULL,
  `odaTipi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `musteriAdi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `musteriSoyadi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `ucret` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `oda`
--

INSERT INTO `oda` (`id`, `odaNumarasi`, `odaTipi`, `musteriAdi`, `musteriSoyadi`, `ucret`) VALUES
(4, 1, 'Ekonomik', '', '', 0),
(5, 2, 'Ekonomik', '', '', 0),
(6, 3, 'Ekonomik', '', '', 0),
(7, 4, 'Ekonomik', '', '', 0),
(8, 5, 'Ekonomik', '', '', 0),
(9, 6, 'Ekonomik', '', '', 0),
(10, 7, 'Ekonomik', '', '', 0),
(11, 8, 'Ekonomik', '', '', 0),
(12, 9, 'Ekonomik', '', '', 0),
(13, 10, 'Ekonomik', '', '', 0),
(14, 11, 'Normal', 'Elif', 'Haytaoğlu', 1219),
(15, 12, 'Normal', '', '', 0),
(16, 13, 'Normal', '', '', 0),
(17, 14, 'Normal', '', '', 0),
(18, 15, 'Normal', '', '', 0),
(19, 16, 'Normal', '', '', 0),
(20, 17, 'Normal', '', '', 0),
(21, 18, 'Normal', '', '', 0),
(22, 19, 'Normal', '', '', 0),
(23, 20, 'Normal', '', '', 0),
(24, 21, 'Kral Dairesi', 'Faruk', 'Özdemir', 1838),
(25, 22, 'Kral Dairesi', '', '', 0),
(26, 23, 'Kral Dairesi', '', '', 0),
(27, 24, 'Kral Dairesi', '', '', 0),
(28, 25, 'Kral Dairesi', '', '', 0),
(29, 26, 'Kral Dairesi', '', '', 0),
(30, 27, 'Kral Dairesi', '', '', 0),
(31, 28, 'Kral Dairesi', '', '', 0),
(32, 29, 'Kral Dairesi', '', '', 0),
(33, 30, 'Kral Dairesi', '', '', 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tablo`
--

CREATE TABLE `tablo` (
  `id` int(11) NOT NULL,
  `adi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `soyadi` text COLLATE utf8mb4_turkish_ci NOT NULL,
  `tc` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL,
  `telefon` varchar(11) COLLATE utf8mb4_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tablo`
--

INSERT INTO `tablo` (`id`, `adi`, `soyadi`, `tc`, `telefon`) VALUES
(22, 'Onur', 'Özbay', '12341234123', '12341234123'),
(23, 'Mustafa', 'Yavaş', '12341234123', '12341234123'),
(24, 'onur', 'özbay', '12341234123', '12341234123'),
(25, 'onur', 'özbay', '12341234123', '12341234123'),
(27, 'Onur', 'Özbay', '31429671632', '05346217321'),
(28, 'AAAAAA', 'WW', '222', '22'),
(29, 'Faruk', 'Özdemir', '12341234123', '12341234123'),
(30, 'Faruk', 'Özdemir', '12341234123', '12341234123'),
(31, 'Elif', 'Haytaoğlu', '12341234123', '13241234123');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `oda`
--
ALTER TABLE `oda`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `tablo`
--
ALTER TABLE `tablo`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `oda`
--
ALTER TABLE `oda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- Tablo için AUTO_INCREMENT değeri `tablo`
--
ALTER TABLE `tablo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
