package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class Book {

    private String isbn;
    private String name;
    private Integer author_id;
    private Integer genre_id;
    private Integer quanlity;
    private String publisher;
    private double price;
    private String date_received;
    private String description;
    private byte[] cover;

    public Book() {
    }

    public Book(String isbn, String name, Integer author_id, Integer genre_id, Integer quanlity, String publisher, double price, String date_received, String description, byte[] cover) {
        this.isbn = isbn;
        this.name = name;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.quanlity = quanlity;
        this.publisher = publisher;
        this.price = price;
        this.date_received = date_received;
        this.description = description;
        this.cover = cover;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_received() {
        return date_received;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(Integer quanlity) {
        this.quanlity = quanlity;
    }

    public void addBook(String _isbn, String _name, Integer _author_id, Integer _genre_id, Integer _quanlity, String _publisher, double _price, String _date_received, String _description, byte[] _cover) throws SQLException {
        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quanlity`, `publisher`, `price`, `date_received`, `description`, `cover_image`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setInt(3, _author_id);
            ps.setInt(4, _genre_id);
            ps.setInt(5, _quanlity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
            ps.setString(8, _date_received);
            ps.setString(9, _description);
            ps.setBytes(10, _cover);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Book is added", "add book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book is not added", "add book", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void editBook(Integer _isbn, String _name, Integer _author_id, Integer _genre_id, Integer _quanlity, String _publisher, double _price, String _date_received, String _description, byte[] _cover) throws SQLException {
        String insertQuery = "UPDATE `books` SET `name`= ?,`author_id`= ?,`genre_id`= ?,`publisher`= ?,`price`= ?,`date_received`= ?,`description`= ?,`cover_image`= ? WHERE `isbn` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _name);
            ps.setInt(2, _author_id);
            ps.setInt(3, _genre_id);
            ps.setInt(4, _quanlity);
            ps.setString(5, _publisher);
            ps.setDouble(6, _price);
            ps.setString(7, _date_received);
            ps.setString(8, _description);
            ps.setBytes(9, _cover);
            ps.setInt(10, _isbn);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Book is edited", "edit book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book is not edit", "edit book", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void deleteBook(Integer _isbn) throws SQLException {
        String insertQuery = "DELETE FROM `books` WHERE `isbn` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _isbn);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Book is deleted", "delete book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book is not deleted", "delete book", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public boolean isISBNexists(String _isbn) throws SQLException {
        String query = "SELECT * FROM `books` WHERE `isbn` = '" + _isbn + "'";
        Func_Class func = new Func_Class();
        func.getData(query);
        ResultSet rs = func.getData(query);
        try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException sQLException) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return true;
    }

}
