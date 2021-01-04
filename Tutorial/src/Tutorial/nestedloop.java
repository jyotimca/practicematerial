package Tutorial;

import java.util.Scanner;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How are you feeling today");
		
		Scanner sc= new Scanner(System.in);
		
		String mood= sc.next();
		
		if (mood.equals("awesome")){
			
			System.out.println("please enter your age");
			Scanner sc1= new Scanner(System.in);
			String age = sc1.nextLine();
			
			int a= Integer.parseInt(age);
			
			if (a==30){
			System.out.println("happy to hear");
		}
			
			else {
				System.out.println("how can i help");
			}
			
		}
		
		else {
			
			System.out.println("please take care");
		}

	}

}
