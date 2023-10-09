package week3.day1;

public abstract class CanaraBank implements Payments {
	
	//public void recordPaymentDetails() {
		//System.out.println("Get the payment details");
	//}
	
public void cashOnDelivery() {
	System.out.println("Cash on delivery");
}
	
	public void upPayments() {
		System.out.println("up payment details");
	}
	
	public void cardPayments() {
		System.out.println("card payment details");
	}
	
	public void internetBanking() {
		System.out.println("Net banking");
	}
	
	public abstract void recordPaymentDetails();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
