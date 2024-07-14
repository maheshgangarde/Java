
public class Method {
	public void login() 
	{
		System.out.println("Login Successfull");

	}
	public void logout() 
	{
		login();
		System.out.println("Logout Successfull");

	}
	public void Submit() 
	{
		System.out.println("Login and logout Successfull");

	}

	public static void main(String[] args) {
		Method M1=new Method();
		M1.login();
		M1.logout();
		M1.Submit();

	}

}
