package basepatterns.creational.factory;

import java.util.Scanner;

import basepatterns.creational.factory.Enteties.*;
import basepatterns.creational.factory.Exception.*;
import basepatterns.creational.factory.Factories.*;

/*
 Pattern lesson "FactoryMethod"
 https://youtu.be/TwIjjTC5g7g
 */

class Program {

    public static void main(String[] args) throws Exception {
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

    private static DevelopersFactory createDeveloperBySpeciality(String speciality) throws ExceptionUnknownSpeciality {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new ExceptionUnknownSpeciality(speciality);
        }
    }
}
