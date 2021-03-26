//check the number is odd or even

package conditional_statements;

import java.util.Scanner;

public class chellenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int a = v1.nextInt();
		
		if(a % 2 == 0)
			System.out.println("number is even");
		else 
			System.out.println("number is odd");
		
		
		v1.close();
		

	}

}
