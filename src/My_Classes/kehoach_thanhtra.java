package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class kehoach_thanhtra {

    private int id_kh_tt;
    private int id_user;
    private int id_ch;
    private String ngaythanhtra;
    private String mota;
    private String ketquathanhtra;

    public kehoach_thanhtra() {
    }

    public kehoach_thanhtra(int id_user, int id_ch, String ngaythanhtra, String mota, String ketquathanhtra) {
        this.id_user = id_user;
        this.id_ch = id_ch;
        this.ngaythanhtra = ngaythanhtra;
        this.mota = mota;
        this.ketquathanhtra = ketquathanhtra;
    }

    public kehoach_thanhtra(int id_kh_tt, int id_user, int id_ch, String ngaythanhtra, String mota, String ketquathanhtra) {
        this.id_kh_tt = id_kh_tt;
        this.id_user = id_user;
        this.id_ch = id_ch;
        this.ngaythanhtra = ngaythanhtra;
        this.mota = mota;
        this.ketquathanhtra = ketquathanhtra;
    }

    public int getId_kh_tt() {
        return id_kh_tt;
    }

    public void setId_kh_tt(int id_kh_tt) {
        this.id_kh_tt = id_kh_tt;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_ch() {
        return id_ch;
    }

    public void setId_ch(int id_ch) {
        this.id_ch = id_ch;
    }

    public String getNgaythanhtra() {
        return ngaythanhtra;
    }

    public void setNgaythanhtra(String ngaythanhtra) {
        this.ngaythanhtra = ngaythanhtra;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getKetquathanhtra() {
        return ketquathanhtra;
    }

    public void setKetquathanhtra(String ketquathanhtra) {
        this.ketquathanhtra = ketquathanhtra;
    }

    public void add_kehoach_thanhtra(int _id_user, int _id_CH, String _dayTT, String _moTa) throws SQLException {
        String insertQuery = "INSERT INTO `kehoach_thanhtra`(`ID_User`, `ID_CH`, `NgayThanhTra`, `MoTa`) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id_user);
            ps.setInt(2, _id_CH);
            ps.setString(3, _dayTT);
            ps.setString(4, _moTa);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "update dtb", "tao ke hoach thanh tra thanh cong", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã tạo kế hoạch thanh tra!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "not update dtb", "tao ke hoach thanh tra khong thanh cong", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa tạo kế hoạch thanh tra!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(kehoach_thanhtra.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<kehoach_thanhtra> kehoachTTList() {
        ArrayList<kehoach_thanhtra> khttlist = new ArrayList<>();

        My_Classes.Func_Class func = new Func_Class();

        try {
            ResultSet rs = func.getData("SELECT * FROM `kehoach_thanhtra`");

            kehoach_thanhtra kh;

            while (rs.next()) {
                kh = new kehoach_thanhtra(rs.getInt("ID_KH_TT"), rs.getInt("ID_User"), rs.getInt("ID_CH"), rs.getString("NgayThanhTra"), rs.getString("MoTa"), rs.getString("KetQuaThanhTra"));
                khttlist.add(kh);
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(CuaHang.class.getName()).log(Level.SEVERE, null, sQLException);
            JOptionPane.showMessageDialog(null, sQLException.getMessage(), "SOMETHING WENT WRONG", 1);
        }
        return khttlist;
    }

    public void edit_KeHoachThanhTra(int _id_user, int _id_CH, String _dayTT, String _MoTathanhtra, int _ID_KHTT) throws SQLException {
        String insertQuery = "UPDATE `kehoach_thanhtra` SET `MoTa` = ?, `NgayThanhTra` = ?, `Id_User` = ?, `ID_CH` = ? WHERE `ID_KH_TT` = ?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _MoTathanhtra);
            ps.setString(2, _dayTT);
            ps.setInt(3, _id_user);
            ps.setInt(4, _id_CH);
            ps.setInt(5, _ID_KHTT);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "update dtb", "chinh sua ket qua thanh tra thanh cong", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã chỉnh sửa kế hoạch thanh tra!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "not update dtb", "chinh sua ket qua thanh tra khong thanh cong", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa chỉnh sửa kế hoạch thanh tra!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(kehoach_thanhtra.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void Edit_KetQuaThanhTra(int _id_user, int _id_CH, String _dayTT, String _ketqua, int _id_khtt) throws SQLException {
        String insertQuery = "UPDATE `kehoach_thanhtra` SET `KetQuaThanhTra` = ?, `NgayThanhTra` = ?, `Id_User` = ?, `ID_CH` = ? WHERE `ID_KH_TT` = ?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _ketqua);
            ps.setString(2, _dayTT);
            ps.setInt(3, _id_user);
            ps.setInt(4, _id_CH);
            ps.setInt(5, _id_khtt);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "update dtb", "chinh sua ket qua thanh tra thanh cong", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Chỉnh sửa kế hoạch thanh tra thành công!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "not update dtb", "chinh sua ket qua thanh tra khong thanh cong", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chỉnh sửa kế hoạch thanh tra không thành công!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(kehoach_thanhtra.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
