
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

	public void recordCourseVideo() {

		System.out.println("Ders video'su cihaz�n�za y�klendi");
	}

}
