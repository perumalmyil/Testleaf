package Week3.Classroom;

public class ReverseString {

	public static void main(String[] args) {
		String CompanyName="TestLeaf";
		char[] charArray = CompanyName.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
			
		}

	}

}
