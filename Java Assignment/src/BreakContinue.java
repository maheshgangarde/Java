
public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("Stat Of Loop");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End Of Loop");

	}

}
