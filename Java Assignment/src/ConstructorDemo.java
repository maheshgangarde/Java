
public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorDemo(int x) {
		System.out.println("Int Constructor : "+x);
	}
	public ConstructorDemo(String s) {
		System.out.println("String Constructor : "+s);
	}
	

	public static void main(String[] args) {

		ConstructorDemo C=new ConstructorDemo("test");

	}

}
