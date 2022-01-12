import java.applet.Applet;  
import java.awt.Graphics;  
  
public class ParameterApplet extends Applet{  
    public void paint(Graphics g){  
    String str=getParameter("Msg");  
    g.drawString(str,75, 75);  
    }  
}  
