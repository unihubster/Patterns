package basepatterns.creational.abstractFactory.website;

import basepatterns.creational.abstractFactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("Website PM manages website project...");
	}

}
