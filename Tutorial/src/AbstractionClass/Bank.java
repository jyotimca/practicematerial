package AbstractionClass;

public abstract class Bank {
	
	// abstraction 
	
	public abstract void  loan();
	
	public void credit(){
		
		System.out.println("This is for credit");
	}
	
	public void debit(){
		
		System.out.println("this is for debit");
	}
	

}
