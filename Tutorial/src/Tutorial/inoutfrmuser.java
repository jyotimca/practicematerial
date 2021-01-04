package Tutorial;
import java.util.*;

public class inoutfrmuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		
		String scanned = sc.nextLine();
		
		System.out.println("Enter your age");
		
		Scanner st = new Scanner(System.in);
		int j = st.nextInt();
		

		System.out.println("Your name " +scanned);
		System.out.println("Age" + j);

	}

}
