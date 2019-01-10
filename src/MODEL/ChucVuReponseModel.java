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
public class ChucVuReponseModel {
    String KHChucVu;
    String TenChucVu;

    @Override
    public String toString() {
        return KHChucVu; //To change body of generated methods, choose Tools | Templates.
    }

    public String getKHChucVu() {
        return KHChucVu;
    }

    public void setKHChucVu(String KHChucVu) {
        this.KHChucVu = KHChucVu;
    }

    public String getTenChucVu() {
        return TenChucVu;
    }

    public void setTenChucVu(String TenChucVu) {
        this.TenChucVu = TenChucVu;
    }

    public ChucVuReponseModel(String KHChucVu, String TenChucVu) {
        this.KHChucVu = KHChucVu;
        this.TenChucVu = TenChucVu;
    }

    public ChucVuReponseModel() {
    }
}
