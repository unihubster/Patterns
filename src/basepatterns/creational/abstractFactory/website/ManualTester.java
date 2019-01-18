package basepatterns.creational.abstractFactory.website;

import basepatterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {

	@Override
	public void testCode() {
		System.out.println("Manual tester tests website...");
	}

}
