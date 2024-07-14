package FinalKeyword;

public class Child //extends Parent //Can not inherite Final Class
{
	int b = 30;
	/*
	 * public void Getdata() // can not override Final method {
	 * System.out.println(b); }
	 */

	public static void main(String[] args) {
		Child c = new Child();
		//c.Getdata();

	}

}
