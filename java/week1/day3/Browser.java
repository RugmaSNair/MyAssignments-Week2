package week1.day3;

public class Browser {
	



	public String launchBrowser( String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
       //ClassName object = new ClassName ();
		Browser app=new Browser();
	
		
		app.launchBrowser("browser" );
		app.loadUrl();
	}

}
