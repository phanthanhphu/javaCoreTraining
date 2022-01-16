package openclosedprinciple;

public class Rectangle implements Shape{
	private double length;
	private double height;
	@Override
	public double area() {
		return (length * height);
	}
	
	

}
