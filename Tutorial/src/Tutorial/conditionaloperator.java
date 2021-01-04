package Tutorial;

public class conditionaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 6;
		int y= 23;
		int z=10;
		boolean compare= x>y && z<y;
		
		boolean compare2 = x>y || z<y;
		
		boolean compare3 = !(false);
		
		System.out.println(compare);
		
		System.out.println (compare2);
		
		System.out.println(compare3);

	}

}
