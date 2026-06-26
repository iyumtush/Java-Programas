package CWT;

public class JavaConstructer {

	JavaConstructer() {
		// TODO Auto-generated method stub
		
		System.out.println("Hey");
		

	}
	
	JavaConstructer(String name){
		System.out.println(" How are you ?");
	}
	
	JavaConstructer(int num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		JavaConstructer obj1 = new JavaConstructer();
		JavaConstructer obj2 = new JavaConstructer("Tushar");
		JavaConstructer obj3 = new JavaConstructer(18);
		
		
	}

}
