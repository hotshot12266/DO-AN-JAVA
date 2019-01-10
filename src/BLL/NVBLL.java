/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NVDAL;
import MODEL.NVModel;
import MODEL.PhongBanReponseModel;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author LE ANH KIET
 */
public class NVBLL {

    String KHPhongBan = null;
    NVDAL dal = new NVDAL();

    public void DeleteNVBLL(int maNV) {
        try {
            if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không", "Thông báo", YES_OPTION) == 0) {

                dal.DeleteNVDAL(maNV);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
    }

    public ArrayList<NVModel> ReadNVBll() {
        ArrayList<NVModel> listNV = new ArrayList<>();
        listNV = dal.readNV();
        return listNV;
    }

    public ArrayList<NVModel> Read1NVBll(int MANV) {
        ArrayList<NVModel> listNV = new ArrayList<>();

        listNV = dal.read1NV(MANV);
        return listNV;
    }

//    public ArrayList<NVModel> LoadMPBll() {
//        ArrayList<NVModel> listPB = new ArrayList<>();
//
//        listPB = dal.LoadPB(KHPhongBan);
//        return listPB;
//    }

    public int UpdateNVBLL( NVModel nVModel) {
       
            
           try {
               if (JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không", "Thông báo", YES_OPTION) == 0) {
               dal.EditNVDAL(nVModel);
               JOptionPane.showMessageDialog(null, "Sửa thành công");
              
               }
               return 1;
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Sửa thất bại");
           }
           return 0;
       
        
    }
       public void addNewNhanVienBLL (NVModel nhanVien){
        dal.addNewNhanVienDAL(nhanVien);
        
}
}
