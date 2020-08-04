import java.util.*;
import java.io.*;

class SortedNumber{
public static void main(String args[])throws Exception{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("How many no. do you want to enters:");
	int n=Integer.parseInt(br.readLine());

	Set s=new TreeSet();

	for(int i=0;i<n;i++){
		System.out.println("Enter the nos.");
		int x=Integer.parseInt(br.readLine());
		s.add(x);
	}
	
	Iterator itr=s.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}

	System.out.println("Enter the no. to be search:");
	int no=Integer.parseInt(br.readLine());

	if(s.contains(n))
		System.out.println("Number "+no+"found.");
	else 
		System.out.println("Number "+no+"Not found.");

} 
}

