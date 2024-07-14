//Mthod overriding
package test.polymorphism;

public class Cat extends Animal {
	public void Noise() {
		System.out.println("Cat Noise Mau Mau");
	}

	public static void main(String[] args) {
		Cat ca= new Cat();
		ca.Noise();

	}

}

