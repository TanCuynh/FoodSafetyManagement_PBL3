package javaswingdev.form;

import My_Classes.quanly_cuahang;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ModelUser;

public class QuanLiCH extends javax.swing.JPanel {

    My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.cap_chungnhan_cuahang capchungnhan = new My_Classes.cap_chungnhan_cuahang();
    private ModelUser myModelUser;

    public QuanLiCH(ModelUser User) {
        myModelUser = User;
        initComponents();
        populateJtableWithAuthor("");

        jLabel_EmptyTenChuCH_.setVisible(false);
        jLabel_EmptySLCN_.setVisible(false);
        jLabel_EmptyDiaChi_.setVisible(false);
        jLabel_EmptyHotline_.setVisible(false);
        jLabel_EmptyTenCH_.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel2_TenCH = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_TenCH = new javax.swing.JTextField();
        jButton_Reset_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_EmptyTenCH_ = new javax.swing.JLabel();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jLabel_EmptyTenChuCH_ = new javax.swing.JLabel();
        jLabel4_TenChuCH = new javax.swing.JLabel();
        jTextField_TenChuCH = new javax.swing.JTextField();
        jLabel_Hotline = new javax.swing.JLabel();
        jTextField_Hotline = new javax.swing.JTextField();
        jLabel_SLCN = new javax.swing.JLabel();
        jTextField_SLCN = new javax.swing.JTextField();
        jLabel_EmptyDiaChi_ = new javax.swing.JLabel();
        jLabel_EmptyHotline_ = new javax.swing.JLabel();
        jLabel_EmptySLCN_ = new javax.swing.JLabel();
        jButton_Add_1 = new javax.swing.JButton();
        jLabel_MemberID = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Author = new javaswingdev.swing.table.Table();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("QUẢN LÝ CỬA HÀNG");
        jLabel_Form_Title.setOpaque(true);

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_ID.setText("ID:");

        jLabel2_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2_TenCH.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2_TenCH.setText("Tên CH:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Reset_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Reset_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Reset_.setForeground(new java.awt.Color(109, 180, 50));
        jButton_Reset_.setText("RESET");
        jButton_Reset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reset_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Delete_.setForeground(new java.awt.Color(255, 102, 102));
        jButton_Delete_.setText("XÓA");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Edit_.setForeground(new java.awt.Color(255, 153, 51));
        jButton_Edit_.setText("SỬA");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jLabel_EmptyTenCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenCH_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptyTenCH_.setText("* Nhập Tên CH");
        jLabel_EmptyTenCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenCH_MouseClicked(evt);
            }
        });

        jLabel_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel_DiaChi.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_DiaChi.setText("Địa chỉ:");

        jTextField_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyTenChuCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenChuCH_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptyTenChuCH_.setText("* Nhập tên chủ cửa hàng");
        jLabel_EmptyTenChuCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenChuCH_MouseClicked(evt);
            }
        });

        jLabel4_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4_TenChuCH.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4_TenChuCH.setText("Tên chủ CH:");

        jTextField_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_TenChuCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenChuCHActionPerformed(evt);
            }
        });

        jLabel_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel_Hotline.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_Hotline.setText("Hotline:");

        jTextField_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Hotline.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HotlineKeyTyped(evt);
            }
        });

        jLabel_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel_SLCN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_SLCN.setText("SLCN:");

        jTextField_SLCN.setEditable(false);
        jTextField_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_SLCN.setText("0");
        jTextField_SLCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SLCNActionPerformed(evt);
            }
        });

        jLabel_EmptyDiaChi_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyDiaChi_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptyDiaChi_.setText("* Nhập địa chỉ");
        jLabel_EmptyDiaChi_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyDiaChi_MouseClicked(evt);
            }
        });

        jLabel_EmptyHotline_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyHotline_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptyHotline_.setText("* Nhập Hotline");
        jLabel_EmptyHotline_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyHotline_MouseClicked(evt);
            }
        });

        jLabel_EmptySLCN_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptySLCN_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptySLCN_.setText("* Nhập SL Chứng Nhận");
        jLabel_EmptySLCN_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptySLCN_MouseClicked(evt);
            }
        });

        jButton_Add_1.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Add_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Add_1.setForeground(new java.awt.Color(109, 180, 50));
        jButton_Add_1.setText("THÊM");
        jButton_Add_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_1ActionPerformed(evt);
            }
        });

        jLabel_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MemberID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MemberID.setText("Tìm kiếm:");

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Search.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Search.setText("Tìm kiếm");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jTable_Author.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_Author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Author);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 180, 50));
        jLabel3.setText("* Hãy nhập các dữ liệu cần thiết để thêm cửa hàng, hoặc chọn từ bảng để chỉnh sửa/xóa cửa hàng!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel4_TenChuCH, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel_DiaChi, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel_Hotline, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel_SLCN, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_EmptyDiaChi_)
                                .addComponent(jLabel_EmptyTenCH_)
                                .addComponent(jLabel_EmptyTenChuCH_)
                                .addComponent(jLabel_EmptyHotline_)
                                .addComponent(jTextField_Hotline, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(jTextField_DiaChi)
                                .addComponent(jLabel_EmptySLCN_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_ID)
                                .addComponent(jTextField_SLCN))
                            .addComponent(jTextField_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_TenChuCH, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Add_1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_Reset_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_MemberID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(280, 333, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MemberID)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2_TenCH)
                            .addComponent(jTextField_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel_EmptyTenCH_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_TenChuCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4_TenChuCH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyTenChuCH_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DiaChi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyDiaChi_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Hotline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Hotline))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyHotline_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_SLCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_SLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptySLCN_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Reset_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Add_1)
                            .addComponent(jButton_Delete_))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Reset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reset_ActionPerformed
        jTextField_ID.setText("");
        jTextField_TenCH.setText("");
        jTextField_TenChuCH.setText("");
        jTextField_DiaChi.setText("");
        jTextField_Hotline.setText("");
        jTextField_SLCN.setText("");
        jLabel_EmptyTenChuCH_.setVisible(false);
        jLabel_EmptySLCN_.setVisible(false);
        jLabel_EmptyDiaChi_.setVisible(false);
        jLabel_EmptyHotline_.setVisible(false);
        jLabel_EmptyTenCH_.setVisible(false);
    }//GEN-LAST:event_jButton_Reset_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        int index = jTable_Author.getSelectedRow();
        if (index == -1) {
            //JOptionPane.showMessageDialog(jLabel_Hotline, "Hãy chọn 1 Cửa Hàng Từ Table Để Xóa");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn cửa hàng để xóa!");
            panel.showNotification();
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa CH này không?", "Xóa Chứng Nhận", JOptionPane.YES_NO_OPTION);
            if (opt == 0) {
                try {
                    int id = Integer.parseInt(jTextField_ID.getText());
                    cuahang.deleteCuaHang(id);

                    quanly_cuahang quanlyCH = new quanly_cuahang();
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();

                    quanlyCH.huy_cuahang_mem(id, dateFormat.format(date));
                    capchungnhan.deleteChungNhan_CuaHang_Table_Soft(id);

                    //refresh the jtable after we delete
                    populateJtableWithAuthor("");
                    jTextField_ID.setText("");
                    jTextField_TenCH.setText("");
                    jTextField_TenChuCH.setText("");
                    jTextField_DiaChi.setText("");
                    jTextField_Hotline.setText("");
                    jLabel_EmptyTenChuCH_.setVisible(false);
                    jLabel_EmptySLCN_.setVisible(false);
                    jLabel_EmptyDiaChi_.setVisible(false);
                    jLabel_EmptyHotline_.setVisible(false);
                    jLabel_EmptyTenCH_.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NumberFormatException e) {
                    //JOptionPane.showMessageDialog(null, "Invalid CH ID" + e.getMessage(), "Error", 0);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "ID cửa hàng không tồn tại!");
                    panel.showNotification();
                }
            }
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();

        int index = jTable_Author.getSelectedRow();

        if (index == -1 || jTextField_ID.getText().equals("")) {
            //JOptionPane.showMessageDialog(jLabel_Hotline, "Hãy Chọn 1 Cửa Hàng Để Tiến Hành Sửa");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn cửa hàng cần chỉnh sửa!");
            panel.showNotification();
        } else {
            if (TenCH.isEmpty()) {
                jLabel_EmptyTenCH_.setVisible(true);
            } else if (TenChuCH.isEmpty()) {
                jLabel_EmptyTenChuCH_.setVisible(true);
            } else if (DiaChi.isEmpty()) {
                jLabel_EmptyDiaChi_.setVisible(true);
            } else if (Hotline.isEmpty()) {
                jLabel_EmptyHotline_.setVisible(true);
            } else if (SLCN.isEmpty()) {
                jLabel_EmptySLCN_.setVisible(true);
            } else {
                try {
                    try {
                        int id = Integer.parseInt(jTextField_ID.getText());
                        cuahang.editCuahang(id, TenCH, TenChuCH, DiaChi, Hotline, Integer.parseInt(SLCN));
                        //refresh the jtable after we edit
                        populateJtableWithAuthor("");

                        jTextField_ID.setText("");
                        jTextField_TenCH.setText("");
                        jTextField_TenChuCH.setText("");
                        jTextField_DiaChi.setText("");
                        jTextField_Hotline.setText("");
                        jLabel_EmptyTenChuCH_.setVisible(false);
                        jLabel_EmptySLCN_.setVisible(false);
                        jLabel_EmptyDiaChi_.setVisible(false);
                        jLabel_EmptyHotline_.setVisible(false);
                        jLabel_EmptyTenCH_.setVisible(false);

                    } catch (SQLException ex) {
                        Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (NumberFormatException ex) {
                    //JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa có ID của cửa hàng cần sửa!");
                    panel.showNotification();
                }
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jLabel_EmptyTenCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenCH_MouseClicked
        //hide this jlable on click
        jLabel_EmptyTenCH_.setVisible(false);
        jLabel_EmptyTenChuCH_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyTenCH_MouseClicked

    private void jLabel_EmptyTenChuCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenChuCH_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyTenChuCH_MouseClicked

    private void jTextField_TenChuCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenChuCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenChuCHActionPerformed

    private void jTextField_SLCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SLCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SLCNActionPerformed

    private void jLabel_EmptyDiaChi_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyDiaChi_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyDiaChi_MouseClicked

    private void jLabel_EmptyHotline_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyHotline_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyHotline_MouseClicked

    private void jLabel_EmptySLCN_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptySLCN_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptySLCN_MouseClicked

    private void jButton_Add_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_1ActionPerformed
        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();

        if (TenCH.isEmpty()) {
            jLabel_EmptyTenCH_.setVisible(true);
        } else if (TenChuCH.isEmpty()) {
            jLabel_EmptyTenChuCH_.setVisible(true);
        } else if (DiaChi.isEmpty()) {
            jLabel_EmptyDiaChi_.setVisible(true);
        } else if (Hotline.isEmpty()) {
            jLabel_EmptyHotline_.setVisible(true);
        } else if (SLCN.isEmpty()) {
            jLabel_EmptySLCN_.setVisible(true);
        } else if (!jTextField_ID.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "ID has been taken, please choose id again", "Id error", 2);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "ID cửa hàng đã tồn tại!");
            panel.showNotification();
        } else {
            try {
                try {

                    cuahang.addCuahang(TenCH, TenChuCH, DiaChi, Hotline, 0);

                    //add bang trung gian:
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();

                    quanly_cuahang quanlyCH = new quanly_cuahang();

                    int id_cuahang = func.countStore("cuahang");
                    Integer id_User = myModelUser.getUserID();

                    quanlyCH.add_cuahang(id_User, id_cuahang, dateFormat.format(date));

                    //refresh the jtable after we edit
                    populateJtableWithAuthor("");

                    jTextField_ID.setText("");
                    jTextField_TenCH.setText("");
                    jTextField_TenChuCH.setText("");
                    jTextField_DiaChi.setText("");
                    jTextField_Hotline.setText("");
                    jLabel_EmptyTenChuCH_.setVisible(false);
                    jLabel_EmptySLCN_.setVisible(false);
                    jLabel_EmptyDiaChi_.setVisible(false);
                    jLabel_EmptyHotline_.setVisible(false);
                    jLabel_EmptyTenCH_.setVisible(false);

                } catch (SQLException ex) {
                    Logger.getLogger(QuanLiCH.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                //JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "ID cửa hàng không tồn tại!");
                panel.showNotification();
            }
        }
    }//GEN-LAST:event_jButton_Add_1ActionPerformed

    private void jTable_AuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorMouseClicked
        // TODO add your handling code here:
        int index = jTable_Author.getSelectedRow();

        //get values;
        String id = jTable_Author.getValueAt(index, 0).toString();
        String firstName = jTable_Author.getValueAt(index, 1).toString();
        String TenChuCH = jTable_Author.getValueAt(index, 2).toString();
        String DiaChi = jTable_Author.getValueAt(index, 3).toString();
        String Hotline = jTable_Author.getValueAt(index, 4).toString();
        String slCN = jTable_Author.getValueAt(index, 5).toString();

        //show data in textfield
        jTextField_ID.setText(id);
        jTextField_TenCH.setText(firstName);
        jTextField_TenChuCH.setText(TenChuCH);
        jTextField_DiaChi.setText(DiaChi);
        jTextField_Hotline.setText(Hotline);
        jTextField_SLCN.setText(slCN);
    }//GEN-LAST:event_jTable_AuthorMouseClicked

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        //search and display the data on the table
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM `cuahang` WHERE `tontai_khongtontai` = true AND `TenCuaHang` LIKE '%" + value + "%'";
        populateJtableWithAuthor(query);
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTextField_HotlineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HotlineKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }  
    }//GEN-LAST:event_jTextField_HotlineKeyTyped
    public void populateJtableWithAuthor(String query) {
        ArrayList<My_Classes.CuaHang> authorsList = cuahang.ListCuaHang(query);

        //jtable collums
        String[] colNames = {"ID", "TÊN CỬA HÀNG", "CHỦ SỠ HỮU", "ĐỊA CHỈ", "HOTLINE", "SLCN"};
        //jtable row
        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getCuaHang();
            rows[i][2] = authorsList.get(i).getTenChuCuaHang();
            rows[i][3] = authorsList.get(i).getDiaChi();
            rows[i][4] = authorsList.get(i).getHotline();
            rows[i][5] = authorsList.get(i).getSLCN();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Author.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_1;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Reset_;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel2_TenCH;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_TenChuCH;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_EmptyDiaChi_;
    private javax.swing.JLabel jLabel_EmptyHotline_;
    private javax.swing.JLabel jLabel_EmptySLCN_;
    private javax.swing.JLabel jLabel_EmptyTenCH_;
    private javax.swing.JLabel jLabel_EmptyTenChuCH_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Hotline;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JLabel jLabel_SLCN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javaswingdev.swing.table.Table jTable_Author;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_Hotline;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_SLCN;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JTextField jTextField_TenCH;
    private javax.swing.JTextField jTextField_TenChuCH;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
