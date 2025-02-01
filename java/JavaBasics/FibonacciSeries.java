package JavaBasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int num1=0, num2=1;
		System.out.print("Fibonacci series: "+ num1+","+num2);
		for(int i=2;i<range;i++)
		{
			int Next_num=num1+num2;
			System.out.print(","+Next_num);
			num1=num2;
			num2=Next_num;
		}

	}

}
