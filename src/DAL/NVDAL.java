/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import MODEL.NVModel;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LE ANH KIET
 */
public class NVDAL extends Database {

    public static Connection conn = null;
    public static Statement stmt = null;
    public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public ArrayList<NVModel> readNV() {

        ArrayList<NVModel> nvlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaNV,HoTenNV,TenChucVu,QueQuan,GioiTinh,TenPhongBan,TenTrinhDo,TenChuyenMon,NoiSinh,nhanvien.KHPhongBan,nhanvien.KHChucVu,nhanvien.KHTrinhDo,nhanvien.KHChuyenMon FROM nhanvien,phongban,chucvu,chuyenmon,trinhdo WHERE nhanvien.KHPhongBan=phongban.KHPhongBan and nhanvien.KHChucVu=chucvu.KHChucVu and nhanvien.KHTrinhDo=trinhdo.KHTrinhDo and nhanvien.KHChuyenMon=chuyenmon.KHChuyenMon";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                NVModel nv = new NVModel();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setHoTenNV(rs.getString("HoTenNV"));
                nv.setTenChucVu(rs.getString("TenChucVu"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setTenPhongBan(rs.getString("TenPhongBan"));
                nv.setTenTrinhDo(rs.getString("TenTrinhDo"));
                nv.setTenChuyenMon(rs.getString("TenChuyenMon"));
                nv.setNoiSinh(rs.getString("NoiSinh"));
                nvlist.add(nv);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return nvlist;
        }

    }

    public ArrayList<NVModel> read1NV(int MaNV) {

        ArrayList<NVModel> nvlist = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT `MaNV`, `HoTenNV`, `NgaySinh`, `NoiSinh`, `SoCMND`, `GiaDinh`, `GioiTinh`, `QueQuan`, `ChoHienTai`, `SDT`, `PhuCapCV`, `HDLDSo`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`, `HinhAnh`, `TenTonGiao`,`TenDanToc`,`GiaBacLuong`,`TenHopDong`,`TenChucVu`,`TenPhongBan`,`TenTrinhDo`,`TenChuyenMon`,nhanvien.KHChucVu,nhanvien.KHChuyenMon,nhanvien.KHTrinhDo,nhanvien.KHPhongBan FROM nhanvien,phongban,chucvu,trinhdo,chuyenmon,tongiao,dantoc,bacluong,hopdong WHERE nhanvien.KHPhongBan=phongban.KHPhongBan and nhanvien.KHChucVu=chucvu.KHChucVu and nhanvien.KHTrinhDo=trinhdo.KHTrinhDo and nhanvien.KHChuyenMon=chuyenmon.KHChuyenMon and nhanvien.IDTonGiao=tongiao.IDTonGiao and nhanvien.IDDanToc=dantoc.IDDanToc and nhanvien.IDBacLuong=bacluong.IDBacLuong and nhanvien.IDHopDong=hopdong.IDHopDong and nhanvien.MaNV='" + MaNV + "'";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rs.next()) {
                NVModel nv = new NVModel();
                nv.setMaNV(rs.getInt("MaNV"));//
                nv.setHoTenNV(rs.getString("HoTenNV"));//
                nv.setTenChucVu(rs.getString("TenChucVu"));//
                nv.setQueQuan(rs.getString("QueQuan"));//
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setTenPhongBan(rs.getString("TenPhongBan"));
                nv.setTenTrinhDo(rs.getString("TenTrinhDo"));
                nv.setTenChuyenMon(rs.getString("TenChuyenMon"));
                nv.setNoiSinh(rs.getString("NoiSinh"));
                nv.setSoCMND(rs.getInt("SoCMND"));
                nv.setGiaDinh(rs.getString("GiaDinh"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setNgaySinh((Date) dateFormat.parse(rs.getString("NgaySinh")));
                nv.setChoHienTai(rs.getString("ChoHienTai"));
                nv.setSDT(rs.getInt("SDT"));
                nv.setPhuCapCV(rs.getString("PhuCapCV"));
                nv.setHDLDSo(rs.getString("HDLDSo"));
                nv.setLoaiHD(rs.getString("LoaiHD"));
                nv.setNgayHD((Date) dateFormat.parse(rs.getString("NgayHD")));
                nv.setNgayBD((Date) dateFormat.parse(rs.getString("NgayBD")));
                nv.setNgayKT((Date) dateFormat.parse(rs.getString("NgayKT")));
                nv.setHinhAnh(rs.getString("HinhAnh"));
                nv.setTenTonGiao(rs.getString("TenTonGiao"));
                nv.setTenDanToc(rs.getString("TenDanToc"));
                nv.setGiaBacLuong(rs.getString("GiaBacLuong"));
                nv.setTenHopDong(rs.getString("TenHopDong"));
                nvlist.add(nv);

            }
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return nvlist;
        }

    }
//
//    public ArrayList<NVModel> LoadPB(String KHPhongBan ) {
//        ArrayList<NVModel> pblist = new ArrayList<>();
//        conn = getConnection();
//        ResultSet rs = null;
//        try {
//            stmt = conn.createStatement();
//            String sql = ("SELECT `KHPhongBan`, `TenPhongBan` FROM `phongban` WHERE KHPhongBan= "+KHPhongBan);
//            NVModel nv;
//            while (rs.next()) {
//                nv=new NVModel(
//                  rs.getString("KHPhongBan"),
//                  rs.getString("TenPhongBan")
//                );
//                pblist.add(nv);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return pblist;
//    }

    public void DeleteNVDAL(int maNV) throws SQLException {
        conn = getConnection();

        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql = "DELETE FROM nhanvien WHERE MaNV = " + maNV + " ";
        stmt.executeUpdate(sql);
    }

    public void EditNVDAL(NVModel nVModel) throws SQLException {
        conn = getConnection();

        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(NVDAL.class.getName()).log(Level.SEVERE, null, ex);
        }

        int MaNV = nVModel.getMaNV();
        String HoTenNV = nVModel.getHoTenNV();
        String KHPhongBan = nVModel.getKHPhongBan();
        String KHChucVu = nVModel.getKHChucVu();
        String KHTrinhDo = nVModel.getKHTrinhDo();
        String KHChuyenMon = nVModel.getKHChuyenMon();
        int IDDanToc = nVModel.getIDDanToc();
        int IDTonGiao = nVModel.getIDTonGiao();
        int IDBacLuong = nVModel.getIDBacLuong();
        int IDHopDong = nVModel.getIDHopDong();
//        Date NgaySinh = nVModel.getNgaySinh();
        int SoCMND = nVModel.getSoCMND();
        String GiaDinh = nVModel.getGiaDinh();
        String NoiSinh = nVModel.getNoiSinh();
        String GioiTinh = nVModel.getGioiTinh();
        String QueQuan = nVModel.getQueQuan();
        String ChoHienTai = nVModel.getChoHienTai();
        int SDT = nVModel.getSDT();
        String PhuCapCV = nVModel.getPhuCapCV();
        String HDLDSo = nVModel.getHDLDSo();
        String LoaiHD = nVModel.getLoaiHD();
//        Date NgayHD = nVModel.getNgayHD();
//        Date NgayBD = nVModel.getNgayBD();
//        Date NgayKT = nVModel.getNgayKT();
//        String HinhAnh = nVModel.getHinhAnh();
        String sql = "UPDATE `nhanvien` SET `HoTenNV`='"+HoTenNV+"',`KHPhongBan`='"+KHPhongBan+"',`KHChucVu`='"+KHChucVu+"',`KHTrinhDo`='"+KHTrinhDo+"',`KHChuyenMon`='"+KHChuyenMon+"',`IDDanToc`='"+IDDanToc+"',`IDTonGiao`='"+IDTonGiao+"',`IDBacLuong`='"+IDBacLuong+"',`IDHopDong`='"+IDHopDong+"',`NoiSinh`='"+NoiSinh+"',`SoCMND`='"+SoCMND+"',`GiaDinh`='"+GiaDinh+"',`GioiTinh`='"+GioiTinh+"',`QueQuan`='"+QueQuan+"',`ChoHienTai`='"+ChoHienTai+"',`SDT`='"+SDT+"',`PhuCapCV`='"+PhuCapCV+"',`HDLDSo`='"+HDLDSo+"',`LoaiHD`='"+LoaiHD+"' WHERE `MaNV`='"+MaNV+"'";
        stmt.executeUpdate(sql);
    }
          public void addNewNhanVienDAL(NVModel nV){
         conn = null;
        Statement stmt = null;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            int maNV = nV.getMaNV();
            String hoTen = nV.getHoTenNV();
            Date ngaySinh = nV.getNgaySinh();
            String noiSinh = nV.getNoiSinh();
            int soCMND =nV.getSoCMND();
            String queQuan = nV.getQueQuan();
            String choOHienTai = nV.getChoHienTai();
            int dienThoaiDD = nV.getSDT();
            String phuCapCV = nV.getPhuCapCV();
            String hdldSo = nV.getHDLDSo();
            String loaiHD = nV.getLoaiHD();
            Date ngayHD = nV.getNgayHD();
            Date ngayBD = nV.getNgayBD();
            Date ngayKT = nV.getNgayKT();
            String gioiTinh = nV.getGioiTinh();
            String maPhong = nV.getKHPhongBan();
            String chucVu = nV.getKHChucVu();
            String trinhDo = nV.getKHTrinhDo();
            String chuyenMon = nV.getKHChuyenMon();
            String giaDinh = nV.getGiaDinh();
            int danToc = nV.getIDDanToc();
            int tonGiao = nV.getIDTonGiao();
            int bacLuong = nV.getIDBacLuong();
            int maHD = nV.getIDHopDong();
            
            
//            String sql = "INSERT INTO `thongtinnhanvien`(`MaNV`, `HoTen`, `MaPhong`, `MaChucVu`, `MaTrinhDo`, "
//                    + "`MaChuyenMon`, `MaGioiTinh`, `MaGiaDinh`, `MaDanToc`, `MaTonGiao`, `NgaySinh`, `NoiSinh`, "
//                    + "`SoCMND`, `QueQuan`, `ChoOHienTai`, `DienThoaiDD`, `MaBacLuong`, `PhuCapCV`, `HDLDSO`, "
//                    + "`MaHD`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`) VALUES ('"+ maNV +"','"+ hoTen +"','"+ maPhong +"',"
//                    + "'"+ chucVu +"','"+ trinhDo +"','"+ chuyenMon +"','"+ gioiTinh +"','"+ giaDinh +"','1','1','1997/03/27',"
//                    + "'"+ noiSinh +"','"+ soCMND +"','"+ queQuan +"','"+ choOHienTai +"','"+ dienThoaiDD +"','3','"+ phuCapCV +"','"+ hdldSo +"',"
//                    + "'DH','"+ loaiHD +"','2019/01/09','2019/01/01','2019/01/31')";
            String sql ="INSERT INTO `nhanvien`(`MaNV`, `HoTenNV`, `KHPhongBan`, `KHChucVu`, `KHTrinhDo`, `KHChuyenMon`, `IDDanToc`, `IDTonGiao`, `IDBacLuong`, `IDHopDong`, `NgaySinh`, `NoiSinh`, `SoCMND`, `GiaDinh`, `GioiTinh`, `QueQuan`, `ChoHienTai`, `SDT`, `PhuCapCV`, `HDLDSo`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`) VALUES "
                    + "('"+maNV+"','"+hoTen+"','"+maPhong+"','"+chucVu+"','"+trinhDo+"','"+chuyenMon+"','"+danToc+"','"+tonGiao+"','"+bacLuong+"','"+maHD +"','1997/03/27', 'noiSinh','soCMND','"+giaDinh+"','"+gioiTinh+"','queQuan','choOHienTai','dienThoaiDD',phuCapCV,'"+hdldSo+"','loaiHD','2019/01/09','2019/01/01','2019/01/31')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
