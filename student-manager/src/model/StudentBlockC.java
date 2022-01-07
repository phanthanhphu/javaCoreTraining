package model;

public class StudentBlockC extends Person {
	public static final String LITERATURE_SUBJECT = "Literature";
	public static final String HISTORY_SUBJECT = "History";
	public static final String GEOGRAPHY_SUBJECT = "Geography";
	public StudentBlockC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + LITERATURE_SUBJECT + " - " + HISTORY_SUBJECT + " - " + GEOGRAPHY_SUBJECT +
                '}';
    }


}
