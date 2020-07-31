import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Applet2 extends JApplet implements KeyListener{
	String msg="";
	
	public void init(){
		addKeyListener(this);	
		setFocusable(true);	
		requestFocusInWindow();
	}

	public void paint(Graphics g){

		super.paint(g);
		g.drawString(msg,(getWidth()-55)/2,getHeight()/2);	
	
	}

	public void keyReleased(KeyEvent ke){
			msg="KeyReleased";
			repaint();	
	}

	public void keyPressed(KeyEvent ke){

			msg="KeyPressed  ";
			repaint();	
	}
	
	public void keyTyped(KeyEvent ke){

			msg="KeyTyped   ";
			repaint();	
	}


}

/*
<applet code="Applet2" width="400" height="400"></applet>
*/
