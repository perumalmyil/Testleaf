package Week3.MethodOverriding;

public class BasePage {
	public void findElement()
	{
		System.out.println("findelement this mehtod is form basepage class");
	}
	public void clickElement()
	{
		System.out.println("click element this mehtod is form basepage class");
	}
	public void enterText()
	{
		System.out.println("enter text this mehtod is form basepage class");
	}
	public void performCommonTasks()
	{
		System.out.println("perform common task this mehtod is form basepage class");
	}

	public static void main(String[] args) {
		
		BasePage bp=new BasePage();
		bp.findElement();
		bp.enterText();
		bp.clickElement();
		bp.performCommonTasks();

	}

}
