package Super.keyword;

public class Child extends Parent{
	int a=30;
	String Str="Child String";
	public void Demo() {
		System.out.println("Child Demo Method");
		System.out.println(super.a+ "  " +super.Str);
	}

	public static void main(String[] args) {
		Child c= new Child();
		{
			c.Demo();
			
		}

	}

}
