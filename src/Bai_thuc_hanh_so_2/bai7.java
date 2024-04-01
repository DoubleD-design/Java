package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bai7 extends JFrame {
    JFrame mainFrame;
    JPanel pn1, pn2;
    JCheckBox cbMale, cbFemale;
    JComboBox cbb1;
    List animalList;
    JLabel lb_display;

    public void GUI() {
        mainFrame = new JFrame("ItemEventTest");
        mainFrame.setSize(350, 250);
        mainFrame.setLayout(new GridLayout(2, 1));


        cbMale = new JCheckBox("Male", false);
        cbMale.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String data = "";
                if (e.getStateChange() == 1) {
                    data += "Male";
                    cbFemale.setSelected(false);
                } else data = "";
                lb_display.setText(data);
            }
        });
        cbFemale = new JCheckBox("Female", false);
        cbFemale.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String data = "";
                if (e.getStateChange() == 1) {
                    data += "Female";
                    cbMale.setSelected(false);
                } else data = "";
                lb_display.setText(data);
            }
        });

        String hdh[] = {"MS DOS", "Window", "Linux", "MacOS"};
        cbb1 = new JComboBox<>(hdh);
        cbb1.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                lb_display.setText((e.getStateChange() == 1 ? cbb1.getSelectedItem().toString() : ""));
            }

        });

        animalList = new List();
        animalList.add("Tiger");
        animalList.add("Lion");
        animalList.add("Elephant");
        animalList.add("Cat");
        animalList.add("Mouse");
        animalList.add("Dog");
        animalList.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                lb_display.setText(e.getStateChange() == 1 ? animalList.getSelectedItem().toString() : "");
            }
        });
        pn1 = new JPanel(new FlowLayout());
        pn1.add(cbMale);
        pn1.add(cbFemale);
        pn1.add(cbb1);
        pn1.add(animalList);

        lb_display = new JLabel("The event is displayed here");
        lb_display.setVerticalAlignment(JLabel.TOP);
        lb_display.setHorizontalAlignment(JLabel.CENTER);
        pn2 = new JPanel(new FlowLayout());
        pn2.add(lb_display);
        mainFrame.add(pn1);
        mainFrame.add(pn2);
        mainFrame.setVisible(true);
    }

    public bai7() {
        super("Item Event");
        GUI();
    }

    public static void main(String[] args) {
        new bai7();
    }
}
