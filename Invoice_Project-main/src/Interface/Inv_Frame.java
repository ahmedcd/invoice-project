package Interface;

import Controlls.Inv_Action_Listener;
import Controlls.Table_Selection_Listener;
import Data.Inv_Header_Table_Model;
import Data.Invoice_Header;
import Data.Invoice_Lines;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Ahmed.wageeh
 */
public class Inv_Frame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	
    public Inv_Frame() {
        initComponents();
    }

       private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Inv_Header_Tbl = new javax.swing.JTable();
        Inv_Create_btn = new javax.swing.JButton();
        Inv_Delete_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inv_Num_Lab = new javax.swing.JLabel();
        Inv_Date_Lab = new javax.swing.JLabel();
        Inv_Cname_Lab = new javax.swing.JLabel();
        Inv__Total_Lab = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Inv_Lines_Tbl = new javax.swing.JTable();
        New_Line_btn = new javax.swing.JButton();
        Delete_line_btn = new javax.swing.JButton();
        InvNumLBL = new javax.swing.JLabel();
        InvDateLBL = new javax.swing.JLabel();
        CustNameLBL = new javax.swing.JLabel();
        InvTotalLBL = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Load_MeIt = new javax.swing.JMenuItem();
        Save_MeIt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Inv_Header_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Inv_Header_Tbl.setName(""); // NOI18N
        Inv_Header_Tbl.getSelectionModel().addListSelectionListener(selectionListener);
        jScrollPane1.setViewportView(Inv_Header_Tbl);

        Inv_Create_btn.setText("Create New Invoice");
        Inv_Create_btn.addActionListener(action_Listener);
        Inv_Create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inv_Create_btnActionPerformed(evt);
            }
        });

        Inv_Delete_btn.setText("Delete Invoice");
        Inv_Delete_btn.addActionListener(action_Listener);
        Inv_Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inv_Delete_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        Inv_Lines_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Inv_Lines_Tbl.setName(""); // NOI18N
        jScrollPane2.setViewportView(Inv_Lines_Tbl);

        New_Line_btn.setText("New Line");
        New_Line_btn.setActionCommand("Create New Line");
        New_Line_btn.addActionListener(action_Listener);

        Delete_line_btn.setText("Delete Line");
        Delete_line_btn.addActionListener(action_Listener);

        jMenu1.setText("File");

        Load_MeIt.setText("Load Files");
        Load_MeIt.addActionListener(action_Listener);
        jMenu1.add(Load_MeIt);

        Save_MeIt.setText("Save Files ");
        Save_MeIt.addActionListener(action_Listener);
        jMenu1.add(Save_MeIt);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 450, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Inv_Num_Lab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Inv_Date_Lab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(InvTotalLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Inv__Total_Lab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Inv_Cname_Lab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(CustNameLBL))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(InvNumLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(InvDateLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Inv_Create_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Inv_Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(New_Line_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(Delete_line_btn)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Inv_Num_Lab)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(Inv_Date_Lab))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(InvDateLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CustNameLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(InvTotalLBL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InvNumLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inv_Cname_Lab)
                .addGap(16, 16, 16)
                .addComponent(Inv__Total_Lab)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(New_Line_btn)
                    .addComponent(Delete_line_btn)
                    .addComponent(Inv_Delete_btn)
                    .addComponent(Inv_Create_btn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Inv_Create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inv_Create_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inv_Create_btnActionPerformed

    private void Inv_Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inv_Delete_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inv_Delete_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inv_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inv_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inv_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inv_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inv_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustNameLBL;
    private javax.swing.JButton Delete_line_btn;
    private javax.swing.JLabel InvDateLBL;
    private javax.swing.JLabel InvNumLBL;
    private javax.swing.JLabel InvTotalLBL;
    private javax.swing.JLabel Inv_Cname_Lab;
    private javax.swing.JButton Inv_Create_btn;
    private javax.swing.JLabel Inv_Date_Lab;
    private javax.swing.JButton Inv_Delete_btn;
    private javax.swing.JTable Inv_Header_Tbl;
    private javax.swing.JTable Inv_Lines_Tbl;
    private javax.swing.JLabel Inv_Num_Lab;
    private javax.swing.JLabel Inv__Total_Lab;
    private javax.swing.JMenuItem Load_MeIt;
    private javax.swing.JButton New_Line_btn;
    private javax.swing.JMenuItem Save_MeIt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private Inv_Action_Listener action_Listener = new Inv_Action_Listener(this);  // this object ( ActionListener ) now is listener to the all buttons inside frame one
private ArrayList<Invoice_Header> invoicesHeadersArray ;
private ArrayList<Invoice_Lines> invoicesLinessArray;
public static SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");   // clarify the date formate that will used 
private Inv_Header_Table_Model headerTableModel;
//private Inv_Line_Table_Model LineTableModel;

private Table_Selection_Listener selectionListener = new Table_Selection_Listener(this);

    public void setInvoicesHeadersArray(ArrayList<Invoice_Header> invoicesHeadersArray) {
        this.invoicesHeadersArray = invoicesHeadersArray;
    }
    
    public Invoice_Header getInvObject(int code){            // Frame is the owner of this array 
        for ( Invoice_Header inv : invoicesHeadersArray){
            if ( inv.getInv_Number() == code)
            {
                return inv ;
            }
        }
        return null ;
    }

    
    public Inv_Header_Table_Model getHeaderTableModel() {
        return headerTableModel;
    }

    public void setHeaderTableModel(Inv_Header_Table_Model headerTableModel) {
        this.headerTableModel = headerTableModel;
    }

    public JTable getInv_Header_Tbl() {
        return Inv_Header_Tbl;
    }

    public JTable getInv_Lines_Tbl() {
        return Inv_Lines_Tbl;
    }

    public ArrayList<Invoice_Header> getInvoicesHeadersArray() {
        return invoicesHeadersArray;
    }
    
    public ArrayList<Invoice_Lines> getInvoicesLinessArray(){
        return invoicesLinessArray;
    }
    public JLabel getInv_C_name_Lab() {
        return Inv_Cname_Lab;
    }

    public JLabel getInv_Date_Lab() {
        return Inv_Date_Lab;
    }

    public JLabel getInv_Num_Lab() {
        return Inv_Num_Lab;
    }

    public JLabel getInv__Total_Lab() {
        return Inv__Total_Lab;
    }

    public JLabel getCustNameLBL() {
        return CustNameLBL;
    }

    public JLabel getInvDateLBL() {
        return InvDateLBL;
    }

    public JLabel getInvNumLBL() {
        return InvNumLBL;
    }

    public JLabel getInvTotalLBL() {
        return InvTotalLBL;
    }
  
    public void setInvoicesLinessArray(ArrayList<Invoice_Lines> invoicesLinessArray) {
        this.invoicesLinessArray = invoicesLinessArray;
    }

    
    public Inv_Action_Listener getAction_Listener() {
        return action_Listener;
    }


    
    

}
