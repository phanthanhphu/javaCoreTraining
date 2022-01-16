package somesubclass;

import somesubclass.Programmer;

public class Main {
	public static void main(String[] args) {
		Programmer pg = new Programmer();
		System.out.println("Programmer salaly is: " + pg.salary);
		System.out.println("Bonus of Progammmer is: " + pg.bonus);
	}
}
