package basepatterns.creational.factory.exception;

public class ExceptionUnknownSpeciality extends Exception {
	public ExceptionUnknownSpeciality(String speciality) {
		System.out.println("\n" + speciality + " is unknown language!!!\n");
	}
}