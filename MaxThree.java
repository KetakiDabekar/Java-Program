class MaxThree{
public static void main(String args[]) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);

		int max=a>b?(a>c?a:c):(b>c?b:c);
System.out.println("Max("+a+","+b+","+c+")="+max);
}
}


*******************************************************
dell@dell-Inspiron-15-3567:~/java$ java MaxThree 2 3 6
Max(2,3,6)=6
dell@dell-Inspiron-15-3567:~/java$ java MaxThree 45 545 1000
Max(45,545,1000)=1000

