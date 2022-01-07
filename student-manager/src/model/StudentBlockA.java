package model;

public class StudentBlockA extends Person{
	public static final String MATH_SUBJECT = "Math";
	public static final String PHYSISCS_SUBJECT = "Physics";
	public static final String CHEMISTRY_SUBJECT = "Chemistry";
	 
	public StudentBlockA(String id, String name, String address, int priority) {
		 super(id, name, address, priority);
	    }

	@Override
    public String toString() {
        return "StudentBlockA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MATH_SUBJECT + " - " + PHYSISCS_SUBJECT + " - " + CHEMISTRY_SUBJECT +
                '}';
	}
	


}
