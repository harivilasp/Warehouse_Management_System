/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Deposite extends java.awt.Frame {

    /**
     * Creates new form Deposite
     */
    public Deposite() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        label5 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        button1 = new java.awt.Button();
        label6 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        button2 = new java.awt.Button();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        textField6 = new java.awt.TextField();
        choice2 = new java.awt.Choice();

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        label1.setText("Deposit");
        add(label1);
        label1.setBounds(510, 60, 240, 70);

        label2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label2.setText("Name");
        add(label2);
        label2.setBounds(380, 150, 140, 51);

        label3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label3.setText("Type");
        add(label3);
        label3.setBounds(380, 220, 90, 60);

        label4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label4.setText("Description");
        add(label4);
        label4.setBounds(380, 310, 180, 60);

        textField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        add(textField1);
        textField1.setBounds(680, 240, 220, 40);

        textField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        add(textField2);
        textField2.setBounds(680, 330, 220, 40);

        textField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        add(textField3);
        textField3.setBounds(680, 410, 220, 40);

        label5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label5.setText("Qty");
        add(label5);
        label5.setBounds(390, 400, 80, 51);

        textField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        add(textField4);
        textField4.setBounds(680, 500, 230, 40);

        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setLabel("Show");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(930, 150, 61, 30);

        label6.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label6.setText("New Qty");
        add(label6);
        label6.setBounds(390, 500, 170, 40);

        textField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        add(textField5);
        textField5.setBounds(680, 590, 230, 40);

        button2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button2.setLabel("Deposit");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(680, 740, 140, 40);

        label7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label7.setText("Date");
        add(label7);
        label7.setBounds(390, 600, 120, 40);

        label8.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label8.setText("Remark");
        add(label8);
        label8.setBounds(390, 670, 130, 51);

        textField6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        add(textField6);
        textField6.setBounds(680, 670, 230, 40);
        add(choice2);
        choice2.setBounds(680, 160, 210, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        try{
            String name,type,description,date,remark;
        int qty;
        name=textField1.getText();
        type=textField2.getText();
        description=textField3.getText();
        qty=Integer.parseInt(textField4.getText());
        date=textField5.getText();
        remark=textField6.getText();
        
        Class.forName("com.mysql.jdbc.Driver");
        //String id=JOptionPane.showInputDialog(null,"enter id");
        String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql_insert="insert into deposit values(?,?,?,?,?,?)";

        PreparedStatement p2=cn.prepareStatement(sql_insert);
        p2.setString(1,name);
        p2.setString(2,type);
        p2.setString(3,description);
        p2.setInt(4,qty);
        p2.setString(5,date);
        p2.setString(6,remark);
        int a=p2.executeUpdate();
        if(a==1)
        {
            JOptionPane.showMessageDialog(null,"Data saved");
        }else
        {
            JOptionPane.showMessageDialog(null,"Try Again");
        }   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_button2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposite().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Choice choice2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
