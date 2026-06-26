package CWT;



abstract class ATM {
	 abstract void withdraw();
	
}

class HDFC extends ATM {
	void withdraw() {
		System.out.println("Money Withdraw Successfully");
	}
}





public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ATM m = new HDFC();
		m.withdraw();
	}

}
