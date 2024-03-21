package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PTB1 extends JFrame implements ActionListener {
    JLabel lb1,lb2,lb3,lb;
    JTextField txta,txtb,txtkg;
    JButton tinh,reset,thoat;
    JPanel pn,pn1,pn2,pn3;
    public void GUI(){
        lb = new JLabel("PHUONG TRINH BAC NHAT");
        lb1 = new JLabel("Nhap a:");
        lb2 = new JLabel("Nhap b:");
        lb3 = new JLabel("Ket qua:");

        txta = new JTextField(7);
        txtb = new JTextField(7);
        txtkg = new JTextField();

        tinh = new JButton("Tinh");
        reset = new JButton("Reset");
        thoat = new JButton("Thoat");

        tinh.addActionListener(this);
        reset.addActionListener(this);
        thoat.addActionListener(this);

        pn = new JPanel(new GridLayout(3,1));
        pn1 = new JPanel(new FlowLayout());
        pn2 = new JPanel(new GridLayout(3,2));
        pn3 = new JPanel(new GridLayout(1,3));

        pn1.add(lb);

        pn2.add(lb1);
        pn2.add(txta);
        pn2.add(lb2);
        pn2.add(txtb);
        pn2.add(lb3);
        pn2.add(txtkg);

        pn3.add(tinh);
        pn3.add(reset);
        pn3.add(thoat);

        pn.add(pn1);
        pn.add(pn2);
        pn.add(pn3);
        add(pn);
        setSize(400,300);
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tinh){
            int a = Integer.parseInt(txta.getText());
            int b = Integer.parseInt(txtb.getText());
            if(a!=0) txtkg.setText(Float.toString((float)-b/a));
            else if (b==0) {
                txtkg.setText("Phuong trinh co vo so nghiem");
            }else {
                txtkg.setText("Phuong trinh vo nghiem");
            }
        }
        if(e.getSource() == reset){
            txta.setText("");
            txtb.setText("");
            txtkg.setText("");
        }
        if (e.getSource() == thoat){
            System.exit(0);
        }
    }
    public PTB1(String title){
        super(title);
        GUI();
    }
    public  static void main(String[] args){
        new PTB1("Giai phuong trinh bac nhat");
    }
}
