
public class Instructor extends User {
	public Instructor() {
		System.out.println("Eðitmenlerimiz");
	}

	String telephoneNumber;
	String profession;
	String jobExperience;

	public Instructor(String telephoneNumber, String profession, String jobExperience) {
		super();
		this.telephoneNumber = telephoneNumber;
		this.profession = profession;
		this.jobExperience = jobExperience;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(String jobExperience) {
		this.jobExperience = jobExperience;
	}

}
