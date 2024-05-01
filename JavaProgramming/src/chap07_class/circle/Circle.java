package chap07_class.circle;

public class Circle {
	public final double PI = 3.14;
	public int radius;
	
	public Circle() {	
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double round() {
		return (2 * PI * radius);
	}
	
	public double area() {
		return (PI * radius * radius);
	}
	
}
