package views;
import java.util.Scanner;
import controller.RoomController;
import controller.StudentController;
import model.Person;
import model.Room;
import model.StudentBlockA;
import model.StudentBlockB;
import model.StudentBlockC;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentController studentController = new StudentController();
		RoomController roomController = new RoomController();
		while (true) {
			System.out.println("Application Manager Student");
			System.out.println("Enter 1: To insert student");
			System.out.println("Enter 2: To show information of student: ");
			System.out.println("Enter 3: To search student by id");
			System.out.println("Enter 4: To insert room");
			System.out.println("Enter 5: To show information of room: ");
			System.out.println("Enter 6: To exit:");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Enter a: to insert Student Block A");
				System.out.println("Enter b: to insert Student Block B");
				System.out.println("Enter c: to insert Student Block C");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					studentController.add(createPerson(scanner, "a"));
					break;
				}
				case "b": {
					studentController.add(createPerson(scanner, "b"));
					break;
				}
				case "c": {
					studentController.add(createPerson(scanner, "c"));
					break;
				}
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}
			case "2": {
				studentController.showInfor();
				break;
			}
			case "3": {
				System.out.print("Enter ID: ");
				String id = scanner.nextLine();
				Person person = studentController.searchById(id);
				if (person == null) {
					System.out.println("Not found");
				} else {
					System.out.println(person.toString());
				}
				break;
			}
			case "4": {
				roomController.saveRoom(createRoom(scanner));
				break;

			}
			case "5": {
				roomController.showRoomInfor();
				break;

			}
			case "6": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
		}
	}

	public static Person createPerson(Scanner scanner, String cate) {
		System.out.print("Enter ID: ");
		String id = scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter address: ");
		String address = scanner.nextLine();
		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		System.out.print("Enter Priotity: ");
		int priority = scanner.nextInt();
		scanner.nextLine();
		if (cate.equals("a")) {
			return new StudentBlockA(id, name, address, email, priority);
		} else if (cate.equals("b")) {
			return new StudentBlockB(id, name, address, email, priority);
		} else {
			return new StudentBlockC(id, name, address, email, priority);
		}
	}
	public static Room createRoom(Scanner scanner) {
		System.out.print("Enter ID: ");
		String id = scanner.nextLine();
		System.out.print("Enter name: ");
		String name = scanner.nextLine();
		System.out.print("Enter quantity: ");
		int quantity = scanner.nextInt();
		scanner.nextLine();
		return new Room(id, name, quantity);
	}
}
