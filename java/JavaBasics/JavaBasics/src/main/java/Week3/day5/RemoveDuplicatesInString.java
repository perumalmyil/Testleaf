package Week3.day5;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[j]=" ";
					count++;
				}
				
			}
		}
		for(String out: split)
		{
			System.out.print(out+" ");
			
		}
		System.out.println("");
		System.out.println("number of duplicate words find in the given string: "+count);
	}

}
