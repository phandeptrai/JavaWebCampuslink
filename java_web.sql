-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 22, 2025 lúc 10:44 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `java_web`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cong_viec`
--

CREATE TABLE `cong_viec` (
  `SoCMND` varchar(10) NOT NULL,
  `NgayVaoCongTy` date NOT NULL,
  `MaNganh` varchar(10) NOT NULL,
  `TenCongViec` varchar(20) NOT NULL,
  `TenCongTy` varchar(30) NOT NULL,
  `DiaChiCongTy` varchar(70) NOT NULL,
  `ThoiGianLamViec` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nganh`
--

CREATE TABLE `nganh` (
  `MaNganh` varchar(10) NOT NULL,
  `TenNganh` varchar(20) DEFAULT NULL,
  `LoaiNganh` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nganh`
--

INSERT INTO `nganh` (`MaNganh`, `TenNganh`, `LoaiNganh`) VALUES
('N01', 'Công nghệ thông tin', 'Kỹ thuật'),
('N02', 'Quản trị kinh doanh', 'Kinh tế'),
('N03', 'Tài chính ngân hàng', 'Kinh tế'),
('N04', 'Kế toán', 'Kinh tế'),
('N05', 'Luật', 'Xã hội'),
('N06', 'Y đa khoa', 'Y tế'),
('N07', 'Dược học', 'Y tế'),
('N08', 'Điều dưỡng', 'Y tế'),
('N09', 'Sư phạm Toán', 'Giáo dục'),
('N10', 'Sư phạm Văn', 'Giáo dục'),
('N11', 'Ngôn ngữ Anh', 'Ngoại ngữ'),
('N12', 'Ngôn ngữ Trung', 'Ngoại ngữ'),
('N13', 'Ngôn ngữ Nhật', 'Ngoại ngữ'),
('N14', 'Công nghệ sinh học', 'Kỹ thuật'),
('N15', 'Kỹ thuật phần mềm', 'Kỹ thuật'),
('N16', 'Hệ thống thông tin', 'Kỹ thuật'),
('N17', 'Kỹ thuật ô tô', 'Kỹ thuật'),
('N18', 'Kỹ thuật điện', 'Kỹ thuật'),
('N19', 'Kiến trúc', 'Mỹ thuật'),
('N20', 'Thiết kế đồ họa', 'Mỹ thuật');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `SoCMND` varchar(10) NOT NULL,
  `HoTen` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `SoDt` varchar(10) DEFAULT NULL,
  `DiaChi` varchar(70) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`SoCMND`, `HoTen`, `Email`, `SoDt`, `DiaChi`) VALUES
('', 'dao van phan', 'vanphan190704@gmail.com', '0111111111', 'adsđâsđá'),
('0111111111', 'dao van phan', 'vanphan190704@gmail.com', '0111111111', 'adsđâsđá'),
('0111112334', 'dao van phan', 'dddd', '0111111111', 'adsđâsđá'),
('0123123412', 'dao van phan', 'bbqdd3241@gmail.com', '0111111111', 'adsđâsđá'),
('12312321', 'dao van phan', 'aa', '0111111111', 'adsđâsđá'),
('7777777777', 'Phận đẹp trai vãi ', 'dsdd@gmail.com', '777777777', 'adsđâsđá');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tot_nghiep`
--

CREATE TABLE `tot_nghiep` (
  `SoCMND` varchar(10) NOT NULL,
  `MaTruong` varchar(10) NOT NULL,
  `MaNganh` varchar(10) NOT NULL,
  `HeTN` varchar(10) NOT NULL,
  `NgayTN` varchar(10) NOT NULL,
  `LoaiTN` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `tot_nghiep`
--

INSERT INTO `tot_nghiep` (`SoCMND`, `MaTruong`, `MaNganh`, `HeTN`, `NgayTN`, `LoaiTN`) VALUES
('', 'T17', 'N01', '4', '2025-04-16', 'gioi'),
('0111111111', 'T17', 'N01', '4', '2025-04-16', 'gioi'),
('0111112334', 'T01', 'N01', '4', '2025-04-17', 'gioi'),
('0123123412', 'T01', 'N01', '4', '2025-04-18', 'gioi'),
('12312321', 'T01', 'N01', '4', '2025-04-18', 'gioi'),
('7777777777', 'T17', 'N01', '4', '2025-04-19', 'suát xac');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `truong`
--

CREATE TABLE `truong` (
  `MaTruong` varchar(10) NOT NULL,
  `TenTruong` varchar(30) DEFAULT NULL,
  `DiaChi` varchar(70) DEFAULT NULL,
  `SoDT` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `truong`
--

INSERT INTO `truong` (`MaTruong`, `TenTruong`, `DiaChi`, `SoDT`) VALUES
('T01', 'Trường A', '123 Lê Lợi, Q1', '0901234560'),
('T02', 'Trường B', '456 Nguyễn Huệ, Q1', '0901234561'),
('T03', 'Trường C', '789 Hai Bà Trưng, Q3', '0901234562'),
('T04', 'Trường D', '321 Lý Tự Trọng, Q1', '0901234563'),
('T05', 'Trường E', '654 Trần Hưng Đạo, Q5', '0901234564'),
('T06', 'Trường F', '987 Cách Mạng, Q10', '0901234565'),
('T07', 'Trường G', '135 Lê Văn Sỹ, Q3', '0901234566'),
('T08', 'Trường H', '246 Nguyễn Trãi, Q5', '0901234567'),
('T09', 'Trường I', '357 Trường Chinh, Tân Bình', '0901234568'),
('T10', 'Trường J', '468 Điện Biên Phủ, Bình Thạnh', '0901234569'),
('T11', 'Trường K', '579 Nguyễn Đình Chiểu, Q3', '0901234570'),
('T12', 'Trường L', '680 Lê Duẩn, Q1', '0901234571'),
('T13', 'Trường M', '791 Phan Đăng Lưu, Phú Nhuận', '0901234572'),
('T14', 'Trường N', '892 Âu Cơ, Tân Phú', '0901234573'),
('T15', 'Trường O', '903 Quang Trung, Gò Vấp', '0901234574'),
('T16', 'Trường P', '114 Võ Thị Sáu, Q3', '0901234575'),
('T17', 'Trường Q', '125 Phạm Văn Đồng, Thủ Đức', '0901234576'),
('T18', 'Trường R', '136 Hoàng Văn Thụ, Phú Nhuận', '0901234577'),
('T19', 'Trường S', '147 Lạc Long Quân, Tân Bình', '0901234578'),
('T20', 'Trường T', '158 Lý Thường Kiệt, Q10', '0901234579');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cong_viec`
--
ALTER TABLE `cong_viec`
  ADD PRIMARY KEY (`SoCMND`,`NgayVaoCongTy`),
  ADD KEY `pk_manganh2` (`MaNganh`);

--
-- Chỉ mục cho bảng `nganh`
--
ALTER TABLE `nganh`
  ADD PRIMARY KEY (`MaNganh`);

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`SoCMND`);

--
-- Chỉ mục cho bảng `tot_nghiep`
--
ALTER TABLE `tot_nghiep`
  ADD PRIMARY KEY (`SoCMND`,`MaTruong`,`MaNganh`),
  ADD KEY `pk_matruong` (`MaTruong`),
  ADD KEY `pk_manganh` (`MaNganh`);

--
-- Chỉ mục cho bảng `truong`
--
ALTER TABLE `truong`
  ADD PRIMARY KEY (`MaTruong`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `cong_viec`
--
ALTER TABLE `cong_viec`
  ADD CONSTRAINT `pk_manganh2` FOREIGN KEY (`MaNganh`) REFERENCES `nganh` (`MaNganh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pk_socmnd2` FOREIGN KEY (`SoCMND`) REFERENCES `sinhvien` (`SoCMND`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tot_nghiep`
--
ALTER TABLE `tot_nghiep`
  ADD CONSTRAINT `pk_manganh` FOREIGN KEY (`MaNganh`) REFERENCES `nganh` (`MaNganh`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pk_matruong` FOREIGN KEY (`MaTruong`) REFERENCES `truong` (`MaTruong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pk_socmnd` FOREIGN KEY (`SoCMND`) REFERENCES `sinhvien` (`SoCMND`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
