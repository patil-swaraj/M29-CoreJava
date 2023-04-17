package Userinputdemo;
import java.util.Scanner;

public class Userinputprogram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your salary:");
	    float salary= s.nextFloat();
	
		System.out.println("Enter your name:");
		//next()
		String name=s.next();
		
		s.nextLine();
		
		System.out.println("Enter your name1:");
		String name1=s.nextLine();
		
		System.out.println("Enter the character:");
		char ch=s.next().charAt(1);
		
		System.out.println("salary is :"+salary);
		System.out.println("name is :"+name);
		System.out.println("salary is :"+name1);
		System.out.println("Character is :"+ch);
 		s.close();

	}

}
