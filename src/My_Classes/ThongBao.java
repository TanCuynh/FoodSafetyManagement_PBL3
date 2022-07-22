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
public class ThongBao {

    private int id_thongbao;
    private int id_user;
    private String mota;
    private String ngaythemthongbao;

    public ThongBao() {
    }

    public ThongBao(int id_user, String mota, String ngaythenthongbao) {
        this.id_user = id_user;
        this.mota = mota;
        this.ngaythemthongbao = ngaythenthongbao;
    }

    

    public ThongBao(int id_thongbao, int id_user, String mota, String ngaythenthongbao) {
        this.id_thongbao = id_thongbao;
        this.id_user = id_user;
        this.mota = mota;
        this.ngaythemthongbao = ngaythenthongbao;
    }

    public int getId_thongbao() {
        return id_thongbao;
    }

    public void setId_thongbao(int id_thongbao) {
        this.id_thongbao = id_thongbao;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNgaythenthongbao() {
        return ngaythemthongbao;
    }

    public void setNgaythenthongbao(String ngaythenthongbao) {
        this.ngaythemthongbao = ngaythenthongbao;
    }

    public void addThongBao(int _User, String _mota, String _ngayaddTB) {
        String insertQuery = "INSERT INTO `thongbao`(`ID_User`, `MoTa`, `NgayThongBao`) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _User);
            ps.setString(2, _mota);
            ps.setString(3, _ngayaddTB);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "thong bao is added", "add TB", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã tạo thông báo!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "thong bao is not added", "add TB", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa tạo thông báo!");
                panel.showNotification();
            }

        } catch (SQLException e) {
            Logger.getLogger(ThongBao.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    public ArrayList<ThongBao> thongbaoList(String query) {
        ArrayList<ThongBao> TBList = new ArrayList<>();

        try {
            if (query.equals("")) {
                query = "SELECT * FROM `thongbao`";  //if the user empty String then use defaut select
            }

            ResultSet rs = func.getData(query);

            ThongBao thongbao;

            while (rs.next()) {
                thongbao = new ThongBao(rs.getInt("id_User"), rs.getString("MoTa"), rs.getString("NgayThongBao"));
                TBList.add(thongbao);
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(ThongBao.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return TBList;
    }

}
