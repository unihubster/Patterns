package basepatterns.creational.prototype;

public class VersionControlRunner {

	public static void main(String[] args) {
		Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

		System.out.println(master);

		// Project masterClone = (Project) master.copy();
		ProjectFactory factory = new ProjectFactory(master);
		Project masterClone = factory.cloneProject();

		System.out.println("\n========================\n");
		System.out.println(masterClone);
	}

}
