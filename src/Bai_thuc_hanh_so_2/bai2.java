package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bai2 extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3,lb4;
    JTextField txta,txtb,txtkg;
    JButton add,sub,mul,div,reset,exit;
    JPanel pn,pn1,pn2,pn3,pn4;
    public void GUI(){
        lb1 = new JLabel("Basic Arithmetic Operations");
        lb2 = new JLabel("Number 1:");
        lb3 = new JLabel("Number 2:");
        lb4 = new JLabel("Result:");

        txta = new JTextField(7);
        txtb = new JTextField(7);
        txtkg = new JTextField();

        add = new JButton("Addition");
        sub = new JButton("Subtraction");
        mul = new JButton("Multiplication");
        div = new JButton("Division");
        reset = new JButton("Reset");
        exit = new JButton("Exit");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        reset.addActionListener(this);
        exit.addActionListener(this);

        pn1 = new JPanel(new FlowLayout());
        pn1.add(lb1);

        pn2 = new JPanel(new GridLayout(3,2));
        pn2.add(lb2);
        pn2.add(txta);
        pn2.add(lb3);
        pn2.add(txtb);
        pn2.add(lb4);
        pn2.add(txtkg);

        pn3 = new JPanel(new FlowLayout());
        pn3.add(add);
        pn3.add(sub);
        pn3.add(mul);
        pn3.add(div);

        pn4 = new JPanel(new FlowLayout());
        pn4.add(reset);
        pn4.add(exit);

        pn = new JPanel(new GridLayout(4,1));
        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        pn.add(pn4);
        add(pn);
        setSize(500,300);
        show();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            txtkg.setText(Integer.toString(a+b));
        }
        if(e.getSource() == sub){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            txtkg.setText(Integer.toString(a-b));
        }
        if(e.getSource() == mul){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            txtkg.setText(Integer.toString(a*b));
        }
        if(e.getSource() == div){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            txtkg.setText(Float.toString((float)a/b));
        }
        if(e.getSource() == reset){
            txta.setText("");
            txtb.setText("");
            txtkg.setText("");
        }
        if (e.getSource() == exit){
            System.exit(0);
        }
    }
    public bai2(String title){
        super(title);
        GUI();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public  static void main(String[] args){
        new bai2("Arithmetic Operations");
    }
}
