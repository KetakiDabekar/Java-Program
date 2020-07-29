import java.io.*;
class Student{
	private int rollNo;
	private String name;
	private float per;
	private static int count;
	public Student(){
		rollNo=0;
		name="";
		per=0.0f;
		count++;
	}
	public Student(int rno,String n,float p){
		rollNo=rno;
		name=n;
		per=p;
		count++;
	}
	public String toString(){
		return "Roll NO:"+rollNo+
			"\nName:"+name+
			"\n Percentage:"+per;
	}
	public static void discount(){
		System.out.println("No.of object created:"+count);
	}
}


class StudentDemo{
	public static void main(String args[]) throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String ch="";
	do{
	System.out.print("Enter the Roll No.:");
	int rno=Integer.parseInt(br.readLine());
	System.out.print("Enter the Name:");
	String n=br.readLine();
	System.out.print("Enter the Parcentage:");
	float p=Float.parseFloat(br.readLine());
	Student s=new Student(rno,n,p);
	System.out.println(s);
	Student.discount();
	System.out.print("Continue Yes/No?");
	ch=br.readLine();
	}while(ch.equals("Yes"));
	}
}
