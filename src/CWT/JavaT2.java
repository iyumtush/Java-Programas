package CWT;

import java.util.Scanner;

public class JavaT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=num;i++)
		
		{   
			
			sum += i;
			
			
		}
      System.out.println("The sum of 1 to enterd number is :" +sum);
	}

}
