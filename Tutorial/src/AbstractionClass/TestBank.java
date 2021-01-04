package AbstractionClass;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.loan();
		hb.fund();

	}

}
