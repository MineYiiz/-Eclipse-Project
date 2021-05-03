
public class Student extends User {
	public Student() {
		System.out.println("Öðrenciler");
	}

	String theChapterYouAreReading;
	String educationStatus;
	String theDepartmentYouWantToSpecializeIn;

	public Student(String theChapterYouAreReading, String educationStatus, String theDepartmentYouWantToSpecializeIn) {
		super();
		this.theChapterYouAreReading = theChapterYouAreReading;
		this.educationStatus = educationStatus;
		this.theDepartmentYouWantToSpecializeIn = theDepartmentYouWantToSpecializeIn;
	}

	public String getTheChapterYouAreReading() {
		return theChapterYouAreReading;
	}

	public void setTheChapterYouAreReading(String theChapterYouAreReading) {
		this.theChapterYouAreReading = theChapterYouAreReading;
	}

	public String getEducationStatus() {
		return educationStatus;
	}

	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

	public String getTheDepartmentYouWantToSpecializeIn() {
		return theDepartmentYouWantToSpecializeIn;
	}

	public void setTheDepartmentYouWantToSpecializeIn(String theDepartmentYouWantToSpecializeIn) {
		this.theDepartmentYouWantToSpecializeIn = theDepartmentYouWantToSpecializeIn;
	}

}
