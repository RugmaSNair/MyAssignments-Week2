package week2.day4;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("take snap");
	}
	public void clearCookies() {
		System.out.println("Clear cookies");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();

	}

}
