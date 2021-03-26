package conditional_statements;

import java.util.Scanner;

public class V1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = v1.nextInt();
		
		
		if(n > 5)
			System.out.println("number is greater than 5");
		else if(n == 5)
			System.out.println("number is 5");
		else
			System.out.println("number is less than 5");
		
		

		
		v1.close();
		
		
		
		
	}

}
