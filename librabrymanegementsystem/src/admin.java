
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class admin extends javax.swing.JFrame {
Connection con = null;
   Statement stmt = null;
   ResultSet rs = null;
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        con = databaseconnection.connection();
    }
    private void reset()
    {         
    id.setText("");
    username.setText("");
    password.setText("");
    email.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        submit1 = new javax.swing.JButton();
        homee = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        reset2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        search2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Admin form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 360, 30));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 360, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 360, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 360, 30));

        submit1.setBackground(new java.awt.Color(153, 204, 255));
        submit1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit1.setText("submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        getContentPane().add(submit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        homee.setText("Back");
        homee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeeActionPerformed(evt);
            }
        });
        getContentPane().add(homee, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, -1, -1));

        update2.setBackground(new java.awt.Color(153, 204, 255));
        update2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });
        getContentPane().add(update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        reset2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        getContentPane().add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, 20));

        delete2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete2.setText("Delete");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });
        getContentPane().add(delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        search2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search2.setText("Search");
        search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search2ActionPerformed(evt);
            }
        });
        getContentPane().add(search2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 5, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Admin ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("User name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 560));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Admin table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
          try
        {
        stmt = con.createStatement();
        
         int sId=Integer.parseInt(id.getText());
         String sUsername =username.getText();
String sPassword =password.getText();
String sEmail =email.getText();
    
                  
         
        String query ="INSERT INTO admin (id,username,password,email) VALUES (?,?,?,?)";
        PreparedStatement preparedStmt=con.prepareStatement(query);
        
        preparedStmt.setInt(1,sId);
        preparedStmt.setString(2,sUsername);
        preparedStmt.setString(3,sPassword);
        preparedStmt.setString(4,sEmail);
  
        preparedStmt.execute();
        JOptionPane.showMessageDialog(null,"ADDED");
        }
        catch (Exception e)
                {
                System.out.println(e);
                }
    }//GEN-LAST:event_submit1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void homeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home view = new home();
        view.setVisible(true);
    }//GEN-LAST:event_homeeActionPerformed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        // TODO add your handling code here:
        reset();

      
    }//GEN-LAST:event_reset2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
        try{
        
            stmt = con.createStatement();
        
         int sId=Integer.parseInt(id.getText());
         String sUsername =username.getText();
         String sPassword =password.getText();
         String sEmail =email.getText();
         
        String query ="UPDATE admin SET username= ?, password= ?,email= ? WHERE id=?";
        PreparedStatement preparedStmt=con.prepareStatement(query);
        
       
        preparedStmt.setString(1,sUsername);
        preparedStmt.setString(2,sPassword);
        preparedStmt.setString(3,sEmail);
        preparedStmt.setInt(4,sId);
        
        preparedStmt.executeUpdate();  
        JOptionPane.showMessageDialog(null,"UPDATED");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_update2ActionPerformed

    private void search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search2ActionPerformed
        // TODO add your handling code here:
        try
        {
               stmt = con.createStatement();
            
            int sId = Integer.parseInt(id.getText());
            
            String query = "SELECT * FROM admin";
            
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                if(sId == rs.getInt("id"))
                {

username.setText(rs.getString("username"));
password.setText(rs.getString("password"));
email.setText(rs.getString("email"));


                }
            }
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
    }//GEN-LAST:event_search2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        // TODO add your handling code here:
        try{
        
     stmt = con.createStatement();
            
            int sId = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM admin WHERE id ='"+sId+"' ";
            
            stmt.executeUpdate(query);
            
            reset();
            JOptionPane.showMessageDialog(null, "DELETED");
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
    }//GEN-LAST:event_delete2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            setVisible(false);
        alladmin view = new alladmin();
        view.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete2;
    private javax.swing.JTextField email;
    private javax.swing.JButton homee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password;
    private javax.swing.JButton reset2;
    private javax.swing.JButton search2;
    private javax.swing.JButton submit1;
    private javax.swing.JButton update2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
