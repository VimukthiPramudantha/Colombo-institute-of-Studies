/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interFaces;

import codes.UserClass;
import javax.swing.JOptionPane;

/**
 *
 * @author Vimukthi Pramudantha
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UserName1 = new javax.swing.JTextField();
        Age1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Adress1 = new javax.swing.JTextArea();
        UserID1 = new javax.swing.JTextField();
        UserPassword1 = new javax.swing.JPasswordField();
        ConfirmPassword1 = new javax.swing.JPasswordField();
        Designation = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Admin Page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Current Adress");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("User ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Designation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        UserName1.setToolTipText("Enter User Name");
        UserName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName1ActionPerformed(evt);
            }
        });
        jPanel1.add(UserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 260, -1));

        Age1.setToolTipText("Enter Age");
        jPanel1.add(Age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, -1));

        Adress1.setColumns(20);
        Adress1.setRows(5);
        Adress1.setToolTipText("Enter Adress");
        jScrollPane1.setViewportView(Adress1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 260, 50));

        UserID1.setToolTipText("Enter User ID");
        jPanel1.add(UserID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 260, -1));

        UserPassword1.setToolTipText("Enter Password");
        jPanel1.add(UserPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, -1));

        ConfirmPassword1.setToolTipText("Confirm Password");
        ConfirmPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPassword1ActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 260, -1));

        Designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designation ", "HR_Manager", "HR_Assistent" }));
        jPanel1.add(Designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 140, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        setSize(new java.awt.Dimension(657, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName = UserName1.getText();
        String age = Age1.getText();
        String adress = Adress1.getText();
        String userID = UserID1.getText();
        String password = UserPassword1.getText();
        String confirmUserPassword = ConfirmPassword1.getText();
        String designation = Designation.getSelectedItem().toString();
        
        if (userName.isEmpty()  || age.isEmpty() || adress.isEmpty() || userID.isEmpty() || password.isEmpty() || confirmUserPassword.isEmpty()|| designation.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Fileds cannot be empty when adding a new user.", "Add a new User ", JOptionPane.WARNING_MESSAGE);
            return;
        }
      if (password.length() < 5) {
            JOptionPane.showMessageDialog(rootPane, "Password cannot be less than 5 characters..", "Add a new User", JOptionPane.ERROR_MESSAGE);
            return;
        }
       if (!password.equals(confirmUserPassword)) {
            JOptionPane.showMessageDialog(rootPane, "Password and Confirm Password should match.", "Add a new User", JOptionPane.ERROR_MESSAGE);
            return;
        }
        UserClass user = new UserClass(userID, password, age, userName, age, adress, designation);
        if(user.addNewUser())
            JOptionPane.showMessageDialog(rootPane, "User added successfully.", "Add a new user", JOptionPane.INFORMATION_MESSAGE);
        else {
            JOptionPane.showMessageDialog(rootPane, "Something went wrong with the application. Will be fixing it soon.", "Add a new user", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     loginPage login = new loginPage();
     login.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ConfirmPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPassword1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adress1;
    private javax.swing.JTextField Age1;
    private javax.swing.JPasswordField ConfirmPassword1;
    private javax.swing.JComboBox<String> Designation;
    private javax.swing.JTextField UserID1;
    private javax.swing.JTextField UserName1;
    private javax.swing.JPasswordField UserPassword1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
