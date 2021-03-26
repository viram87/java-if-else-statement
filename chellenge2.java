//find the person young  or not

package conditional_statements;

import java.util.Scanner;

public class chellenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner v1 = new Scanner(System.in);
		System.out.println("Enter the age: ");
		
		int age = v1.nextInt();
		
		if(age<14)
			System.out.println("person is in underage group");
		else if(age>=14 && age <55 )
			System.out.println("person is young");
		else
			System.out.println("person is old aged");
		
		v1.close();
		
		
		
	}

}
