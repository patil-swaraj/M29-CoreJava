package factorydesignpattern;

import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Network");
		String name=a.next();
		SelectNetworkFactory s=new SelectNetworkFactory();
		s.getPlan(name);
		System.out.println(s);
	}

}
