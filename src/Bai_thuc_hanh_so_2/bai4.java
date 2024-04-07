package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class bai4 extends JFrame implements ActionListener {
    JLabel lb1, lb2, lb3, lb4, lb5;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JButton btnOK, btnReset, btnExit;
    JPanel pn, pn1;

    public void GUI(){
        lb1 = new JLabel("Enter a String:");
        txt1 = new JTextField(30);
        lb2 = new JLabel("To Upper Case:");
        txt2 = new JTextField(30);
        txt2.setEnabled(false);
        lb3 = new JLabel("To Lower Case:");
        txt3 = new JTextField(30);
        txt3.setEnabled(false);
        lb4 = new JLabel("To LowerUpper:");
        txt4 = new JTextField(30);
        txt4.setEnabled(false);
        lb5 = new JLabel("Number of word:");
        txt5 = new JTextField(30);
        txt5.setEnabled(false);
        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        btnReset = new JButton("Reset");
        btnReset.addActionListener(this);
        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);

        pn = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        addComponent(pn, lb1, 0,0,1,1,gbc);
        addComponent(pn, txt1, 1,0,3,1,gbc);
        addComponent(pn, lb2, 0,1,1,1,gbc);
        addComponent(pn, txt2, 1, 1, 3,1, gbc);
        addComponent(pn, lb3, 0,2,1,1,gbc);
        addComponent(pn, txt3, 1, 2, 3,1, gbc);
        addComponent(pn, lb4, 0,3,1,1,gbc);
        addComponent(pn, txt4, 1, 3, 3,1, gbc);
        addComponent(pn, lb5, 0,4,1,1,gbc);
        addComponent(pn, txt5, 1, 4, 3,1, gbc);

        pn1 = new JPanel(new FlowLayout(20,0,20));
        pn1.add(btnOK);
        pn1.add(btnReset);
        pn1.add(btnExit);

        addComponent(pn,pn1,0,5,5,2,gbc);
        add(pn);
        setSize(520,500);
        show();
    }

    public void addComponent(JPanel gb,Component cp, int grid_x, int grid_y,int width, int height ,GridBagConstraints gbc){
        gbc.gridx = grid_x;
        gbc.gridy = grid_y;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        gbc.insets = new Insets(40,5,0, 10);
        gb.add(cp,gbc);
    }

    public String Uppercase(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                c -= 32;
            }
            res += c;
        }
        return res;
    }
    public String Lowercase(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c += 32;
            }
            res += c;
        }
        return res;
    }
    public String LowerUpper(String str){
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                c -= 32;
            }else if(c >= 'A' && c <= 'Z'){
                c += 32;
            }
            res += c;
        }
        return res;
    }
    public static int countWords(String input) {
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            // Nếu ký tự hiện tại là một chữ cái và nó không phải là cuối cùng của chuỗi,
            // đặt isWord thành true.
            if (Character.isLetter(input.charAt(i)) && i != endOfLine) {
                isWord = true;
                // Nếu ký tự hiện tại không phải là một chữ cái và isWord đã được đặt,
                // tăng wordCount lên 1 vì đã kết thúc một từ.
            } else if (!Character.isLetter(input.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
                // Nếu ký tự cuối cùng là một chữ cái thì tăng wordCount lên 1 vì nó cũng là một từ.
            } else if (Character.isLetter(input.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }

        return wordCount;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            txt2.setText(Uppercase(txt1.getText()));
            txt3.setText(Lowercase(txt1.getText()));
            txt4.setText(LowerUpper(txt1.getText()));
            txt5.setText(String.valueOf(countWords(txt1.getText())));
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