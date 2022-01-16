package equals;

public class TestString {
	public static void main(String[] args) {
	   String s1 = new String("Hello equals");
	   String s2 = new String("Hello equals");
	   System.out.println("Result 1:" + (s1 == s2));
	   System.out.println("Result 2:" + (s1.equals(s2)));
	}
}
