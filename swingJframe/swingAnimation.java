package swingJframe;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;



public class swingAnimation {
    public static void main(String[] args) {
        page p = new page();
    }
    
}
class page extends JFrame{
   JButton button;
   public page(){
       button = new JButton("SOURAV");

       add(button);

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}