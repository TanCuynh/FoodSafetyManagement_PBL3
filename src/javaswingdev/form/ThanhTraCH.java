package javaswingdev.form;

import My_Forms.AuthorListForm;
import My_Forms.MembersListForm;
import My_Forms.MembersListForm_Choose;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ThanhTraCH extends javax.swing.JPanel {

    //My_Classes.User member = new My_Classes.User();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.kehoach_thanhtra khtt = new My_Classes.kehoach_thanhtra();

    public ThanhTraCH() {
        initComponents();
        Border JlaBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);

        //add a default image
    }

    public static void displayIdCuaHang(int id, String name) {
        jLabel_ID_CuaHang.setText(String.valueOf(id));
        jTextField_CuaHang.setText(name);
    }

    //display member in the jtextfield_member by id and fullname
    public static void displayMemberData(int id, String fullName) {
        jLabel_ID_ThanhTra.setText(String.valueOf(id));
        jTextField_ThanhTra.setText(fullName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_IDCuaHang = new javax.swing.JLabel();
        jLabel_ID_ThanhTra = new javax.swing.JLabel();
        jLabel_ID_CuaHang = new javax.swing.JLabel();
        jButton_Select_CuaHang = new javax.swing.JButton();
        jDateChooser_DateRecived = new com.toedter.calendar.JDateChooser();
        jButton_LapKeHoach = new javax.swing.JButton();
        jTextField_Book_Mota = new javax.swing.JTextField();
        jLabel_MoTa = new javax.swing.JLabel();
        jLabel_DateThanhTra = new javax.swing.JLabel();
        jTextField_ThanhTra = new javax.swing.JTextField();
        jLabel_IDThanhTra = new javax.swing.JLabel();
        jButton_Select_ThanhTra = new javax.swing.JButton();
        jTextField_CuaHang = new javax.swing.JTextField();
        jButton_Clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("LẬP KẾ HOẠCH THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_IDCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_IDCuaHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_IDCuaHang.setText("ID cửa hàng:");

        jLabel_ID_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ID_ThanhTra.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_ID_ThanhTra.setText("ID");

        jLabel_ID_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ID_CuaHang.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_ID_CuaHang.setText("ID");

        jButton_Select_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_CuaHang.setText("Chọn Cửa Hàng");
        jButton_Select_CuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_CuaHangActionPerformed(evt);
            }
        });

        jButton_LapKeHoach.setBackground(new java.awt.Color(53, 53, 53));
        jButton_LapKeHoach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_LapKeHoach.setForeground(new java.awt.Color(139, 180, 100));
        jButton_LapKeHoach.setText("LẬP KẾ HOẠCH");
        jButton_LapKeHoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LapKeHoachActionPerformed(evt);
            }
        });

        jTextField_Book_Mota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Book_Mota.setActionCommand("<Not Set>");
        jTextField_Book_Mota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Book_MotaActionPerformed(evt);
            }
        });

        jLabel_MoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MoTa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MoTa.setText("Mô tả chi tiết :");

        jLabel_DateThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_DateThanhTra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_DateThanhTra.setText("Ngày thanh tra:");

        jTextField_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ThanhTra.setEnabled(false);

        jLabel_IDThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_IDThanhTra.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_IDThanhTra.setText("ID Thanh tra:");

        jButton_Select_ThanhTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_ThanhTra.setText("Chọn Thanh Tra");
        jButton_Select_ThanhTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_ThanhTraActionPerformed(evt);
            }
        });

        jTextField_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_CuaHang.setEnabled(false);
        jTextField_CuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CuaHangActionPerformed(evt);
            }
        });

        jButton_Clear.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Clear.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Clear.setText("RESET");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_IDThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_IDCuaHang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CuaHang)
                                    .addComponent(jTextField_ThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_ID_ThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton_Select_ThanhTra))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel_ID_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Select_CuaHang))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel_DateThanhTra)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser_DateRecived, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_LapKeHoach, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_MoTa)
                    .addComponent(jTextField_Book_Mota, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MoTa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel_ID_CuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_IDCuaHang))
                            .addComponent(jButton_Select_CuaHang))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_IDThanhTra)
                            .addComponent(jTextField_ThanhTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ID_ThanhTra)
                            .addComponent(jButton_Select_ThanhTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_DateRecived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DateThanhTra))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_LapKeHoach)
                            .addComponent(jButton_Clear)))
                    .addComponent(jTextField_Book_Mota))
                .addGap(75, 75, 75))
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 180, 50));
        jLabel3.setText("* Hãy chọn ID cửa hàng, ID thaanh tra cùng các dữ liệu cần thiết để lập kế hoạch thanh tra cửa hàng!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1131, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LapKeHoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LapKeHoachActionPerformed

        //add a new Book
        if (!verif()) {
            //JOptionPane.showMessageDialog(null, "Một trong các trường chưa điền thông tin", "empty data", 2);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Một trong các trường chưa điền thông tin!");
            panel.showNotification();
        } else {
            try 
            {
                String desciption = jTextField_Book_Mota.getText();

                Integer idch = Integer.parseInt(jLabel_ID_CuaHang.getText());   //get the id author
                Integer idtt = Integer.parseInt(jLabel_ID_ThanhTra.getText());     //get the id genre

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dayTT = dateFormat.format(jDateChooser_DateRecived.getDate());

                Date issDate = dateFormat.parse(dayTT);
                Date today = new Date();

                if (issDate.before(today)) {
                    //JOptionPane.showMessageDialog(jButton_Clear, "Không Thể Lập Kế Hoạch Thanh Tra Trong Quá Khứ", "Vui lòng chọn lại ngày thanh tra", 1);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Không thể lập kế hoạch thanh tra trong quá khứ!");
                    panel.showNotification();
                } else {
                    khtt.add_kehoach_thanhtra(idtt, idch, dayTT, desciption);
                    clearData();
                }
            } catch (NumberFormatException ex) {
                //JOptionPane.showMessageDialog(null, "You Enterred Wrong Data In A Number Field", "Wrong data number", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Đã nhập sai dữ liệu!");
                panel.showNotification();
            } catch (NullPointerException ex) {
                //JOptionPane.showMessageDialog(null, "You Need To Select A Date", "Select date", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn ngày thanh tra!");
                panel.showNotification();
            } catch (SQLException ex) {
                Logger.getLogger(ThanhTraCH.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ThanhTraCH.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton_LapKeHoachActionPerformed


    private void jButton_Select_CuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_CuaHangActionPerformed
        //show a form
        //the form will have a jtable populated with author
        //the user can select the author from the table and it will displayed in the jtextfield

        AuthorListForm authorListForm = new AuthorListForm();
        authorListForm.setVisible(true);

    }//GEN-LAST:event_jButton_Select_CuaHangActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed

        clearData();
    }//GEN-LAST:event_jButton_ClearActionPerformed

    public void clearData() {
        jTextField_CuaHang.setText("");
        jLabel_ID_CuaHang.setText("ID");
        jTextField_ThanhTra.setText("");
        jLabel_ID_ThanhTra.setText("ID");
        jDateChooser_DateRecived.setCalendar(null);
        jTextField_Book_Mota.setText("");
    }

    private void jButton_Select_ThanhTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_ThanhTraActionPerformed
        // TODO add your handling code here:
        MembersListForm_Choose membersListForm_Choose = new MembersListForm_Choose();
        membersListForm_Choose.setVisible(true);
    }//GEN-LAST:event_jButton_Select_ThanhTraActionPerformed

    private void jTextField_CuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CuaHangActionPerformed

    private void jTextField_Book_MotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Book_MotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Book_MotaActionPerformed

    public boolean verif() {
        if (jTextField_CuaHang.getText().equals("")
                || jTextField_ThanhTra.getText().equals("")
                || jLabel_ID_CuaHang.getText().equals("ID") || jLabel_ID_ThanhTra.getText().equals("ID")) {
            return false;
        } else {
            return true;
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
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_LapKeHoach;
    private javax.swing.JButton jButton_Select_CuaHang;
    private javax.swing.JButton jButton_Select_ThanhTra;
    private com.toedter.calendar.JDateChooser jDateChooser_DateRecived;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_DateThanhTra;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_IDCuaHang;
    private javax.swing.JLabel jLabel_IDThanhTra;
    private static javax.swing.JLabel jLabel_ID_CuaHang;
    private static javax.swing.JLabel jLabel_ID_ThanhTra;
    private javax.swing.JLabel jLabel_MoTa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Book_Mota;
    private static javax.swing.JTextField jTextField_CuaHang;
    private static javax.swing.JTextField jTextField_ThanhTra;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
