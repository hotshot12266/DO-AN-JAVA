/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LE ANH KIET
 */
public class LoadDataCbxDAL {

    public static Connection conn = null;
    public static Statement stmt = null;
    Database database = new Database();

    public ResultSet layChucVuDAL() {
        return database.loadData("SELECT * FROM `chucvu` ");
    }

    public ResultSet layTonGiaoDAL() {
        return database.loadData("SELECT * FROM `tongiao` ");
    }

    public ResultSet layBacLuongDAL() {
        return database.loadData("SELECT * FROM `bacluong` ");
    }

    public ResultSet layMaHopDongDAL() {
        return database.loadData("SELECT * FROM `hopdong`   ");
    }

    public ResultSet layChuyenMonDAL() {
        return database.loadData("SELECT * FROM `chuyenmon`  ");
    }

    public ResultSet layTrinhDoDAL() {
        return database.loadData("SELECT * FROM `trinhdo`");
    }

    public ResultSet layPhongBanDAL() {
        return database.loadData("SELECT * FROM `phongban`");
    }

    public ResultSet layDanTocDAL() {
        return database.loadData("SELECT * FROM `dantoc`");
    }

    public ResultSet layGiaDinhDAL() {
        return database.loadData("SELECT `MaNV`,`GiaDinh` FROM `nhanvien`GROUP BY `GiaDinh`");
    }

    public ResultSet layGioiTinhDAL() {
        return database.loadData("SELECT MaNV,GioiTinh FROM `nhanvien`GROUP BY GioiTinh");

    }
}
