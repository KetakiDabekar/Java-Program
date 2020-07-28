import java.io.*;
class ArrayLength{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the number of string:");
int n=Integer.parseInt(br.readLine());
String names[]=new String[n];
	for(int i=0;i<n;i++){
	System.out.print("names["+i+"]=");
	names[i]=br.readLine();
	}
	int max="-999";
	for(int i=0;i<n;i++){
		if(a[i]>max) 
			max=a[i];
	}
	System.out.println("max=",+max);
}
}
