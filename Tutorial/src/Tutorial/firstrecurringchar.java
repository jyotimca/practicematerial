package Tutorial;

import java.util.HashSet;
import java.util.Scanner;

public class firstrecurringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] chararray= s.toCharArray();
		System.out.println(recurring1(chararray));
		//findfirstrecurring(chararray);

	}
	
	/*static void findfirstrecurring(char[] arr) {
		System.out.println(arr.length);
	    for (int i=0 ; i<arr.length;){
	    	
	    	if (arr[i]==arr[i+1]){
	    		
	    		System.out.println("the first recurring character is " + arr[i]);
	    		break;
	    	}
	    	else
	    	{
	    		i++;
	    	}
	    }
	    
	 	
	}*/
	
	  static char recurring1(char[] arr1){
		  HashSet<Character> h = new HashSet<>();
		  
		  for (int i=0 ; i<arr1.length;i++){
			  
			  char c= arr1[i];
			  
			  if(h.contains(c)){
				  return c;
			  }
			  else {
				  h.add(c);
			  }
		  }
		  return '\0';
	
	    	
	    	
	    }

}
