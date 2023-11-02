package designPattern;

interface Shape{
	public void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape : Circle");
		
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle ");
		
	}
	
}


abstract class ShapeDecorator implements Shape{
	protected Shape decorateshape;
	public ShapeDecorator(Shape decorateshape) {
		this.decorateshape=decorateshape;
	}
	
	public void draw() {
		decorateshape.draw();
		
	}
}

class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decorateshape) {
		super(decorateshape);
		
	}
	
	@Override
	public void draw() {
		decorateshape.draw();
		setRedBorder(decorateshape);
	}

	private void setRedBorder(Shape decorateshape) {
		System.out.println("Border color: red");
		
	}
	
}

public class DecoratorPatternDemo {

	public static void main(String[] args) {
	    Shape circle =new Circle();
		Shape redCircle=new RedShapeDecorator(new Circle());
		Shape redRectangle=new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}
