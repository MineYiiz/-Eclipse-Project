
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
	public void recordCourseVideo(Course course) {

		System.out.println("Ders video'su cihazınıza yüklendi");
	}

	public void addRating(Course course) {
		System.out.println("Kurs değerlendirilmesi sisteme eklendi");
	}

	public void lectureNotes(Course course) {
		System.out.println("Ders Notları Kaydedildi");
	}
	public void defineAssignment(Course course) {
		System.out.println("Ödev sisteme yüklendi");
	}


}
