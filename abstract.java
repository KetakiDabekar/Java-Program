import java.io.*;
abstract class Shape{
	protected double d1,d2;
	public Shape(double s1,double s2){
	this.d1=s1;
	this.d2=s2;
	}
	public abstract double CalcArea();
	public abstract double CalcVolume();
}

class Sphere extends Shape{
	public Sphere(double r){ 
	super(r,0)
	}
	public double CalcArea(){
		return 4*Math.PI*d1*d1;
	}
	public double CalcVolume(){
		return (4*Math.PI(d1*d1*d1))/3;
	}
}

class Cone extends Shape{
	public Cone(double radius,double height){
	super(r,h)	
	}
	public double CalcArea(){
	return Math.PI*d1*(d1+
			Math.sqrt(d1*d1+d2*d2));

	}
	public double CalcVolume(){
		return Math.PI*d1*d1*d2/3;
	}
}

class Cylinder extends Shape{
	public Cylinder(double radius,double height){
	super(r,h)	
	}
	public double CalcArea(){
	return 2*Math.PI*d1*(d1+d2);
	}
	public double CalcVolume(){
		return Math.PI*d1*d1*d2;
	}
}


class abstract_test{

}



