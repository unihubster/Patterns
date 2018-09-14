package basepatterns.creational.factory;

import java.util.Scanner;

import basepatterns.creational.factory.Enteties.*;
import basepatterns.creational.factory.Factories.*;

class Program {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
            System.out.println("Please, enter what language developer you need:");
                String language = scanner.next();
                DevelopersFactory developersFactory = createDeveloperBySpeciality(language);
                Developer developer = developersFactory.createDeveloper();
                developer.writeCode();
            }
        }
    }

    private static DevelopersFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown");
        }
    }
}
