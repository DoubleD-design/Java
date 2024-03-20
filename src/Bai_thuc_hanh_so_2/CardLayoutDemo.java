package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends Frame implements ActionListener {
    JButton order = new JButton("Order");
    JButton products = new JButton("Products");
    CardLayoutDemo(String title){
        super(title);
        setBounds(200, 200, 200, 200);
        setLayout(new CardLayout());
        JPanel panel = new JPanel();
        panel.add(new JLabel("Product 1"));
        panel.add(new JLabel("Product 2"));
        panel.add(order);
        order.addActionListener(this);
        panel.add(products);
        products.addActionListener(this);
        JPanel p1 = new JPanel();

    }
}
