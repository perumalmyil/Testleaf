package Week3.Classroom;

public class Java {
	public void reportStep(String msg, String status) {
		System.out.println("String for msg and status");
	}
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("msg and status and snap");
		if(snap) {System.out.println("take a snap");}
		else {System.out.println("no need to take a snap");}
	}
	
	public static void main(String[] args) {
		Java obj=new Java();
		obj.reportStep("first", "Method");
		obj.reportStep("Second", "overloaded method", true);
		
	}

}
