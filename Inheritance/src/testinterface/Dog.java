package testinterface;

public class Dog extends Animal {
	public void Bark() {
		System.out.println("Dog is Barking");
	}
	public void Smell() {
		System.out.println("Dog is Smelling");
	}
	public void Loyal() {
		System.out.println("Dog is Loyal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog D= new Dog();
		D.Bark();
		D.Walk();
		D.Loyal();
		D.Eat();
		D.sleep();

	}

}
