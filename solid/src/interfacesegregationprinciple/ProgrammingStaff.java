package interfacesegregationprinciple;

public class ProgrammingStaff implements SalaryEmployee, WorkingDay {
	private String name;
	private double coefficirnts;
	private double salaryIncome;

	@Override
	public float salary(double coefficirnts, double salaryIncome) {

		return (float) (coefficirnts*salaryIncome);
	}

	public double employeeSalary() {
		return salary(coefficirnts, salaryIncome);
	}

	@Override
	public int numberOfDays(int startDay, int today) {
		
		return 0;
	}

}
