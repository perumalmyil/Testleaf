package Week3.Classroom;

public class SubClass extends SuperClass{
	public void takeSnap() {
		super.takeSnap("from parent");
		System.out.println("take snap form subclass");
	}

	public static void main(String[] args) {
		SubClass sub=new SubClass();
		sub.takeSnap();
	

	}

}
