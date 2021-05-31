/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiennh
 */
public class MainGUI extends javax.swing.JFrame {
    private QuanLyInterface qlsv;

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        
        this.qlsv = new QuanLyNguoi();
        
        uiMacDinh();
    }
    
    private void uiMacDinh()
    {
        this.txtHoTen.setText("");
        this.txtMaSV.setText("");
        this.txtQueQuan.setText("");
        
        this.radioGtNam.setSelected(true);
        
        // Xóa tất cả các phần tử trong ComboBox
        this.cbbChuyenNganh.removeAllItems();
        
        this.cbbChuyenNganh.addItem("UDPM");
        this.cbbChuyenNganh.addItem("TKTW");
        this.cbbChuyenNganh.addItem("LTMT");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGT = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        radioGtNam = new javax.swing.JRadioButton();
        radioGtNu = new javax.swing.JRadioButton();
        cbbChuyenNganh = new javax.swing.JComboBox<>();
        txtQueQuan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnTaoSvAo = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QLSV");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Giới tính");

        jLabel5.setText("Chuyên ngành");

        jLabel6.setText("Quê quán");

        txtMaSV.setText("jTextField1");

        txtHoTen.setText("jTextField2");

        btnGroupGT.add(radioGtNam);
        radioGtNam.setText("Nam");

        btnGroupGT.add(radioGtNu);
        radioGtNu.setText("Nữ");

        cbbChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtQueQuan.setText("jTextField3");

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ Tên", "Giới tính", "Quê quán", "Chuyên ngành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSV);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTaoSvAo.setText("Tạo đối tượng ảo");
        btnTaoSvAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoSvAoActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Sửa");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xóa form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioGtNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioGtNu))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txtHoTen))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbbChuyenNganh, 0, 185, Short.MAX_VALUE)
                                                    .addComponent(txtQueQuan))))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnTaoSvAo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaForm)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioGtNam)
                    .addComponent(radioGtNu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm))
                .addGap(30, 30, 30)
                .addComponent(btnTaoSvAo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        uiMacDinh();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnTaoSvAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoSvAoActionPerformed
        if (this.qlsv.xuatDanhSach().size() == 0) {
            this.qlsv.taoDoiTuongAo();
        }

        this.hienThiJTable();
    }//GEN-LAST:event_btnTaoSvAoActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SinhVien sv = this.docForm();
        if (sv == null) {
            return ;
        }

        this.qlsv.them(sv);
        
        this.hienThiJTable();
        this.uiMacDinh();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        int row = this.tblSV.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên JTable",
                "Lỗi", JOptionPane.ERROR_MESSAGE);
            
            return ;
        }
        
        SinhVien sv = this.docForm();
        if (sv == null) {
            return ;
        }

        // cập nhật đối tượng sinh viên vào ArrayList
        ArrayList<Nguoi> listSV = this.qlsv.xuatDanhSach();
        listSV.set(row, sv);
        
        this.hienThiJTable();
        this.uiMacDinh();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        int viTri = this.tblSV.getSelectedRow();

        if (viTri == -1) {
            return ;
        }

        DefaultTableModel dtm = (DefaultTableModel) this.tblSV.getModel();
        String maSV = dtm.getValueAt(viTri, 0).toString();
        String hoten = dtm.getValueAt(viTri, 1).toString();
        int gioiTinh = (int) dtm.getValueAt(viTri, 2);
        String queQuan = dtm.getValueAt(viTri, 3).toString();
        String chuyenNganh = dtm.getValueAt(viTri, 4).toString();

        this.txtHoTen.setText(hoten);
        this.txtMaSV.setText(maSV);
        this.txtQueQuan.setText(queQuan);
        this.cbbChuyenNganh.setSelectedItem(chuyenNganh);
        
        if (gioiTinh == 0) {
            this.radioGtNu.setSelected(true);
        } else {
            this.radioGtNam.setSelected(true);
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int viTri = this.tblSV.getSelectedRow();
        if (viTri == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên JTable", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        
        int xacNhan = JOptionPane.showConfirmDialog(this, "Bạn muốn xóa bản ghi này?",
            "Xác nhận", JOptionPane.YES_NO_OPTION);
        
        if (xacNhan == 1) {
            // Người dùng chọn No
            return ;
        }

        // Xóa bản ghi trong ArrayList
        this.qlsv.xoa(viTri);
        
        // Hiển thị lại JTable
        this.hienThiJTable();
        
        // Xóa thông tin trên form
        this.uiMacDinh();
    }//GEN-LAST:event_btnXoaActionPerformed

    private SinhVien docForm() {
        String hoTen = this.txtHoTen.getText();
        String maSV = this.txtMaSV.getText();
        String queQuan = this.txtQueQuan.getText();
        String chuyenNganh = this.cbbChuyenNganh.getSelectedItem().toString();
        
        boolean gioiTinhNam = this.radioGtNam.isSelected();
        int gioiTinh = (gioiTinhNam == true) ? 1 : 0 ;
        
        // Kiểm tra form
        if (
            hoTen.length() == 0 ||
            maSV.length() == 0 ||
            queQuan.length() == 0 ||
            chuyenNganh.length() == 0
        ) {
            JOptionPane.showMessageDialog(this, "Không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            
            return null;
        }
        
        SinhVien sv = new SinhVien(maSV, chuyenNganh, hoTen, gioiTinh, queQuan);
        
        return sv;
    }
    
    private void hienThiJTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSV.getModel();

        // Xóa tất cả các dòng đang có trên JTable
        dtm.setRowCount(0);
        
        ArrayList<Nguoi> ds = this.qlsv.xuatDanhSach();
        for (int i = 0; i < ds.size(); i++) {
            SinhVien sv = (SinhVien) ds.get(i);
            
            Object[] rowData = new Object[] {
                sv.getMaSV(),
                sv.getHoTen(),
                sv.getGioiTinh(),
                sv.getQueQuan(),
                sv.getChuyenNganh()
            } ;
            
            dtm.addRow(rowData);
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.ButtonGroup btnGroupGT;
    private javax.swing.JButton btnTaoSvAo;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.JComboBox<String> cbbChuyenNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioGtNam;
    private javax.swing.JRadioButton radioGtNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtQueQuan;
    // End of variables declaration//GEN-END:variables
}
