package Tutorial;

import java.util.Scanner;

public class checkConstructor {
	
	int num;
	
	checkConstructor(){
		
		System.out.println("This is default constructor");
	}
	
checkConstructor( int x){
		
		System.out.println("This is default constructor");
		
		num = x;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkConstructor cc = new checkConstructor();
		System.out.println("initialize the default value" + cc.num);
		
		System.out.print("Enter a value");
		
		Scanner sc = new Scanner (System.in);
		
		int temp = sc.nextInt();
		
		checkConstructor ccd = new checkConstructor(temp);
		System.out.println("initialize the default value" + ccd.num);
		
		
		
				
	}

}
