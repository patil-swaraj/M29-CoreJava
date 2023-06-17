package singleton;

public class SingleTon {

	public static void main(String[] args) {
		
		private static final SingleTon single=new SingleTon();
		
		private SingleTon()
		{
			
		}
		
		public static SingleTon getsingle() {
			return single;
		}

	}

}
