package TY;

public class TYMarks{
private int theoryTot,practTot;

	public TYMarks(int t,int p){
		theoryTot=t;
		practTot=p;
	}
	public String toString(){
	return"THEORY:"+theoryTot+
		"\nPRACTICAL:"+practTot;
 	}
	
	public int getTheory(){
		return theoryTot;
	}
	
	public int getPract(){
		return practTot;
	}

}


