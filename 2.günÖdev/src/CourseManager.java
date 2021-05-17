
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
	public void recordCourseVideo(Course course) {

		System.out.println("Ders video'su cihazýnýza yüklendi");
	}

	public void addRating(Course course) {
		System.out.println("Kurs deðerlendirilmesi sisteme eklendi");
	}

	public void lectureNotes(Course course) {
		System.out.println("Ders Notlarý Kaydedildi");
	}
	public void defineAssignment(Course course) {
		System.out.println("Ödev sisteme yüklendi");
	}


}
