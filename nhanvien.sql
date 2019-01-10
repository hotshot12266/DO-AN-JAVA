-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 10, 2019 lúc 04:24 AM
-- Phiên bản máy phục vụ: 10.1.36-MariaDB
-- Phiên bản PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `nhanvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bacluong`
--

CREATE TABLE `bacluong` (
  `IDBacLuong` int(11) NOT NULL,
  `GiaBacLuong` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `bacluong`
--

INSERT INTO `bacluong` (`IDBacLuong`, `GiaBacLuong`) VALUES
(1, '3'),
(2, '4'),
(3, '5'),
(4, '6');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chucvu`
--

CREATE TABLE `chucvu` (
  `KHChucVu` varchar(100) NOT NULL,
  `TenChucVu` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chucvu`
--

INSERT INTO `chucvu` (`KHChucVu`, `TenChucVu`) VALUES
('CT', 'Chủ tịch'),
('GD', 'Giám đốc'),
('LC', 'Lao công'),
('NV', 'Nhân viên'),
('PGD', 'Phó giám đốc'),
('TP', 'Trưởng phòng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chuyenmon`
--

CREATE TABLE `chuyenmon` (
  `KHChuyenMon` varchar(100) NOT NULL,
  `TenChuyenMon` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `chuyenmon`
--

INSERT INTO `chuyenmon` (`KHChuyenMon`, `TenChuyenMon`) VALUES
('CNTT', 'Công nghệ thông tin'),
('DTVT', 'Điện tử viễn thông'),
('KDBDS', 'Kinh doanh bất động sản'),
('KDTC', 'Kinh doanh tài chính');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `IDDanToc` int(11) NOT NULL,
  `TenDanToc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `dantoc`
--

INSERT INTO `dantoc` (`IDDanToc`, `TenDanToc`) VALUES
(1, 'Kinh'),
(2, 'Tầy'),
(3, 'Nùng'),
(4, 'Thái');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `IDHopDong` int(11) NOT NULL,
  `TenHopDong` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`IDHopDong`, `TenHopDong`) VALUES
(1, 'Dài hạn'),
(2, 'Ngắn hạn'),
(3, 'Có phát sinh'),
(4, 'Có tiền thưởng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `HoTenNV` varchar(100) NOT NULL,
  `KHPhongBan` varchar(100) NOT NULL,
  `KHChucVu` varchar(100) NOT NULL,
  `KHTrinhDo` varchar(100) NOT NULL,
  `KHChuyenMon` varchar(100) NOT NULL,
  `IDDanToc` int(11) NOT NULL,
  `IDTonGiao` int(11) NOT NULL,
  `IDBacLuong` int(11) NOT NULL,
  `IDHopDong` int(11) NOT NULL,
  `NgaySinh` date NOT NULL,
  `NoiSinh` varchar(100) NOT NULL,
  `SoCMND` int(11) NOT NULL,
  `GiaDinh` varchar(100) NOT NULL,
  `GioiTinh` varchar(100) NOT NULL,
  `QueQuan` varchar(100) NOT NULL,
  `ChoHienTai` varchar(1000) NOT NULL,
  `SDT` int(11) NOT NULL,
  `PhuCapCV` varchar(100) NOT NULL,
  `HDLDSo` varchar(100) NOT NULL,
  `LoaiHD` varchar(100) NOT NULL,
  `NgayHD` date NOT NULL,
  `NgayBD` date NOT NULL,
  `NgayKT` date NOT NULL,
  `HinhAnh` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `HoTenNV`, `KHPhongBan`, `KHChucVu`, `KHTrinhDo`, `KHChuyenMon`, `IDDanToc`, `IDTonGiao`, `IDBacLuong`, `IDHopDong`, `NgaySinh`, `NoiSinh`, `SoCMND`, `GiaDinh`, `GioiTinh`, `QueQuan`, `ChoHienTai`, `SDT`, `PhuCapCV`, `HDLDSo`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`, `HinhAnh`) VALUES
(3, 'hhs', 'LT', 'GD', 'THPT', 'CNTT', 3, 2, 4, 3, '2019-01-16', 'vtss', 1734, 'ko', 'Nu', 'dfss', 'gsf', 1563, 'laksdj', 'fghjf', 'Có phát sinh', '2019-01-09', '2019-01-11', '2019-01-05', 'shh'),
(4, 'sdf', 'KT', 'LC', 'THPT', 'CNTT', 3, 2, 4, 2, '2019-01-16', 'xfcgvd', 5274, 'ko', 'Nu', 'fdgx', 'dffgv', 12353, 'vbbnn', '454', 'Ng?n h?n', '2019-01-09', '2019-01-24', '2019-01-08', 'vbbn'),
(5, 'ghjhs', 'KD', 'GD', 'THPT', 'CNTT', 1, 2, 2, 2, '2019-01-09', 'ghgs', 516512, 'ko', 'Nam', 'fsdsa', 'sdfa', 1233, 'dfgs', 'abc', 'Ng?n h?n', '2019-01-11', '2019-01-19', '2019-01-08', 'dfg'),
(6, 'lkjd', 'KT', 'GD', 'THPT', 'CNTT', 3, 1, 4, 3, '2019-01-15', 'hcm', 5165, 'ko', 'Nu', 'ald', 'kjkj', 156, 'jkjh', 'lkj', 'Có phát sinh', '2019-01-23', '2019-01-25', '2019-01-14', 'jsj');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phongban`
--

CREATE TABLE `phongban` (
  `KHPhongBan` varchar(100) NOT NULL,
  `TenPhongBan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `phongban`
--

INSERT INTO `phongban` (`KHPhongBan`, `TenPhongBan`) VALUES
('KD', 'Kinh doanh'),
('KT', 'Kinh tế'),
('LT', 'Lập trình'),
('PT', 'Phát triển');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `IDTonGiao` int(11) NOT NULL,
  `TenTonGiao` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tongiao`
--

INSERT INTO `tongiao` (`IDTonGiao`, `TenTonGiao`) VALUES
(1, 'Phật'),
(2, 'Chúa'),
(3, 'Không có'),
(4, 'Mẹ đức chúa trời'),
(5, 'Đức Tin Lành');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trinhdo`
--

CREATE TABLE `trinhdo` (
  `KHTrinhDo` varchar(100) NOT NULL,
  `TenTrinhDo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `trinhdo`
--

INSERT INTO `trinhdo` (`KHTrinhDo`, `TenTrinhDo`) VALUES
('CĐ', 'Cao đẳng'),
('THPT', 'Trung học phổ thông'),
('ĐH', 'Đại học');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bacluong`
--
ALTER TABLE `bacluong`
  ADD PRIMARY KEY (`IDBacLuong`),
  ADD KEY `IDBacLuong` (`IDBacLuong`);

--
-- Chỉ mục cho bảng `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`KHChucVu`),
  ADD KEY `IDChucVu` (`KHChucVu`);

--
-- Chỉ mục cho bảng `chuyenmon`
--
ALTER TABLE `chuyenmon`
  ADD PRIMARY KEY (`KHChuyenMon`),
  ADD KEY `IDChuyenMon` (`KHChuyenMon`);

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`IDDanToc`),
  ADD KEY `IDDanToc` (`IDDanToc`);

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`IDHopDong`),
  ADD KEY `IDHopDong` (`IDHopDong`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD KEY `MaNV` (`MaNV`,`KHPhongBan`,`KHChucVu`,`KHTrinhDo`,`KHChuyenMon`,`IDDanToc`,`IDTonGiao`,`IDBacLuong`,`IDHopDong`),
  ADD KEY `IDDanToc` (`IDDanToc`),
  ADD KEY `IDTonGiao` (`IDTonGiao`),
  ADD KEY `IDBacLuong` (`IDBacLuong`),
  ADD KEY `IDHopDong` (`IDHopDong`),
  ADD KEY `KHChucVu` (`KHChucVu`),
  ADD KEY `KHTrinhDo` (`KHTrinhDo`),
  ADD KEY `KHChuyenMon` (`KHChuyenMon`),
  ADD KEY `KHPhongBan` (`KHPhongBan`);

--
-- Chỉ mục cho bảng `phongban`
--
ALTER TABLE `phongban`
  ADD PRIMARY KEY (`KHPhongBan`),
  ADD KEY `IDPhongBan` (`KHPhongBan`),
  ADD KEY `IDPhongBan_2` (`KHPhongBan`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`IDTonGiao`),
  ADD KEY `IDTonGiao` (`IDTonGiao`);

--
-- Chỉ mục cho bảng `trinhdo`
--
ALTER TABLE `trinhdo`
  ADD PRIMARY KEY (`KHTrinhDo`),
  ADD KEY `IDTrinhDo` (`KHTrinhDo`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bacluong`
--
ALTER TABLE `bacluong`
  MODIFY `IDBacLuong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  MODIFY `IDDanToc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  MODIFY `IDHopDong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  MODIFY `IDTonGiao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_10` FOREIGN KEY (`KHTrinhDo`) REFERENCES `trinhdo` (`KHTrinhDo`),
  ADD CONSTRAINT `nhanvien_ibfk_11` FOREIGN KEY (`KHChuyenMon`) REFERENCES `chuyenmon` (`KHChuyenMon`),
  ADD CONSTRAINT `nhanvien_ibfk_12` FOREIGN KEY (`KHPhongBan`) REFERENCES `phongban` (`KHPhongBan`),
  ADD CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`IDDanToc`) REFERENCES `dantoc` (`IDDanToc`),
  ADD CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`IDTonGiao`) REFERENCES `tongiao` (`IDTonGiao`),
  ADD CONSTRAINT `nhanvien_ibfk_7` FOREIGN KEY (`IDBacLuong`) REFERENCES `bacluong` (`IDBacLuong`),
  ADD CONSTRAINT `nhanvien_ibfk_8` FOREIGN KEY (`IDHopDong`) REFERENCES `hopdong` (`IDHopDong`),
  ADD CONSTRAINT `nhanvien_ibfk_9` FOREIGN KEY (`KHChucVu`) REFERENCES `chucvu` (`KHChucVu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
