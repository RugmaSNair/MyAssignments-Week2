package week2.day4;

public class OverLoading {
	
	public void reportStep(String message, String status) {
		
		System.out.println(message +" is "+status);
		
	}
	
	public void reportStep(String message2, String status2, boolean snap) {
		if(snap==true)
			 System.out.println("The Snap is taken");
		else
			System.out.println("No snap is taken");
		 System.out.println(message2 +" is "+status2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading ob = new OverLoading();
		ob.reportStep("Result", "pass");
		ob.reportStep("Result", "fail", true);
		
		

	}

}
