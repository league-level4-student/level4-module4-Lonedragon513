package _04_hospital;

public class Patient extends Hospital{
	boolean feelsCaredFor = false;
	
	Patient(){
		
	}
	
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}



	public void checkPulse() {
		// TODO Auto-generated method stub
		feelsCaredFor = true;
	}

}
