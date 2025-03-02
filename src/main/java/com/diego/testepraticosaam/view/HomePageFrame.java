/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.diego.testepraticosaam.view;

import com.diego.testepraticosaam.view.LoginFrame;
import com.diego.testepraticosaam.model.AuthenticatedUser;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class HomePageFrame extends javax.swing.JFrame {

    public HomePageFrame() {
        initComponents();
        recoverUserName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        employeesButton = new javax.swing.JButton();
        buttonUseless1 = new javax.swing.JButton();
        buttonUseless2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        employeesButton.setBackground(new java.awt.Color(53, 81, 145));
        employeesButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        employeesButton.setForeground(new java.awt.Color(255, 255, 255));
        employeesButton.setText("<html><center>Tela de<br>Funcionários</center></html>");
        employeesButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonActionPerformed(evt);
            }
        });

        buttonUseless1.setBackground(new java.awt.Color(53, 81, 145));
        buttonUseless1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonUseless1.setForeground(new java.awt.Color(255, 255, 255));
        buttonUseless1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonUseless1.setLabel("<html><center>Botão sem<br>Funcionalidade</center></html>");

        buttonUseless2.setBackground(new java.awt.Color(53, 81, 145));
        buttonUseless2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonUseless2.setForeground(new java.awt.Color(255, 255, 255));
        buttonUseless2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonUseless2.setLabel("<html><center>Botão sem<br>Funcionalidade</center></html>");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 81, 145));
        jLabel2.setText("Menu de ações:");
        jLabel2.setToolTipText("");

        userName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(53, 81, 145));
        userName.setToolTipText("");

        logoutButton.setIcon(new javax.swing.ImageIcon("D:\\Pessoal\\netbeans\\TestePraticoSAAM\\src\\main\\java\\com\\diego\\Images\\logout.png")); // NOI18N
        logoutButton.setBorderPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 81, 145));
        jLabel4.setText("Olá, ");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(employeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(buttonUseless1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(buttonUseless2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jLabel4)
                    .addContainerGap(929, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUseless1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUseless2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel4)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonActionPerformed
        EmployeesListFrame employessListFrame = new EmployeesListFrame();
        employessListFrame.setVisible(true);
        employessListFrame.pack();
        employessListFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_employeesButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente deslogar?", "Confirmação",JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            AuthenticatedUser.logout();
            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void recoverUserName(){
        userName.setText(AuthenticatedUser.getUsuario().getName());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonUseless1;
    private javax.swing.JButton buttonUseless2;
    private javax.swing.JButton employeesButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
