class CozaLozaWoza{
public static void main(String arg[]){
boolean flag;
for(int i=1;i<=110;i++){
	flag=false;
	if(i%3==0){
	System.out.print("Coza");
	}
	if(i%5==0){
	System.out.print("Loza");
	}
	if(i%7==0){
	System.out.print("Woza");
	}
	if(flag==false){
	System.out.print(i);
	}
System.out.print(" ");
if(i%11==0)
System.out.println();
}
}
}
