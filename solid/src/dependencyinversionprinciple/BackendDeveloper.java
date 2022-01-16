package dependencyinversionprinciple;

public class BackendDeveloper implements Developer {

	@Override
	public void develop() {
		codeJava();
		//codeC
	}
	 private void codeJava() {};

	private void codeC() {};

}
