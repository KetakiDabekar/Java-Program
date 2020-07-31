import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Applet extends JApplet implements KeyListener{

private String msg="";

public void init(){
addKeyListener(this);
}


public void paint(Graphics g){
super.paint(g);
g.drawString(msg,(getWidth()-msg.length()-55)/2,getHeight()/2);

}

public void keyReleased(KeyEvent ke){
msg="Release";
repaint();

} 



}
