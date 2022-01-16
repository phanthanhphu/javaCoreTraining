package sortingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sortingcomparable.Student;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(3, "Phuc", 27));
		studentList.add(new Student(1, "Nam", 29));
		studentList.add(new Student(2, "Lan", 25));
		// sort age

		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
	}
}
