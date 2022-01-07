package dependencyinversionprinciple;

import java.util.List;

public class Main {
	private List<Developer> developers;
	public void Project(List<Developer> developers) {
		this.developers = developers;
	}
	public void showInfo() {
		developers.forEach(developer -> developer.develop());
	}
}
