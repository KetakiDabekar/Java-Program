import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class Number extends JFrame{
private JMenuBar mb;
private JMenu opr,sort;
private JMenuItem load,save,exit,sum,avg;
private JTextField t1;
private int a[]=new int[10];
private double sum=0.0,avg=0.0;
  
Number(){
	setSize(400,500);
	setLocation(200,200);
	mb=new JMenuBar();
	opr=new JMenu("operation");
	sort=new JMenu("sort");
	load=new JMenuItem("load");
	save=new JMenuItem("save");
	exit=new JMenuItem("exit");
	sum=new JMenuItem("sum");
	avg=new JMenuItem("average");
	t1=new JTextField();
	

	add(mb,"North");
	mb.add(opr);
	mb.add(sort);
	opr.add(load);
	opr.add(save);
	opr.add(exit);
	sort.add(sum);
	sort.add(avg);
	add(t1,"South");

	exit.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	System.exit(0);
	}
	});

	load.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	for(int i=0;i<10;i++){
	a[i]=(int)(Math.random()*10);
	sum+=a[i];
	}
	avg=sum/10;
	t1.setText(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+",");
	}
	});
	
	sum.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	t1.setText(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+"Sum:"+sum);
	}
	});
	avg.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
				t1.setText(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+","+a[5]+","+a[6]+","+a[7]+","+a[8]+","+a[9]+"Average : "+avg);
				
				}
		
		
			});	
	
	
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
  
  
public static void main(String args[]){
new Number();
}

}
