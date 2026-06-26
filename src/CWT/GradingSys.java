package CWT;

import java.util.Scanner;

public class GradingSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		
		int marks = sc.nextInt();
		
		if(marks >= 90) {
			
			System.out.println("You got A grade");
		}
		else if (75 <= marks || marks <= 89)  {
			System.out.println("You got B grade");
			
		}
		
		else if (50 <= marks || marks <= 74) {
			System.out.println("You got C grade");
			
		}
		else if (50 <= marks) {
			System.out.println("Fail");
			
		}
		else {
			System.out.println("Wrong input");
		}

	}

}
