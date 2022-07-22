package javaswingdev.form;
import My_Classes.User;
import My_Forms.MembersListForm;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
public class UserListForm extends javax.swing.JPanel {
                
    
     My_Classes.User member = new My_Classes.User();

    My_Classes.Func_Class func = new My_Classes.Func_Class();
           
    public UserListForm() {
        initComponents();
         func.displayImage(100, 100, null, "/My_Images/icons8_list_100px_1.png", jLabel_Form_Title);
        Border JlaBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_Image1.setBorder(JlaBorder);

        //add a default image
        func.displayImage(237, 170, null, "/My_Images/icons8_male_user_100px.png", jLabel_Image1);
        populateJtableWithMember("");
    }

    public void populateJtableWithMember(String query) {

        ArrayList<My_Classes.User> memberList = member.membersList(query);

        //jtable collums
        String[] colNames = {"ID", "Họ Tên", "Email", "Số ĐT", "Quê Quán", "Giới Tính","Role"};
        //jtable row
        Object[][] rows = new Object[memberList.size()][colNames.length];
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        for (int i = 0; i < memberList.size(); i++) {
            
            rows[i][0] = memberList.get(i).getId();
            rows[i][1] = memberList.get(i).getFullname();
            rows[i][2] = memberList.get(i).getEmail();
            rows[i][3] = memberList.get(i).getPhone();
           rows[i][4] = memberList.get(i).getCountry();
            if(func.checkGender(Integer.parseInt(memberList.get(i).getGender()))) {
                   rows[i][5] = "Nam";
            }
            else {
                    rows[i][5] = "Nữ";
            }
            rows[i][6] = memberList.get(i).getRole().toUpperCase();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Members_.setModel(model);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jLabel_MemberID = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_FullName = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Country = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Members_ = new javaswingdev.swing.table.Table();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(53, 53, 55));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("DANH SÁCH THANH TRA");
        jLabel_Form_Title.setOpaque(true);

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_MemberID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_MemberID.setText("Tìm kiếm theo tên:");

        jButton_Search.setBackground(new java.awt.Color(53, 53, 53));
        jButton_Search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(139, 180, 100));
        jButton_Search.setText("Tìm kiếm");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jLabel_Image1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_Image1.setOpaque(true);

        jLabel_FullName.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_FullName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FullName.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_FullName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_FullName.setText("Họ tên :");
        jLabel_FullName.setOpaque(true);

        jLabel_Phone.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Phone.setText("SĐT :");
        jLabel_Phone.setOpaque(true);

        jLabel_Gender.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Gender.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Gender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Gender.setText("Giới tính :");
        jLabel_Gender.setOpaque(true);

        jLabel_Email.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Email.setText("Email :");
        jLabel_Email.setOpaque(true);

        jLabel_Country.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Country.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Country.setForeground(new java.awt.Color(109, 180, 50));
        jLabel_Country.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Country.setText("Quê quán :");
        jLabel_Country.setOpaque(true);

        jTable_Members_.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_Members_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Members_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Members_);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_MemberID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_FullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jLabel_Country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_MemberID)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_FullName)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Phone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Email)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Gender)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Country))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        //search and display the data on the table
        String value = jTextField_Search.getText();
        String query = "SELECT * FROM `user` WHERE `tontai_khongtontai` = true AND `Role` = " + "'user'" + " AND `TenNguoiDung` LIKE '%" + value + "%' OR `TenNguoiDung` LIKE '%text%'";
        populateJtableWithMember(query);
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jTable_Members_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Members_MouseClicked
        // TODO add your handling code here:
         User selectedmMember;
        try {
            //search member by ID and print infor 
            Integer rowIndex = jTable_Members_.getSelectedRow();    //get the selected row index
            //get the member id from the jtable(the id is the first column [0] )
            Integer id = Integer.parseInt(jTable_Members_.getModel().getValueAt(rowIndex, 0).toString());

            selectedmMember = member.getMemberById(id);

            if (selectedmMember != null) {
                jLabel_FullName.setText("Họ tên : "+selectedmMember.getFullname());
                jLabel_Phone.setText("SĐT : "+selectedmMember.getPhone());
                jLabel_Email.setText("Email : "+selectedmMember.getEmail());
//                jLabel_Gender.setText("Giới Tính : "+selectedmMember.getGender());
                if(func.checkGender(Integer.parseInt(selectedmMember.getGender()))) {
                    jLabel_Gender.setText("Giới tính : Nam");
            }
            else {
                    jLabel_Gender.setText("Giới tính : Nữ");
            }
                jLabel_Country.setText("Quê quán : "+selectedmMember.getCountry());
                //display image:
                byte[] image = selectedmMember.getPicture();
                //we will display the image using the imagebyte
                //so we will made the image path null
                func.displayImage(237, 170, image, "", jLabel_Image1);
            } else {
                JOptionPane.showMessageDialog(null, "No Member With This ID Found", "invalid id member", 2);
            }

        } catch (SQLException | NumberFormatException ex) {
            //Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a valid Member ID", "invalid id member", 3);
        }
    }//GEN-LAST:event_jTable_Members_MouseClicked
   
    
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
    private javax.swing.JButton jButton_Search;
    private javax.swing.JLabel jLabel_Country;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_FullName;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_MemberID;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.table.Table jTable_Members_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
