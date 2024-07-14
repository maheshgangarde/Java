package test.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Before exception Hndling");
		try {
			System.out.println(a[10]);  //expecting error : array index out of bound
		}
		catch(Throwable e)
		{
			System.out.println(e.getCause());
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Cath block executed after error");
			
		}
		finally
		{
			System.out.println("Finally Block executed");
		}
		
		

	}

}
