import oopIntro.Product;
import oopIntro.ProductManager;

public class main {

	public static void main(String[] args) {
		 Course course1 = new Course(1,"Programlama giri� kursu","T�m programlama dilleri i�in programlama mant���n� anlama");
		 
		 Course course2 = new Course();
		 course2.id = 2;
		 course2.name = "C# + ANGULAR";
		 course2.detail = "Yaz�l�m geli�tirici yeti�tirme kursu.";
		 
		 Course course3 = new Course();
		 course3.id =3;
		 course3.name = "Java + REACT";
		 course3.detail = "Yaz�l�m geli�tirici yeti�tirme kursu.";
		 
		 Course[] courses = {course1,course2,course3};
		 
		 for (Course course : courses) {
			 System.out.println(course.name);
			
		}
		 
		 Category category1 = new Category(1, "Programlama");
		 
		 Category category2 = new Category();
		 category2.id = 2;
		 category2.name = "Veri taban� tasarlama ve geli�tirme";
		 
		 //ProductManager productManager = new ProductManager();
		// productManager.addToCart(product1);
		 CourseManager courseManager = new CourseManager();
		 courseManager.registrationForTheCourse();
		 courseManager.addCourse(course1);
		 
		 
		 
		 
		 

	}

}
