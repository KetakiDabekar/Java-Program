import java.io.*;
class Vehicle{
private String company;
private float price;

	public void accept()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the company name:");
		company=br.readLine();
		System.out.println("Enter the price:");
		price=Float.parseFloat(br.readLine());
	}
	public void display(){
		System.out.println("COMPANY:"+company+
				"\nPRICE:"+price);
	}
}
class LightMotorVehicle extends Vehicle{
private float mileage;
	public void accept()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		super.accept();
		System.out.println("Enter the Mileage:");
		mileage=Float.parseFloat(br.readLine());
	}
	public void display(){
		super.display();
		System.out.println("MILEAGE:"+mileage);
	}
}
class HeavyMotorVehicle extends Vehicle{
private float capacity;
	public void accept()throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		super.accept();
		System.out.println("Enter the capacity:");
		capacity=Float.parseFloat(br.readLine());
	}
	public void display(){
		super.display();
		System.out.println("CAPACITY:"+capacity);
	}
}
class VehicleTest{
public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no.of vehicle:");
		int n=Integer.parseInt(br.readLine());
		Vehicle v[]=new Vehicle[n];
		for(int i=0;i<n;i++){
		System.out.println("HEAVYMTVEHICLE(0)/LIGHTMTVEHICLE(1)");
		int ch=Integer.parseInt(br.readLine());
		if(ch==0)
			v[i]=new HeavyMotorVehicle();
		if(ch==1)
			v[i]=new LightMotorVehicle();
		
		v[i].accept();
		}
for(int i=0;i<n;i++){
v[i].display();
}
}
}
