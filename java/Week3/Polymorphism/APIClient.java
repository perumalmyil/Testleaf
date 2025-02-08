package Week3.Polymorphism;

public class APIClient {
	public void sendRequest(String endpoint)
	{
		System.out.println("this method with single string argument");
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("this method have two string and boolean argument");
		
	}

	public static void main(String[] args) {
		APIClient obj=new APIClient();
		obj.sendRequest("first method");
		obj.sendRequest("second", "overloading", true);

	}

}
