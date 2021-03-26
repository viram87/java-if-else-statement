//given year is leap or not


package conditional_statements;

import java.util.Scanner;

public class chellenge5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = v1.nextInt();
		
		if(year % 4 == 0) 
		{
			if(year % 100 == 0) 
			{
				if(year % 400 == 0)
				{
					System.out.println("its a leap year");
				}
				else
				{
					System.out.println("it's not a leap year");
				}
			}
			else 
			{
				System.out.println("It's a leap year ");
			}
		}
		else 
		{
			System.out.println("year is not a leap year");
		}
		v1.close();
			

	}

}
