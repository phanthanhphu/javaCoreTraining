package equalsandhashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        Student student_1 = new Student(1, "Nguyen Van A");
        Student student_2 = new Student(1, "Nguyen Van A");
        System.out.println(student_1.equals(student_2));

        System.out.println(student_1.hashCode());
        System.out.println(student_2.hashCode());
        //hashcode ? equals
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student_1);
        studentSet.add(student_2);

        for(Student element:studentSet){
            System.out.println(element);
        }
    }
}
