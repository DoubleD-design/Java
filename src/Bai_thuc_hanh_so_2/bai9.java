package Bai_thuc_hanh_so_2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bai9 extends JFrame implements MouseListener{

    public void GUI() {
        addMouseListener(this);
        setSize(400,300);
        show();
    }
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("You left clicked at " + e.getX() + " " + e.getY());
        }
        if (e.getButton() == MouseEvent.BUTTON2) {
            System.out.println("You middle clicked at " + e.getX() + " " + e.getY());
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("You right clicked at " + e.getX() + " " + e.getY());
        }

    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the window at " + e.getX() + " " + e.getY());

    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("You exited the window at " + e.getX() + " " + e.getY());

    }
    public bai9(String st) {
        super(st);
        GUI();

    }
    public static void main(String[] args) {
        new bai9("Mouse");
    }

}