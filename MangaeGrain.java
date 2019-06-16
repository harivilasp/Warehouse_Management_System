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
 * @author dream
 */
public class MangaeGrain extends java.awt.Frame {

    /**
     * Creates new form MangaeGrain
     */
    public MangaeGrain() {
        initComponents();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //String id=JOptionPane.showInputDialog(null,"enter id");
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);
            
            String sql="select grain_name from graindata";
            PreparedStatement p1=cn.prepareStatement(sql);
            ResultSet r1=p1.executeQuery();
            while(r1.next())
            {
                String str=r1.getString("grain_name");
                choice1.add(str);
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
        //Hide other components
        kota();
    }

    private void kota()
    {
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        textArea1.setVisible(false);
        textField1.setVisible(false);
        textField2.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        
        choice1.setEnabled(true);
        button1.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        choice1 = new java.awt.Choice();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textArea1 = new java.awt.TextArea();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("Grain");
        add(label1);
        label1.setBounds(150, 160, 39, 23);

        choice1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add(choice1);
        choice1.setBounds(240, 160, 130, 23);

        button1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button1.setLabel("Show");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(420, 160, 50, 27);

        label2.setText("Type");
        add(label2);
        label2.setBounds(150, 220, 30, 20);

        label3.setText("Description");
        add(label3);
        label3.setBounds(68, 260, 120, 20);

        label4.setText("Qty");
        add(label4);
        label4.setBounds(150, 350, 21, 20);
        add(textField1);
        textField1.setBounds(240, 220, 130, 20);
        add(textField2);
        textField2.setBounds(240, 360, 160, 20);
        add(textArea1);
        textArea1.setBounds(240, 250, 250, 80);

        button2.setLabel("Save");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(150, 420, 43, 24);

        button3.setLabel("Cancel");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(280, 420, 55, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //String id=JOptionPane.showInputDialog(null,"enter id");
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);
            
            String sql="select * from graindata where grain_name=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1,choice1.getSelectedItem());
            ResultSet r1=p1.executeQuery();
            if(r1.next())
            {
                label2.setVisible(true);
                label3.setVisible(true);
                label4.setVisible(true);
                textArea1.setVisible(true);
                textField1.setVisible(true);
                textField2.setVisible(true);
                button2.setVisible(true);
                button3.setVisible(true);
                
                choice1.setEnabled(false);
                button1.setEnabled(false);
                
                textField1.setText(r1.getString("grain_type"));
                textField2.setText(r1.getString("qty"));
                textArea1.setText(r1.getString("description"));
            }
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            //String id=JOptionPane.showInputDialog(null,"enter id");
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);
            
            String sql="update graindata set grain_type=?,description=?,qty=? where grain_name=?";
            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, textField1.getText());
            p1.setString(2, textArea1.getText());
            p1.setString(3, textField2.getText());
            p1.setString(4,choice1.getSelectedItem());
            int n=p1.executeUpdate();
            if(n>0)
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Data Saved");
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Try again");
            }
            kota();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, ""+e);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        kota();
    }//GEN-LAST:event_button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MangaeGrain().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Choice choice1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    // End of variables declaration//GEN-END:variables
}
