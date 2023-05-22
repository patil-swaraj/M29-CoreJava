package methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		System.out.println(m1.multiplication(12.5f, 3.0f));
		System.out.println(m1.multiplication(1.5f, 4));
		System.out.println(m1.multiplication(5, 15.2f));
		System.out.println(m1.multiplication(2, 7));
		System.out.println(m1.print("Welcome to C2TC"));
		System.out.println(m1.print("Niket", "Kamble"));

	}

}
