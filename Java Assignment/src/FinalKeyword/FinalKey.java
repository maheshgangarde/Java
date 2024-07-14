package FinalKeyword;

public class FinalKey {
	public final int a=20;
	public void Getdata()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		FinalKey F=new FinalKey();
		F.Getdata();
		// F.a=30; can not reassign
		 F.Getdata();
	}
	
	
	
	

}
