/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoadDataCbxDAL;

import java.sql.ResultSet;

/**
 *
 * @author LE ANH KIET
 */
public class LoadDataCbxBLL {

    LoadDataCbxDAL dataCbxBLL = new LoadDataCbxDAL();

    public ResultSet layChucVuBLL() {
        return dataCbxBLL.layChucVuDAL();
    }

    public ResultSet layTonGiaoBLL() {
        return dataCbxBLL.layTonGiaoDAL();
    }

    public ResultSet layBacLuongBLL() {
        return dataCbxBLL.layBacLuongDAL();
    }

    public ResultSet layMaHopDongBLL() {
        return dataCbxBLL.layMaHopDongDAL();
    }

    public ResultSet layChuyenMonBLL() {
        return dataCbxBLL.layChuyenMonDAL();
    }

    public ResultSet layTrinhDoBLL() {
        return dataCbxBLL.layTrinhDoDAL();
    }

    public ResultSet layPhongBanBLL() {
        return dataCbxBLL.layPhongBanDAL();
    }

    public ResultSet layDanTocBLL() {
        return dataCbxBLL.layDanTocDAL();
    }

    public ResultSet layGiaDinhBLL() {
        return dataCbxBLL.layGiaDinhDAL();
    }

    public ResultSet layGioiTinhBLL() {
        return dataCbxBLL.layGioiTinhDAL();
    }
}
