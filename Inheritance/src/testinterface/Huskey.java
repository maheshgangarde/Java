package testinterface;

public class Huskey extends Dog{
	public void playfull() {
		System.out.println("Huskey is Playfull");
	}
	public void Cold() {
		System.out.println("Huskey Can survive in cold");
	}

	public static void main(String[] args) {
		Huskey H = new Huskey();
		H.Bark();
		H.playfull();
		H.Cold();
		H.Eat();
		H.Loyal();
		H.Walk();
		H.sleep();
		

	}

}
