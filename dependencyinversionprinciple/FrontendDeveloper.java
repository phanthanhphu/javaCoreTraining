package dependencyinversionprinciple;

public class FrontendDeveloper implements Developer{

	@Override
	public void develop() {
			codePhp();
	}
	
	private void codePhp() {};

    private void codeAngular() {};

}
