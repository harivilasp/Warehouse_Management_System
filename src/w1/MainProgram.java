
package w1;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MainProgram extends Frame implements ActionListener
{
    MenuBar bar;
    Menu f1,f2,f3,f21,f22;
    MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9;
    
    CardLayout CL;
    
    //Panels
    
    adminreg ad;
    Deposite de;
    Employee emp;
    Grain gra;
    IssueGrain iss;
    
    ManageGrain man;
    ManageEmployee manemp;
    
    //Home panel
    Welcome wel;
    Login log;
    Panel home;
    CardLayout CL2;
    
    public MainProgram()
    {
        //Home
        wel=new Welcome();
        log= new Login();
        home=new Panel();
        CL2=new CardLayout();
        home.setLayout(CL2);
        home.add(wel,"wel");
        home.add(log,"log");
        
        //Other panels
            
            ad=new adminreg() ;
            de= new Deposite();
            emp = new Employee();
            gra = new Grain();
            iss= new IssueGrain();
            
            man= new ManageGrain();
            manemp= new ManageEmployee();
        
        bar=new MenuBar();
        f1=new Menu("Home");
        f2=new Menu("Admin");
        f3=new Menu("Grain");
        f21=new Menu("New");
        f22=new Menu("Show");
        
        m1=new MenuItem("Welcome");
        m2=new MenuItem("Login");
        m3=new MenuItem("Exit");
        m4=new MenuItem("New Admin");
        m5=new MenuItem("New Employee");
        m6=new MenuItem("Add Grain");
        m7=new MenuItem("Mainage");
        m8=new MenuItem("Admin");
        m9=new MenuItem("Employee");
        
        CL=new CardLayout();
        
        setLayout(CL);
        
        //add menubar
        setMenuBar(bar);
        
        //add menu
        bar.add(f1);
        bar.add(f2);
        bar.add(f3);
        
        //add menuitems
        f1.add(m1);
        f1.add(m2);
        f1.addSeparator();
        f1.add(m3);
        
        f2.add(f21);
        f21.add(m4);
        f21.add(m5);
        f22.add(m8);
        f22.add(m9);
        
        f3.add(m6);
        f3.add(m7);
        
        //add panels
        add(home,"home");
        add(ad,"ad");
        add(emp,"emp");
        add(man,"man");
        add(gra,"gra");
            
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        
        
        wel.button1.addActionListener(new A());
        wel.button2.addActionListener(new A());
        log.button1.addActionListener(new A());
        log.button2.addActionListener(new A());
        
        setSize(500,500);
        setVisible(true);
    }
    class A implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Button bt=(Button) e.getSource();
            if(bt==wel.button1)
            {
                CL2.show(home, "log");
            }
            else if(bt==wel.button2)
            {
                System.exit(0);
            }
            else if(bt==log.button1)
            {
                
            }
            else if(bt==log.button2)
            {
                CL2.show(home, "wel");
            }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        MenuItem mt=(MenuItem) e.getSource();
        if(mt==m1)
        {
            CL.show(this, "home");
            CL2.show(home, "wel");
        }
        else if(mt==m2)
        {
            CL.show(this, "home");
            CL2.show(home, "log");
        }
        else if(mt==m3)
        {
            System.exit(0);
        }
        else if(mt==m4)
        {
            CL.show(this, "ad");
        }
        else if(mt==m5)
        {
            CL.show(this, "emp");
        }
        else if(mt==m6)
        {
            CL.show(this, "gra");
        }
        else if(mt==m7)
        {
            CL.show(this, "man");
        }
    }
    public static void main(String args[])
    {
        MainProgram obj=new MainProgram();
    }
}
