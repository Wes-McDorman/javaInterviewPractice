package interviewReady;


class Shape{
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Circle extends Shape { // Object to Object Inheritance
	void draw() {   // overriding
		System.out.println("Drawing a Circle");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
	
}

class Polygon extends Shape {
	void draw() {
		System.out.println("Drawing a Polygon");
	}
	
}


public class Polymorphism {
	private int cash = 100;
	public void showCash() {
		System.out.println(cash);
	}
	
	
	
	
	public static void main(String[] args) {
		Polymorphism poly = new Polymorphism();
		poly.showCash();
		
		
		/*
		//shape stuff
		Shape s;
		s = new Shape();
		s.draw();
		
		//Circle
		Circle c = new Circle();
		c.draw();
		*/
		
		Shape s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		s = new Polygon();
		s.draw();
	}
}
