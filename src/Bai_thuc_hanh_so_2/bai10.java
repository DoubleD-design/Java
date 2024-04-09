package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class bai10 extends JFrame implements WindowListener{
    Menu file, edit;
    MenuBar mb;
    public void GUI() {
        file = new Menu("File");
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.add(new MenuItem("Save"));
        file.add(new MenuItem("Save As"));
        file.add(new MenuItem("Close"));

        edit = new Menu("Edit");
        edit.add(new MenuItem("Copy"));
        edit.add(new MenuItem("Cut"));
        edit.add(new MenuItem("Paste"));

        Menu opt = new Menu("Options");
        opt.add(new MenuItem("first"));
        opt.add(new MenuItem("second"));
        opt.add(new MenuItem("third"));
        edit.add(opt);

        edit.add(new MenuItem("Protected"));
        mb = new MenuBar();
        mb.add(file);
        mb.add(edit);

        setMenuBar(mb);
        setSize(400,300);
        show();
    }
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }
    public bai10(String st) {
        super(st);
        GUI();
    }
    public static void main(String[] args) {
        new bai10("Menu");
    }

}
