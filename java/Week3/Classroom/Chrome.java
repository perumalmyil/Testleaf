package Week3.Classroom;

public class Chrome extends Browse{
	public void openIncognito() {
		System.out.println("open Incognito from chrome class");
	}
	public void clearCache() {
		System.out.println("clear cahce form chrome class");
	}
	
	public static void main(String[] args) {
		Chrome object1=new Chrome();
		object1.clearCache();
		object1.openIncognito();
		object1.navigateBack();
		object1.openURL();
		object1.closeBrowser();
		String browserName_frmchrome = object1.browserName;
		System.out.println(browserName_frmchrome);
		String browserVersion_frmchrome = object1.browserVersion;
		System.out.println(browserVersion_frmchrome);
		System.out.println(object1.name);
	}

}
