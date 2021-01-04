package Tutorial;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		if (name.equals("jyoti")) {
			
			System.out.println(name);
			
		}
		else if (name.equals("mayank")){
		
		System.out.println("this is outside");

	}
		else {
			System.out.println("name print");
		}

}
}
