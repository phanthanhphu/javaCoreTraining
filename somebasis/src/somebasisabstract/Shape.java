package somebasisabstract;

public abstract class Shape {
	private String color = "red";

	public Shape() {

	}

	public abstract void drow();

	public String getColor() {
		return color;
	}
}
