package Week3.day5;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray = test.toCharArray();
		int out=charArray.length;
		System.out.println(out);
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
			  char upperCase = Character.toUpperCase(charArray[i]);
			  System.out.print(upperCase);
			}
			else {
				System.out.print(charArray[i]);
			}
		}

	}

}
