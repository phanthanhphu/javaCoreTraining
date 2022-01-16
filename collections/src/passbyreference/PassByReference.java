package passbyreference;
//java no reference
public class PassByReference {
	int data = 50;

	void change(PassByReference op) {
		op.data = op.data + 100;
	}

	public static void main(String[] args) {
		PassByReference op = new PassByReference();
		System.out.println("Before: " + op.data);
		op.change(op);
		System.out.println("After: " + op.data);
	}
}
