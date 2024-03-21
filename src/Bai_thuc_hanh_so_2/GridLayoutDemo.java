package Bai_thuc_hanh_so_2;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    public static void main(String[] args) {
        JLabel label = new JLabel("X coordinate: ");
        JTextField xInput = new JTextField(5);
        JLabel label2 = new JLabel("Y coordinate: ");
        JTextField yInput = new JTextField(5);
        GridLayoutDemo f = new GridLayoutDemo();
        f.setLayout(new GridLayout(2,2));
        f.setTitle("Grid Layout Demo");
        f.setSize(300,150);
        f.add(label);
        f.add(xInput);
        f.add(label2);
        f.add(yInput);
        f.setVisible(true);
    }
}
