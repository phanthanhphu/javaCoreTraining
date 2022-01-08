package interfacesegregationprinciple;

public class ProgrammingStaff implements SararyEmployee {
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

}
