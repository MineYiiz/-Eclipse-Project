
public class CourseManager {

	public void add(Course course) {

		System.out.println(course.getName() + " hesab�n�za tan�mland�.");
	}

	public void remove(Course course) {

		System.out.println(course.getName() + " hesab�n�zdan silindi.");
	}

	public void update(Course course) {

		System.out.println(course.getName() + " Kursunuz g�ncellendi.");
	}
	public void recordCourseVideo(Course course) {

		System.out.println("Ders video'su cihaz�n�za y�klendi");
	}

	public void addRating(Course course) {
		System.out.println("Kurs de�erlendirilmesi sisteme eklendi");
	}

	public void lectureNotes(Course course) {
		System.out.println("Ders Notlar� Kaydedildi");
	}
	public void defineAssignment(Course course) {
		System.out.println("�dev sisteme y�klendi");
	}


}
