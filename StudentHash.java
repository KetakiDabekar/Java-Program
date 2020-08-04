import java.util.*;
import java.io.*;

class StudentHash{
public static void main(String args[])throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter  no of student:");

	int n=Integer.parseInt(br.readLine());
	
	Hashtable ht=new Hashtable();
	for(int i=0;i<n;i++){
		System.out.println("Enter the name of student:");
		String name=br.readLine();
		System.out.println("Enter the percentage of student:");
		float per=Float.parseFloat(br.readLine());
		ht.put(name,per);
	}
	Set s=ht.keySet();
	Iterator itr=s.iterator();
	System.out.println("Name\t Percentage\t");

	while(itr.hasNext()){
		String k=(String)itr.next();
		System.out.println(k+"\t"+ht.get(k));
	}
	System.out.println("Enter the name to be search:");
	String name=br.readLine();
	if(ht.containsKey(name))
		 System.out.println("Percentage of:"+name+"is"+ht.get(name));
	else
		System.out.println(name+"not found.");
}
}
