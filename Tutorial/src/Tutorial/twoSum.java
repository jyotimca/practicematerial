package Tutorial;

import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {75,412,519,703};
		
		//75 =0, 703 =1;412=2 , 519=3
		
		int target=778;
		
		
		HashMap <Integer,Integer> mayank= new HashMap<Integer,Integer>();
		
		for( int i =0 ; i <arr.length; i++){
			int temp=target-arr[i];
			
			if(mayank.containsKey(temp)){
				
				System.out.println("In loop");
			
				System.out.println("value at index: " +i+" and value at index: " +mayank.get(temp));
			}
			
			
				mayank.put(arr[i], i);
				
			
			
		}
		

	}

}
