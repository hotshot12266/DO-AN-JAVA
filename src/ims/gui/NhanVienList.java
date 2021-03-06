/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import BLL.NVBLL;
import MODEL.BacLuongReponseModel;
import MODEL.ChucVuReponseModel;
import MODEL.ChuyenMonReponseModel;
import MODEL.NVModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import MODEL.DanTocReponseModel;
import MODEL.MaHopDongReponseModel;
import MODEL.PhongBanReponseModel;
import MODEL.TonGiaoReponseModel;
import MODEL.TrinhDoReponseModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author NAT
 */
public class NhanVienList extends javax.swing.JFrame implements ActionListener, ListSelectionListener, WindowListener {

    /**
     * Creates new form EmployeeList
     */
    NVBLL nvBLL = new NVBLL();
    NhanVienChiTiet nvct = new NhanVienChiTiet();
    public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public NhanVienList() {
        initComponents();
        setInfoDialog();
        LoadData();
        Load1NV();
    }

    public void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonThem = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhanVienThongTin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButtonThem.setText("Thêm ");
        jButtonThem.setFocusable(false);
        jButtonThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonThem);
        jToolBar1.add(jSeparator3);

        jButtonThoat.setText("Thoát");
        jButtonThoat.setFocusable(false);
        jButtonThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThoatActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonThoat);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 25));

        jTableNhanVienThongTin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV ", "HoTenNV ", "TenChucVu ", "QueQuan ", "GioiTinh ", "TenPhongBan  ", "TenTrinhDo ", "TenChuyenMon ", "NoiSinh "
            }
        ));
        jTableNhanVienThongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienThongTinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhanVienThongTin);
        if (jTableNhanVienThongTin.getColumnModel().getColumnCount() > 0) {
            jTableNhanVienThongTin.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableNhanVienThongTin.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 970, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        NhanVienThem NVGui = new NhanVienThem();
        NVGui.setVisible(true);
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThoatActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonThoatActionPerformed

    private void jTableNhanVienThongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanVienThongTinMouseClicked
        // TODO add your handling code here:
        int MaNV = jTableNhanVienThongTin.getSelectedRow();
        TableModel model = jTableNhanVienThongTin.getModel();

        int maNV = Integer.parseInt(model.getValueAt(MaNV, 0).toString());
//        String HoTenNV = model.getValueAt(MaNV, 1).toString();
//        String TenChucVu = model.getValueAt(MaNV, 2).toString();
//        String QueQuan = model.getValueAt(MaNV, 3).toString();
//        String GioiTinh = model.getValueAt(MaNV, 4).toString();
//        String TenPhongBan = model.getValueAt(MaNV, 5).toString();
//        String TenTrinhDo = model.getValueAt(MaNV, 6).toString();
//        String TenChuyenMon = model.getValueAt(MaNV, 7).toString();
//        String NoiSinh = model.getValueAt(MaNV, 8).toString();
        nvct.setVisible(true);
        nvct.pack();
        nvct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//`MaNV`, `HoTenNV`, `NgaySinh`, `NoiSinh`, `SoCMND`, `GiaDinh`, `GioiTinh`, `QueQuan`, 
//`ChoHienTai`, `SDT`, `PhuCapCV`, `HDLDSo`, `LoaiHD`, `NgayHD`, `NgayBD`, `NgayKT`, `HinhAnh`, `TenTonGiao`,`TenDanToc`,
//`GiaBacLuong`,`TenHopDong`,`TenChucVu`,`TenPhongBan`,`TenTrinhDo`,`TenChuyenMon`
        ArrayList<NVModel> nvListModel = nvBLL.Read1NVBll(maNV);
        NVModel nvModel = new NVModel();
        for (int i = 0; i < nvListModel.size(); i++) {
            nvModel = nvListModel.get(i);

//            nvct.jComboBoxGioitinh.addItem("NKAKA KAKA");
//            nvct.jComboBoxGioitinh.addItem("SSSS");
            nvct.jTextFieldMaNV.setText(nvModel.getMaNV() + "");
            nvct.jTextFieldHoten.setText(nvModel.getHoTenNV());
            nvct.jTextFieldChucvu.setText(nvModel.getTenChucVu());
            nvct.jTextFieldNoisinh.setText(nvModel.getNoiSinh());
            nvct.jTextFieldSoCMND.setText(nvModel.getSoCMND() + "");
            nvct.jComboBoxGiaDinh.setSelectedItem(nvModel.getGiaDinh());
            nvct.jComboBoxGioitinh.setSelectedItem(nvModel.getGioiTinh());
            nvct.jTextFieldQuequan.setText(nvModel.getQueQuan());
            nvct.jTextFieldChohientai.setText(nvModel.getChoHienTai());
            nvct.jTextFieldSDT.setText(nvModel.getSDT() + "");
            nvct.jTextFieldPhucapCV.setText(nvModel.getPhuCapCV());
            nvct.jTextFieldSoHDLD.setText(nvModel.getHDLDSo());
            nvct.jTextFieldLoaiHD.setText(nvModel.getLoaiHD());

            nvct.jLabelHinhanh.setText(nvModel.getHinhAnh());
            nvct.jComboBoxTonGiao.getModel().setSelectedItem(new TonGiaoReponseModel(1, nvModel.getTenTonGiao()));
            nvct.jComboBoxDantoc.getModel().setSelectedItem(new DanTocReponseModel(2, nvModel.getTenDanToc()));
            nvct.jComboBoxBacluong.getModel().setSelectedItem(new BacLuongReponseModel(2, nvModel.getGiaBacLuong()));
            nvct.jComboBoxMaHD.getModel().setSelectedItem(new MaHopDongReponseModel(2, nvModel.getTenHopDong()));
            nvct.jTextFieldMaphong.setText(nvModel.getTenPhongBan());
            nvct.jTextFieldMatrinhdo.setText(nvModel.getTenTrinhDo());
            nvct.jTextFieldChuyenmon.setText(nvModel.getTenChuyenMon());
            String NS = dateFormat.format(nvModel.getNgaySinh());
            String NBD = dateFormat.format(nvModel.getNgayBD());
            String NHD = dateFormat.format(nvModel.getNgayHD());
            String NKT = dateFormat.format(nvModel.getNgayKT());
            nvct.jTextFieldNgaysinh.setText(NS + "");
            nvct.jTextFieldNgayHD.setText(NHD + "");
            nvct.jTextFieldNgayBD.setText(NBD + "");
            nvct.jTextFieldNgayKT.setText(NKT + "");
            nvct.jComboBoxChuyenmon.getModel().setSelectedItem(new ChuyenMonReponseModel(nvModel.getKHChuyenMon(), nvModel.getTenChuyenMon()));
            nvct.jComboBoxMatrinhdo.getModel().setSelectedItem(new TrinhDoReponseModel(nvModel.getKHTrinhDo(), nvModel.getTenTrinhDo()));
            nvct.jComboBoxMaphong.getModel().setSelectedItem(new PhongBanReponseModel(nvModel.getKHPhongBan(), nvModel.getTenPhongBan()));
            nvct.jComboBoxChucvu.getModel().setSelectedItem(new ChucVuReponseModel(nvModel.getKHChucVu(), nvModel.getTenChucVu()));
        }
        //   jtableEmployee.setModel(model);
        nvListModel.clear();
//
//        nvct.jTextFieldMaNV.setText(maNV);
//        nvct.jTextFieldHoten.setText(HoTenNV);
//        nvct.jTextFieldChucvu.setText(TenChucVu);
//        nvct.jTextFieldQuequan.setText(QueQuan);
//        nvct.jComboBoxGioitinh.setSelectedItem(GioiTinh);
//        nvct.jTextFieldMaphong.setText(TenPhongBan);
//        nvct.jTextFieldMatrinhdo.setText(TenTrinhDo);
//        nvct.jTextFieldChuyenmon.setText(TenChuyenMon);
//        nvct.jTextFieldNoisinh.setText(NoiSinh);
    }//GEN-LAST:event_jTableNhanVienThongTinMouseClicked

    /**
     * @param args the command line arguments
     */
    private void LoadData() {
        DefaultTableModel model = (DefaultTableModel) jTableNhanVienThongTin.getModel();
        ArrayList<NVModel> nvListModel = nvBLL.ReadNVBll();
        NVModel nvModel = new NVModel();
        for (int i = 0; i < nvListModel.size(); i++) {
            nvModel = nvListModel.get(i);
            model.addRow(new Object[0]);
            model.setValueAt(nvModel.getMaNV(), i, 0);
            model.setValueAt(nvModel.getHoTenNV(), i, 1);
            model.setValueAt(nvModel.getTenChucVu(), i, 2);
            model.setValueAt(nvModel.getQueQuan(), i, 3);
            model.setValueAt(nvModel.getGioiTinh(), i, 4);
            model.setValueAt(nvModel.getTenPhongBan(), i, 5);
            model.setValueAt(nvModel.getTenTrinhDo(), i, 6);
            model.setValueAt(nvModel.getTenChuyenMon(), i, 7);
            model.setValueAt(nvModel.getNoiSinh(), i, 8);
            System.out.println("ID GUI" + nvModel);
        }
        //   jtableEmployee.setModel(model);
        nvListModel.clear();
    }

    private void Load1NV() {
        DefaultTableModel model = (DefaultTableModel) jTableNhanVienThongTin.getModel();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NhanVienList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonThoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTableNhanVienThongTin;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
