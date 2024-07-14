package text.interfacenew;

public class Circle implements Shape {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.Drawshape();
		c.Colorshape();
		c.Moveshape();
	}

	@Override
	public void Drawshape() {
		System.out.println("Drwing circle");

	}

	@Override
	public void Colorshape() {
		System.out.println("Coloring circle");

	}

	@Override
	public void Moveshape() {
		System.out.println("Moving circle");

	}

}
