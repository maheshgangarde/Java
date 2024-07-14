package test.abstraction;

abstract public class Shape {
	abstract public void DrawShape();
	abstract public void ColorShape();
	public void MoveShape() {
		System.out.println("Moving Shape from shape class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
