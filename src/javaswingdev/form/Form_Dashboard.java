package javaswingdev.form;

import javaswingdev.card.ModelCard;
import models.ModelUser;

public class Form_Dashboard extends javax.swing.JPanel {
               My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
               My_Classes.Func_Class func = new My_Classes.Func_Class();
                private ModelUser myModelUser;

    public Form_Dashboard(ModelUser modelUser) {
        myModelUser = modelUser;
        initComponents();
        populateJtableWithAuthor(modelUser);
    }
    
    
    
    public void populateJtableWithAuthor(ModelUser modelUser) {
        
        Integer countStore = func.countStoreCH();
        Integer countChungNhan = func.countStoreCN();
        Integer countUser = func.countUSER();

        
        card1.setData(new ModelCard(null, null, null, countStore.toString(), "SỐ CỬA HÀNG TRONG HỆ THỐNG"));
        card2.setData(new ModelCard(null, null, null,countChungNhan.toString(), "SỐ CHỨNG NHẬN TRONG HỆ THỐNG"));
        card3.setData(new ModelCard(null, null, null, countUser.toString(), "SỐ NGƯỜI DÙNG TRONG HỆ THỐNG"));
       
        jLabel2.setText("Chào " + modelUser.getUserName() + " , chúc bạn 1 ngày vui vẻ !");
       
         if("user".equals(modelUser.getRole())) {
            JButton_GuiTB.setVisible(false);
        }
        
        
        func.displayImage(170, 152, null, "/My_Images/1.jpg", jLabel_Image1);
        func.displayImage(170, 152, null, "/My_Images/2.jpg", jLabel_Image2);
        func.displayImage(170, 152, null, "/My_Images/3.jpg", jLabel_Image3);
        func.displayImage(170, 152, null, "/My_Images/4.jpg", jLabel_Image4);
        func.displayImage(170, 152, null, "/My_Images/5.jpg", jLabel_Image5);
        func.displayImage(170, 152, null, "/My_Images/kfc.jpg", jLabel_Image6);
        func.displayImage(347, 152, null, "/My_Images/sushi.jpg", jLabel_Image7);
        func.displayImage(347, 152, null, "/My_Images/thaimarket.png", jLabel_Image8);
        func.displayImage(347, 152, null, "/My_Images/highland.jpg", jLabel_Image9);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        card1 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        JButton_GuiTB = new customDefaultUI.Button();
        JButton_NhanTB = new customDefaultUI.Button();
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_Image5 = new javax.swing.JLabel();
        jLabel_Image3 = new javax.swing.JLabel();
        jLabel_Image2 = new javax.swing.JLabel();
        jLabel_Image4 = new javax.swing.JLabel();
        jLabel_Image6 = new javax.swing.JLabel();
        jLabel_Image7 = new javax.swing.JLabel();
        jLabel_Image8 = new javax.swing.JLabel();
        jLabel_Image9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PIE_CHART);

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.RING_VOLUME);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Những cửa hàng trong hệ thống :");

        JButton_GuiTB.setBackground(new java.awt.Color(25, 182, 247));
        JButton_GuiTB.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JButton_GuiTB.setForeground(new java.awt.Color(255, 255, 255));
        JButton_GuiTB.setText("Gửi thông báo");
        JButton_GuiTB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        JButton_GuiTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_GuiTBActionPerformed(evt);
            }
        });

        JButton_NhanTB.setBackground(new java.awt.Color(25, 182, 247));
        JButton_NhanTB.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JButton_NhanTB.setForeground(new java.awt.Color(255, 255, 255));
        JButton_NhanTB.setText("Nhận thông báo");
        JButton_NhanTB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        JButton_NhanTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_NhanTBActionPerformed(evt);
            }
        });

        jLabel_Image1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image1.setOpaque(true);

        jLabel_Image5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image5.setOpaque(true);

        jLabel_Image3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image3.setOpaque(true);

        jLabel_Image2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image2.setOpaque(true);

        jLabel_Image4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image4.setOpaque(true);

        jLabel_Image6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image6.setOpaque(true);

        jLabel_Image7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image7.setOpaque(true);

        jLabel_Image8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image8.setOpaque(true);

        jLabel_Image9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image9.setOpaque(true);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Image8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Image3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Image4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JButton_GuiTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Image5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JButton_NhanTB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Image6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel_Image9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButton_GuiTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_NhanTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Image4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jLabel_Image3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Image8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Image9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Image7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Hệ thống quản lý và thông báo tình trạng an toàn vệ sinh thực phẩm ");

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Chào .... , ngày mới vui vẻ !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {card1, card2, card3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {card1, card2, card3});

    }// </editor-fold>//GEN-END:initComponents

    private void JButton_GuiTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_GuiTBActionPerformed
        // TODO add your handling code here:
         AddThongBao atb_frame = new AddThongBao(myModelUser.getUserID());
            atb_frame.setVisible(true);
        
        
    }//GEN-LAST:event_JButton_GuiTBActionPerformed

    private void JButton_NhanTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_NhanTBActionPerformed
        
        TrungTamThongBao tttb_frame = new TrungTamThongBao();
        tttb_frame.setVisible(true);

    }//GEN-LAST:event_JButton_NhanTBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customDefaultUI.Button JButton_GuiTB;
    private customDefaultUI.Button JButton_NhanTB;
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_Image2;
    private javax.swing.JLabel jLabel_Image3;
    private javax.swing.JLabel jLabel_Image4;
    private javax.swing.JLabel jLabel_Image5;
    private javax.swing.JLabel jLabel_Image6;
    private javax.swing.JLabel jLabel_Image7;
    private javax.swing.JLabel jLabel_Image8;
    private javax.swing.JLabel jLabel_Image9;
    private javax.swing.JSeparator jSeparator1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
