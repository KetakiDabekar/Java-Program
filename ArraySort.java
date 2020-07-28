import java.io.*;
class ArraySort{
public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the number of string:");
int n=Integer.parseInt(br.readLine());
String names[]=new String[n];
	for(int i=0;i<n;i++){
	System.out.print("names["+i+"]=");
	names[i]=br.readLine();
	}
	for(int i=0;i<n-1;i++){
	for(int j=0;j<n-1-i;j++){
		if(names[j].compareTo(names[j+1])>0){
			String t=names[j];
			names[j]=names[j+1];
			names[j+1]=t;
		}
	}
	}
	System.out.println("sorted Names:");
	for(int i=0;i<n;i++)
		System.out.println(names[i]);
}
}
