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
public class DanTocReponseModel {
    int IDDanToc ; 
    String TenDanToc; 

    public DanTocReponseModel(int IDDanToc, String TenDanToc) {
        this.IDDanToc = IDDanToc;
        this.TenDanToc = TenDanToc;
    }

    public DanTocReponseModel() {
    }

    public int getIDDanToc() {
        return IDDanToc;
    }

    public void setIDDanToc(int IDDanToc) {
        this.IDDanToc = IDDanToc;
    }

    public String getTenDanToc() {
        return TenDanToc;
    }

    public void setTenDanToc(String TenDanToc) {
        this.TenDanToc = TenDanToc;
    }

    @Override
    public String toString() {
        return TenDanToc; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
