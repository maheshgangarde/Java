
public class StaticMethod {

	public static void main(String[] args) {
		
		StaticMethod sm=new StaticMethod();
		sm.add();
		sub();

	}
	public static void add() {
		System.out.println("non Static Method calling");
	}
	public static void sub() {
		System.out.println("static Method calling");
	}

}
