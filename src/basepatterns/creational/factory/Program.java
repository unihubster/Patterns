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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean bool = true;
            while (bool) {
                try {
                    System.out.println();
                    System.out.println("Please, enter what language developer you need:");
                    String language = scanner.next();
                    if (!language.equalsIgnoreCase("exit")) {
                        DevelopersFactory developersFactory;
                        developersFactory = createDeveloperBySpeciality(language);
                        Developer developer = developersFactory.createDeveloper();
                        developer.writeCode();
                    } else {
                        bool = false;
                    }
                } catch (ExceptionUnknownSpeciality e) {
                }
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
