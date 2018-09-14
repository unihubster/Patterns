package basepatterns.creational.factory.Exception;

public class ExceptionUnknownSpeciality extends Exception{
	public ExceptionUnknownSpeciality(String speciality) {
		System.out.println(speciality + " is unknown");
	}
}