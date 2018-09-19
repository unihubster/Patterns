package basepatterns.creational.abstractFactory.website;

import basepatterns.creational.abstractFactory.Developer;
import basepatterns.creational.abstractFactory.ProjectManager;
import basepatterns.creational.abstractFactory.ProjectTeamFactory;
import basepatterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebsiteProjectManager();
	}

}
