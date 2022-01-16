package equals;

public class Main {
	public static void main(String[] args) {
		StudentA sa = new StudentA();
		sa.setName("Join A");
		sa.setAge(10);
		
		StudentB sb = new StudentB();
		sb.setName("Join A");
		sb.setAge(10);
		
		System.out.print(sa.equals(sb));
	}
}
