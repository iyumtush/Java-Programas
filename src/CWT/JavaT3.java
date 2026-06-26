package CWT;

import java.util.Scanner;

public class JavaT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		int result = 0;
		
		int i = 1;
		while(i<=10){
			
			result = num * i;
			i++;
			System.out.println(result);
		}
		
		
	}

}
