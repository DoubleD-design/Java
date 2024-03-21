package Bai_thuc_hanh_so_2;
import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame {
    public static void main(String[] args) {
        GridBagLayoutDemo frame = new GridBagLayoutDemo();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GridBagLayout Demo");
        frame.setSize(400, 400);

        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(new JLabel("Name"), c);

        c.gridx = 1;
        c.gridy = 0;
        pane.add(new JTextField(10), c);

        c.gridx = 0;
        c.gridy = 1;
        pane.add(new JLabel("Address"), c);

        c.gridx = 1;
        c.gridy = 1;
        pane.add(new JTextArea(5,30), c);

        c.gridx = 0;
        c.gridy = 2;
        pane.add(new JLabel("Sex"), c);

        c.gridx = 1;
        c.gridy = 2;
        JPanel panel = new JPanel();
        CheckboxGroup cb = new CheckboxGroup();
        panel.add(new Checkbox("Male",cb,true));
        panel.add(new Checkbox("Female",cb,false));
        pane.add(panel, c);

        c.gridx = 0;
        c.gridy = 3;
        pane.add(new JLabel("Hobbies"), c);

        c.gridx = 1;
        c.gridy = 3;
        panel = new JPanel();
        panel.add(new JCheckBox("Reading",true));
        panel.add(new JCheckBox("Sport",false));
        panel.add(new JCheckBox("Travelling",false));
        pane.add(panel, c);

        c.gridx = 0;
        c.gridy = 4;
        pane.add(new JLabel("Age Group"), c);

        c.gridx = 1;
        c.gridy = 4;
        Choice ch1 = new Choice();
        ch1.addItem("0-10");
        ch1.addItem("10-20");
        ch1.addItem("20-30");
        ch1.addItem("30-40");
        ch1.addItem("40+");
        pane.add(ch1, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        panel = new JPanel();
        panel.add(new JButton("OK"));
        panel.add(new JButton("Cancel"));
        pane.add(panel, c);

        frame.pack();
        frame.setVisible(true);
    }
}
