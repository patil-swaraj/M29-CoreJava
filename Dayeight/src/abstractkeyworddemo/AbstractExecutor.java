package abstractkeyworddemo;

public class AbstractExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteChild r = new RemoteChild();
		r.cellName = "DuroCell";
		r.display();
		r.functionRemote();
		r.create();

	}

}
