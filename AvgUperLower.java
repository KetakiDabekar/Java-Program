import java.util.*;
class Avg{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the lower bound:");
int lb=s.nextInt();
System.out.println("Enter the upper bound:");
int up=s.nextInt();
float sum=0;
int count=0;
for(int i=lb;i<=up;i++)
	{
		sum=sum+i;
		count++;
		
	}
	System.out.println("No.of elements in the range:"+count);
	System.out.println("Avg="+sum/count);
}
}
