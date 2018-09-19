package basepatterns.creational.abstractFactory.banking;

import basepatterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("Java developer writes java code...");
	}

}
