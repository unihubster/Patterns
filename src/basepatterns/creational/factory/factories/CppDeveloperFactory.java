package basepatterns.creational.factory.factories;

import basepatterns.creational.factory.enteties.*;

public class CppDeveloperFactory implements DevelopersFactory {

	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}

}
