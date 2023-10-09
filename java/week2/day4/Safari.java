package week2.day4;

public class Safari extends Browser {
	public void fullScreenMode() {
		System.out.println("Full Screen Mode");
	}
	public void readerMode() {
		System.out.println("Reader mode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari s = new Safari();
		s.closeBrowser();
		s.navigateBack();
		s.fullScreenMode();
		s.readerMode();
		s.openURL();

	}

}
