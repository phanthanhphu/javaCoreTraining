package somekeywordprotected2;

import somekeywordprotected1.Test;

public class TestPackage extends Test {
	public static void main(String[] args) {
		Test t = new TestPackage();
		System.out.println(t);
	}
}
