package swingJframe;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;



public class FirstGui {
    public static void main(String[] args) {
        sourav obj = new sourav();
        
    }
    
}
class sourav extends JFrame{
    public sourav(){
        JLabel l = new JLabel("sourav raj");
        JLabel l1 = new JLabel("we are one");
        add(l);
        add(l1);
       
        //FlowLayout GridLayout Null
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
