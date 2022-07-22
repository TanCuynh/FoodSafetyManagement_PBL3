package My_Classes;

import java.io.InputStream;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class User {

    private int Id;
    private String fullName;
    private String country;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;
    private String role;
    private String taikhoan;
    private String matkhau;
    private String address;

    public User() {
    }

    public User(int id, String fullName, String country, String phone, String email, String gender, byte[] picture, String role) {
        this.Id = id;
        this.fullName = fullName;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
        this.role = role;
        
    }
    
    public User( String fullName,byte[] picture) {
        this.fullName = fullName;
        this.picture = picture;
    }

    public User(int id, String fullName, String country, String phone, String email, String gender, byte[] picture, String role, String taikhoan, String matkhau, String address) {
        this.Id = id;
        this.fullName = fullName;
        this.country = country;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.picture = picture;
        this.role = role;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id) {
        this.Id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMaukhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void addMember(String _fullName, String _country, String _phone, String _email, int _gender, byte[] _profileImg, String taikhoan, String matkhau, String addess, String dayTaoTK) throws SQLException {
        String insertQuery = "INSERT INTO `user`(`TenNguoiDung`, `QueQuan`, `SoDienThoai`, `Email`, `GioiTinh`, `Profile`, `TaiKhoan`, `MatKhau`, `DiaChi`, `NgayTaoTK`, `Role`, `tontai_khongtontai`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, true )";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            Date date = new Date();
            ps.setString(1, _fullName);
            ps.setString(2, _country);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setInt(5, _gender);
            ps.setBytes(6, _profileImg);
            ps.setString(7, taikhoan);
            ps.setString(8, matkhau);
            ps.setString(9, addess);
            ps.setString(10, dayTaoTK);
            ps.setString(11, "user");
            
            if (ps.executeUpdate() == 1) {
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã thêm thanh tra!");
                panel.showNotification();
            } else {
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Thanh tra không được thêm!");
                panel.showNotification();
            }

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Tài Khoản đã được sử dụng", "Lỗi Tài Khoản", 0);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Email hoặc SĐT đã có người đăng kí!");
            panel.showNotification();
        }
    }
    
    
    
    
    public User getMemberByTaiKhoan_BiXoa(String _taiKhoan) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM user WHERE tontai_khongtontai = false AND TaiKhoan = '" + _taiKhoan + "'";
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return new User(rs.getInt(1), rs.getString(2), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(9), rs.getBytes(13), rs.getString(14), rs.getString(3), rs.getString(4), rs.getString(7));
        } else {
            return null;
        }
    }

    public void editMember(Integer _id, String _fullName, String _email, String _phone, String _country, Integer _gender, byte[] _profileImg, String matkhau, String role) throws SQLException {
        String insertQuery = "UPDATE user SET TenNguoiDung= ?,QueQuan= ?,SoDienThoai= ?,Email= ?,GioiTinh= ?, Profile = ?, MatKhau = ?, Role = ? WHERE ID_User = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _fullName);
            ps.setString(2, _country);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setInt(5, _gender);
            ps.setBytes(6, _profileImg);
            ps.setString(7, matkhau);
            ps.setString(8, role);
            ps.setInt(9, _id);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "User Đã Được Sửa", "Sửa Người Dùng", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã sửa thông tin thanh tra!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "User Chưa Được Sửa", "Sửa Người Dùng", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Thông tin thanh tra chưa được sửa!");
                panel.showNotification();
            }

        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Email hoặc SĐT đã có người đăng kí", "Lỗi đăng kí tài khoản", 0);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Email hoặc SĐT đã có người đăng kí!");
            panel.showNotification();
        }
    }

   public void deleteMember(int _id, String _dayHuy) throws SQLException {
        String insertQuery = "UPDATE `user` SET `NgayHuyTK` = ?, `tontai_khongtontai` = false WHERE `id_user` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _dayHuy);
            ps.setInt(2, _id);

            if (ps.executeUpdate() == 1) {
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Thanh tra đã được xóa!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "Thanh tra chưa được xóa", "Xóa Thanh Tra", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Không tìm thấy tài khoản của thanh tra cần xóa!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public User getMemberById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM `user` WHERE `tontai_khongtontai` = true AND `role` = 'user' AND `id_user` = " + _id;
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return new User(rs.getInt(1), rs.getString(2), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(9), rs.getBytes(13), rs.getString(14), rs.getString(3), rs.getString(4), rs.getString(7));
        } else {
            return null;
        }
    }
    
    public byte[] getPictureOfMember(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT `profile` FROM `user` WHERE `tontai_khongtontai` = true AND `id_user` = " + _id;
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return  rs.getBytes("profile");
        } else {
            return null;
        }
    }
    
    public User getMemberByIdInCaNhanFrame(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM `user` WHERE `tontai_khongtontai` = true AND `id_user` = " + _id;
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return new User(rs.getInt(1), rs.getString(2), rs.getString(8), rs.getString(5), rs.getString(6), rs.getString(9), rs.getBytes(13), rs.getString(14), rs.getString(3), rs.getString(4), rs.getString(7));
        } else {
            return null;
        }
    }
    

    public void updateAvatarMember(int _id, InputStream ad) throws SQLException {
        String insertQuery = "UPDATE `user` SET `Profile` = ? WHERE `ID_User` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setBinaryStream(1, ad);
            ps.setInt(2, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Avatar Đã Được Thêm", "Cap Nhat AVT", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Avatar Không Được Thêm", "Cap Nhat AVT", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<User> membersList(String query) {
        ArrayList<User> memLists = new ArrayList<>();
        My_Classes.Func_Class func = new Func_Class();

        try {
            if (query.equals("")) {

                query = "SElect * FROM `user` where `tontai_khongtontai` = true AND `Role` = " + "'user'";
            }
            ResultSet rs = func.getData(query);

            User member;
            while (rs.next()) {
                member = new User(rs.getInt("ID_User"), rs.getString("TenNguoiDung"), rs.getString("QueQuan"),
                        rs.getString("SoDienThoai"), rs.getString("Email"), rs.getString("GioiTinh"), rs.getBytes("profile"), rs.getString("Role"));
                memLists.add(member);
            }
        } catch (SQLException sQLException) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return memLists;
    }
}
