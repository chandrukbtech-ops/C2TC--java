package Day4.secondpackage;

public class Base {

	private int varPrivate = 10;
	int varDefault = 20;
	protected int varProtected = 30;
	public int varPublic = 40;

	private void methodPrivate() {
		System.out.println("Private Method");
	}

	void methodDefault() {
		System.out.println("Default Method");
	}

	protected void methodProtected() {
		System.out.println("Protected Method");
	}

	public void methodPublic() {
		System.out.println("Public Method");
		System.out.println("varPrivate = " + varPrivate);
		System.out.println("varDefault = " + varDefault);
		System.out.println("varProtected = " + varProtected);
		System.out.println("varPublic = " + varPublic);
	}
}
