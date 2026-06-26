package CWT;

public class Grandfather {

	public void land() {
       System.out.println("3 Acres");
	}
}

class father extends Grandfather {
	
	public void land() {
		System.out.println("2 Acre");
		
	}
}

public class Son extends father {
	public static void main (String[] args) {
		Son tushar = new Son();
		
		tushar.land();
		tushar.land();
	}
}
