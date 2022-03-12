package swingJframe;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;


public class calc {
    public static void main(String[] args){

        AddSub obj = new AddSub();

    }
    
}
class AddSub extends JFrame{

    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;

    public AddSub(){
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);
        
        //java7
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 =Integer.parseInt(t1.getText());
                int num2 =Integer.parseInt(t2.getText());
                int value = num1+num2;
                l.setText(value + "");
                
            }
        });
        //java8 new function 
        b2.addActionListener(e -> {
                int num1 =Integer.parseInt(t1.getText());
                int num2 =Integer.parseInt(t2.getText());
                int value = num1-num2;
                l.setText(value + "");
                
            
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    // public void actionPerformed(ActionEvent ae){
    //     int num1 =Integer.parseInt(t1.getText());
    //     int num2 =Integer.parseInt(t2.getText());
    //     int value;
    //     if(ae.getSource() == b1)
    //        value = num1+num2;
    //     else
    //        value = num1-num2;
       
    //     l.setText(value + "");


    // }
}
