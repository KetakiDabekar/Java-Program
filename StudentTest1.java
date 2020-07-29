interface Exam{
	void calcPercent();
}
class Student implements Exam{
	private int rollno;
	private String name;
	private float m1,m2,m3;
public Student(int rno,String n,float a,float b,float c){
	rollno=rno;
	name=n;
	m1=a;
	m2=b;
	m3=c;
}
public void calcPercent(){
float per=(m1+m2+m3)/3;
System.out.println("Percentage:"+per);
}
public void displayStudent(){
System.out.println("RollNo:"+rollno+"\n Name:"+name+"\nmarks1:"+m1+"\nmarks2:"+m2+"\nmarks3:"+m3);
calcPercent();
}
}
class StudentTest{
public static void main(String args[]){
	Student s=new Student(101,"Ram",67,98,92);
	s.displayStudent();
}
}
