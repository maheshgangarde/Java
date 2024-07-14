package thiskeyowrd;
//this keyword is use when we have to access global variable locally which has same name 
public class ThisKeyword {
	int a=20;
	int b=30;
	int x;
	int y;
public ThisKeyword(int x,int y)
{
	int z= this.x+this.y;//initialized value via contructor
			System.out.println("Parameterized Constructor "+z);
}
	public void add()
	{
		int a=40;
		int b=60;
		int x=this.a+this.b; //using same variable name but this redirecting to Global Variable
		System.out.println(x);
		int y=a+b;
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyword Tk1= new ThisKeyword(4,6);
		Tk1.add();
		

	}

}
