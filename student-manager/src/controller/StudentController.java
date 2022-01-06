package controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

import model.Student;

public class StudentController {

	private static ArrayList<Student> list = new ArrayList<>();

	public void input() {
		int choose;
		Scanner input = new Scanner(System.in);
		System.out.println("           STUDENT MANAGER");
		System.out.println("---------------------------------------");

	
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			switch (choose) {
			case 1:
				inputStudent();
				break;

			case 2:
				listStudent();
				break;

			case 3:
				pointMinMax();
				break;
			case 4:
				searchStudent();
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		} while (true);

	}

	static void showMenu() {
		System.out.println(" * Function");
		System.out.println(" 1. Enter n students");
		System.out.println(" 2. Show list of students");
		System.out.println(" 3. Displays the student with the highest and lowest scores");
		System.out.println(" 4. Search students by rollNo");
//		System.out.println(" 5. Exit");
	}

	public static void inputStudent() {
		int n;
		System.out.print("Enter the number of students");
		Scanner input = new Scanner(System.in);
		n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++) {
			Student student = new Student();
			student.inputInfo();
			list.add(student);
		}
	}

	public static void listStudent() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showStudent();;
		}
	}

	public static void pointMinMax() {
		int minIndex = 0;
		int maxIndex = 0;
		float minMark, maxMark;
		minMark = list.get(0).getMark();
		maxMark = list.get(0).getMark();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMark() < minMark) {
				minIndex = i;
				minMark = list.get(i).getMark();
			}
			if (list.get(i).getMark() > maxMark) {
				maxIndex = i;
				maxMark = list.get(i).getMark();
			}
		}
		System.out.println("The student with the highest score");
		list.get(maxIndex).showStudent();;
		System.out.println("The student with the lowest score");
		list.get(minIndex).showStudent();;
	}

	public static void searchStudent() {
		int count = 0;
		System.out.println("Enter the student rollNo you need to search for:");
		Scanner input = new Scanner(System.in);
		String rollNosearch = input.nextLine();
		for (Student student : list) {
			if (student.getRollNo().equalsIgnoreCase(rollNosearch)) {
				student.showStudent();
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Student not found");
		}
	}

}
