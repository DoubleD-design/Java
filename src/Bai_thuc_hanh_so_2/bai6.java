package Bai_thuc_hanh_so_2;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class bai6 extends Frame implements ActionListener {
    JFrame mainFrame;
    JLabel lb_display;
    JPanel pn, pn1, pn2;
    JButton butt_ok;
    JTextField txtstring;
    List animallist;

    public void GUI() {
        mainFrame = new JFrame("Action Event Test");
        mainFrame.setSize(400, 250);
        mainFrame.setLayout(new GridLayout(2, 1));

        butt_ok = new JButton("OK");
        butt_ok.addActionListener(this);
        txtstring = new JTextField(10);
        txtstring.getDocument().addDocumentListener(new DocumentListener() {

            @Override//from  w  w  w .  j  av  a 2s.  com
            public void insertUpdate(DocumentEvent e) {
                lb_display.setText("Text changed");
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                lb_display.setText("Text changed");

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                lb_display.setText("Text changed");

            }

        });
        animallist = new List();
        animallist.add("Tiger");
        animallist.add("Lion");
        animallist.add("Elephant");
        JScrollPane sb = new JScrollPane(animallist,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        sb.add(animallist);
        JScrollBar bar = sb.getVerticalScrollBar();
        bar.setPreferredSize(new Dimension(10, 0));

        animallist.addActionListener(this);
        pn1 = new JPanel(new FlowLayout());
        pn1.add(butt_ok);
        pn1.add(txtstring);
        pn1.add(sb);

        lb_display = new JLabel("The event is displayed here");
        lb_display.setHorizontalAlignment(JLabel.CENTER);
        lb_display.setVerticalAlignment(JLabel.TOP);

        mainFrame.add(pn1);
        mainFrame.add(lb_display);
        mainFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == butt_ok) {
            lb_display.setText("Button is clicked ");
        }
        if (e.getSource() == txtstring) {
            lb_display.setText("TextField is written: " + txtstring.getText());
        }
        if (e.getSource() == animallist) {
            lb_display.setText("You double click on the" + e.getActionCommand());
        }
    }

    public bai6() {
        GUI();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new bai6();
    }
}