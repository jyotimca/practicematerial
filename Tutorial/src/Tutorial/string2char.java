package Tutorial;
import java.util.*;

public class string2char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int len = s.length();
		char[] chararray= new char[len];
		chararray= s.toCharArray();
		
		for ( int i=0;i<len ; i++){
			System.out.println(chararray[i]);
		}
		

	}

}
