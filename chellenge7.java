//find the type of website and the protocol used in the website

package conditional_statements;

import java.util.Scanner;

public class chellenge7 {
	public static void main(String[] args) {
		
		
	Scanner v1 = new Scanner(System.in);
	
	System.out.print("Enter the URL :");
	String url = v1.nextLine();
	
	
	//for the type of website.....................
	
	int v = (url.indexOf(":"));
	
	String v2 = (url.substring(0 , v));
	
	System.out.println("");
	
	if(v2.equals("http"))
		System.out.println("Hyper text trasfer protocol");
	else if (v2.equals("https"))
		System.out.println("Hyper text transfer protocol secured");
	else if(v2.equals("ftp"))
		System.out.println("File transfer protocol");
	
	//for the protocol used in website
	
	String ext = url.substring(url.lastIndexOf(".")+1);
	
	System.out.println(" ");
	
	if(ext.equals("com"))
		System.out.println("commercial website");
	else if(ext.equals("org"))
		System.out.println("organizational website");
	else if(ext.equals("gov"))
		System.out.println("government website");
	else if(ext.equals("net"))
		System.out.println("network website");
	
	
	v1.close();
		
		
		
	}
	

}
