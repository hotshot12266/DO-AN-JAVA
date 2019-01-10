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
public class BacLuongReponseModel {
    private int IDBacLuong;
    private String GiaBacLuong;

    @Override
    public String toString() {
        return GiaBacLuong; //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDBacLuong() {
        return IDBacLuong;
    }

    public void setIDBacLuong(int IDBacLuong) {
        this.IDBacLuong = IDBacLuong;
    }

    public String getGiaBacLuong() {
        return GiaBacLuong;
    }

    public void setGiaBacLuong(String GiaBacLuong) {
        this.GiaBacLuong = GiaBacLuong;
    }

    public BacLuongReponseModel(int IDBacLuong, String GiaBacLuong) {
        this.IDBacLuong = IDBacLuong;
        this.GiaBacLuong = GiaBacLuong;
    }

    public BacLuongReponseModel() {
    }


   
    
    
}
