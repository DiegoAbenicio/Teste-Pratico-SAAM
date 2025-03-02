/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.diego.testepraticosaam.view;

import com.diego.testepraticosaam.view.EmployeesListFrame;
import com.diego.testepraticosaam.model.Employees;
import com.diego.testepraticosaam.service.EmployeesService;
import com.diego.testepraticosaam.util.DataUtil;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Objects;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author diego
 */
public class EmployeesCreateFrame extends javax.swing.JFrame {
     
    private int idEmployees;
    
    public EmployeesCreateFrame(Employees employees) {
        initComponents();
        if(Objects.nonNull(employees)){
            setUpdateFrame(employees);
        }
    }
    
    private void setUpdateFrame(Employees employees){
        this.idEmployees = employees.getId();
        name.setText(employees.getName());
        remunaration.setText(String.valueOf(employees.getRemuneration()));
        if(employees.getStatus()){
            statusTrue.setSelected(true);
        } else {
            statusFalse.setSelected(true);
        }
        admissionDate.setText(DataUtil.formatDateToString(employees.getAdmissionDate()));
        titleText.setText("Atualizar funcionário:");
        saveButton.setText("ATUALIZAR");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        admissionDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        remunaration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        statusFalse = new javax.swing.JCheckBox();
        statusTrue = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);

        titleText.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        titleText.setForeground(new java.awt.Color(53, 81, 145));
        titleText.setText("Adicionar funcionário:");
        titleText.setToolTipText("");

        backButton.setBackground(new java.awt.Color(53, 81, 145));
        backButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("VOLTAR");
        backButton.setToolTipText("");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(53, 81, 145));
        saveButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("SALVAR");
        saveButton.setToolTipText("");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");
        jLabel4.setToolTipText("");

        try{
            MaskFormatter dateMask = new MaskFormatter("##/##/####");
            admissionDate = new JFormattedTextField(dateMask);
            admissionDate.addKeyListener(new KeyAdapter() {
                public void keyTyped(KeyEvent e) {
                    if (Character.isWhitespace(e.getKeyChar())) {
                        e.consume();
                    }
                }
            });
        } catch (ParseException e) {
            e.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Data de Admissão:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Status:");
        jLabel6.setToolTipText("");

        remunaration.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
                if (c == '.' && remunaration.getText().contains(".")) {
                    e.consume();
                }
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Valor do salário:");
        jLabel7.setToolTipText("");

        statusFalse.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(statusFalse);
        statusFalse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusFalse.setText("Falso");
        statusFalse.setToolTipText("");

        statusTrue.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(statusTrue);
        statusTrue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        statusTrue.setText("Verdadeiro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(admissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(statusTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(statusFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(remunaration, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remunaration, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(statusTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statusFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(122, 122, 122)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        EmployeesListFrame employessListFrame = new EmployeesListFrame();
        employessListFrame.setVisible(true);
        employessListFrame.pack();
        employessListFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(this.checkFields()){
            try{
                Employees employess = new Employees(name.getText(), statusTrue.isSelected(), new BigDecimal(remunaration.getText()), DataUtil.convertDate(admissionDate.getText().trim()));
                EmployeesService employessService = new EmployeesService();
                if(Objects.nonNull(this.idEmployees) && this.idEmployees != 0){
                    employess.setId(this.idEmployees);
                    String result = employessService.updateEmployee(employess);
                    if(result.trim().equals("Updated")){
                        JOptionPane.showMessageDialog(this, "Funcionário atualizado com sucesso!");
                    } 
                } else{
                    String result = employessService.createEmployee(employess);
                    if(result.trim().equals("Created")){
                        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
                    } 
                }
                cleanFields();
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Erro ao salvar funcionário: " + e.getMessage());
            }
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private Boolean checkFields(){
        if(name.getText().trim().equals("") || name.getText() == null){
            JOptionPane.showMessageDialog(this, "O campo de nome do funcionário não pode ser vazio");
            return false;
        } else if(remunaration.getText().trim().equals("") || remunaration.getText() == null){
            JOptionPane.showMessageDialog(this, "O campo de salário do funcionário não pode ser vazio");
            return false;
        } else if(buttonGroup1.getSelection() == null){
            JOptionPane.showMessageDialog(this, "Selecione o status do Funcionário");
            return false;
        } else if(DataUtil.invalidDate(admissionDate.getText().trim())){
            JOptionPane.showMessageDialog(this, "Porfavor insira uma data válida");
            return false;
        }
        return true;
    }
    
    private void cleanFields(){
        name.setText("");
        remunaration.setText("");
        admissionDate.setText("");
        buttonGroup1.clearSelection();
        if(Objects.nonNull(this.idEmployees) && this.idEmployees != 0){
            titleText.setText("Adicionar funcionário:");
            saveButton.setText("SALVAR");
            this.idEmployees = 0;
        }
    }
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesCreateFrame(null).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admissionDate;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField remunaration;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox statusFalse;
    private javax.swing.JCheckBox statusTrue;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
