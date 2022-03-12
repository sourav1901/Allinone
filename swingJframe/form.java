import javax.swing.JFrame;


import java.awt.*;
// import java.awt.event.*;


public class form {
    public static void main(String[] args) {
        sourav s = new sourav();
    }
}

    class sourav extends JFrame{

        public sourav(){
            setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }
    
