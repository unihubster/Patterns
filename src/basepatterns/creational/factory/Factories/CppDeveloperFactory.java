package basepatterns.creational.factory.Factories;

import basepatterns.creational.factory.Enteties.*;

public class CppDeveloperFactory implements DevelopersFactory {

	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}

}
