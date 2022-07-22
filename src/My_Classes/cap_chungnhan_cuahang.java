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
public class cap_chungnhan_cuahang {

    private int id_user;
    private int id_CH;
    private int id_CN;
    private String issue_date;
    private String return_date;
    private String mota;
    private String trangthaichungnhan;  //da cap,bi thu hoi, het han

    public cap_chungnhan_cuahang() {
    }

    public cap_chungnhan_cuahang(int id_user, int id_CH, int id_CN, String issue_date, String return_date, String mota, String trangthaichungnhan) {
        this.id_user = id_user;
        this.id_CH = id_CH;
        this.id_CN = id_CN;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.mota = mota;
        this.trangthaichungnhan = trangthaichungnhan;
    }

    public cap_chungnhan_cuahang(int id_CH, int id_CN, String issue_date, String return_date, String mota, String trangthaichungnhan) {
        this.id_CH = id_CH;
        this.id_CN = id_CN;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.mota = mota;
        this.trangthaichungnhan = trangthaichungnhan;
    }

    public int getId_CN() {
        return id_CN;
    }

    public void setId_CN(int id_CN) {
        this.id_CN = id_CN;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_CH() {
        return id_CH;
    }

    public void setId_CH(int id_CH) {
        this.id_CH = id_CH;
    }

    public String getTrangthaichungnhan() {
        return trangthaichungnhan;
    }

    public void setTrangthaichungnhan(String trangthaichungnhan) {
        this.trangthaichungnhan = trangthaichungnhan;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    My_Classes.Book book = new My_Classes.Book();

    public boolean capChungNhan(int idChungNhan, int idCuaHang, String ngayCap, String ngayHuy, String _mota) throws SQLException {
        String query = "SELECT `ID_CN` FROM `cap_chungnhan` where `tontai_khongtontai` = true AND `ID_CH` = " + idCuaHang;
        ArrayList<Integer> list_IDCN = new ArrayList<>();
        Func_Class func = new Func_Class();
        ResultSet rs = func.getData(query);
        String TrangThaiCHungNhan = "";

        while (rs.next()) {
            list_IDCN.add(rs.getInt("ID_CN"));
        }
//        System.out.print(list_IDCN);

        String query2 = "SELECT `trangthaichungnhan` FROM `cap_chungnhan` where `ID_CH` = '" + idCuaHang + "' AND `ID_CN` = '" + idChungNhan + "'";
        ResultSet rs2 = func.getData(query2);

        while (rs2.next()) {
            TrangThaiCHungNhan = rs2.getString("trangthaichungnhan");
        }
//        System.out.println(TrangThaiCHungNhan);

        if (list_IDCN.contains(idChungNhan) && TrangThaiCHungNhan.equalsIgnoreCase("Đã Thu Hồi CN")) {
            // suawr lai status la dang cap'
            String updateQuery = "UPDATE cap_chungnhan SET trangthaichungnhan = ?, NgayCapCN = ?, NgayThuHoiCN = ? ,MoTa = ? WHERE ID_CH = " + idCuaHang + " AND ID_CN = " + idChungNhan;
            PreparedStatement ps1 = DB.getConnection().prepareStatement(updateQuery);

            ps1.setString(1, "Đang Cấp");
            ps1.setString(2, ngayCap);
            ps1.setString(3, ngayHuy);
            ps1.setString(4, _mota);

            if (ps1.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "Cap Nhat Thanh Cong", "Cap Chung Nhan Cho Cua Hang", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã cấp chứng nhận cho cửa hàng!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "Cap Nhat Khong Thanh Cong", "Cap Chung Nhan Cho Cua Hang", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa cấp chứng nhận cho cửa hàng!");
                panel.showNotification();
            }
        } else if (!list_IDCN.contains(idChungNhan)) {
            // tao ra 1 chung nhan moi cho cua hang 
            String insertQuery = "INSERT INTO `cap_chungnhan`(`ID_CH`, `ID_CN`, `NgayCapCN`, `NgayThuHoiCN`, `MoTa`, `TrangThaiChungNhan` ,`tontai_khongtontai`) VALUES ( ?, ?, ?, ?, ?, 'Đang Cấp' ,true)";
            try {

                PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

                ps.setInt(1, idCuaHang);
                ps.setInt(2, idChungNhan);
                ps.setString(3, ngayCap);
                ps.setString(4, ngayHuy);
                ps.setString(5, _mota);

                if (ps.executeUpdate() == 1) {
                    //JOptionPane.showMessageDialog(null, "Chứng Nhận Đã Được Cấp", "Cấp chứng nhận", 1);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã cấp chứng nhận cho cửa hàng!");
                    panel.showNotification();
                } else {
                    //JOptionPane.showMessageDialog(null, "Chứng nhận chưa được cấp , đã có lỗi gì đó xảy ra", "Cấp chứng nhận", 0);
                    Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa cấp chứng nhận cho cửa hàng!");
                    panel.showNotification();
                    return false;
                }
            } catch (SQLException e) {
                Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "Chứng nhận này đã từng được cấp cho cửa hàng này , vui lòng chọn chứng nhận khác !", "Cấp chứng nhận", 0);
            Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chứng nhận đã từng được cấp cho cửa hàng này!");
            panel.showNotification();
            return false;
        }
        return true;
    }

    //func to populate an arraylist with issued/ retruned/ losted book
    public ArrayList<cap_chungnhan_cuahang> chungnhan_cuahang_List(String _status) {

        ArrayList<cap_chungnhan_cuahang> chungnhan_cuahang = new ArrayList<>();
        Func_Class func = new Func_Class();
        String query;

        if (_status.equals("")) {    //if the status emmty then show all data
            query = "SELECT ID_CN, ID_CH, NgayCapCN, NgayThuHoiCN, MoTa, TrangThaiChungNhan FROM cap_chungnhan WHERE `tontai_khongtontai` = true";
        } else {                    //show data depending on the selected status
            query = "SELECT ID_CN, ID_CH, NgayCapCN, NgayThuHoiCN, MoTa, TrangThaiChungNhan FROM `cap_chungnhan` WHERE `tontai_khongtontai` = true AND `TrangThaiChungNhan` = '" + _status + "'";
        }

        try {
            ResultSet rs = func.getData(query);

            cap_chungnhan_cuahang capCN;

            while (rs.next()) {
                capCN = new cap_chungnhan_cuahang(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                chungnhan_cuahang.add(capCN);
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return chungnhan_cuahang;
    }

    public void update_TrangThaiChungNhan(int _id_CH, int _ID_CN, String _trangthaiCN, String _date_return, String _mota) throws SQLException {
        String updateQuery = "UPDATE `cap_chungnhan` SET `TrangThaiChungNhan`= ?, `NgayThuHoiCN`= ?, `MoTa`=? WHERE `ID_CH` = ? AND `ID_CN` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);

            ps.setString(1, _trangthaiCN);
            ps.setString(2, _date_return);
            ps.setString(3, _mota);
            ps.setInt(4, _id_CH);
            ps.setInt(5, _ID_CN);

            if (ps.executeUpdate() == 1) {
                //JOptionPane.showMessageDialog(null, "Status update", "Cap Chung Nhan Cho Cua Hang", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Đã thu hồi chứng nhận từ cửa hàng!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "Status update is not update", "Cap Chung Nhan Cho Cua Hang", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chưa thu hồi chứng nhận!");
                panel.showNotification();
            }          
        } catch (SQLException e) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //remove issue book using the book id - member id and issue date
    //you can add a collum id (make it as the key) into the table and delete using it
    public void deleteChungNhan_CuaHang_Table_Soft(int _ID_CH) {
        String removeQuery = "UPDATE cap_chungnhan SET tontai_khongtontai = false WHERE ID_CH = ?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _ID_CH);

            if (ps.executeUpdate() != 0) {
                //JOptionPane.showMessageDialog(null, "Deleted Successfully", "delete book", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Chứng nhận ATTP đã được thu hồi!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "Not Deleted", "delete book", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chứng nhận chưa được thu hồi!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public void deleteChungNhan_ChungNhan_Table_Soft(int _ID_CN) {
        String removeQuery = "UPDATE cap_chungnhan SET tontai_khongtontai = false WHERE ID_CN = ?";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _ID_CN);

            if (ps.executeUpdate() != 0) {
                //JOptionPane.showMessageDialog(null, "Deleted Successfully", "delete book", 1);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, "Chứng nhận ATTP đã được thu hồi!");
                panel.showNotification();
            } else {
                //JOptionPane.showMessageDialog(null, "Not Deleted", "delete book", 0);
                Notification panel = new Notification(javaswingdev.main.Main.getMain(), Notification.Type.WARNING, Notification.Location.BOTTOM_RIGHT, "Chứng nhận chưa được thu hồi!");
                panel.showNotification();
            }
        } catch (SQLException e) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
