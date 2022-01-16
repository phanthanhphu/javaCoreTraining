package dependencyinversionprinciple;

public class FrontendDeveloper implements Developer{

	@Override
	public void develop() {
			codePhp();
			//code Angular
	}
	
	private void codePhp() {};

    private void codeAngular() {};

}
