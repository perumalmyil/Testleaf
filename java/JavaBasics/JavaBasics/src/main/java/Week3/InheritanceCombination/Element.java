package Week3.InheritanceCombination;

public class Element extends Button{
	public void dropdown()
	{
		System.out.println("this method dropdown from Element class");
	}

	public static void main(String[] args) {
		Element el=new Element();
		el.dropdown();
		el.submit();
		el.click();
		el.setText("Myil");
		System.out.println("--- now calling the methods from button object---");
		Button bt=new Button();
		bt.submit();
		bt.click();
		bt.setText("Testleaf");
		
	
		

	}

}
