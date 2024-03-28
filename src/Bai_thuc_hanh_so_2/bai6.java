package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bai6 extends JFrame implements ActionListener{
    JButton btnOk;
    JTextField txt,txt1;
    List ls;

    JPanel pn;
    public void GUI(){
        btnOk = new JButton("OK");
        txt = new JTextField(20);
        ls = new List(3);
        ls.add("Tiger");
        ls.add("Lion");
        ls.add("Elephant");
        pn = new JPanel(new FlowLayout());
        pn.add(btnOk);
        pn.add(txt);
        pn.add(ls);
        txt1 = new JTextField("The event is displayed here");
        txt1.setEditable(false);
        pn.add(txt1);
        add(pn);
        btnOk.addActionListener(this);
        txt.addActionListener(this);
        ls.addActionListener(this);
        setSize(510,350);
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOk){
            txt1.setText("You have clicked on the button");
        }
        if(e.getSource() == txt){
            txt1.setText("You have typed " + txt.getText());
        }
        if(e.getSource() == ls){
            txt1.setText("You have selected "+ls.getSelectedItem());
        }
    }
    public bai6(String title){
        super(title);
        GUI();
    }
    public  static void main(String[] args){
        new bai6("Action Event");
    }
}
