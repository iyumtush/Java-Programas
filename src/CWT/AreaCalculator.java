package CWT;

public class AreaCalculator {
	
	public void area(int l , int b) {
		System.out.println(l*b);
	}
	
	public void area(int s) {
		
		System.out.println(s*s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalculator c = new AreaCalculator();
		
		c.area(5, 4);
		c.area(5);
		
		
		

	}

}
