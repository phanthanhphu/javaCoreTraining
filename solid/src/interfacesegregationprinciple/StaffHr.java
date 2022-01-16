package interfacesegregationprinciple;

public class StaffHr implements WorkingDay {
	private String name;
	private double coefficirnts;
	private double salaryIncome;
	private int startDay;
	private int today;
	@Override
	public int numberOfDays(int startDay, int today) {
		
		return startDay - today;
	}
	
	private int totalDay() {
		return numberOfDays(startDay, today);
	}
	
	
}
