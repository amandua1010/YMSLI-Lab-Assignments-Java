package umlCircle;

public class Circle {
	
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public void printCircle() {
		System.out.println("Radius of the circle is: " + radius);
		System.out.println("Area of the circle is: " + this.getArea());
	}
	
}
