package basepatterns.creational.abstractFactory.banking;

import basepatterns.creational.abstractFactory.Developer;
import basepatterns.creational.abstractFactory.ProjectManager;
import basepatterns.creational.abstractFactory.ProjectTeamFactory;
import basepatterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingProjectManager();
	}

}
