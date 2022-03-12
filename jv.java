import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class jv extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 30, 20);
        g.setColor(Color.GREEN);
        g.fillRect(120, 140, 120, 140);

        g.setColor(Color.ORANGE);
        g.drawOval(123, 134,120,110);
        g.fillOval(123, 134,120,110);
    }
}
/*
<applet code="jv.class",width="600",height="700">

</applet>
*/