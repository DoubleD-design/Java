package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends Frame implements ActionListener {
    JButton order = new JButton("Order");
    JButton products = new JButton("Products");
    CardLayoutDemo(String title){
        super(title);
        setBounds(200, 200, 300, 200);
        setLayout(new CardLayout());
        JPanel panel = new JPanel();
        panel.add(new JLabel("Product 1"));
        panel.add(new JLabel("Product 2"));
        panel.add(order);
        order.addActionListener(this);
        products.addActionListener(this);
        add("products", panel);
        JPanel p1 = new JPanel();
        p1.add(new JTextField("Name: ",20));
        p1.add(new JTextField("Address: ", 20));
        p1.add(new JTextField("Phone: ", 20));
        p1.add(new JButton("Order"));
        p1.add(products);
        add("order", p1);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout)getLayout();
        if (e.getSource() == order) {
            cl.show(this, "order");
        } else if (e.getSource() == products) {
            cl.show(this, "products");
        }
    }
    public static void main(String[] args){
        new CardLayoutDemo("Card Layout");
    }
}
