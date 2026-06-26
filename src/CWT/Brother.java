package CWT;


// Hierarchical inheritance
class parent{
	public void property() {
		System.out.println("5 Cr");
	}
}

class sister extends parent{
	
}


public class Brother extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brother obj = new Brother ();
		obj.property();
		
		sister obj1 = new sister();
		
		obj.property();
		

	}

}
