package com.demo.model;

public class StudentBlockB extends Person {
	public static final String Math_Subject = "Math";
	public static final String Biology_Subject = "Biology";
	public static final String Chemistry_Subject = "Chemistry";

	public StudentBlockB(String id, String name, String address, String email, int priority) {
		super(id, name, address, email, priority);
	}

	@Override
	public String toString() {
		return "CandidateB{" + "id='" + id + '\'' + ", name='" + name + '\''
				+ ",email='\" + email + '\\'' + \", address='" + address + '\'' + ", priority=" + priority
				+ ", Subject: " + Math_Subject + " - " + Biology_Subject + " - " + Chemistry_Subject + '}';
	}

}
