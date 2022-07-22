package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.Notification;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class quanly_chungnhan {
    private int id_qlcn;
    private int id_cn;
    private int id_user;
    private String dayadd;
    private String daydel;

    public quanly_chungnhan() {
    }

    public quanly_chungnhan(int id_qlcn, int id_cn, int id_user, String dayadd, String daydel) {
        this.id_qlcn = id_qlcn;
        this.id_cn = id_cn;
        this.id_user = id_user;
        this.dayadd = dayadd;
        this.daydel = daydel;
    }

    public int getId_qlcn() {
        return id_qlcn;
    }

    public void setId_qlcn(int id_qlcn) {
        this.id_qlcn = id_qlcn;
    }

    public int getId_cn() {
        return id_cn;
    }

    public void setId_cn(int id_cn) {
        this.id_cn = id_cn;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getDayadd() {
        return dayadd;
    }

    public void setDayadd(String dayadd) {
        this.dayadd = dayadd;
    }

    public String getDaydel() {
        return daydel;
    }

    public void setDaydel(String daydel) {
        this.daydel = daydel;
    }
    
    public void add_chungnhan(int _id_cn, int _id_user, String _dayadd) throws SQLException {
        String insertQuery = "INSERT INTO `quanly_chungnhan`(`ID_CN`, `ID_User`, `ngaycapCN`) VALUES ( ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id_cn);
            ps.setInt(2, _id_user);
            ps.setString(3, _dayadd);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            Logger.getLogger(quanly_chungnhan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void huy_chungnhan_mem(int _id_QLCN, String _dayhuy) throws SQLException {
        String insertQuery = "UPDATE quanly_chungnhan SET NgayHuyCN = ? WHERE ID_QLCN = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _dayhuy);
            ps.setInt(2, _id_QLCN);
            ps.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(quanly_chungnhan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
