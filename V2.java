package conditional_statements;

import java.util.Scanner;

public class V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		
		System.out.println("Enter your numbers :");
		int a = v1.nextInt();
		int b = v1.nextInt();
		int c = v1.nextInt();
		
		
		if(a>b)
		{
			if(b>c)
				System.out.println(b + " is biggest");
			else
				System.out.println(a+ " is biggest" );
		}
		else
		{
			if(b>c)
				System.out.println(b+ " is biggest");
			else
				System.out.println(c+ " is biggest");
		}
		
	
		
		v1.close();
		
		
		
	}

}
