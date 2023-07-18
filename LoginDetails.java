/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import javax.swing.border.BevelBorder;

/**
 *
 * @author user
 */
public class LoginDetails extends JFrame{
    
    private JPanel headingPnl;
    private JPanel loginPnl;
    private JPanel namePnl;
    private JPanel passwordPnl;
    private JPanel surnameAndPassPnl;
    private JPanel btnPnl;
    //private JPanel detailPnl;
    private JPanel mainPnl;
    
    private JLabel headingLb;
    private JLabel loginLb;
    private JLabel usernameLb;
    private JLabel passwordLb;
    
    private JTextField usernameTxf;
    private JTextField passwordTxf;
    
    private JButton submitBtn;
    
    

    public LoginDetails() {
        setLayout(new BorderLayout());
        setTitle("My Login");
        setBackground(Color.yellow);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        
        
        headingPnl = new JPanel(new FlowLayout());
        loginPnl = new JPanel(new FlowLayout());
        namePnl = new JPanel(new FlowLayout());
        passwordPnl = new JPanel(new FlowLayout());
        surnameAndPassPnl = new JPanel(new GridLayout(2,1));
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new FlowLayout());
        //detailPnl = new JPanel(new FlowLayout());
        
        headingLb = new JLabel("User login page");
        loginLb = new JLabel("Login Details");
        usernameLb = new JLabel("Username");
        passwordLb = new JLabel("Password");
        
        usernameTxf = new JTextField(20);
        passwordTxf = new JPasswordField(20);
        
        submitBtn = new JButton("Submit");
        
       
        
        headingPnl.add(headingLb);
        
        
        loginPnl.add(loginLb);
        
        namePnl.add(usernameLb);
        namePnl.add(usernameTxf);
        
        passwordPnl.add(passwordLb);
        passwordPnl.add(passwordTxf);
        
        btnPnl.add(submitBtn,LEFT_ALIGNMENT);
        
        surnameAndPassPnl.add(namePnl);
        surnameAndPassPnl.add(passwordPnl);
        
        mainPnl.add(loginPnl,BorderLayout.NORTH);
        mainPnl.add(surnameAndPassPnl,BorderLayout.CENTER);
        mainPnl.add(btnPnl,LEFT_ALIGNMENT);
        
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        setVisible(true);
    }
    
}
