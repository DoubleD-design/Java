package Bai_thuc_hanh_so_2;
import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame {
    public static void main(String[] args){
        FlowLayoutDemo f = new FlowLayoutDemo();
        f.setTitle("FlowLayout Demo");
        f.setSize(420,400);
        f.setLayout(new FlowLayout());
        f.add(new Button("OK"));
        f.add(new Button("Cancel"));
        f.add(new Label("This is the label"));
        f.add(new JTextField(10));
        f.add(new JTextArea(10,30));
        f.add(new Checkbox("Sport"));
        f.add(new Checkbox("Music"));
        f.add(new Checkbox("Travel"));
        CheckboxGroup cb = new CheckboxGroup();
        f.add(new Checkbox("Male",cb,true));
        f.add(new Checkbox("Female",cb,false));
        Choice ch = new Choice();
        ch.addItem("Sport");
        ch.addItem("Music");
        ch.addItem("Travel");
        f.add(ch);
        List ls = new List(3,false);
        ls.add("Music");
        ls.add("Travel");
        ls.add("Game");
        f.add(ls);
        f.setVisible(true);
    }
}
