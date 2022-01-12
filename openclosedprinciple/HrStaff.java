package openclosedprinciple;

public class HrStaff implements Staff {
	private double salaryBouns;
	@Override
	public double salary() {
		return salaryBouns * 30;
	}
 
}
