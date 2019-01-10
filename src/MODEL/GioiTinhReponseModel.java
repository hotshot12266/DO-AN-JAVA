/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author LE ANH KIET
 */
public class GioiTinhReponseModel {
    int MaNV;
    String GioiTinh;

    @Override
    public String toString() {
        return GioiTinh; //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public GioiTinhReponseModel(int MaNV, String GioiTinh) {
        this.MaNV = MaNV;
        this.GioiTinh = GioiTinh;
    }

    public GioiTinhReponseModel() {
    }
}
