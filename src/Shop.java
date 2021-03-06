
import java.awt.Color;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class Shop extends javax.swing.JFrame {

    /**
     * Creates new form Gacha
     */
    public Shop() {
        initComponents();
        setLocationRelativeTo(null);
        
        int token = Integer.parseInt(Home.tokens.getText());
        tokens.setText(""+token);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tokens = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        topup2 = new javax.swing.JLabel();
        topup1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        shopLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gashapon Quiz");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tokens.setBackground(new java.awt.Color(0, 0, 0));
        tokens.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        tokens.setForeground(new java.awt.Color(255, 255, 255));
        tokens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tokens.setText("0");
        getContentPane().add(tokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 70, -1));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/tokens.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topup2.setBackground(new java.awt.Color(0, 0, 0));
        topup2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        topup2.setForeground(new java.awt.Color(255, 255, 255));
        topup2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Shop/2.png"))); // NOI18N
        topup2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topup2MouseClicked(evt);
            }
        });
        jPanel1.add(topup2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 630, 140));

        topup1.setBackground(new java.awt.Color(0, 0, 0));
        topup1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        topup1.setForeground(new java.awt.Color(255, 255, 255));
        topup1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Shop/1.png"))); // NOI18N
        topup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topup1MouseClicked(evt);
            }
        });
        jPanel1.add(topup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 630, 140));

        back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Back button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        shopLabel.setBackground(new java.awt.Color(0, 0, 0));
        shopLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        shopLabel.setForeground(new java.awt.Color(255, 255, 255));
        shopLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shopLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Shop/shop.png"))); // NOI18N
        shopLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopLabelMouseClicked(evt);
            }
        });
        jPanel1.add(shopLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 270, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Shop/BG.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shopLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_shopLabelMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void topup2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topup2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_topup2MouseClicked

    private void topup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topup1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_topup1MouseClicked

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
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and dcurrencythe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gacha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel shopLabel;
    public static javax.swing.JLabel tokens;
    private javax.swing.JLabel topup1;
    private javax.swing.JLabel topup2;
    // End of variables declaration//GEN-END:variables
}
