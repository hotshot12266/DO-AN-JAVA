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
public class PhongBanReponseModel {
    private String KHPhongBan;
    private String TenPhongBan;

    public String getKHPhongBan() {
        return KHPhongBan;
    }

    public void setKHPhongBan(String KHPhongBan) {
        this.KHPhongBan = KHPhongBan;
    }

    public String getTenPhongBan() {
        return TenPhongBan;
    }

    public void setTenPhongBan(String TenPhongBan) {
        this.TenPhongBan = TenPhongBan;
    }

    public PhongBanReponseModel(String KHPhongBan,String TenPhongBan) {
        this.KHPhongBan = KHPhongBan;
        this.TenPhongBan = TenPhongBan;
    }

    public PhongBanReponseModel() {
    }

    @Override
    public String toString() {
        return KHPhongBan; //To change body of generated methods, choose Tools | Templates.
    }
    
}
