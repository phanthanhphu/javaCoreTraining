package controlflow;

import java.util.Scanner;

public class exampleif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter: old");
		int n = sc.nextInt();
		if (n > 18) {
			System.out.print("Older than 18");
		} else if (n == 18) {
			System.out.print("Equal to 18 years old");
		} else {
			System.out.print("Under than 18");
		}
	}
}
