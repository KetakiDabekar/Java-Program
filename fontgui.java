import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FontGui extends JFrame {
	private JTextField t1;
	private JComboBox c1,c2;
	private JCheckBox cbBold,cbItalic;
	private JLabel size,style,font;		
	private String s[],s1[];	
FontGui(){

	try{
	String fontName[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//String fontName[]=GraphicsEnvironment.getLocalGraphicsEnvironment().gatAvailableFontFamilyNames();	
	setSize(500,500);
	setLocation(100,100);
	 	
	//initialization
	t1=new JTextField();
	c1=new JComboBox(s1);
	c2=new JComboBox(fontName);
	cbBold=new JCheckBox("Bold");
	cbItalic=new JCheckBox("Italic");
	size=new JLabel("Size");
	style=new JLabel("Style");
	font=new JLabel("Font");
	add(size);
	add(font);
	add(c1);
	add(cbBold);
	add(cbItalic);
	add(c2);
	add(t1);	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}catch(Exception e){}
}
public static void main(String arg[])throws Exception{
new FontGui();
}
}
