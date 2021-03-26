/*find the redix of the given number 
		
		
		binary number = redix 2
		octal number = redix 8
		hexadecimal number = redix 16
		decimal number = redix 10
		


*/


package conditional_statements;

import java.util.Scanner;

public class chellenge4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		String num;
		
		System.out.println("Enter the number : ");
		
		num = v1.nextLine();
		

		if(num.matches("[01]+"))
			System.out.println("binary redix = 2 ");
		else if(num.matches("[0-7]+"))
			System.out.println("octal redix = 7 ");
		else if(num.matches("[0-9]+"))
			System.out.println("decimal redix = 10");
		else if(num.matches("[0-9A-F]+"))
			System.out.println("hexadecimal redix = 16");
		else
			System.out.println("Unknown Number ");
		
		v1.close();
		
		 
	}

}



