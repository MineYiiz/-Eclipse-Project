
public class CourseManager {

	public void add(Course course) {

		System.out.println(course.getName() + " hesabınıza tanımlandı.");
	}

	public void remove(Course course) {

		System.out.println(course.getName() + " hesabınızdan silindi.");
	}

	public void update(Course course) {

		System.out.println(course.getName() + " Kursunuz güncellendi.");
	}

	public void recordCourseVideo() {

		System.out.println("Ders video'su cihazınıza yüklendi");
	}

}
