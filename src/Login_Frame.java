import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Khushkuro
 */
public class Login_Frame extends javax.swing.JFrame {

    public Login_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_warning = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        text_password = new javax.swing.JPasswordField();
        btn_signup = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        lbl_show = new javax.swing.JLabel();
        lbl_hide = new javax.swing.JLabel();
        text_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MC Inventory Management System - Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_warning.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        text_warning.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(text_warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 230, 20));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MC Invertory Managment System");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));

        text_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(text_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 210, 40));
        getContentPane().add(text_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 210, 40));

        btn_signup.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 110, 40));

        btn_login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 110, 40));

        lbl_show.setForeground(new java.awt.Color(255, 255, 255));
        lbl_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show.png"))); // NOI18N
        lbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_showMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 50, 50));

        lbl_hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hide.png"))); // NOI18N
        lbl_hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hideMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 50, 50));

        text_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neon Background 2.jpg"))); // NOI18N
        getContentPane().add(text_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_usernameActionPerformed
    
    
//    public String get_username(){
//        String username = text_username.getText();
//        Main_Frame mf = new Main_Frame(username);
//        return username;
//    }
      
    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        new SignUp_Frame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_signupActionPerformed
    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        String username = text_username.getText();
        String password = text_password.getText();
                 
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mc_ims_db", "root", "1234");

            Statement statement = connection.createStatement();

            String query = "select username,password from login_table";

            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
                {
                    if(resultSet.getString("username").equalsIgnoreCase(username) && resultSet.getString("password").equalsIgnoreCase(password) )
                    {
                        JOptionPane.showMessageDialog(this, "Login successfully");
                        Main_Frame m_f = new Main_Frame();
                        m_f.lbl_show_username.setText(username);
                        m_f.setVisible(true);
                        
                        this.dispose();
                    }                  
                }
            
            text_warning.setText("Your Username or Password is incorrect!");        
              
            connection.close();         
        }
        
        catch(Exception mubeen){
            System.out.println(mubeen);
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void lbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_showMouseClicked
        lbl_hide.setVisible(true);
        lbl_show.setVisible(false);
        text_password.setEchoChar((char)0);
    }//GEN-LAST:event_lbl_showMouseClicked

    private void lbl_hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hideMouseClicked
        lbl_hide.setVisible(false);
        lbl_show.setVisible(true);
        text_password.setEchoChar('*');    
    }//GEN-LAST:event_lbl_hideMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_hide;
    private javax.swing.JLabel lbl_show;
    private javax.swing.JLabel text_image;
    private javax.swing.JPasswordField text_password;
    private javax.swing.JTextField text_username;
    private javax.swing.JLabel text_warning;
    // End of variables declaration//GEN-END:variables
}
