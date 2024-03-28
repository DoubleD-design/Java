package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class bai5 extends JFrame implements ActionListener{
    JTextField txtResult;
    Button btn7, btn8, btn9, btnDiv, btn4,
            btn5, btn6, btnMult, btn1, btn2, btn3,
            btnMinus, btn0, btnDot, btnC, btnSum, btnEqual;
    Panel resultPanel, mainPanel, smallbtnPanel, btnPanel;

    public void GUI() {
        txtResult = new JTextField();
        txtResult.setHorizontalAlignment(JTextField.RIGHT);
        txtResult.setEditable(false);
        btn0 = new Button("0");
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btnDot = new Button(".");
        btnC = new Button("C");
        btnSum = new Button("+");
        btnMinus = new Button("-");
        btnMult = new Button("*");
        btnDiv = new Button("/");
        btnEqual = new Button("=");

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

        mainPanel = new Panel(new GridLayout(2, 1));
        btnPanel = new Panel(new GridLayout(1, 3));
        resultPanel = new Panel(new FlowLayout());
        smallbtnPanel = new Panel(new GridLayout(4, 4));

        smallbtnPanel.add(btn7);
        smallbtnPanel.add(btn8);
        smallbtnPanel.add(btn9);
        smallbtnPanel.add(btnDiv);
        smallbtnPanel.add(btn4);
        smallbtnPanel.add(btn5);
        smallbtnPanel.add(btn6);
        smallbtnPanel.add(btnMult);
        smallbtnPanel.add(btn1);
        smallbtnPanel.add(btn2);
        smallbtnPanel.add(btn3);
        smallbtnPanel.add(btnMinus);
        smallbtnPanel.add(btn0);
        smallbtnPanel.add(btnDot);
        smallbtnPanel.add(btnC);
        smallbtnPanel.add(btnSum);

//      btnPanel.setSize(500,400);
        btnPanel.add(smallbtnPanel);
        btnPanel.add(btnEqual);
//      smallbtnPanel.setSize(400,400);
//      btnEqual.setSize(100,400);

        mainPanel.add(txtResult);
//      txtResultArea.setSize(400,100);
        mainPanel.add(btnPanel);

        add(mainPanel);
        setSize(400, 300);
        show();
    }
    public static String evaluateExpression(String expression) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            Object result = engine.eval(expression);
            if (result instanceof Double) {
                double doubleResult = (Double) result;
                if (doubleResult == (int) doubleResult) {
                    return String.valueOf((int) doubleResult);
                } else {
                    return String.valueOf(doubleResult);
                }
            }
            return String.valueOf(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return "Không thể tính toán kết quả.";
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
            txtResult.setText(evaluateExpression(a));
        }
    }
    public bai5(String title){
        super(title);
        GUI();
    }
    public  static void main(String[] args){
        new bai5("Calculator");
    }
}
