package controlflow;

import java.util.Scanner;

public class examplefor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Number: " +i);
		}
		
	}

}
