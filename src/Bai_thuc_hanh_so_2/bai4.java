package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

class bai4 extends Frame implements ActionListener {
    Label lb1, lb2, lb3, lb4, lb5;
    TextField txt1, txt2, txt3, txt4, txt5;
    Button btnOK, btnReset, btnExit;
    Panel pn, pn1, pn2;

    public void GUI() {
        lb1 = new Label("Enter a String");
        lb2 = new Label("To UpperCase");
        lb3 = new Label("To LowerCase");
        lb4 = new Label("To LowerUpper");
        lb5 = new Label("Number of word");


        txt1 = new TextField(30);
        txt2 = new TextField(30);
        txt3 = new TextField(30);
        txt4 = new TextField(30);
        txt5 = new TextField(30);

        btnOK = new Button("OK");
        btnReset = new Button("Reset");
        btnExit = new Button("Exit");

        btnOK.addActionListener(this);
        btnReset.addActionListener(this);
        btnExit.addActionListener(this);

        pn = new Panel(new GridLayout(2, 1));
        pn1 = new Panel(new GridLayout(5, 2));
        pn2 = new Panel(new FlowLayout());
        pn1.add(lb1);
        pn1.add(txt1);
        pn1.add(lb2);
        pn1.add(txt2);
        pn1.add(lb3);
        pn1.add(txt3);
        pn1.add(lb4);
        pn1.add(txt4);
        pn1.add(lb5);
        pn1.add(txt5);

        pn2.add(btnOK);
        pn2.add(btnReset);
        pn2.add(btnExit);

        pn.add(pn1);
        pn.add(pn2);
        add(pn);
        setSize(500, 300);
        show();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            txt2.setText(txt1.getText().toUpperCase());
            txt3.setText(txt1.getText().toLowerCase());
            String temp = txt1.getText();
            StringBuffer result = new StringBuffer(temp);

            for (int i = 0; i < temp.length(); i++) {
                if (Character.isLowerCase(temp.charAt(i))) {
                    result.setCharAt(i, Character.toUpperCase(temp.charAt(i)));
                }
                if (Character.isUpperCase(temp.charAt(i))) {
                    result.setCharAt(i, Character.toLowerCase(temp.charAt(i)));
                }
            }
            txt4.setText(result.toString());
            txt5.setText(String.valueOf(countWords(temp)));
        }

        if (e.getSource() == btnReset) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");

        }
        if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public bai4() {
        GUI();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new bai4();
    }
}