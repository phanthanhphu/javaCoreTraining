package somebasisabstract;

public class Circle extends Shape{

	@Override
	public void drow() {
		System.out.print("Circle color: " + super.getColor());
		
	}

}
