package components;

import models.ModelUser;
import connectionDB.DatabaseConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Path2D;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import javaswingdev.main.Main; 


     
public class PanelSlide extends javax.swing.JLayeredPane {

    public void setFram(JFrame fram) {
        this.fram = fram;
    }
    
    private final Animator animator;
    private float animate = 1f;
    private boolean slideLeft;
    private final PanelLogin login;
    private final PanelLoading loading;
    private ModelUser modelUserLogin;
    private Thread th;
    private MigLayout layout;
    private JFrame fram;

    public PanelSlide() {
        initComponents();
        setPreferredSize(new Dimension(350, 450));
        layout = new MigLayout("inset 0", "[fill]", "[fill]");
        setLayout(layout);
        login = new PanelLogin();
        loading = new PanelLoading();
        loading.setVisible(false);
        Color color = new Color(67, 99, 132);
        setBackground(color);
        loading.setBackground(color);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                if (slideLeft) {
                    loading.setVisible(true);
                } else {
                    login.setVisible(true);
                }
            }

            @Override
            public void timingEvent(float fraction) {
                double width = getWidth();
                animate = fraction;
                float a = easeOutQuint(fraction);
                int x = (int) (a * width);
                loading.setAnimate(slideLeft, fraction);
                layout.setComponentConstraints(loading, "pos " + x + " 0 100% 100%");
                revalidate();
                repaint();
            }

            @Override
            public void end() {
                if (slideLeft) {
                    login.setVisible(false);
                } else {
                    loading.setVisible(false);
                    loading.reset();
                }
            }
        };
        animator = new Animator(1000, target);
        animator.setResolution(0);
        add(loading, " pos 0 0 0 0, w 0!");
        add(login);
        login.addEventLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    if (login.checkUser()) {
                        showSlide(true);
                        login(login.getUserName(), login.getPassword());
                    }
                }
            }
        });
        loading.addEventContinue(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                DashBoardForm dbFrame = new DashBoardForm(modelUserLogin);
                    javaswingdev.main.Main main = null;
                try {
                    main = new javaswingdev.main.Main(modelUserLogin);
                } catch (java.sql.SQLException ex) {
                    Logger.getLogger(PanelSlide.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                    main.setVisible(true);
//                main.setData(loading.getData());
                //  Close login form
                fram.dispose();
            }
        });
        loading.addEventBack(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    th.interrupt();
                    showSlide(false);
                }
            }
        });
    }

    public void showSlide(boolean show) {
        slideLeft = show;
        animator.start();
    }

    private void login(String userName, String password) {
        th = new Thread(new Runnable() {
            @Override
            public void run() {
               try {
                    Thread.sleep(2000);

                    PreparedStatement p = handlePrepareStatment(userName, password);
                    ResultSet r = p.executeQuery();
                    if (r.next()) {
                        loading.doneLogin(generateModelUser(r));
                    } else {
                        loading.showError("User and Password Incorrect");
                    }

                    r.close();
                    p.close();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    loading.showError("Error Server" + e);
                }
            }
        });
        th.start();
    }

    private ImageIcon getProfile(ResultSet r) throws SQLException, java.sql.SQLException  {
         if (r.getObject("Profile") != null) {
                            return new ImageIcon(r.getBytes("Profile"));
                       } else {
                   return new ImageIcon(getClass().getResource("/com/raven/icon/user.png"));
                        }
    }

    private PreparedStatement handlePrepareStatment(String userName, String password) throws SQLException, java.sql.SQLException  {
        String sql = "select * from user where TaiKhoan=? and MatKhau=? and tontai_khongtontai=true LIMIT 1";
        PreparedStatement p = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
        p.setString(1, userName);
        p.setString(2, password);

        return p;
    }

     private ModelUser generateModelUser(ResultSet r) throws SQLException, java.sql.SQLException  {
        int id = r.getInt("ID_User");
        String user = r.getString("TenNguoiDung");
        String email = r.getString("Email");
        String diaChi = r.getString("DiaChi");
        String queQuan = r.getString("QueQuan");
        String gioiTinh = r.getString("GioiTinh");
        String soDienThoai = r.getString("SoDienThoai");
        String role = r.getString("Role");

       
        Icon profile = getProfile(r);
        modelUserLogin = new ModelUser(id, user, profile,email, soDienThoai,diaChi,queQuan,gioiTinh , role);
        return new ModelUser(id, user, profile,email, soDienThoai,diaChi,queQuan,gioiTinh ,role);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        if (slideLeft == false) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            float x = easeOutQuint(animate) * width;
            float y = 0;
            int centerY = height / 2;
            Path2D.Float p = new Path2D.Float();
            p.moveTo(x, y);
            p.lineTo(x, height);
            p.curveTo(x, height, easeOutBounce(animate) * width, centerY, x, y);
            g2.setColor(getBackground());
            g2.fill(p);
            g2.dispose();
        }
    }

    private float easeOutBounce(float x) {
        float n1 = 7.5625f;
        float d1 = 2.75f;
        double v;
        if (x < 1 / d1) {
            v = n1 * x * x;
        } else if (x < 2 / d1) {
            v = n1 * (x -= 1.5 / d1) * x + 0.75;
        } else if (x < 2.5 / d1) {
            v = n1 * (x -= 2.25 / d1) * x + 0.9375;
        } else {
            v = n1 * (x -= 2.625 / d1) * x + 0.984375;
        }
        if (slideLeft) {
            return (float) (1f - v);
        } else {
            return (float) v;
        }
    }

    private float easeOutQuint(float x) {
        double v = 1 - Math.pow(1 - x, 5);
        if (slideLeft) {
            return (float) (1f - v);
        } else {
            return (float) v;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
