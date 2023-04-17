package orgtnsifoperatordemo;
import java.util.Scanner;

public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 		System.out.println("Plaese Enter the value of x And y:");
 		int a = sc.nextInt();
 		int b = sc.nextInt();
 		System.out.println("The addition of two number is: " +(a+b));
 		System.out.println("The subtraction of two number is: " +(a-b));
 		System.out.println("The multiplication of two number is: " +(a*b));
 		System.out.println("The division of two number is: " +(a/b));
        sc.close(); 

	}

}
