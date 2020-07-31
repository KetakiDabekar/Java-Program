import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class applet extends JApplet implements MouseListener,MouseMotionListener{
	private String msg="";
	
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);

	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(msg,(getWidth()-msg.length()-55)/2,getHeight()/2);
	}
	public void mouseMoved(MouseEvent me){
		msg="Moved";
		repaint();
	}
public void mouseExited(MouseEvent me){
		msg="Exit";
		repaint();

}

public void mouseEntered(MouseEvent me){
		msg="Enter";
		repaint();

}

public void  mouseReleased(MouseEvent me) {
		msg="Release";
		repaint();

}


public void  mousePressed(MouseEvent me) {
		msg="Press";
		repaint();

}
public void  mouseClicked(MouseEvent me) {
		msg="Click";
		repaint();

}
public void  mouseDragged(MouseEvent me) {
		msg="Drag";
		repaint();

}



}
