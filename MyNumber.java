import java.io.*;

class MyNumber{
private int n;
	public MyNumber(){
	n=0;
	}
	
	public MyNumber(int n){
	this.n=n;
	}
	
	public boolean isNegative(int n){
	return n<0;
	}
	
	public boolean isPositive(int n){
	return n>=0;
	}
	
	public boolean isZero(int n){
	return n==0;
	}
	
	public boolean isEven(int n){
	return n%2==0;
	}
	
	public boolean isOdd(int n){
	return n%2==1;
	}


}
class MyNumberTest{
public static void main(String args[]){
int n=Integer.parseInt(args[0]);
MyNumber o=new MyNumber(n);
System.out.println("NUMBER IS POSITIVE:"+o.isPositive(n));
System.out.println("NUMBER IS NEGATIVE:"+o.isNegative(n));
System.out.println("NUMBER IS ZERO:"+o.isZero(n));
System.out.println("NUMBER IS EVEN:"+o.isEven(n));
System.out.println("NUMBER IS ODD:"+o.isOdd(n));
}
}
