package Week3.Classroom;

public class Edge extends Browse{

	public void takeSnap() {
		System.out.println("take snap from Edge class");
	}
	public void clearCookies() {
		System.out.println("clear cookie from Edge class");
	}
	public static void main(String[] args) {
		Edge ed=new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		String browserName_frmed = ed.browserName;
		String browserVersion_frmed = ed.browserVersion;
		System.out.println(browserName_frmed);
		System.out.println(browserVersion_frmed);
		
	}

}
