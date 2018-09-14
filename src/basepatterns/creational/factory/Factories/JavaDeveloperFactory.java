package basepatterns.creational.factory.Factories;

import basepatterns.creational.factory.Enteties.*;

public class JavaDeveloperFactory implements DevelopersFactory {

	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}
