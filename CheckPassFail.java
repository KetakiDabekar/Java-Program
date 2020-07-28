class CheckPassFail{
public static void main(String args[]){
int marks=Integer.parseInt(args[0]);
if(marks>=50)
System.out.println("PASS");
else
System.out.println("FAIL");
}
}

***********************************************************
OUTPUT:
dell@dell-Inspiron-15-3567:~/java$ java CheckPassFail 45
FAIL
dell@dell-Inspiron-15-3567:~/java$ java CheckPassFail 69
PASS

