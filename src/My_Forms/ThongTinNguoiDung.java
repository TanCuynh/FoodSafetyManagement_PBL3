package My_Forms;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class ThongTinNguoiDung extends javax.swing.JFrame {

    
    My_Classes.CuaHang cuahang = new My_Classes.CuaHang();
    My_Classes.User member = new My_Classes.User();
    My_Classes.ChungNhan genre = new My_Classes.ChungNhan();
    My_Classes.Func_Class func = new My_Classes.Func_Class();

    public ThongTinNguoiDung(int ID_TT) {
        initComponents();
        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(252, 231, 125));
        jPanel1.setBorder(panelHeaderBorder);

        //display image        
        func.displayImage(70, 70, null, "/My_Images/icons8_male_user_100px.png", jLabel_Form_Title);

        //border the image
        Border JlaBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        //display the book infor
        displayMemberInfor(ID_TT);
    }

    //creat a func to display the book infor
    public void displayMemberInfor(int ID_TT) {
        try {
            My_Classes.User selectedThanhTra = member.getMemberById(ID_TT);

            if (selectedThanhTra != null) {
                jLabel_ID.setText("ID :" + String.valueOf(selectedThanhTra.getId()));
                jLabel_Fullname.setText("Tên Thanh Tra:" + String.valueOf(selectedThanhTra.getFullname()));
                jLabel_Email.setText("Email : "+ selectedThanhTra.getEmail()); //
                jLabel_SDT.setText("Số Điện Thoại: "+ selectedThanhTra.getPhone()); //
                jLabel_TaiKhoan.setText("Tài Khoản : "+selectedThanhTra.getTaikhoan());
                jLabel_GioiTinh.setText("Giới Tính : "+selectedThanhTra.getGender());
                jLabel_QueQuan.setText("Quê quán: "+selectedThanhTra.getCountry());
            } else {
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_TaiKhoan = new javax.swing.JLabel();
        jLabel_SDT = new javax.swing.JLabel();
        jLabel_GioiTinh = new javax.swing.JLabel();
        jLabel_QueQuan = new javax.swing.JLabel();
        jLabel_Fullname = new javax.swing.JLabel();

        jLabel_Image.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 53));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("THÔNG TIN THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jLabel_Close.setBackground(new java.awt.Color(53, 53, 53));
        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel_ID.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_ID.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ID.setText("ID:");
        jLabel_ID.setOpaque(true);

        jLabel_Email.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Email.setText("Email:");
        jLabel_Email.setOpaque(true);

        jLabel_TaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TaiKhoan.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_TaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_TaiKhoan.setText("Tên tài khoản:");
        jLabel_TaiKhoan.setOpaque(true);

        jLabel_SDT.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_SDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_SDT.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_SDT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_SDT.setText("SĐT:");
        jLabel_SDT.setOpaque(true);

        jLabel_GioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_GioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_GioiTinh.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_GioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_GioiTinh.setText("Giới tính:");
        jLabel_GioiTinh.setOpaque(true);

        jLabel_QueQuan.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_QueQuan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_QueQuan.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_QueQuan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_QueQuan.setText("Quê quán:");
        jLabel_QueQuan.setOpaque(true);

        jLabel_Fullname.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Fullname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Fullname.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Fullname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Fullname.setText("Tên thanh tra:");
        jLabel_Fullname.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_GioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_QueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_ID)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Fullname)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Email)
                .addGap(18, 18, 18)
                .addComponent(jLabel_SDT)
                .addGap(18, 18, 18)
                .addComponent(jLabel_TaiKhoan)
                .addGap(18, 18, 18)
                .addComponent(jLabel_GioiTinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel_QueQuan)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_GioiTinh;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_QueQuan;
    private javax.swing.JLabel jLabel_SDT;
    private javax.swing.JLabel jLabel_TaiKhoan;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
