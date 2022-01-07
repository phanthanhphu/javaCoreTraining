package model;

public class StudentBlockC extends Person {
	public static final String literature_Subject = "Literature";
	public static final String History_Subject = "History";
	public static final String Geography_Subject = "Geography";
	public StudentBlockC(String id, String name, String address,String email, int priority) {
        super(id, name, address,email, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", priority=" + priority + ", Subject: " + literature_Subject + " - " + History_Subject + " - " + Geography_Subject +
                '}';
    }


}
