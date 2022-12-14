
package View;

import controller.InvActionListening;
import controller.InvSelection;
import Model.HeaderInv;
import Model.TableInv;
import Model.InvItems;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Kareem Ashraf Mohamed
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceForm
     */
    public MainUI() {
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

        LeftP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        InvoicesTable = new javax.swing.JTable();
        InvoiceTableL = new javax.swing.JLabel();
        CreateInvoiceBTN = new javax.swing.JButton();
        DeleteInvoiceBTN = new javax.swing.JButton();
        RightP = new javax.swing.JPanel();
        InvoiceNumberTxt = new javax.swing.JLabel();
        InvoiceNumOT = new javax.swing.JLabel();
        InvoiceDateTxt = new javax.swing.JLabel();
        InoiveDateOT = new javax.swing.JLabel();
        CustomerNameTXT = new javax.swing.JLabel();
        CustomerNameOT = new javax.swing.JLabel();
        InvoiceTotal_TXT = new javax.swing.JLabel();
        InvoiceTotalOT = new javax.swing.JLabel();
        InvoiceItemTXT = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoicesItemsTable = new javax.swing.JTable();
        CreateNewLineBTN = new javax.swing.JButton();
        DeleteLineBTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvoicesTable.getSelectionModel().addListSelectionListener(selectionLis);
        jScrollPane1.setViewportView(InvoicesTable);

        InvoiceTableL.setText("Invoices Table");

        CreateInvoiceBTN.setText("Create New Invoice");
        CreateInvoiceBTN.setToolTipText("");
        CreateInvoiceBTN.setActionCommand("New Invoice");
        CreateInvoiceBTN.addActionListener(actionLis);
        CreateInvoiceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateInvoiceBTNActionPerformed(evt);
            }
        });

        DeleteInvoiceBTN.setText("Delete Invoice");
        DeleteInvoiceBTN.addActionListener(actionLis);

        javax.swing.GroupLayout LeftPLayout = new javax.swing.GroupLayout(LeftP);
        LeftP.setLayout(LeftPLayout);
        LeftPLayout.setHorizontalGroup(
            LeftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(LeftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPLayout.createSequentialGroup()
                        .addGap(0, 41, Short.MAX_VALUE)
                        .addComponent(CreateInvoiceBTN)
                        .addGap(123, 123, 123)
                        .addComponent(DeleteInvoiceBTN)
                        .addGap(62, 62, 62))
                    .addGroup(LeftPLayout.createSequentialGroup()
                        .addGroup(LeftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftPLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        LeftPLayout.setVerticalGroup(
            LeftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvoiceTableL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(LeftPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteInvoiceBTN)
                    .addComponent(CreateInvoiceBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InvoiceNumberTxt.setText("Invoice Number:");

        InvoiceDateTxt.setText("Invoice Date:");

        CustomerNameTXT.setText("Customer Name:");

        InvoiceTotal_TXT.setText("Invoice Total:");

        InvoiceItemTXT.setText("Invoice Items");

        InvoicesItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(InvoicesItemsTable);

        CreateNewLineBTN.setText("Create New Line");
        CreateNewLineBTN.setActionCommand("Save Invoice");
        CreateNewLineBTN.addActionListener(actionLis);
        CreateNewLineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewLineBTNActionPerformed(evt);
            }
        });

        DeleteLineBTN.setText("Delete Line");
        DeleteLineBTN.setActionCommand("Cancel Changes");
        DeleteLineBTN.addActionListener(actionLis);
        DeleteLineBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLineBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightPLayout = new javax.swing.GroupLayout(RightP);
        RightP.setLayout(RightPLayout);
        RightPLayout.setHorizontalGroup(
            RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addComponent(InvoiceNumberTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(InvoiceNumOT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addComponent(InvoiceDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InoiveDateOT))
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addComponent(CustomerNameTXT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CustomerNameOT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addComponent(InvoiceTotal_TXT)
                        .addGap(18, 18, 18)
                        .addComponent(InvoiceTotalOT))
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addComponent(InvoiceItemTXT)
                        .addGap(27, 27, 27)
                        .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RightPLayout.createSequentialGroup()
                                .addComponent(CreateNewLineBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteLineBTN)
                                .addGap(33, 33, 33)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        RightPLayout.setVerticalGroup(
            RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceNumberTxt)
                    .addComponent(InvoiceNumOT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceDateTxt)
                    .addComponent(InoiveDateOT))
                .addGap(27, 27, 27)
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameTXT)
                    .addComponent(CustomerNameOT))
                .addGap(27, 27, 27)
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceTotal_TXT)
                    .addComponent(InvoiceTotalOT))
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(InvoiceItemTXT)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(RightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteLineBTN)
                    .addComponent(CreateNewLineBTN))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        loadMenuItem.setText("Load Files");
        loadMenuItem.addActionListener(actionLis);
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        saveMenuItem.setText("Save Files");
        saveMenuItem.addActionListener(actionLis);
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeftP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RightP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(LeftP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RightP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMenuItemActionPerformed

    private void CreateInvoiceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateInvoiceBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateInvoiceBTNActionPerformed

    private void CreateNewLineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewLineBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewLineBTNActionPerformed

    private void DeleteLineBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLineBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteLineBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateInvoiceBTN;
    private javax.swing.JButton CreateNewLineBTN;
    private javax.swing.JLabel CustomerNameOT;
    private javax.swing.JLabel CustomerNameTXT;
    private javax.swing.JButton DeleteInvoiceBTN;
    private javax.swing.JButton DeleteLineBTN;
    private javax.swing.JLabel InoiveDateOT;
    private javax.swing.JLabel InvoiceDateTxt;
    private javax.swing.JLabel InvoiceItemTXT;
    private javax.swing.JLabel InvoiceNumOT;
    private javax.swing.JLabel InvoiceNumberTxt;
    private javax.swing.JLabel InvoiceTableL;
    private javax.swing.JLabel InvoiceTotalOT;
    private javax.swing.JLabel InvoiceTotal_TXT;
    private javax.swing.JTable InvoicesItemsTable;
    private javax.swing.JTable InvoicesTable;
    private javax.swing.JPanel LeftP;
    private javax.swing.JPanel RightP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
     public static SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
     private InvActionListening actionLis = new InvActionListening(this);
     private ArrayList <HeaderInv> invoicessArr;
     private InvSelection selectionLis=new InvSelection(this);
     private TableInv HeadTModel;
     private ArrayList<InvItems>itemsArr;
    


    public void setInvoicessArr(ArrayList<HeaderInv> invoicessArr) {
        this.invoicessArr = invoicessArr;
    }

    public ArrayList<HeaderInv> getInvoicessArr() {
        return invoicessArr;
    }

    public ArrayList<InvItems> getItemsArr() {
        return itemsArr;
    }

    public void setItemsArr(ArrayList<InvItems> itemsArr) {
        this.itemsArr = itemsArr;
    }
    
    

    
    
    public HeaderInv getInvObject(int invId){
    
        for (HeaderInv inv:invoicessArr){
        
            if(inv.getOverallNumber()==invId){
            
                return inv;
            }
        }
        
        return null;
    }

    public TableInv getHeadTModel() {
        return HeadTModel;
    }

    public void setHeadTModel(TableInv HeadTModel) {
        this.HeadTModel = HeadTModel;
    }
    
    

    public JTable getInvoicesItemsTable() {
        return InvoicesItemsTable;
    }

    public JTable getInvoicesTable() {
        return InvoicesTable;
    }

    public JLabel getCusName() {
        return CustomerNameOT;
    }

    public JLabel getInvDate() {
        return InoiveDateOT;
    }

    public JLabel getInvID() {
        return InvoiceNumOT;
    }

    public JLabel getInvTotal() {
        return InvoiceTotalOT;
    }

    public InvActionListening getActionLis() {
        return actionLis;
    }
    
            

}

