/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class ManagEmployee extends java.awt.Frame {

    /**
     * Creates new form ManagEmployee
     */
    public ManagEmployee() {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql="select email from employeedata";

        PreparedStatement p1=cn.prepareStatement(sql);
        
        ResultSet r1=p1.executeQuery();
        while(r1.next())
        {
            String str=r1.getString("email");
            
        }
           
      }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
        //hide other component
        kota();
    }                                    
        private void kota()
        {
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            textField3.setVisible(false);
            textField4.setVisible(false);
           
            textField2.setVisible(false);
            button3.setVisible(false);
            button2.setVisible(false);
            button1.setVisible(false);

            button4.setEnabled(true);        
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
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        textField4 = new java.awt.TextField();

        setBackground(new java.awt.Color(0, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Email");
        add(label1);
        label1.setBounds(320, 130, 64, 36);

        label2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label2.setText("Name");
        add(label2);
        label2.setBounds(320, 190, 67, 36);

        label3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label3.setText("Address");
        add(label3);
        label3.setBounds(320, 250, 92, 36);

        label4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label4.setText("Contact");
        add(label4);
        label4.setBounds(320, 310, 87, 36);

        textField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(textField1);
        textField1.setBounds(520, 140, 170, 30);

        textField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(textField2);
        textField2.setBounds(520, 200, 170, 28);

        textField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        add(textField3);
        textField3.setBounds(520, 260, 170, 28);

        button1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button1.setLabel("Save");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(260, 420, 90, 40);

        button2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button2.setLabel("Cancel");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(550, 420, 91, 40);

        button3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button3.setLabel("Delete");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(820, 420, 80, 40);

        button4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button4.setLabel("Show");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4);
        button4.setBounds(710, 130, 61, 32);

        textField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });
        add(textField4);
        textField4.setBounds(520, 320, 170, 30);

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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql="update employeedata set name=?,address=?,contact=? where email=?";

        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(4, textField1.getText());
        p1.setString(1, textField2.getText());
        
        p1.setString(2, textField3.getText());
        p1.setString(3, textField4.getText());
       
        
        int n=p1.executeUpdate();
        if(n>0)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Data Saved");
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Try again");
        }
        kota();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,""+e);
        }
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql="select * from employeedata where email=?";

        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1,textField1.getText() );
        ResultSet r1=p1.executeQuery();
        if(r1.next())
        {
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            
            textField3.setVisible(true);
            textField4.setVisible(true);
            textField2.setVisible(true);
            button2.setVisible(true);
            button3.setVisible(true);
            button1.setVisible(true);
            
           
            button4.setEnabled(true);
            
            textField4.setText(r1.getString("contact"));
            textField3.setText(r1.getString("address"));
            textField2.setText(r1.getString("name"));
        }
     }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
        
        
        
    }//GEN-LAST:event_button4ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        kota();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
        String dbuser="root";
        String dbpassword="";
        Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

        String sql="delete from employeedata where email=?";

        PreparedStatement p1=cn.prepareStatement(sql);
        p1.setString(1, textField1.getText());
        
        int n=p1.executeUpdate();
        if(n>0)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Data deleted");
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Try again");
        }
        kota();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,""+e);
        }
        
        
    }//GEN-LAST:event_button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagEmployee().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    // End of variables declaration//GEN-END:variables
}
