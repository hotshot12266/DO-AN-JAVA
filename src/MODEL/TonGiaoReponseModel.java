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
public class TonGiaoReponseModel {
    int IDTonGiao;
    String TenTonGiao;

    public TonGiaoReponseModel(int IDTonGiao, String TenTonGiao) {
        this.IDTonGiao = IDTonGiao;
        this.TenTonGiao = TenTonGiao;
    }

    public TonGiaoReponseModel() {
    }

  

   

    public int getIDTonGiao() {
        return IDTonGiao;
    }

    public void setIDTonGiao(int IDTonGiao) {
        this.IDTonGiao = IDTonGiao;
    }

    public String getTenTonGiao() {
        return TenTonGiao;
    }

    public void setTenTonGiao(String TenTonGiao) {
        this.TenTonGiao = TenTonGiao;
    }

     @Override
    public String toString() {
        return TenTonGiao; //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
