package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

class bai4 extends Frame implements ActionListener {
    Label lb1, lb2, lb3, lb4, lb5;
    TextField txt1, txt2, txt3, txt4, txt5;
    Button btnOK, btnReset, btnExit;
    Panel pn, pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8;

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

        pn = new Panel(new GridBagLayout());
        pn1 = new Panel(new GridBagLayout());
        pn2 = new Panel(new GridBagLayout());
        pn3 = new Panel(new GridBagLayout());
        pn4 = new Panel(new GridBagLayout());
        pn5 = new Panel(new GridLayout(1,3));
        pn6 = new Panel(new FlowLayout());
        pn7 = new Panel(new FlowLayout());
        pn8 = new Panel(new FlowLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints gbc1 = new GridBagConstraints();
        GridBagConstraints gbc2 = new GridBagConstraints();
        GridBagConstraints gbc3 = new GridBagConstraints();
        GridBagConstraints gbc4 = new GridBagConstraints();

        pn6.add(btnOK);
        pn7.add(btnReset);
        pn8.add(btnExit);
        pn5.add(pn6);
        pn5.add(pn7);
        pn5.add(pn8);

        gbc1.fill = GridBagConstraints.NONE;
        gbc1.anchor = GridBagConstraints.SOUTHWEST;
        pn1.add(txt1, gbc1);

        gbc2.fill = GridBagConstraints.NONE;
        gbc2.anchor = GridBagConstraints.SOUTHWEST;
        pn2.add(txt2, gbc2);

        gbc3.fill = GridBagConstraints.NONE;
        gbc3.anchor = GridBagConstraints.SOUTHWEST;
        pn3.add(txt3, gbc3);

        gbc4.fill = GridBagConstraints.NONE;
        gbc4.anchor = GridBagConstraints.SOUTHWEST;
        pn4.add(txt4,gbc4);

        gbc.fill = GridBagConstraints.NONE;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(40,5,0,10);
        pn.add(lb1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        pn.add(pn1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        pn.add(lb2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        pn.add(pn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        pn.add(lb3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        pn.add(pn3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        pn.add(lb4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        pn.add(pn4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        pn.add(lb5, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        pn.add(txt5, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridheight = 2;
        gbc.gridwidth = 4;
        pn.add(pn5, gbc);

        add(pn);
        setSize(400, 420);
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