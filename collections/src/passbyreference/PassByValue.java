package passbyreference;

public class PassByValue {
	int data = 50;

	void change(int data) {
		data = data + 100;
	}

	public static void main(String[] args) {
		PassByValue op = new PassByValue();
		System.out.println("Before: " + op.data);
		op.change(500);
		System.out.println("After: " + op.data);
	}
}
