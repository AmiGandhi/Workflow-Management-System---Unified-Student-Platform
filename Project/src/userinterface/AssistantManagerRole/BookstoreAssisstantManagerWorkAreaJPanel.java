/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AssistantManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Logging.MyLogging;
import Business.Organization.AssisstantManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookstoreAssisstantManagerWorkRequest;
import Business.WorkQueue.BookstoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ami Gandhi
 */
public class BookstoreAssisstantManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookstoreAssisstantManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization assistantManagerOrganization;
    private Enterprise enterprise;
    
    public BookstoreAssisstantManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.assistantManagerOrganization = (AssisstantManagerOrganization)organization;
        this.enterprise=enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Book Name", "Book Price", "Book Author", "Book Type", "No. of Books", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(6).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BOOKSTORE ASSISSTANT MANAGER WORK AREA");

        processJButton.setBackground(new java.awt.Color(102, 102, 102));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("PROCESS REQUEST");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Decision:");

        resultTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resultTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(processJButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
       DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        
        for (BookstoreWorkRequest request : assistantManagerOrganization.getWorkQueue().getBookstoreWorkRequestList()){
            Object[] row = new Object[8];
            row[0] = request.getfName();
            row[1] = request.getBookName();
            row[2] = request.getBookPrice();
            row[3] = request.getBookAuthor();
            row[4] = request.getBooktype();
            row[5] = request.getNoOfBooks();
            row[6] = request.getStatus();
            row[7] = request;
            
            dtm.addRow(row);
        }
    }
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
           String result =resultTxt.getText();
        int selectedRow = workRequestJTable.getSelectedRow();
        if(result!= null && result.trim().length()>0)
        {
            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row!!");
                return;
            }

            BookstoreAssisstantManagerWorkRequest request = (BookstoreAssisstantManagerWorkRequest)workRequestJTable.getValueAt(selectedRow,7);
            String currentState=request.getStatus();
            switch(currentState.toUpperCase())
            {
                case "PENDING":
                    JOptionPane.showMessageDialog(null, "Request is not yet processed by manager!!");
                    resultTxt.setText("");
                    break;
                case "PROCESSING":
                    JOptionPane.showMessageDialog(null, "Request is completed");
                    request.setStatus("Completed");
                    request.setReport(result);
                    resultTxt.setText("");
                    break;
                case "COMPLETED":
                    JOptionPane.showMessageDialog(null, "Request is  already completed by you !!");
                    resultTxt.setText("");
                    break;
                case "ADDED TO CART":
                    JOptionPane.showMessageDialog(null, "Request is  already completed by you!!");
                    resultTxt.setText("");
                    break;
                case "PURCHASED":
                    JOptionPane.showMessageDialog(null, "Request is  already completed by you!!");
                    resultTxt.setText("");
                    break;

            }

            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter decision.");
            return;
        }
         MyLogging.log(Level.INFO, userAccount.getUsername()+ "  from  "  + enterprise +"  Completed the request"); 
    }//GEN-LAST:event_processJButtonActionPerformed

    private void resultTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
