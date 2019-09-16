package basepatterns.creational.factory.factories;

import basepatterns.creational.factory.enteties.*;

public class JavaDeveloperFactory implements DevelopersFactory {

	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

}
