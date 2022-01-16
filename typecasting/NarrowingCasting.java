package typecasting;

public class NarrowingCasting {
	public static void main(String[] args) {
        double myDouble1 = 9.5;
        float f = (float) myDouble1;
        System.out.println(f);
		double myDouble = 9.5;
		int myInt = (int) myDouble;

		System.out.println(myDouble);
		System.out.println(myInt);

	}
}
