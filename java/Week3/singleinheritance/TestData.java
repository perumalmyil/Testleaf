package Week3.singleinheritance;

public class TestData {
	
	public void enterCredentials(int a)
	{
		System.out.println("this method from TestData Parent class with Int param:"+a);
	
		
	}
	public String navigateToHomePage()
	{
		System.out.println("this method from TestData parent class without param");
		return null;
		
	}

	public static void main(String[] args) {
		
		TestData td=new TestData();
		td.enterCredentials(10);
		td.navigateToHomePage();
	}

}
