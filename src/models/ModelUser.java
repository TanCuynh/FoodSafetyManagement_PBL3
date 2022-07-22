package models;

import javax.swing.Icon;
import java.util.Date;

public class ModelUser {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Icon getProfile() {
        return profile;
    }

    public void setProfile(Icon profile) {
        this.profile = profile;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ModelUser(int userID, String userName, Icon profile,String email,String soDienThoai,String diaChi,String queQuan,String gioiTinh, String role) {
        this.userID = userID;
        this.userName = userName;
        this.profile = profile;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
//        this.ngaySinh = ngaySinh;
        this.role = role;

    }
    public ModelUser( String userName,Icon profile) {
        this.userName = userName;
        this.profile = profile;
    }
    public ModelUser() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

//    public Date getNgaySinh() {
//        return ngaySinh;
//    }
//
//    public void setNgaySinh(Date ngaySinh) {
//        this.ngaySinh = ngaySinh;
//    }

    private int userID;
    private String userName;
    private Icon profile;
    private String email;
    private String soDienThoai;
    private String diaChi;
    private String queQuan;
    private String gioiTinh;
    private String role;
//    private Date ngaySinh;
}
