package swingJframe;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;


public class AddGui {
    public static void main(String[] args){
        Addition obj = new Addition();
    }
}        
    class Addition extends JFrame implements ActionListener{

        JTextField t1,t2;
        JLabel l;
        JButton b;
        public Addition(){

            t1 = new JTextField(20);
            t2 = new JTextField(20);
            b = new JButton("OK");
            l= new JLabel("RESULT");

            add(t1);
            add(t2);
            add(b);
            add(l);

            b.addActionListener(this);//ActionListener is an interface

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent e){
            int num1 =Integer.parseInt(t1.getText());
            int num2 =Integer.parseInt(t2.getText());

            int value = num1+num2;
            l.setText(value + "");

        }
    }

 

