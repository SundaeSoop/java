package method;

import java.util.Scanner;

public class integers {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first interger: ");
			
			int n1 = scan.nextInt();
			System.out.println("Enter the second interger: ");
			
			int n2 = scan.nextInt();
			System.out.println("Enter the third interger:");
			
			int n3 = scan.nextInt();
			
			if( n1 + n2 == n3 && n1 * n2 == n3) {
				System.out.println("+*");
				return;
			}
			
			if( n1 + n2 == n3) {
				System.out.println("+");
				return;
			}
			
			if( n1 * n2 == n3) {
				System.out.println("*");
				return;
			}
			
			if( n1 - n2 == n3) {
				System.out.println("-");
				return;
				
			}
			
			if(n1 / n2 == n3) {
				System.out.println("/");
				return;
				
			}
			
			else {
				System.out.println("None");
				return;
			}
			

	}




	}

