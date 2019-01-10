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
public class ChuyenMonReponseModel {
    String KHChuyenMon;
    String TenChuyenMon;

    @Override
    public String toString() {
        return KHChuyenMon; //To change body of generated methods, choose Tools | Templates.
    }

    public String getKHChuyenMon() {
        return KHChuyenMon;
    }

    public void setKHChuyenMon(String KHChuyenMon) {
        this.KHChuyenMon = KHChuyenMon;
    }

    public String getTenChuyenMon() {
        return TenChuyenMon;
    }

    public void setTenChuyenMon(String TenChuyenMon) {
        this.TenChuyenMon = TenChuyenMon;
    }

    public ChuyenMonReponseModel(String KHChuyenMon, String TenChuyenMon) {
        this.KHChuyenMon = KHChuyenMon;
        this.TenChuyenMon = TenChuyenMon;
    }

    public ChuyenMonReponseModel() {
    }
}
