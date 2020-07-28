import java.io.*;
class ArrayMax{
public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public static void accept(int a[])throws Exception{
	for(int i=0;i<a.length;i++){
		System.out.print("["+i+"]=");
		a[i]=Integer.parseInt(br.readLine());
}
}

public static int FindMax(int a[]){
	int max=a[0];
	for(int i=0;i<a.length;i++){
		if(a[i]>max) 
			max=a[i];
}
return max;
}


public static void main(String args[])throws Exception{
System.out.print("Enter the number of elements:");
int n=Integer.parseInt(br.readLine());
int nos[]=new int[n];
accept(nos);
System.out.println("Max="+FindMax(nos));

}
}
