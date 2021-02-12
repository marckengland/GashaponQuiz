
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class Main extends javax.swing.JFrame {

    /*File file = new File("C:\\");
    int ln;
    String Username,Password,Email;*/
    
    private static String username = new String("Username");
    private static String password = new String("Password");
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void onClickLogin() throws Exception {
		
		Main.username = user.getText();
		System.out.println("Username: " + Main.username);
		
		Main.password = pass.getText();
		System.out.println("Password: " + Main.password);
		
		DBConnection connectNow = new DBConnection();
		Connection connectDB = connectNow.getConnection();
		
		String verifyLogin = "SELECT * FROM gachaponacc WHERE user = '" + username + "' AND pass = '" + password + "'";
		
		try {
			Statement statement = connectDB.createStatement();
			ResultSet queryResult = statement.executeQuery(verifyLogin);
			
			if (queryResult.next()) {
				System.out.println("Login Successful!!");
                                this.dispose();
				new Home().setVisible(true); // -> Will call the...
					// switchScene method to switch the scene to dash board window.
			} else {
                                JOptionPane.showMessageDialog(null,"Invalid username or password!");
				System.out.println("Invalid Login");
			}
			
			System.out.println("Try!");
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			System.out.println("Exception!");
		}
		
	}
    
    /*void createFolder(){
        if(!file.exists()){
            file.mkdirs();
        }
    }
    
    void readFile(){
        try {
            FileReader fileRead = new FileReader(file+"\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fireWrite = new FileWriter(file+"\\logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    void login(String usr,String pswd){
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;i<ln;i+=4){System.out.println("count "+i);
            
                String forUser = accessFile.readLine().substring(9);
                String forPswd = accessFile.readLine().substring(9);
                if(usr.equals(forUser) & pswd.equals(forPswd)){
                    this.dispose();
                    new Home().setVisible(true);
                    break;
                }else if(i==(ln-3)){
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                    break;
                }
                // if you are using user & passwword without email
                // then dont forget to replace  k<=2 with k=2 below
                for(int k=1;k<=2;k++){
                    accessFile.readLine();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    
    void countLines(){
        try {
            ln=0;
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;accessFile.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerhere = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gachapon");
        setBackground(new java.awt.Color(153, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setToolTipText("");
        user.setName("user"); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, -1));

        pass.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));

        login.setBackground(new java.awt.Color(153, 204, 255));
        login.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Log In");
        login.setOpaque(true);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 30));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(pass);
        jLabel1.setText("Password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(user);
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        registerhere.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        registerhere.setForeground(new java.awt.Color(0, 102, 204));
        registerhere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerhere.setText("Register Now");
        registerhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerhereMouseClicked(evt);
            }
        });
        jPanel1.add(registerhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Log In");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        try {
            onClickLogin();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_userActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        /*createFolder();
            readFile();
            countLines();
            login(user.getText(), pass.getText());
            try{
            String sql = "SELECT * FROM gachaponacc WHERE user=? AND pass=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/gachapondb","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            rs=pst.executeQuery();
            if(rs.next()){
            this.dispose();
            new Home().setVisible(true);
            }
            else
            JOptionPane.showMessageDialog(null,"Invalid Credentials!");
            }
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            }*/
        try {
            onClickLogin();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginMouseClicked

    private void registerhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerhereMouseClicked
        this.dispose();
        new Registration().setVisible(true);
    }//GEN-LAST:event_registerhereMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        try {
            onClickLogin();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel registerhere;
    public static javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
