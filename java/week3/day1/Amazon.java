package week3.day1;

public class Amazon extends CanaraBank {
	
	public void recordPaymentDetails() {
		System.out.println("Record of payment details");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we can call methods with reference to interface or concrete class 
		
		Payments obj = new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.internetBanking();
		obj.upPayments();
		
		Amazon ob = new Amazon();
		ob.recordPaymentDetails();

	}

}
