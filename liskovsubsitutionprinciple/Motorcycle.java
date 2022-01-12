package liskovsubsitutionprinciple;

public class Motorcycle extends Vehicle {
	@Override
	public void move() {
		System.out.println("Move without pedaling, move on the ground.");
	}

}
