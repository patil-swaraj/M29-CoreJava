package secondpackage;

public class Executor {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		
		//b.methodPrivate();
		
		System.out.println(b instanceof Base);

	}

}
