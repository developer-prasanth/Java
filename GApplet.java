import java.applet.*;
import java.awt.*;

public class GApplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(50, 50, 500, 50);
        g.drawRect(50, 100, 200, 100);
        g.fillRect(300, 100, 200, 100);
        g.drawRoundRect(50, 250, 200, 100, 20, 20);
        g.fillRoundRect(300, 250, 200, 100, 20, 20);
        g.drawOval(50, 400, 200, 100);
        g.fillOval(300, 400, 200, 100);

    }
}

/*<applet code="GApplet" height="500" width="700" border="1">
    </applet>*/
