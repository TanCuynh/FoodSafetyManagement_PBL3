package javaswingdev.form;

import My_Forms.ThongTinChungNhan;
import My_Forms.ThongTinCuaHang;
import java.awt.Color;
import java.awt.Frame;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class CapChungNhan extends javax.swing.JPanel {

    My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.cap_chungnhan_cuahang capchungnhan = new My_Classes.cap_chungnhan_cuahang();
    My_Classes.ChungNhan chungnhan = new My_Classes.ChungNhan();

    boolean book_Exist = false;
    boolean mem_Exist = false;

    public CapChungNhan() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_FirstName = new javax.swing.JLabel();
        jLabel_FirstName1 = new javax.swing.JLabel();
        jButton_issue_Book = new javax.swing.JButton();
        jButton_Select_Member = new javax.swing.JButton();
        jButton_Select_Book = new javax.swing.JButton();
        jLabel_CuaHang = new javax.swing.JLabel();
        jLabel_CN = new javax.swing.JLabel();
        jLabel_FirstName2 = new javax.swing.JLabel();
        jLabel_Available = new javax.swing.JLabel();
        jLabel_FirstName7 = new javax.swing.JLabel();
        jDateChooser_NgayCap = new com.toedter.calendar.JDateChooser();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jSpinner_IDBook = new javax.swing.JSpinner();
        jLabel_FirstName9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jLabel_Close.setBackground(new java.awt.Color(255, 235, 15));
        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("CẤP CHỨNG NHẬN");
        jLabel_Form_Title.setOpaque(true);

        jLabel_FirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FirstName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_FirstName.setText("Nhập ID chứng nhận:");

        jLabel_FirstName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FirstName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_FirstName1.setText("Nhập ID cửa hàng:");

        jButton_issue_Book.setBackground(new java.awt.Color(53, 53, 55));
        jButton_issue_Book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_issue_Book.setForeground(new java.awt.Color(109, 180, 50));
        jButton_issue_Book.setText("Cấp chứng nhận");
        jButton_issue_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_issue_BookActionPerformed(evt);
            }
        });

        jButton_Select_Member.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_Member.setText("Tìm Cửa Hàng");
        jButton_Select_Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_MemberActionPerformed(evt);
            }
        });

        jButton_Select_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Select_Book.setText("Tìm Chứng Nhận");
        jButton_Select_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_BookActionPerformed(evt);
            }
        });

        jLabel_CuaHang.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_CuaHang.setForeground(new java.awt.Color(139, 192, 100));
        jLabel_CuaHang.setText("Tên cửa hàng");
        jLabel_CuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CuaHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CuaHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CuaHangMouseExited(evt);
            }
        });

        jLabel_CN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_CN.setForeground(new java.awt.Color(139, 192, 100));
        jLabel_CN.setText("Tên chứng nhận ATTP");
        jLabel_CN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CNMouseExited(evt);
            }
        });

        jLabel_FirstName2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FirstName2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_FirstName2.setText("Chứng nhận tồn tại?");

        jLabel_Available.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel_Available.setForeground(new java.awt.Color(139, 192, 100));
        jLabel_Available.setText("Có - Không");

        jLabel_FirstName7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FirstName7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_FirstName7.setText("Ngày cấp:");

        jSpinner_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSpinner_IDBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel_FirstName9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FirstName9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_FirstName9.setText("Tin nhắn:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 180, 50));
        jLabel3.setText("* Hãy nhập ID chứng nhận ATVSTP, ID cửa hàng cần cấp chứng nhận cùng các dữ liệu cần thiết để cấp chứng nhận!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_FirstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_FirstName1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel_FirstName7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_FirstName9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_CN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinner_IDBook, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel_Available)
                                                            .addComponent(jLabel_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(jDateChooser_NgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton_Select_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_Select_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jButton_issue_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_IDBook, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Select_Book)
                    .addComponent(jLabel_FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CN)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Select_Member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_CuaHang)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Available)
                    .addComponent(jLabel_FirstName2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FirstName7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_NgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FirstName9))
                .addGap(47, 47, 47)
                .addComponent(jButton_issue_Book)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_issue_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_issue_BookActionPerformed

        try {
            int id_chungnhan = (int) jSpinner_IDBook.getValue();
            int id_cuahang = (int) jSpinner_MemberID.getValue();
            String _note = jTextArea_Note.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngaycap = dateFormat.format(jDateChooser_NgayCap.getDate());

            LocalDate date = LocalDate.parse(ngaycap);
            LocalDate returnvalue = date.plusYears(3);
            Date reDate = (java.sql.Date.valueOf(returnvalue));
            Frame main = new Frame();
            //we nedd to check if the book add member exits
            if (!book_Exist) {
                //JOptionPane.showMessageDialog(null, "Bạn cần kiểm tra xem chứng nhận này có tồn tại không bằng cách nhấn nút tìm kiếm", "Kiểm tra chứng nhận", 2);
                Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa tìm kiếm chứng nhận!");
                panel.showNotification();
            } else if (!mem_Exist) {                
                Notification panel = new Notification(main, Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa tìm kiếm cửa hàng!");
                panel.showNotification();
            }
            else {
                boolean x = capchungnhan.capChungNhan(id_chungnhan, id_cuahang, ngaycap, reDate.toString(), _note);
                if (x) {
                    cuahang.increaseSLCN(id_cuahang);
                }

                jSpinner_IDBook.setValue(0);
                jSpinner_MemberID.setValue(0);
                jLabel_CN.setText("Tên chứng nhận ATTP");
                jLabel_CuaHang.setText("Tên cửa hàng");
                jLabel_Available.setText("YES - NO");
                jTextArea_Note.setText("");
                jDateChooser_NgayCap.setCalendar(null);
                book_Exist = false;
                mem_Exist = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapChungNhan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            //JOptionPane.showMessageDialog(null, "You Need To Select A Date Issue & Date Return", "Select date", 2);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn ngày cấp chứng nhận!");
            panel.showNotification();
        }
    }//GEN-LAST:event_jButton_issue_BookActionPerformed

    private void jButton_Select_MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_MemberActionPerformed
        //search member by id and display his full name:
        int id_cuahang = (int) jSpinner_MemberID.getValue();
        Frame main = new Frame();
        try {
            //get the book id
            My_Classes.CuaHang selectedCuaHang = cuahang.getCuaHangById(id_cuahang);

            if (selectedCuaHang != null) {
                //display the book title
                jLabel_CuaHang.setText(String.valueOf(selectedCuaHang.getCuaHang()));
                //set the member exist to true
                mem_Exist = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Cửa Hàng Này Không Tồn Tại", "Cửa Hàng Không Tìm Thấy", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Cửa hàng không tồn tại!");
                panel.showNotification();
                jLabel_CuaHang.setText("Tên cửa hàng");
                mem_Exist = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapChungNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Select_MemberActionPerformed

    private void jButton_Select_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_BookActionPerformed
        //search for the book by ID
        //display the book title
        //check if this book is avalble or not
        int id_chungnhan = (int) jSpinner_IDBook.getValue();
        try {
            //get the book id
            My_Classes.ChungNhan selectedCN = chungnhan.getCNById(id_chungnhan);

            if (selectedCN != null) {
                //display the book title
                jLabel_CN.setText(String.valueOf(selectedCN.getName()));
                //set the book exist to true
                book_Exist = true;
                jLabel_Available.setText("YES");
                jLabel_Available.setForeground(new Color(139, 192, 100));

            } else {
                jLabel_CN.setText("Tên chứng nhận ATTP");
                //JOptionPane.showMessageDialog(null, "Chứng Nhận Này Không Tồn Tại", "Không tìm thấy chứng nhận", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Chứng nhận không tồn tại!");
                panel.showNotification();
                book_Exist = false;
                jLabel_Available.setText("NO");
                jLabel_Available.setForeground(Color.red);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapChungNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Select_BookActionPerformed

    private void jLabel_CuaHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CuaHangMouseClicked
        int mem_id = (int) jSpinner_MemberID.getValue();
        ThongTinCuaHang memberInforCardForm = new ThongTinCuaHang(mem_id);
        memberInforCardForm.setVisible(true);
    }//GEN-LAST:event_jLabel_CuaHangMouseClicked

    private void jLabel_CuaHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CuaHangMouseEntered
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(139, 192, 100));
        jLabel_CuaHang.setBorder(border);
    }//GEN-LAST:event_jLabel_CuaHangMouseEntered

    private void jLabel_CuaHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CuaHangMouseExited
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255));
        jLabel_CuaHang.setBorder(border);
    }//GEN-LAST:event_jLabel_CuaHangMouseExited

    private void jLabel_CNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CNMouseClicked
        int id_chungnhan = (int) jSpinner_IDBook.getValue();
        ThongTinChungNhan bookInforCardForm = new ThongTinChungNhan(id_chungnhan);
        bookInforCardForm.setVisible(true);
    }//GEN-LAST:event_jLabel_CNMouseClicked

    private void jLabel_CNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CNMouseEntered
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(139, 192, 100));
        jLabel_CN.setBorder(border);
    }//GEN-LAST:event_jLabel_CNMouseEntered

    private void jLabel_CNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CNMouseExited
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255));
        jLabel_CN.setBorder(border);
    }//GEN-LAST:event_jLabel_CNMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Select_Book;
    private javax.swing.JButton jButton_Select_Member;
    private javax.swing.JButton jButton_issue_Book;
    private com.toedter.calendar.JDateChooser jDateChooser_NgayCap;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Available;
    private javax.swing.JLabel jLabel_CN;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_CuaHang;
    private javax.swing.JLabel jLabel_FirstName;
    private javax.swing.JLabel jLabel_FirstName1;
    private javax.swing.JLabel jLabel_FirstName2;
    private javax.swing.JLabel jLabel_FirstName7;
    private javax.swing.JLabel jLabel_FirstName9;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_IDBook;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
