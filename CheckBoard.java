import java.util.*;
class CheckBoard{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the no.of lines:");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	if(i%2==0)
	System.out.print(" ");
	for(int j=1;j<=n;j++){
	System.out.print("# ");
	}
System.out.println();
}
}
}
