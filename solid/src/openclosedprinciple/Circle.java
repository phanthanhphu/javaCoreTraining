package openclosedprinciple;

public class Circle implements Shape {
	private double radius;

	@Override
	public double area() {
		return (radius * radius * 3.14);
	}

}
