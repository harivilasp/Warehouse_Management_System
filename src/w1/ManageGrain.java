/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class ManageGrain extends java.awt.Panel {

    /**
     * Creates new form ManageGrain
     */
    public ManageGrain() {
        initComponents();
  try
        {
            Class.forName("com.mysql.jdbc.Driver");
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
        //hide other component
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
            button3.setVisible(false);
            button2.setVisible(false);
            button4.setVisible(false);

            
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
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        textArea1 = new java.awt.TextArea();
        choice1 = new java.awt.Choice();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        label4 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();

        setLayout(null);

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setText("Grain");
        add(label1);
        label1.setBounds(310, 150, 60, 30);

        textField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add(textField1);
        textField1.setBounds(520, 220, 150, 30);

        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setText("Type");
        add(label2);
        label2.setBounds(310, 220, 70, 28);

        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setText("Description");
        add(label3);
        label3.setBounds(310, 300, 94, 28);

        textArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add(textArea1);
        textArea1.setBounds(520, 290, 170, 80);

        choice1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add(choice1);
        choice1.setBounds(510, 150, 150, 30);

        button1.setLabel("Show");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(710, 160, 70, 30);

        button2.setLabel("Save");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(310, 460, 60, 40);

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("Qty");
        add(label4);
        label4.setBounds(320, 400, 70, 30);
        add(textField2);
        textField2.setBounds(520, 400, 170, 30);

        button3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button3.setLabel("Cancel");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(570, 460, 60, 40);

        button4.setLabel("delete");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4);
        button4.setBounds(740, 460, 70, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

            String sql="select * from graindata where grain_name=?";

            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, choice1.getSelectedItem());
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
                button4.setVisible(true);

                choice1.setEnabled(true);
                button1.setEnabled(true);

                textField1.setText(r1.getString("grain_type"));
                textArea1.setText(r1.getString("description"));
                textField2.setText(r1.getString("qty"));
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
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

            String sql="update graindata set grain_type=?,description=?,qty=? where grain_name=?";

            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, textField1.getText());
            p1.setString(2, textArea1.getText());
            p1.setString(3, textField2.getText());
            p1.setString(4, choice1.getSelectedItem());
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
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        kota();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/warehouse";
            String dbuser="root";
            String dbpassword="";
            Connection cn=DriverManager.getConnection(path,dbuser,dbpassword);

            String sql="delete from graindata where grain_name=?";

            PreparedStatement p1=cn.prepareStatement(sql);
            p1.setString(1, choice1.getSelectedItem());

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

    }//GEN-LAST:event_button4ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
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
