import SY.*;
import TY.*;
import java.io.*;

class Student{
private int rollno;
private String name;
private SYMarks sy;
private TYMarks ty;
private String grade;

public Student(int rno,String n,int m,int e,int c,int t,int p){
	rollno=rno;
	name=n;
	sy=new SYMarks(m,e,c);
	ty=new TYMarks(t,p);
	int tot=sy.getCompTot()+ty.getTheory()+ty.getPract();
	float avg=tot/12.0f;
	
	if(avg>=70) grade="A";
	else if(avg>=60) grade="B";
	else if(avg>=50) grade="C";
	else if(avg>=40) grade="Pass";
	else if(avg>=30) grade="Fail";
}
public String toString(){
	return "ROLL NO:"+rollno+
	"\nNAME:"+name+
	"\nSY MARKS:\n"+sy+
	"\nTY MARKS:\n"+ty+
	"\n GRADE:"+grade;
}
}


class StudentTest{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no.of Students:");
int j=Integer.parseInt(br.readLine());
Student s[]=new Student[j];
for(int i=0;i<j;i++){
	System.out.println("Enter the roll no:");
	int rno=Integer.parseInt(br.readLine());
	System.out.println("Enter the name:");
	String n=br.readLine();
	System.out.println("Enter the maths marks:");
	int m=Integer.parseInt(br.readLine());
	System.out.println("Enter the electronics marks:");
	int e=Integer.parseInt(br.readLine());
	System.out.println("Enter the computer marks:");
	int c=Integer.parseInt(br.readLine());
	System.out.println("Enter the theory marks:");
	int t=Integer.parseInt(br.readLine());
	System.out.println("Enter the practical marks:");
	int p=Integer.parseInt(br.readLine());
	s[i]=new Student(rno,n,m,e,c,t,p);
}
for(int i=0;i<j;i++){
System.out.println(s[i]);
}
}
}
