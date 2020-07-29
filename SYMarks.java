package SY;

public class SYMarks{
private int mathTot,electTot,compTot;

	public SYMarks(int m,int e,int c){
		mathTot=m;
		electTot=e;
		compTot=c;
	}


	public String toString(){
	return"MATH TOT:"+mathTot+
		"\nELECT TOT:"+electTot+
		"\nCOMP TOT:"+compTot; 
	}
	public int getCompTot(){
		return compTot;
	}
}

