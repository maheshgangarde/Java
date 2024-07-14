package test.abstraction;

public class Circle extends Shape{

	public static void main(String[] args) {
		Circle ca=new Circle();
		ca.DrawShape();
		ca.ColorShape();
		ca.MoveShape();

	}

	@Override
	public void DrawShape() {
		System.out.println("Drwaing Circle");
		
	}

	@Override
	public void ColorShape() {
		System.out.println("Coloring Circle");
		
	}

}
