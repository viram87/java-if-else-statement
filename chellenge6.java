//display name of the day based on number

package conditional_statements;

import java.util.Scanner;

public class chellenge6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the number of the day : ");
		int day = v1.nextInt();
		
		if(day == 1)
			System.out.println("Sunday");
		else if(day == 2)
			System.out.println("Monday");
		else if(day == 3)
			System.out.println("Tuesday");
		else if(day == 4)
			System.out.println("Wednesday");
		else if(day == 5)
			System.out.println("Thursday");
		else if(day == 6)
			System.out.println("Friday");
		else if(day == 7)
			System.out.println("Saturday");
		else
			System.out.println("Enter the right value..");
		
		v1.close();
		
	}

}
