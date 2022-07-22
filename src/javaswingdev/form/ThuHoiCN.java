package javaswingdev.form;

import My_Forms.ThongTinChungNhan;
import My_Forms.ThongTinCuaHang;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class ThuHoiCN extends javax.swing.JPanel {

    My_Classes.User user = new My_Classes.User();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
    My_Classes.ChungNhan chungnhan = new My_Classes.ChungNhan();
    My_Classes.cap_chungnhan_cuahang capchungnhan = new My_Classes.cap_chungnhan_cuahang();

    boolean cuahang_Exist = false;
    boolean user_Exist = false;

    public ThuHoiCN() {
        initComponents();

//        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(53, 53, 55));
//        jPanel1.setBorder(panelHeaderBorder);  

        populateJtableWithGenres("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_CuaHang = new javax.swing.JLabel();
        jLabel_ChungNhan = new javax.swing.JLabel();
        jButton_Reset = new javax.swing.JButton();
        jButton_TimCN = new javax.swing.JButton();
        jButton_TimCuaHang = new javax.swing.JButton();
        jLabel_Help_ChungNhan = new javax.swing.JLabel();
        jLabel_Help_CuaHang = new javax.swing.JLabel();
        jSpinner_IDCN = new javax.swing.JSpinner();
        jSpinner_IDCuaHang = new javax.swing.JSpinner();
        jLabel_MoTa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_MoTa = new javax.swing.JTextArea();
        jLabel_FilterChungNhan = new javax.swing.JLabel();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jButton_Confirm = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Chungnhan1 = new javaswingdev.swing.table.Table();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1131, 636));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("THU HỒI CHỨNG NHẬN VỆ SINH ATTP");
        jLabel_Form_Title.setOpaque(true);

        jLabel_CuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_CuaHang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_CuaHang.setText("ID cửa hàng:");

        jLabel_ChungNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ChungNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ChungNhan.setText("ID chứng nhận:");

        jButton_Reset.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Reset.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        jButton_TimCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_TimCN.setText("Tìm chứng nhận");
        jButton_TimCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimCNActionPerformed(evt);
            }
        });

        jButton_TimCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_TimCuaHang.setText("Tìm cửa hàng");
        jButton_TimCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TimCuaHangActionPerformed(evt);
            }
        });

        jLabel_Help_ChungNhan.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_Help_ChungNhan.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Help_ChungNhan.setText("Tên chứng nhận vệ sinh ATTP");
        jLabel_Help_ChungNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Help_ChungNhanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Help_ChungNhanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Help_ChungNhanMouseExited(evt);
            }
        });

        jLabel_Help_CuaHang.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_Help_CuaHang.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Help_CuaHang.setText("Tên cửa hàng");
        jLabel_Help_CuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Help_CuaHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Help_CuaHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Help_CuaHangMouseExited(evt);
            }
        });

        jSpinner_IDCN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSpinner_IDCuaHang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel_MoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MoTa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MoTa.setText("Mô tả:");

        jTextArea_MoTa.setColumns(20);
        jTextArea_MoTa.setRows(5);
        jScrollPane1.setViewportView(jTextArea_MoTa);

        jLabel_FilterChungNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_FilterChungNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_FilterChungNhan.setText("Lọc chứng nhận");

        jComboBox_Status.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Đang Cấp", "Đã Thu Hồi CN" }));
        jComboBox_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_StatusActionPerformed(evt);
            }
        });

        jButton_Confirm.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Confirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Confirm.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Confirm.setText("Xác nhận thu hồi");
        jButton_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmActionPerformed(evt);
            }
        });

        jTable_Chungnhan1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Chungnhan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Chungnhan1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Chungnhan1);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 180, 50));
        jLabel3.setText("* Hãy chọn từ bảng để xác nhận lại thông tin và thu hồi chứng nhận vệ sinh ATTP!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addComponent(jLabel_CuaHang)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jSpinner_IDCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel_ChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSpinner_IDCN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(19, 19, 19)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton_TimCuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_TimCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel_MoTa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Help_ChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Help_CuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FilterChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner_IDCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimCuaHang)
                    .addComponent(jLabel_FilterChungNhan)
                    .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_CuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Help_CuaHang)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ChungNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_TimCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSpinner_IDCN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Help_ChungNhan)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_MoTa))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmActionPerformed

        int index = jTable_Chungnhan1.getSelectedRow();

        if (index == -1) {
            //JOptionPane.showMessageDialog(jButton_Reset, "Hãy Chọn Giá Trị Trong Bảng");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn chứng nhận để thu hồi!");
            panel.showNotification();
        } else {

            try {
                int _ID_CH = (int) jSpinner_IDCuaHang.getValue();
                int _ID_CN = (int) jSpinner_IDCN.getValue();
                String _Mota = jTextArea_MoTa.getText();

                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                Date date = new Date();
                if ("Đã Thu Hồi CN".equals((String) jTable_Chungnhan1.getValueAt(index, 5))) {
                    //JOptionPane.showMessageDialog(jButton_Reset, "Đã Thu Hồi CN cho CH này rồi, không thể thu hồi CN này được nữa");
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chứng nhận của cửa hàng đã từng bị thu hồi!");
                    panel.showNotification();
                } else {
                    capchungnhan.update_TrangThaiChungNhan(_ID_CH, _ID_CN, "Đã Thu Hồi CN", dateFormat.format(date), _Mota);

                    int ChungNhanCuaCH = new My_Classes.CuaHang().getCuaHangById(_ID_CH).getSLCN();
                    cuahang.setQuanlity_Minus_One(_ID_CH, ChungNhanCuaCH - 1);

                    resetAllField();

                    populateJtableWithGenres("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ThuHoiCN.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException ex) {
                //JOptionPane.showMessageDialog(null, "Select An Item From The Table", "Select item", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn chứng nhận để thu hổi!");
                panel.showNotification();
            }
        }
    }//GEN-LAST:event_jButton_ConfirmActionPerformed

    private void jComboBox_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_StatusActionPerformed
        //display the data on the table depending to the status
        String status = (String) jComboBox_Status.getSelectedItem();
        if (status.equals("Tất Cả")) {
            status = "";
        }
        populateJtableWithGenres(status);
    }//GEN-LAST:event_jComboBox_StatusActionPerformed

    private void jLabel_Help_CuaHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_CuaHangMouseExited
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255));
        jLabel_Help_CuaHang.setBorder(border);
    }//GEN-LAST:event_jLabel_Help_CuaHangMouseExited

    private void jLabel_Help_CuaHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_CuaHangMouseEntered
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(139, 192, 100));
        jLabel_Help_CuaHang.setBorder(border);
    }//GEN-LAST:event_jLabel_Help_CuaHangMouseEntered

    private void jLabel_Help_CuaHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_CuaHangMouseClicked
