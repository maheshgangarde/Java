package text.collections;

public class Wrapping {
	public static void main(String[]args)
	{
		int i=20;
		Integer int1=new Integer(i); //Wrapping
		System.out.println(int1);
		int j=int1; //Unwrapping
		System.out.println(j);
	}

}
