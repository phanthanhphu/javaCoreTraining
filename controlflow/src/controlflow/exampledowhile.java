package controlflow;

import java.util.Scanner;

public class exampledowhile {
	public static void main(String[] args) {

		int a = 6, sum = 0;
		do {
			sum += a;
			a++;
		} while (a <= 5);
		System.out.print("Sum of 1 to 5 is: " + sum);

	}
}
