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
public class GiaDinhReponseModel {
    int MaNV;
    String GiaDinh;

    @Override
    public String toString() {
        return GiaDinh; //To change body of generated methods, choose Tools | Templates.
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getGiaDinh() {
        return GiaDinh;
    }

    public void setGiaDinh(String GiaDinh) {
        this.GiaDinh = GiaDinh;
    }

    public GiaDinhReponseModel(int MaNV, String GiaDinh) {
        this.MaNV = MaNV;
        this.GiaDinh = GiaDinh;
    }

    public GiaDinhReponseModel() {
    }
    

    
}
