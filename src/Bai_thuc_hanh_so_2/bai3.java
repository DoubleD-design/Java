package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bai3 extends JFrame implements ActionListener{
    JButton red,green,blue,exit;
    JPanel pn,pn1;
    public void GUI(){
        red = new JButton("RED");
        green = new JButton("GREEN");
        blue = new JButton("BLUE");
        exit = new JButton("EXIT");
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        exit.addActionListener(this);
        pn1 = new JPanel(new FlowLayout());
        pn1.add(red);
        pn1.add(green);
        pn1.add(blue);
        pn1.add(exit);
        pn = new JPanel(new BorderLayout());
        pn.add(pn1,BorderLayout.SOUTH);
        add(pn);
        setSize(500,300);
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == red){
            pn.setBackground(Color.RED);
            pn1.setBackground(Color.RED);
        }
        if(e.getSource() == green){
            pn.setBackground(Color.GREEN);
            pn1.setBackground(Color.GREEN);
        }
        if(e.getSource() == blue){
            pn.setBackground(Color.BLUE);
            pn1.setBackground(Color.BLUE);
        }
        if(e.getSource() == exit){
            System.exit(0);
        }
    }
    public bai3(String title){
        super(title);
        GUI();
    }
    public  static void main(String[] args){
        new bai3("Change Background");
    }
}
