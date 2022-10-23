/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ahmed.wageeh
 */
public class Inv_Header_Diag extends JDialog {
    
	private static final long serialVersionUID = 1L;
	private JTextField CustomerNameField;
    private JTextField InvoiceDateField;
    private JLabel customerNameLabel;
    private JLabel invoiceDateLabel;
    private JButton okBtn;
    private JButton cancelBtn;

    public Inv_Header_Diag(Inv_Frame frame) {
        customerNameLabel = new JLabel("Customer Name:");
        CustomerNameField = new JTextField(20);
        invoiceDateLabel = new JLabel("Invoice Date:");
        InvoiceDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("CreatenewInvOK");
        cancelBtn.setActionCommand("CreatenewInvCancel");
        
        okBtn.addActionListener(frame.getAction_Listener());
        cancelBtn.addActionListener(frame.getAction_Listener());
        setLayout(new GridLayout(3, 2));
        
        add(invoiceDateLabel);
        add(InvoiceDateField);
        add(customerNameLabel);
        add(CustomerNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustomerNameField() {
        return CustomerNameField;
    }

    public JTextField getInvoiceDateField() {
        return InvoiceDateField;
    }
    
}
