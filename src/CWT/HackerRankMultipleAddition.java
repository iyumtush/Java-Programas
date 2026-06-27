package CWT;

import java.util.Scanner;

public class HackerRankMultipleAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		
		int num =  sc.nextInt();
		
		int sum = 0 ;
	
		
		
			
		for(int i = 1; i < num ; i++){
			if( i % 3 == 0 || i % 5 == 0) {
				sum += i ;
			}
		}
		 
		 
			 System.out.println("Sum = " + sum);
		}
		

	}


