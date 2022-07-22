package javaswingdev.main;

import My_Classes.Func_Class;
import My_Classes.User;
import javaswingdev.form.ThanhTraCH;
import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.form.AddUser;
import javaswingdev.form.CaNhan;
import javaswingdev.form.CapChungNhan;
import javaswingdev.form.DeleteUser;
import javaswingdev.form.EditUser;
import javaswingdev.form.Form_Dashboard;
import javaswingdev.form.KeHoachThanhTra;
import javaswingdev.form.KetQuaThanhTraAD;
import javaswingdev.form.QLCN;
import javaswingdev.form.QuanLiCH;
import javaswingdev.form.ThuHoiCN;
import javaswingdev.form.UserListForm;
//import javaswingdev.form.Form_Empty;
import javaswingdev.menu.EventMenuSelected;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.ModelUser;
import view.Login;

public class Main extends javax.swing.JFrame {

    private ModelUser myModelUser;
    private static Main main;
    My_Classes.Func_Class func = new Func_Class();

    public Main(ModelUser modelUser) throws SQLException {
        myModelUser = modelUser;
        initComponents();
        init();
        jLabel_name.setText(modelUser.getUserName());
        imageAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/user.png")));
    }
    
   
    


    private Main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     public static void displayNameAndAvatar(String newName) {
        jLabel_name.setText(newName);      
     }
    
    private void init() {

        main = this;
        titleBar.initJFram(this);
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, int indexSubMenu) {
                if (index == 0 && indexSubMenu == 0) {
                    showForm(new Form_Dashboard(myModelUser));
                } else if (index == 1 && indexSubMenu == 1) {
//                    showForm(new Form_Empty(index + " " + indexSubMenu));
                    showForm(new QLCN(myModelUser));
                } else if (index == 1 && indexSubMenu == 2) {
                    showForm(new CapChungNhan());
                } else if (index == 1 && indexSubMenu == 3) {
                    showForm(new ThuHoiCN());
                } else if (index == 2 && indexSubMenu == 0) {
                    showForm(new QuanLiCH(myModelUser));
                } else if (index == 4 && indexSubMenu == 1) {
                    showForm(new ThanhTraCH());
                } else if (index == 4 && indexSubMenu == 2) {
                    showForm(new KeHoachThanhTra());
                } else if (index == 3 && indexSubMenu == 0) {
                    showForm(new KetQuaThanhTraAD());
                } else if (index == 5 && indexSubMenu == 1) {
                    showForm(new UserListForm());
                } else if (index == 5 && indexSubMenu == 2) {
                    showForm(new AddUser());
                } else if (index == 5 && indexSubMenu == 3) {
                    showForm(new EditUser());
                } else if (index == 5 && indexSubMenu == 4) {
                    showForm(new DeleteUser());
                } else if (index == 6 && indexSubMenu == 0 || index == 4 && indexSubMenu == 0) 
                {
                    int confirm = JOptionPane.showConfirmDialog(null, "Bạn Có Chắc Chắn Muốn Đăng Xuất ?",
                            "XÁC NHẬN ĐĂNG XUẤT", JOptionPane.YES_NO_OPTION);
                    if (confirm == 0) 
                    {
                        Login loginFrame = new Login();
                        loginFrame.setVisible(true);
                        main.dispose();
                    }
                }
            }
        });
        menu.setSelectedIndex(0, 0);
        menu.setData(myModelUser);
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    public static Main getMain() {
        return main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        menu = new javaswingdev.menu.Menu();
        titleBar = new javaswingdev.swing.titlebar.TitleBar();
        body = new javax.swing.JPanel();
        jLabel_name = new javax.swing.JLabel();
        imageAvatar = new customDefaultUI.ImageAvatar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        jLabel_name.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(79, 79, 79));
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_name.setText("name");
        jLabel_name.setToolTipText("");

        imageAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_name, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imageAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatarMouseClicked
        // TODO add your handling code here:
        CaNhan x = new CaNhan(myModelUser.getUserID());
        x.setVisible(true);
    }//GEN-LAST:event_imageAvatarMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel body;
    private customDefaultUI.ImageAvatar imageAvatar;
    private static javax.swing.JLabel jLabel_name;
    private javaswingdev.menu.Menu menu;
    private javax.swing.JPanel panelMenu;
    private javaswingdev.swing.titlebar.TitleBar titleBar;
    // End of variables declaration//GEN-END:variables

    public void setData(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
