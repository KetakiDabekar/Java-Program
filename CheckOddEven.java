import java.util.*;
class CheckOddEven{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int number=s.nextInt();
if(number%2==0)
	System.out.println("Even Number");
else
	System.out.println("Odd Number");
}
}
