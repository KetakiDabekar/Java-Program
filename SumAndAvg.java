import java.util.*;
class SumAndAvg{
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the no");
	int number=s.nextInt();
	int sum=0;
	for(int i=1;i<=number;i++)
		sum=sum+i;

	System.out.println("sum is"+sum);
	System.out.println("avg"+((float)sum/number));
	}
}		
		
		
