import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;

import java.awt.Button;
import java.awt.FlowLayout;

public class MyGui{
    public static void main(String[] args) {
        new MyFrame();
    }

}
class MyFrame extends Frame implements ActionListener{
   
    Button b;
    Label l;

    public MyFrame()
    {
        // FlowLayout f = new FlowLayout();
        // setLayout(f);
        setLayout(new FlowLayout());
        // l = new Label("I love u too");
        // add(l);
        b = new Button("I love u");
        b.addActionListener(this);

        add(b);
       setVisible(true);
       setSize(400,400);
    }
    public void actionPerformed(ActionEvent e){
         int f=0;
        f= f+i++;
        System.out.println("I love u too  " + f);
       
        }

} 