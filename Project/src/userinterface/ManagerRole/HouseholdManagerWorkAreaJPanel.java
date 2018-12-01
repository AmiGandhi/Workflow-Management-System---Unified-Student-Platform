/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccomodationAssisstantManagerWorkRequest;
import Business.WorkQueue.BookstoreAssisstantManagerWorkRequest;
import Business.WorkQueue.HouseholdAssisstantManagerWorkRequest;
import Business.WorkQueue.HouseholdWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AssistantManagerRole.AssistantAccomodationManagerWorkAreaJPanel;
import userinterface.AssistantManagerRole.HouseholdAssistantManagerWorkAreaJPanel;

/**
 *
 * @author Jaynee
 */
public class HouseholdManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    public HouseholdManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManagerOrganization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        //BookstoreAssisstantManagerWorkRequest request1= new BookstoreAssisstantManagerWorkRequest();
        model.setRowCount(0);
           
         for (HouseholdWorkRequest request : organization.getWorkQueue().getHouseholdWorkRequests()){
            Object[] row = new Object[10];
            row[0]=((HouseholdAssisstantManagerWorkRequest) request)==null?"waiting":((HouseholdAssisstantManagerWorkRequest) request);
            row[1]=request.getfName();
            row[2] = request.getlName();
            row[3] = request.getFurnitureType();
            row[4]=request.getCost();
             row[5]=request.getQuantity();
           row[6] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestReportJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();

        requestReportJButton.setText("Pass Request to Assistant");
        requestReportJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestReportJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setText("<value>");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Result", "First Name", "Last Name", "Furniture Type", "Quantity", "Cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshTestJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(requestReportJButton)))
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTestJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(requestReportJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestReportJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestReportJButtonActionPerformed
         
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        
        HouseholdAssisstantManagerWorkRequest request = (HouseholdAssisstantManagerWorkRequest)workRequestJTable.getValueAt(selectedRow,0);
     
        request.setStatus("Processing");
        
        
        populateRequestTable();
        
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendToHouseholdAssistantQueueJPanel1", new SendToHouseholdAssistantQueueJPanel1(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestReportJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestReportJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
