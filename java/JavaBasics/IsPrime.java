package JavaBasics;

public class IsPrime {

	public static void main(String[] args) {
		int num=7;
		boolean IsPrime=true;
		if(num<=1){
			IsPrime=false;
			System.out.println("Given number is not Prime number");}
		else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					IsPrime=false;
					break;  }
		                           }
			if(IsPrime==true) {System.out.println(num+" is a Prime Number");}
			else {System.out.println(num+" is not a Prime Number");}    
		}
		
	}

}
