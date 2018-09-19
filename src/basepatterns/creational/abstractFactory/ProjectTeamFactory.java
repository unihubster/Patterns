package basepatterns.creational.abstractFactory;

public interface ProjectTeamFactory {
	Developer getDeveloper();
	Tester getTester();
	ProjectManager getProjectManager();
}
