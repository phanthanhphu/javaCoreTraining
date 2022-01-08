package liskovsubsitutionprinciple;

public class Bicycle extends Vehicle {
	@Override
	public void move() {
		System.out.println("To move, you have to use force to pedal.");
	}

}
