package javaswingdev.form;

import My_Classes.ChungNhan;
import My_Classes.quanly_chungnhan;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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


public class QLCN extends javax.swing.JPanel {

    private ModelUser myModelUser;
    My_Classes.ChungNhan chungnhan = new My_Classes.ChungNhan();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.quanly_chungnhan quanlychungnhan = new My_Classes.quanly_chungnhan();
    My_Classes.cap_chungnhan_cuahang capchungnhan = new My_Classes.cap_chungnhan_cuahang();
    String imagePath = "";
    byte [] displayImage_1 = null;
    byte [] displayImage = null;
    public QLCN(ModelUser user) {
        myModelUser = user;
        initComponents();
        populateJtableWithChungNhan("");
        //hide the jlable "empty name message"
        jLabel_EmptyName_.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jLabel_EmptyName_ = new javax.swing.JLabel();
        jButton_SelectProfile = new javax.swing.JButton();
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jLabel_MemberID = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jButton_Reset_ = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Genres = new javaswingdev.swing.table.Table();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("QUẢN LÝ CHỨNG NHẬN VỆ SINH ATTP");
        jLabel_Form_Title.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Tên chứng nhận:");

        jTextField_ID.setEnabled(false);

        jButton_Add_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Add_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Add_.setForeground(new java.awt.Color(0, 204, 0));
        jButton_Add_.setText("THÊM");
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Delete_.setForeground(new java.awt.Color(255, 51, 51));
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

        jLabel_EmptyName_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyName_.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_EmptyName_.setText("* Nhập tên chứng nhận ATTP");
        jLabel_EmptyName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyName_MouseClicked(evt);
            }
        });

        jButton_SelectProfile.setText("Select Profile");
        jButton_SelectProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectProfileActionPerformed(evt);
            }
        });

        jLabel_Image1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image1.setOpaque(true);

        jLabel_ImagePath.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_ImagePath.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ImagePath.setText("Hãy chọn ảnh!");

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

        jButton_Reset_.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Reset_.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_Reset_.setForeground(new java.awt.Color(109, 180, 50));
        jButton_Reset_.setText("RESET");
        jButton_Reset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reset_ActionPerformed(evt);
            }
        });

        jTable_Genres.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Genres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_GenresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Genres);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 180, 50));
        jLabel3.setText("* Hãy nhập tên chứng nhận và chọn ảnh để thêm, hoặc chọn chứng nhận từ bảng để chỉnh sửa/xóa!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_EmptyName_, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9)))
                                    .addGap(44, 44, 44))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton_Reset_, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_SelectProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jLabel_Image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(159, 159, 159)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_MemberID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_MemberID)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_EmptyName_)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SelectProfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ImagePath)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_Reset_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Delete_)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Add_)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        String name = jTextField_Name.getText();

        if (name.trim().isEmpty()) {
            jLabel_EmptyName_.setVisible(true);
        } else if (!jTextField_ID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ID has been taken, please choose id again", "Id error", 2);
        } else {
            byte[] img = null;

            if (imagePath != null) {

                try {
                    Path path = Paths.get(imagePath);
                    img = Files.readAllBytes(path);
                    chungnhan.addChungNhan(name, img);

                    //add vao bang trung gian:
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();

                    int id_chungnhan = func.countStore("chungnhan_atvstp");

                    quanly_chungnhan quanlychungnhan = new quanly_chungnhan();

                    Integer id_User = myModelUser.getUserID();

                    quanlychungnhan.add_chungnhan(id_chungnhan, id_User, dateFormat.format(date));

                    //refresh the jtable after we add
                    populateJtableWithChungNhan("");
                    //after refresh the table we clear the textfield
                    jTextField_ID.setText("");
                    jTextField_Name.setText("");
                    imagePath = "";
                    jLabel_ImagePath.setText("Hãy chọn ảnh!");
                    func.displayImage(238, 177, null, null, jLabel_Image1);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Make Sure To Add A ImageCover", "No cover image found", 2);
                } catch (SQLException ex) {
                    Logger.getLogger(QLCN.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Select a profile picture for this member", "no picture selected", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn ảnh chứng nhận");
                panel.showNotification();
            }
        }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed

        Integer rowIndex = jTable_Genres.getSelectedRow();
        if (rowIndex == -1) {
            //JOptionPane.showMessageDialog(jLabel_Image1, "Hãy chọn 1 CN ở Bảng");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn chứng nhận để xóa!");
            panel.showNotification();
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa CN này không?", "Xóa Chứng Nhận", JOptionPane.YES_NO_OPTION);
            if (opt == 0) {
                try {
                    int id = Integer.parseInt(jTextField_ID.getText());
                    chungnhan.deleteChungNhan(id);
                    //refresh the jtable after we delete

                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();

                    quanlychungnhan.huy_chungnhan_mem(id, dateFormat.format(date));
                    capchungnhan.deleteChungNhan_ChungNhan_Table_Soft(id);

                    populateJtableWithChungNhan("");
                    jTextField_ID.setText("");
                    jTextField_Name.setText("");
                    imagePath = "";
                    jLabel_ImagePath.setText("Hãy chọn ảnh!");
                    func.displayImage(238, 177, null, null, jLabel_Image1);

                } catch (SQLException ex) {
                    Logger.getLogger(QLCN.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid Genre ID" + e.getMessage(), "Error", 0);
                }
            }
        }


    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        Integer rowIndex = jTable_Genres.getSelectedRow();

        if (rowIndex == -1) {
            //JOptionPane.showMessageDialog(jLabel_Image1, "Hãy Chọn 1 CN Để Tiến Hành Sửa");
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn chứng nhận để chỉnh sửa!");
            panel.showNotification();
        } else {
            String name = jTextField_Name.getText();

            if (name.isEmpty()) {
                jLabel_EmptyName_.setVisible(true);
            } else {
                byte[] img = null;
                if (imagePath != null && displayImage == null) {

                    try {
                        Path path = Paths.get(imagePath);
                        int id = Integer.parseInt(jTextField_ID.getText());
                        try {
                            //if the user want to change the image

                            img = Files.readAllBytes(path);
                            chungnhan.editChungNhan(id, name, img);
                            populateJtableWithChungNhan("");
                            jTextField_ID.setText("");
                            jTextField_Name.setText("");
                            imagePath = "";
                            jLabel_ImagePath.setText("Hãy chọn ảnh!");
                            func.displayImage(238, 177, null, null, jLabel_Image1);

                        } catch (IOException e) {   //if not want to change
                            chungnhan.editChungNhan(id, name, displayImage_1);
                            populateJtableWithChungNhan("");
                            jTextField_ID.setText("");
                            jTextField_Name.setText("");
                            imagePath = "";
                            jLabel_ImagePath.setText("Hãy chọn ảnh!");
                            func.displayImage(238, 177, null, null, jLabel_Image1);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(QLCN.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (NullPointerException ex) {
                        //JOptionPane.showMessageDialog(null, "Error, null", "Select date", 2);
                        ex.printStackTrace();
                    } catch (NumberFormatException ex) {
                        //JOptionPane.showMessageDialog(null, "You Enterred Wrong Data In A Number Field", "Wrong data number", 2);
                        Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Sai dữ liệu nhập!");
                        panel.showNotification();
                    }
                } else if (displayImage != null) {
                    try {
                        int id = Integer.parseInt(jTextField_ID.getText());
                        chungnhan.editChungNhan(id, name, displayImage);
                        populateJtableWithChungNhan("");
                        jTextField_ID.setText("");
                        jTextField_Name.setText("");
                        imagePath = "";
                        jLabel_ImagePath.setText("Hãy chọn ảnh!");
                        func.displayImage(238, 177, null, null, jLabel_Image1);

                    } catch (SQLException ex) {
                        Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    //JOptionPane.showMessageDialog(null, "Select a profile picture for this member", "no picture selected", 0);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chọn ảnh cho chứng nhận!");
                    panel.showNotification();
                }

            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed
    public void populateJtableWithChungNhan(String query) {
        ArrayList<My_Classes.ChungNhan> chungnhanList = chungnhan.genreList(query);

        //jtable collums
        String[] colNames = {"ID Chứng Nhận", "Tên Chứng Nhận"};
        //jtable row
        Object[][] rows = new Object[chungnhanList.size()][colNames.length];

        for (int i = 0; i < chungnhanList.size(); i++) {
            rows[i][0] = chungnhanList.get(i).getId();
            rows[i][1] = chungnhanList.get(i).getName();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Genres.setModel(model);
    }
    private void jLabel_EmptyName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyName_MouseClicked
        //hide this jlable on click
        jLabel_EmptyName_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyName_MouseClicked

    private void jButton_SelectProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectProfileActionPerformed
        //select pictuer from the PC
        String path = func.selectImage();
        jLabel_ImagePath.setText(path);
        imagePath = path;

        //display the image when we select in path
        func.displayImage(211, 173, null, path, jLabel_Image1);
    }//GEN-LAST:event_jButton_SelectProfileActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        //search and display the data on the table
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM `chungnhan_atvstp` WHERE `tontai_khongtontai` = true AND `TenChungNhan` LIKE '%" + value + "%'";
        populateJtableWithChungNhan(query);
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jButton_Reset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reset_ActionPerformed
        jTextField_ID.setText("");
        jTextField_Name.setText("");
        imagePath = null;
        jLabel_ImagePath.setText("Hãy chọn ảnh!");
        jLabel_Image1.setIcon(null);
    }//GEN-LAST:event_jButton_Reset_ActionPerformed

    private void jTable_GenresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_GenresMouseClicked
        // TODO add your handling code here:
        ChungNhan selectedChungnhan;
        try {
            //search member by ID and print infor 
            Integer rowIndex = jTable_Genres.getSelectedRow();    //get the selected row index
            //get the member id from the jtable(the id is the first column [0] )
            Integer id = Integer.parseInt(jTable_Genres.getModel().getValueAt(rowIndex, 0).toString());

            selectedChungnhan = chungnhan.getCNById(id);

            if (selectedChungnhan != null) {
                jTextField_Name.setText(selectedChungnhan.getName());
                jTextField_ID.setText(String.valueOf(selectedChungnhan.getId()));

                //display image:
                byte[] image = selectedChungnhan.getAnhchungnhan();
                displayImage_1 = image;
                //we will display the image using the imagebyte
                //so we will made the image path null
                func.displayImage(211, 173, image, "", jLabel_Image1);
            } else {
                JOptionPane.showMessageDialog(null, "No Member With This ID Found", "invalid id member", 2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(QLCN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable_GenresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Reset_;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_SelectProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_EmptyName_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javaswingdev.swing.table.Table jTable_Genres;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
