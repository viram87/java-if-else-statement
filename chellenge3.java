//find grades for the given marks 

package conditional_statements;

import java.util.Scanner;

public class chellenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("how many subjects : ");
		int n = v1.nextInt();
		
		int avg = 0;
		
		System.out.println("");
		System.out.println("Enter the marks one by one :");
		for(int i = 0 ; i < n ; i++ )
		{
			int m = v1.nextInt();
			avg = avg + m;
					
		}	
		avg = avg/n;
		
		if(avg >=70)
			System.out.println("A grade ");

		else if(avg<70 && avg>=60)
			System.out.println("B grade ");
		else if(avg<60 && avg>=50)
			System.out.println("C grade ");
		else if(avg<50 && avg>=40)
			System.out.println("D grade ");
		
		else
			System.out.println("Better luck next time...!!!!");
		
		System.out.println("");
		 
		System.out.println("your result is : " + avg + "%");
		
		v1.close();
	}

}
