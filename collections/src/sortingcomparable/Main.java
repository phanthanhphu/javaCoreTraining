package sortingcomparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(3, "Phuc", 27));
		studentList.add(new Student(1, "Nam", 29));
		studentList.add(new Student(2, "Lan", 25));
		//sort age
		Collections.sort(studentList);
		for(Student student: studentList) {
			System.out.println(student.toString());
		}
	}

}
