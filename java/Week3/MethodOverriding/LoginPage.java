package Week3.MethodOverriding;

public class LoginPage extends BasePage{
	public void performCommonTasks()
	{
		System.out.println("this method is @overriden on loginpage class");
	}

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();
		lp.clickElement();
		lp.performCommonTasks();
		lp.enterText();
		lp.findElement();
		

	}

}
