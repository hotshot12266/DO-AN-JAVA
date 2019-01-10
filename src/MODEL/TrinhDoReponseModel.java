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
public class TrinhDoReponseModel {
    String KHTrinhDo;
    String TenTrinhDo;

    @Override
    public String toString() {
        return KHTrinhDo; //To change body of generated methods, choose Tools | Templates.
    }

    public String getKHTrinhDo() {
        return KHTrinhDo;
    }

    public void setKHTrinhDo(String KHTrinhDo) {
        this.KHTrinhDo = KHTrinhDo;
    }

    public String getTenTrinhDo() {
        return TenTrinhDo;
    }

    public void setTenTrinhDo(String TenTrinhDo) {
        this.TenTrinhDo = TenTrinhDo;
    }

    public TrinhDoReponseModel() {
    }

    public TrinhDoReponseModel(String KHTrinhDo, String TenTrinhDo) {
        this.KHTrinhDo = KHTrinhDo;
        this.TenTrinhDo = TenTrinhDo;
    }
}
