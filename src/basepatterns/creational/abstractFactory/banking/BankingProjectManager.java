package basepatterns.creational.abstractFactory.banking;

import basepatterns.creational.abstractFactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("Banking PM manages banking project...");
	}

}
