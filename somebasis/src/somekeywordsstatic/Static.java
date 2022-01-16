package somekeywordsstatic;

public class Static {
	int rollno;
	String name;
	static String college = "Post and Telecommunication";
	
	Static(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno + " - " + name + "  - "+ college);
		
	}
	
	public static void main(String[] args) {
		Static s1 = new  Static(1, "A");
		Static s2 = new  Static(2, "B");
		System.out.print(Static.college);
		s1.display();
		s2.display();
		
	}

}
