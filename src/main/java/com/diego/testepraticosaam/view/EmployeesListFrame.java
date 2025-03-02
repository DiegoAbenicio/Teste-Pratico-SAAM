package com.diego.testepraticosaam.view;

import com.diego.testepraticosaam.controller.EmployeesController;
import com.diego.testepraticosaam.model.Employees;
import com.diego.testepraticosaam.util.DataUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class EmployeesListFrame extends javax.swing.JFrame {

    public EmployeesListFrame() {
        initComponents();
        paginationInitializer();
    }
    
    private void paginationInitializer(){
        EmployeesController employeesController = new EmployeesController();
        pagination.setText("1");
        maxPagination.setText(employeesController.returnTotalElements());
        loadDate();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        updateEmployees = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        pagination = new javax.swing.JLabel();
        previousPage = new javax.swing.JButton();
        nextPage = new javax.swing.JButton();
        maxPagination = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addEmployees = new javax.swing.JButton();
        deleteEmployees = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 578));

        jTable1.setBackground(new java.awt.Color(53, 81, 145));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data de admissão", "Valor do Salário", "Status", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setInheritsPopupMenu(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(20, 10));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(141, 171, 240));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 81, 145));
        jLabel3.setText("Lista de Funcionários:");
        jLabel3.setToolTipText("");

        updateEmployees.setBackground(new java.awt.Color(53, 81, 145));
        updateEmployees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateEmployees.setForeground(new java.awt.Color(255, 255, 255));
        updateEmployees.setText("ATUALIZAR FUNCIONÁRIO");
        updateEmployees.setToolTipText("");
        updateEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeesActionPerformed(evt);
            }
        });

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

        pagination.setBackground(new java.awt.Color(255, 255, 255));
        pagination.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagination.setText("0");
        pagination.setToolTipText("");
        pagination.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        previousPage.setBackground(new java.awt.Color(53, 81, 145));
        previousPage.setForeground(new java.awt.Color(255, 255, 255));
        previousPage.setText("<");
        previousPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageActionPerformed(evt);
            }
        });

        nextPage.setBackground(new java.awt.Color(53, 81, 145));
        nextPage.setForeground(new java.awt.Color(255, 255, 255));
        nextPage.setText(">");
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        maxPagination.setBackground(new java.awt.Color(255, 255, 255));
        maxPagination.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxPagination.setText("0");
        maxPagination.setToolTipText("");
        maxPagination.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("de");

        addEmployees.setBackground(new java.awt.Color(53, 81, 145));
        addEmployees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addEmployees.setForeground(new java.awt.Color(255, 255, 255));
        addEmployees.setText("ADICIONAR FUNCIONÁRIO");
        addEmployees.setToolTipText("");
        addEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeesActionPerformed(evt);
            }
        });

        deleteEmployees.setBackground(new java.awt.Color(53, 81, 145));
        deleteEmployees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteEmployees.setForeground(new java.awt.Color(255, 255, 255));
        deleteEmployees.setText("DELETAR");
        deleteEmployees.setToolTipText("");
        deleteEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(addEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(previousPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pagination, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxPagination, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextPage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagination, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(previousPage)
                        .addComponent(maxPagination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPage))
                    .addComponent(deleteEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeesActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse funcionário?", "Confirmação",JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int id = (int) jTable1.getValueAt(selectedRow, 4);
                EmployeesController employeesController = new EmployeesController();
                Boolean success = employeesController.deleteEmployees(id);
                if(success){
                    paginationInitializer();
                }
            }
        } else{
            JOptionPane.showMessageDialog(this, "Selecione uma coluna antes de excluir");
        }
    }//GEN-LAST:event_deleteEmployeesActionPerformed

    private void addEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeesActionPerformed
        EmployeesCreateFrame emplyessCreateFrame = new EmployeesCreateFrame(null);
        emplyessCreateFrame.setVisible(true);
        emplyessCreateFrame.pack();
        emplyessCreateFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addEmployeesActionPerformed

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageActionPerformed
        if(!(Integer.parseInt(pagination.getText()) + 1 > Integer.parseInt(maxPagination.getText()))){
            Integer newPage = Integer.valueOf(pagination.getText()) + 1;
            pagination.setText(String.valueOf(newPage));
            loadDate();
        } else {
            JOptionPane.showMessageDialog(this, "Impossível avançar pois não existe mais registros");
        }
    }//GEN-LAST:event_nextPageActionPerformed

    private void previousPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageActionPerformed
        if(!(Integer.parseInt(pagination.getText()) -1 < 1)){
            Integer newPage = Integer.valueOf(pagination.getText()) - 1;
            pagination.setText(String.valueOf(newPage));
            loadDate();
        } else {
            JOptionPane.showMessageDialog(this, "Impossível retroceder da primeira página da lista");
        }
    }//GEN-LAST:event_previousPageActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        HomePageFrame homePageFrame = new HomePageFrame();
        homePageFrame.setVisible(true);
        homePageFrame.pack();
        homePageFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeesActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) jTable1.getValueAt(selectedRow, 4);
            EmployeesController employeesController = new EmployeesController();
            Employees employee = employeesController.findById(id);
            if (employee != null) {
                EmployeesCreateFrame emplyessCreateFrame = new EmployeesCreateFrame(employee);
                emplyessCreateFrame.setVisible(true);
                emplyessCreateFrame.pack();
                emplyessCreateFrame.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao carregar dados do funcionário.");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Selecione uma coluna antes de atualizar os dados");
        }
    }//GEN-LAST:event_updateEmployeesActionPerformed

    private void loadDate(){
        EmployeesController employeesController = new EmployeesController();
        List<Employees> employeeses  = employeesController.listAllPagination(Integer.valueOf(pagination.getText()), 10);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Employees emp : employeeses) {
            model.addRow(new Object[]{
                emp.getName(), DataUtil.formatDateToString(emp.getAdmissionDate()), emp.getRemuneration(), emp.getStatus() ? "Ativo" : "Inativo", emp.getId()
            });
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesListFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployees;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteEmployees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel maxPagination;
    private javax.swing.JButton nextPage;
    private javax.swing.JLabel pagination;
    private javax.swing.JButton previousPage;
    private javax.swing.JButton updateEmployees;
    // End of variables declaration//GEN-END:variables
}
