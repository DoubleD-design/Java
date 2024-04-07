package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class bai5 extends JFrame implements ActionListener{
    JTextField txtResult;
    JButton btn7, btn8, btn9, btnDiv, btn4,
            btn5, btn6, btnMult, btn1, btn2, btn3,
            btnMinus, btn0, btnDot, btnC, btnSum, btnEqual;
    JPanel btnPanel, mainPanel;

    public void GUI() {
        txtResult = new JTextField();
        txtResult.setHorizontalAlignment(JTextField.RIGHT);
        txtResult.setEditable(false);
        txtResult.setPreferredSize(new Dimension(200, 50));
        txtResult.setFont(new Font("Roboto", Font.PLAIN, 20));

        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnDot = new JButton(".");
        btnC = new JButton("C");
        btnSum = new JButton("+");
        btnMinus = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        btnEqual = new JButton("=");

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnC.addActionListener(this);
        btnSum.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);
        btnEqual.addActionListener(this);

        btnPanel = new JPanel(new GridLayout(4,4));
        btnPanel.add(btn7);
        btnPanel.add(btn8);
        btnPanel.add(btn9);
        btnPanel.add(btnDiv);
        btnPanel.add(btn4);
        btnPanel.add(btn5);
        btnPanel.add(btn6);
        btnPanel.add(btnMult);
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btnMinus);
        btnPanel.add(btn0);
        btnPanel.add(btnDot);
        btnPanel.add(btnC);
        btnPanel.add(btnSum);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(txtResult, BorderLayout.NORTH);
        mainPanel.add(btnPanel, BorderLayout.CENTER);
        mainPanel.add(btnEqual, BorderLayout.EAST);
        add(mainPanel);
        setSize(500,300);
        show();
    }

    public static String calculate(String expression) {
        String postfix = infixToPostfix(expression);
        double result = evaluatePostfix(postfix);

        if (result == (int) result) {
            return String.valueOf((int) result);
        } else {
            return String.valueOf(result);
        }
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String number = "";

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                number += c;
            } else {
                if (!number.isEmpty()) {
                    result.append(number).append(" ");
                    number = "";
                }

                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop()).append(" ");
                    }
                    if (!stack.isEmpty() && stack.peek() != '(') {
                        return "Invalid Expression";
                    } else {
                        stack.pop();
                    }
                } else {
                    while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                        result.append(stack.pop()).append(" ");
                    }
                    stack.push(c);
                }
            }
        }

        if (!number.isEmpty()) {
            result.append(number).append(" ");
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString();
    }

    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static double evaluatePostfix(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            char c = token.charAt(0);

            if (Character.isDigit(c) || token.length() > 1) {
                stack.push(Double.parseDouble(token));
            } else {
                double val1 = stack.pop();
                double val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn0){
            txtResult.setText(txtResult.getText()+"0");
        }
        if(e.getSource() == btn1){
            txtResult.setText(txtResult.getText()+"1");
        }
        if(e.getSource() == btn2){
            txtResult.setText(txtResult.getText()+"2");
        }
        if(e.getSource() == btn3){
            txtResult.setText(txtResult.getText()+"3");
        }
        if(e.getSource() == btn4){
            txtResult.setText(txtResult.getText()+"4");
        }
        if(e.getSource() == btn5){
            txtResult.setText(txtResult.getText()+"5");
        }
        if(e.getSource() == btn6){
            txtResult.setText(txtResult.getText()+"6");
        }
        if(e.getSource() == btn7){
            txtResult.setText(txtResult.getText()+"7");
        }
        if(e.getSource() == btn8){
            txtResult.setText(txtResult.getText()+"8");
        }
        if(e.getSource() == btn9){
            txtResult.setText(txtResult.getText()+"9");
        }
        if(e.getSource() == btnDot){
            txtResult.setText(txtResult.getText()+".");
        }
        if(e.getSource() == btnSum){
            txtResult.setText(txtResult.getText()+"+");
        }
        if(e.getSource() == btnMinus){
            txtResult.setText(txtResult.getText()+"-");
        }
        if(e.getSource() == btnMult){
            txtResult.setText(txtResult.getText()+"*");
        }
        if(e.getSource() == btnDiv){
            txtResult.setText(txtResult.getText()+"/");
        }
        if(e.getSource() == btnEqual){
            String a = txtResult.getText();
            txtResult.setText(calculate(a));
        }
        if(e.getSource() == btnC){
            txtResult.setText("");
        }
    }

    public bai5(String title){
        super(title);
        GUI();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public  static void main(String[] args){
        new bai5("Calculator");
    }
}
