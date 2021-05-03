
public class CourseManager {

	public void add(Course course) {

		System.out.println(course.getName() + " hesabýnýza tanýmlandý.");
	}

	public void remove(Course course) {

		System.out.println(course.getName() + " hesabýnýzdan silindi.");
	}

	public void update(Course course) {

		System.out.println(course.getName() + " Kursunuz güncellendi.");
	}

	public void recordCourseVideo() {

		System.out.println("Ders video'su cihazýnýza yüklendi");
	}

}
