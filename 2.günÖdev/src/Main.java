

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Programlama giriþ kursu", "Tüm Yazýlým dilleri için programlama mantýðýný anlama", 50, 10);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("C# + ANGULAR");
		course2.setDetail("Yazýlým geliþtirici yetiþtirme kursu.");
		course2.setUnitPrice(60);
		course2.setDiscount(15);
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Java + REACT");
		course3.setDetail("Yazýlým geliþtirici yetiþtirme kursu.");
		course3.setUnitPrice(75);
		course3.setDiscount(15);
		
		System.out.println(course2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Veri tabaný tasarlama ve geliþtirme");
		
		 System.out.println(category1.getName());
		 System.out.println(category2.getName());
		 
		 Instructor instructor1 = new Instructor();
		 instructor1.id=1;
		 instructor1.name="Engin";
		 instructor1.lastName="Demiroð";
		 instructor1.Email="engindemirog@gmail.com";
		 instructor1.password="123456";
		 instructor1.userName="EnginD";
		 instructor1.profession="Yazýlým Mühendisi";
		 
		 Student student = new Student();
		 student.id=1;
		 student.name="Mine";
		 student.lastName="Yiðiz";
		 student.theChapterYouAreReading="Coðrafi Bilgi Sistemleri";
		 
		 UserManager userManager = new UserManager();
		 
		 User[] users= {instructor1,student};
		 userManager.addMultiple(users);

	}

}
