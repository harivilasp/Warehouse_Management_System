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
public class Employee extends java.awt.Frame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        textField3 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        button1 = new java.awt.Button();
        label6 = new java.awt.Label();

        setBackground(new java.awt.Color(0, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Name");
        add(label1);
        label1.setBounds(180, 200, 110, 51);

        textField3.setBackground(new java.awt.Color(204, 204, 255));
        textField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        add(textField3);
        textField3.setBounds(510, 340, 210, 30);

        label4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label4.setText("Address");
        add(label4);
        label4.setBounds(170, 260, 140, 51);

        textField4.setBackground(new java.awt.Color(204, 204, 255));
        textField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        add(textField4);
        textField4.setBounds(510, 410, 210, 30);

        label5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label5.setText("Contact");
        add(label5);
        label5.setBounds(170, 330, 140, 40);

        textField1.setBackground(new java.awt.Color(204, 204, 255));
        textField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        add(textField1);
        textField1.setBounds(510, 220, 220, 30);

        label2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label2.setText("Email");
        add(label2);
        label2.setBounds(170, 400, 120, 40);

        label3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label3.setText("Password");
        add(label3);
        label3.setBounds(170, 470, 161, 40);

        textField5.setBackground(new java.awt.Color(204, 204, 255));
        textField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });
        add(textField5);
        textField5.setBounds(510, 480, 220, 30);

        textField2.setBackground(new java.awt.Color(204, 204, 255));
        textField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        add(textField2);
        textField2.setBounds(510, 280, 230, 30);

        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setLabel("Register");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(170, 550, 150, 50);

        label6.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        label6.setText("Employee Reg");
        add(label6);
        label6.setBounds(230, 90, 360, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        try{
        String name,address,contact,email,password;
        
        name=textField1.getText();
        address=textField2.getText();
      
        contact=textField3.getText();
        email=textField4.getText();
        password=textField5.getText();
        
        Class.forName("com.mysql.jdbc.Driver");
        
        String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql_insert="insert into employeedata values(?,?,?,?,?)";

        PreparedStatement p2=cn.prepareStatement(sql_insert);
        p2.setString(1,name);
        p2.setString(2,address);
        p2.setString(3,contact);
        p2.setString(4,email);
        p2.setString(5,password);
        //p2.setString(6,remark);
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

        
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables
}
