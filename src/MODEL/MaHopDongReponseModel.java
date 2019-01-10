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
public class MaHopDongReponseModel {
    int IDHopDong;
    String TenHopDong;

    @Override
    public String toString() {
        return TenHopDong; //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDHopDong() {
        return IDHopDong;
    }

    public void setIDHopDong(int IDHopDong) {
        this.IDHopDong = IDHopDong;
    }

    public String getTenHopDong() {
        return TenHopDong;
    }

    public void setTenHopDong(String TenHopDong) {
        this.TenHopDong = TenHopDong;
    }

    public MaHopDongReponseModel(int IDHopDong, String TenHopDong) {
        this.IDHopDong = IDHopDong;
        this.TenHopDong = TenHopDong;
    }

    public MaHopDongReponseModel() {
    }
}
