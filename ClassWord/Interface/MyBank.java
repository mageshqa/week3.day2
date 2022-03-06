package week3.day2;

public class MyBank {

	public static void main(String[] args) {

		SBI sbiObj = new SBI();// implementation class obj
		RBI rbiObj = new SBI();// interface obj

		/**
		 * implementation class obj can access all methods within implementation class
		 * and interface
		 */
		sbiObj.openAccount();
		sbiObj.provideDebitCard();
		sbiObj.provideInsurance();

		rbiObj.openAccount();
		rbiObj.provideDebitCard();
		/**
		 * Below line is Scope Restriction of Interface object. Interface object cannot
		 * access methods specific to Implementation class alone and not present in
		 * Interface
		 */
		// rbiObj.provideInsurance();
	}

}
