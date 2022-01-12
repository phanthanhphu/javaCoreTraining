package openclosedprinciple;

public class ProgrammingStaff implements Staff{
	 private double responsileWage;
	 

	@Override
	public double salary() {
		return responsileWage * 30;
	}

}
