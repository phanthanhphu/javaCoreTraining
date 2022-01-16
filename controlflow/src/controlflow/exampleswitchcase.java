package controlflow;

public class exampleswitchcase {
	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("Number one");
			break;
		case 2: 
			System.out.println("Number two");
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + number);
		}
	}
}
