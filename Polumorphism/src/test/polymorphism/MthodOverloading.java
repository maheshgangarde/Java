package test.polymorphism;

public class MthodOverloading {
	public void login()
	{
		System.out.println("Login without Credentials");
	}
	public void login(String username, String Password)
	{
		System.out.println("Login with Username and password");
	}
	public void login(int OTP)
	{
		System.out.println("Login with OTP");
	}

	public static void main(String[] args) {
		MthodOverloading mo=new MthodOverloading();
		mo.login();
		mo.login(4567);
		mo.login("Savi", "Savi");

	}

}
