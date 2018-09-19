package basepatterns.creational.abstractFactory;

import basepatterns.creational.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
		Developer phpdeveloper = projectTeamFactory.getDeveloper();
		Tester manualTester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();

		System.out.println("Creating auction website...");
		phpdeveloper.writeCode();
		manualTester.testCode();
		projectManager.manageProject();
	}

}
