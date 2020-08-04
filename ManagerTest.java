import java.io.*;

class Employee{
private int id;
private String name,dept;
private float salary;

	public Employee(){
		id=0;
		name="";
		dept="";
		salary=0.0f;
	}
	public Employee(int i,String n,String d,float s){
			id=i;
			name=n;
			dept=d;
			salary=s;
	}
public void accept()throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the id:");
id=Integer.parseInt(br.readLine());
System.out.println("Enter the name:");
name=br.readLine();
System.out.println("Enter the department:");
dept=br.readLine();
System.out.println("Enter the salary:");
salary=Float.parseFloat(br.readLine());
}

public void display(){
System.out.println("ID:"+id+
		"\nNAME:"+name+
		"\nDEPARTMENT:"+dept+
		"\nSALARY:"+salary);

}
public float getSalary(){
return salary;
}
}

class Manager extends Employee{
private float bonus;
	public Manager(){
	super();
	bonus=0.0f;
	}
	public Manager(int i,String n,String d,float s,float b){
	super(i,n,d,s);
	bonus=b;
	}
	public void accept()throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	super.accept();
	System.out.println("Enter the bonus:");
	bonus=Float.parseFloat(br.readLine());
	}
	public void display(){
	super.display();
	System.out.println("BONUS:"+bonus);
	}
	public float getBonus(){
	return bonus;
	}
}

class ManagerTest{
	public static void main(String args[])throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no. of Manager:");
	int n=Integer.parseInt(br.readLine());
	Manager m[]=new Manager[n];

	for(int i=0;i<n;i++){
	m[i]=new Manager();
	m[i].accept();
	}

	float max=-9999;
	int pos=-1;

	for(int i=0;i<n;i++){
	float tot=m[i].getSalary()+m[i].getBonus();
	if(tot>max){
		max=tot;
		pos=i;
	}
	}
	System.out.println("Manager with max salary:");
	m[pos].display();
	
}

