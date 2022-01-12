import java.applet.Applet;
import java.awt.Graphics;
class LifeCycle extends Applet{
    public void init(){
        System.out.println("Initialization");
    }
    public void start(){
        System.out.println("Starting");
    }
    public void paint(Graphics graphics){
        graphics.drawString("Hello World!", 75, 150);
    }
    public void stop(){
        System.out.println("Stop");
    }

    public void destory(){
        System.out.println("Destroy");
    }
}