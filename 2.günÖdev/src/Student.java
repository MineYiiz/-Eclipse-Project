
public class Student extends User {
	public Student() {
		System.out.println("Öðrenci");
	}
	
	String name;
	String lastName;
	String theChapterYouAreReading;
	
	public Student( String name, String lastName, String theChapterYouAreReading) {
	
		this.name = name;
		this.lastName = lastName;
		this.theChapterYouAreReading = theChapterYouAreReading;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTheChapterYouAreReading() {
		return theChapterYouAreReading;
	}

	public void setTheChapterYouAreReading(String theChapterYouAreReading) {
		this.theChapterYouAreReading = theChapterYouAreReading;
	}

	

}
