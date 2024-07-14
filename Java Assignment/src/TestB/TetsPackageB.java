package TestB;

import TestA.TestPackageA;

public class TetsPackageB {

	public static void main(String[] args) {
		TestPackageA A= new TestPackageA();
		A.Add();
		int Y= A.i+A.y;
		System.out.println("Addition of PAckage A Variable "+Y);

	}

}
