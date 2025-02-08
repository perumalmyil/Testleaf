package Week3.singleinheritance;

public class LoginTestData extends TestData {
	public void enterUsername()
	{
		System.out.println("enterusername method from LoginTest child class");
		
	}
	public void enterPassword()
	{
		System.out.println("enterpassword method from LoginTest child class");
	}

	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterUsername();
		ltd.enterPassword();
		ltd.enterCredentials(20);
		ltd.navigateToHomePage();
		System.out.println("successfully called the current and parent class methods");
		
	}

}
