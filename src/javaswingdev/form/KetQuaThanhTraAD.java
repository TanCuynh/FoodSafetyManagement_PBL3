package javaswingdev.form;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class KetQuaThanhTraAD extends javax.swing.JPanel {

    /**
     * Creates new form KeHoachThanhTra
     */
    public KetQuaThanhTraAD() {
        initComponents();
        populateJtableWithAuthor();
    }

    My_Classes.kehoach_thanhtra khtt = new My_Classes.kehoach_thanhtra();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID_User = new javax.swing.JTextField();
        jTextField_ID_CH = new javax.swing.JTextField();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser_NgayTT = new com.toedter.calendar.JDateChooser();
        jTextField_KetQuaTT = new javax.swing.JTextField();
        jButton_Clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_ID_KHTT = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_KHTT = new javaswingdev.swing.table.Table();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("KẾT QUẢ THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID kế hoạch TT:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Cửa hàng:");

        jTextField_ID_User.setEditable(false);
        jTextField_ID_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ID_User.setEnabled(false);

        jTextField_ID_CH.setEditable(false);
        jTextField_ID_CH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ID_CH.setEnabled(false);

        jButton_Edit_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Edit_.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Edit_.setText("Xác nhận");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kết quả:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ngày thanh tra:");

        jDateChooser_NgayTT.setEnabled(false);

        jTextField_KetQuaTT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Clear.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Clear.setText("Reset");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID Thanh tra:");

        jTextField_ID_KHTT.setEditable(false);
        jTextField_ID_KHTT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ID_KHTT.setEnabled(false);

        jTable_KHTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Email", "Position", "Date Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_KHTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_KHTTMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_KHTT);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(108, 180, 50));
        jLabel4.setText("* Hãy chọn từ bảng để xem các thông tin và xác nhận kết quả của đợt thanh tra!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID_User)
                                    .addComponent(jTextField_ID_KHTT)
                                    .addComponent(jTextField_ID_CH)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateChooser_NgayTT, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                            .addComponent(jTextField_KetQuaTT))))))
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID_KHTT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID_User, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID_CH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_NgayTT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_KetQuaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Clear)))
                    .addComponent(jScrollPane3))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        int index = jTable_KHTT.getSelectedRow();

        if (index == -1 || jTextField_ID_KHTT.getText().equals("")) {
            //JOptionPane.showMessageDialog(jButton_Clear, "Hãy Chọn 1 Giá Trị Trong Bảng Phân Công Thanh Tra");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn giá trị trong bảng phân công thanh tra!");
            panel.showNotification();
        } else {
            try {
                int _id_KHTT = Integer.parseInt(jTextField_ID_KHTT.getText());
                int _Id_User = Integer.parseInt(jTextField_ID_User.getText());
                int _Id_ch = Integer.parseInt(jTextField_ID_CH.getText());

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String _ngayTT = dateFormat.format(jDateChooser_NgayTT.getDate());
                String _ketqua = jTextField_KetQuaTT.getText();
                khtt.Edit_KetQuaThanhTra(_Id_User, _Id_ch, _ngayTT, _ketqua, _id_KHTT);
                //refresh the jtable after we add
                populateJtableWithAuthor();

                //after refresh the table we clear the textfield
                clearData();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(jPanel1, e);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    public void populateJtableWithAuthor() {
        ArrayList<My_Classes.kehoach_thanhtra> khttList = khtt.kehoachTTList();

        //jtable collums
        String[] colNames = {"ID_KHTT", "ID_TT", "ID_CH", "Ngay TT", "Kết Quả Thanh Tra"};
        //jtable row
        Object[][] rows = new Object[khttList.size()][colNames.length];

        for (int i = 0; i < khttList.size(); i++) {
            rows[i][0] = khttList.get(i).getId_kh_tt();
            rows[i][1] = khttList.get(i).getId_user();
            rows[i][2] = khttList.get(i).getId_ch();
            rows[i][3] = khttList.get(i).getNgaythanhtra();
            rows[i][4] = khttList.get(i).getKetquathanhtra();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_KHTT.setModel(model);
    }

    

    
    
    
    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed

        clearData();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jTable_KHTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_KHTTMouseClicked

           try {
            Date ngayTT = null;
            //display the selected genres
            //get the selected row index
            int index = jTable_KHTT.getSelectedRow();

            //get values;
            String id_khtt = jTable_KHTT.getValueAt(index, 0).toString();
            String id_user = jTable_KHTT.getValueAt(index, 1).toString();
            String id_CH = jTable_KHTT.getValueAt(index, 2).toString();
            String ngay_TT = (String) jTable_KHTT.getValueAt(index, 3);
            String KetQuaTT = (String) jTable_KHTT.getValueAt(index, 4);

            ngayTT = new SimpleDateFormat("yyyy-MM-dd").parse(ngay_TT);
            jDateChooser_NgayTT.setDate(ngayTT);

            //show data in textfield
            jTextField_ID_KHTT.setText(id_khtt);
            jTextField_ID_User.setText(id_user);
            jTextField_ID_CH.setText(id_CH);
            jTextField_KetQuaTT.setText(KetQuaTT);

        } catch (ParseException ex) {
            Logger.getLogger(KetQuaThanhTraAD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_KHTTMouseClicked

    public void clearData() {
        jTextField_ID_User.setText("");
        jTextField_ID_CH.setText("");
        jDateChooser_NgayTT.setCalendar(null);
        jTextField_KetQuaTT.setText("");
        jTextField_ID_KHTT.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Edit_;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javaswingdev.swing.table.Table jTable_KHTT;
    private static javax.swing.JTextField jTextField_ID_CH;
    private static javax.swing.JTextField jTextField_ID_KHTT;
    private static javax.swing.JTextField jTextField_ID_User;
    private javax.swing.JTextField jTextField_KetQuaTT;
    // End of variables declaration//GEN-END:variables
}
