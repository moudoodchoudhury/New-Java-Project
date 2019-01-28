package AbstractionInheritance;

public class TestBankDutch {

	public static void main(String[] args) {

		//statc polymorphism or Compile time polymorphism
		DutchBanglaBank obj = new DutchBanglaBank();
		obj.credit();
		obj.debit();
		obj.loan();
		obj.mutualfunds();

	}

}
