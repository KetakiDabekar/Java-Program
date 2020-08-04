import java.io.*;
class PhoneNumberDemo{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true){
	System.out.println("1]search the name and display number\n"+
			"2]add name and number\n"+"3]Exit"+"Enter your choice(1-3):");
	int ch=Integer.parseInt(br.readLine());
	switch(ch){
	case 1:
	System.out.println("enter the name to be search:");
	String str=br.readLine();
	String s="";
	BufferedReader bw1=new BufferedReader(new FileReader("phone.txt")); 
	while((s=bw1.readLine())!=null){
	int i=s.indexOf(" ");
	String name=s.substring(0,i);
	String no=s.substring(i+1);
	if(name.equals(str))
	{
		System.out.println("PHONE NUMBER:"+no);
		break;
	}	
	}
	if(str==null)
		System.out.println("Name"+str+"Not Found.");
	bw1.close();
	break;
	case 2:
	System.out.println("Enter the name:");
	String name=br.readLine();
	System.out.println("Enter the number:");
	String no=br.readLine();
	BufferedWriter bw=new BufferedWriter(new FileWriter("phone.txt",true)); 
	bw.write(name+" "+no+"\n");
	bw.close();
	break;
	case 3:
	System.exit(0);
	}
}
}
}
