package model;

public class StudentBlockB extends Person {
	public static final String MATH_SUBJECT = "Math";
	public static final String BIOLOGY_SUBJECT = "Biology";
	public static final String CHEMISTRY_SUBJECT = "Chemistry";

	public StudentBlockB(String id, String name, String address, int priority) {
		super(id, name, address, priority);
	}

	@Override
	public String toString() {
		return "CandidateB{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", address='" + address + '\''
				+ ", priority=" + priority + ", Subject: " + MATH_SUBJECT + " - " + BIOLOGY_SUBJECT + " - " + CHEMISTRY_SUBJECT + '}';
	}

}