//                int id_chungnhan = (int) jSpinner_IDCuaHang.getValue();
        int mem_id = (int) jSpinner_IDCuaHang.getValue();

        ThongTinCuaHang memberInforCardForm = new ThongTinCuaHang(mem_id);
        memberInforCardForm.setVisible(true);


    }//GEN-LAST:event_jLabel_Help_CuaHangMouseClicked

    private void jLabel_Help_ChungNhanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_ChungNhanMouseExited
        //add aborder in the bottom of the book name jlable
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255));
        jLabel_Help_ChungNhan.setBorder(border);
    }//GEN-LAST:event_jLabel_Help_ChungNhanMouseExited

    private void jLabel_Help_ChungNhanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_ChungNhanMouseEntered
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(139, 192, 100));
        jLabel_Help_ChungNhan.setBorder(border);
    }//GEN-LAST:event_jLabel_Help_ChungNhanMouseEntered

    private void jLabel_Help_ChungNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Help_ChungNhanMouseClicked
        int cn_id = (int) jSpinner_IDCN.getValue();
        ThongTinChungNhan cn_frame = new ThongTinChungNhan(cn_id);
        cn_frame.setVisible(true);
    }//GEN-LAST:event_jLabel_Help_ChungNhanMouseClicked

    private void jButton_TimCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimCuaHangActionPerformed
        //search for the book by ID
        //display the book title
        //check if this book is avalble or not

        int idch = (int) jSpinner_IDCuaHang.getValue();

        try {
            //get the book id
            My_Classes.CuaHang selectedCuaHang = cuahang.getCuaHangById(idch);

            if (selectedCuaHang != null) {
                //display the book title
                jLabel_Help_CuaHang.setText(String.valueOf(selectedCuaHang.getCuaHang()));
                //set the book exist to true
                cuahang_Exist = true;

            } else {
                jLabel_Help_CuaHang.setText("Tên cửa hàng");
                //JOptionPane.showMessageDialog(null, "Cửa Hàng Này Không Tồn Tại", "Không Tìm Thấy Cửa Hàng", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Cửa hàng không tồn tại!");
                panel.showNotification();
                cuahang_Exist = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CapChungNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_TimCuaHangActionPerformed

    private void jButton_TimCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TimCNActionPerformed
        //search member by id and display his full name:
        int cn_id = (int) jSpinner_IDCN.getValue();

        try {
            //get the book id
            My_Classes.ChungNhan selectedCN = chungnhan.getCNById(cn_id);

            if (selectedCN != null) {
                //display the book title
                jLabel_Help_ChungNhan.setText(selectedCN.getName());
                //set the member exist to true
                user_Exist = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Chứng Nhận Này Không Tồn Tại", "Chứng Nhận Không Tồn Tại", 2);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.INFO, Notification.Location.BOTTOM_RIGHT, "Chứng nhận không tồn tại!");
                panel.showNotification();
                jLabel_Help_ChungNhan.setText("Tên chứng nhận ATTP");
                user_Exist = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThuHoiCN.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_TimCNActionPerformed
    private void resetAllField() {
        jSpinner_IDCuaHang.setValue(0);
        jSpinner_IDCN.setValue(0);
        jLabel_Help_CuaHang.setText("Tên cửa hàng");
        jLabel_Help_ChungNhan.setText("Tên chứng nhận ATTP");
        jTextArea_MoTa.setText("");
    }

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        resetAllField();
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jTable_ChungnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ChungnhanMouseClicked

        int index = jTable_Chungnhan1.getSelectedRow();

        //get value
        int id_CH = Integer.parseInt(jTable_Chungnhan1.getValueAt(index, 0).toString());
        int id_CN = Integer.parseInt(jTable_Chungnhan1.getValueAt(index, 1).toString());

        My_Classes.CuaHang selectedCH;
        My_Classes.ChungNhan selectedCN;

        try {
            selectedCH = cuahang.getCuaHangById(id_CH);
            jSpinner_IDCuaHang.setValue(selectedCH.getId());
            jLabel_Help_CuaHang.setText(selectedCH.getCuaHang());

            selectedCN = chungnhan.getCNById(id_CN);
            jSpinner_IDCN.setValue(selectedCN.getId());
            jLabel_Help_ChungNhan.setText(selectedCN.getName());

            //String status = (String) jTable_IssueBook.getValueAt(index, 2);
            String note = (String) jTable_Chungnhan1.getValueAt(index, 4);

            //display the date
            jTextArea_MoTa.setText(note);

        } catch (SQLException e) {
            Logger.getLogger(ThuHoiCN.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_jTable_ChungnhanMouseClicked

    private void jTable_Chungnhan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Chungnhan1MouseClicked

        int index = jTable_Chungnhan1.getSelectedRow();
        //get value
        int id_CH = Integer.parseInt(jTable_Chungnhan1.getValueAt(index, 0).toString());
        int id_CN = Integer.parseInt(jTable_Chungnhan1.getValueAt(index, 1).toString());
        //            My_Classes.CuaHang selectedCH;
//            My_Classes.ChungNhan selectedCN;
//selectedCH = cuahang.getCuaHangById(id_CH);
        jSpinner_IDCuaHang.setValue(id_CH);
//            jLabel_Help_CuaHang.setText(selectedCH.getCuaHang());
//            selectedCN = chungnhan.getCNById(id_CN);
        jSpinner_IDCN.setValue(id_CN);
//           jLabel_Help_ChungNhan.setText(selectedCN.getName());
//String status = (String) jTable_IssueBook.getValueAt(index, 2);
        String note = (String) jTable_Chungnhan1.getValueAt(index, 4);
        String trangthai = (String) jTable_Chungnhan1.getValueAt(index, 5);
//display the date
        jTextArea_MoTa.setText(note);
    }//GEN-LAST:event_jTable_Chungnhan1MouseClicked

    public void populateJtableWithGenres(String status) {
        ArrayList<My_Classes.cap_chungnhan_cuahang> chungnhanList = capchungnhan.chungnhan_cuahang_List(status);

        //jtable collums
        String[] colNames = {"ID Cửa Hàng", "ID CN", "Ngày Cấp CN", "Ngày Thu Hồi CN", "Mo Ta", "Trạng Thái"};
        //jtable row
        Object[][] rows = new Object[chungnhanList.size()][colNames.length];

        for (int i = 0; i < chungnhanList.size(); i++) {
            rows[i][0] = chungnhanList.get(i).getId_CN();
            rows[i][1] = chungnhanList.get(i).getId_CH();
            rows[i][2] = chungnhanList.get(i).getIssue_date();
            rows[i][3] = chungnhanList.get(i).getReturn_date();
            rows[i][4] = chungnhanList.get(i).getMota();
            rows[i][5] = chungnhanList.get(i).getTrangthaichungnhan();
        }
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Chungnhan1.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Confirm;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JButton jButton_TimCN;
    private javax.swing.JButton jButton_TimCuaHang;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_ChungNhan;
    private javax.swing.JLabel jLabel_CuaHang;
    private javax.swing.JLabel jLabel_FilterChungNhan;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Help_ChungNhan;
    private javax.swing.JLabel jLabel_Help_CuaHang;
    private javax.swing.JLabel jLabel_MoTa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_IDCN;
    private javax.swing.JSpinner jSpinner_IDCuaHang;
    private javaswingdev.swing.table.Table jTable_Chungnhan1;
    private javax.swing.JTextArea jTextArea_MoTa;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
