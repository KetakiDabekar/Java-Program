import java.io.*;

class InsufficientFundsException extends Exception{}

class SavingAccount{
	private int accno;
	private String acname;
	private double bal;
SavingAccount(int accno,String acname,double bal){
this.accno=accno;
this.acname=acname;
this.bal=bal;
}

public void Withdraw()throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the amt to be withdraw:");
	float amt=Float.parseFloat(br.readLine());
	if(bal-amt<500){
		throw new InsufficientFundsException();
	}
	else{
		bal-=amt;
		System.out.println("Withdraw Sucessfully");
	}
}

public void Deposite()throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the amt to be Deposited:");
	float amt=Float.parseFloat(br.readLine());
	bal+=amt;
	System.out.println("Deposited Sucessfully");
}
public void View(){
	System.out.println("Balance:"+bal);
	}


public static void main(String args[])throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the accno:");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter the accname:");
String na=br.readLine();
System.out.println("Enter the bal:");
double b=Double.parseDouble(br.readLine());
SavingAccount sa=new SavingAccount(n,na,b);
		while(true){
			System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
			System.out.print("Enter your choice (1-4):");
                                                               
			int ch=Integer.parseInt(br.readLine());

			switch(ch){
			case 1: 
				sa.Deposite();
				break;
			case 2:
				sa.Withdraw();
                                break;
			case 3: 
				sa.View();
				break;
			case 4: 
				System.exit(0);
			}
		}
}
}






