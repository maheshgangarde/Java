
public class ParamMethod {
	public int Add(int x, int y)
	{
		System.out.println(x);
		System.out.println(y);
		return x+y;
	}

	public static void main(String[] args) {
		ParamMethod PM= new ParamMethod();
		System.out.println(PM.Add(10, 20));

	}

}
