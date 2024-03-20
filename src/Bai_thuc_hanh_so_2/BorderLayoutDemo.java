package Bai_thuc_hanh_so_2;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public static void main(String[] args){
        BorderLayoutDemo f = new BorderLayoutDemo();
        JTextField msg = new JTextField("Hien thi thong bao");
        msg.setEditable(false);
        JButton bt1 = new JButton("Ve");
        Canvas VungVe = new Canvas();
        VungVe.setSize(150, 150);
        VungVe.setBackground(Color.WHITE);
        Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL,0, 10, 30, 100);
        Scrollbar sb2 = new Scrollbar(Scrollbar.VERTICAL,0, 10, 30, 100);
        f.setLayout(new BorderLayout());
        f.add(msg, BorderLayout.SOUTH);
        f.add(bt1, BorderLayout.NORTH);
        f.add(VungVe, BorderLayout.CENTER);
        f.add(sb1, BorderLayout.WEST);
        f.add(sb2, BorderLayout.EAST);
        f.setVisible(true);
        f.setSize(300,300);
    }
}
