import java.util.*;
class Diagonal{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the n");
int n=s.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1 || i==n || i==n-j+1)
				System.out.print("#");
			else 
				System.out.print(" ");
				     }
				System.out.println();
			     }
}
} 

