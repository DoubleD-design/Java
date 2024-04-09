package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bai8 extends JFrame implements KeyListener {
    JLabel lb;
    JPanel pn;
    public void GUI() {
        pn = new JPanel(new GridLayout(1,1));
        lb = new JLabel("A", lb.CENTER);
        addKeyListener(this);

        pn.add(lb);
        add(pn);
        setSize(400,300);
        show();
    }
    public void keyTyped(KeyEvent e) {
        lb.setText(String.valueOf(e.getKeyChar()));

    }
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    public bai8(String st) {
        super(st);
        GUI();
    }
    public static void main(String[] args) {
        new bai8("Key");
    }

}
