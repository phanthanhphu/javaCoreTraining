package com.demo.model;

public class StudentBlockA extends Person{
	public static final String Math_Subject = "Math";
	public static final String Physics_Subject = "Physics";
	public static final String Chemistry_Subject = "Chemistry";
	 
	public StudentBlockA(String id, String name, String address,String email, int priority) {
		 super(id, name, address,email, priority);
	    }

	@Override
    public String toString() {
        return "StudentBlockA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email +'\'' +
                ", priority=" + priority*1.2 + ", Subject: " + Math_Subject + " - " + Physics_Subject + " - " + Chemistry_Subject +
                '}';
	}
	


}
