import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Hobby extends JFrame{
private JTextField t1;
private JPanel p1,p2;
private JLabel display;
private JRadioButton rbFy,rbSy,rbTy;
private JCheckBox chmusic,chdance,chsport;
private ButtonGroup bg;


Hobby(){
	setSize(700,700);
	setLocation(400,400);
	t1=new JTextField();
	p1=new JPanel();
	p2=new JPanel();
	display=new JLabel("Name:-----------,Class:----------------,Hobby:-----------------");
	rbFy=new JRadioButton("FY");
	rbSy=new JRadioButton("SY");
	rbTy=new JRadioButton("TY");
	
	chmusic=new JCheckBox("Music");
	chdance=new JCheckBox("Dance");
	chsport=new JCheckBox("Sport");
	bg=new ButtonGroup();
	add(p1,"North");
	add(p2,"Center");
	add(display,"South");
	
	
	bg.add(rbFy);
	bg.add(rbSy);
	bg.add(rbTy);
	
	
	p1.setLayout(new GridLayout(1,2));
	p2.setLayout(new GridLayout(4,2));
	
	p1.add(new JLabel("Your Name:"));
	p1.add(t1);
	
	p2.add(new JLabel("Your Class:"));
	p2.add(new JLabel("Your Hobbies:"));
	p2.add(rbFy);
	p2.add(chmusic);
	p2.add(rbSy);
	p2.add(chdance);
	p2.add(rbTy);
	p2.add(chsport);
	
	EventHandler eh=new EventHandler();
	
	rbFy.addItemListener(eh);	
	rbSy.addItemListener(eh);	
	rbTy.addItemListener(eh);		

	chmusic.addItemListener(eh);
	chdance.addItemListener(eh);	
	chsport.addItemListener(eh);

	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);


}
class EventHandler implements ItemListener{
	public void itemStateChanged(ItemEvent ie){
	
	String cls="",hobby="";
	if(rbFy.isSelected()==true)
		cls="FY";
	else if(rbSy.isSelected()==true)
		cls="SY";
	else if(rbTy.isSelected()==true)
		cls="TY";

	if(chmusic.isSelected()==true)
		hobby=hobby+"Music";
	if(chdance.isSelected()==true)
		hobby=hobby+"Dance";
	if(chsport.isSelected()==true)
		hobby=hobby+"Sport";
		display.setText("Name : "+t1.getText()+" Class : "+cls+" Hobbies : "+hobby);
}




} 
	



public static void main(String args[]){
	new Hobby();
}


}
