package dependencyinversionprinciple;

public class BackendDeveloper implements Developer {

	@Override
	public void develop() {
		codeJava();
	}
	 private void codeJava() {};

	private void codeC() {};

}
