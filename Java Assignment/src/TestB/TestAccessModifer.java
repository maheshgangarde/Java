package TestB;

import TestA.TestAccessModifierA;

public class TestAccessModifer {

	public static void main(String[] args) {
		TestAccessModifierA AM = new TestAccessModifierA();
		System.out.println(AM.PublicVariable); 
		AM.Add();
		//AM.PrivateVariable;


	}

}
