

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Programlama giri� kursu", "T�m Yaz�l�m dilleri i�in programlama mant���n� anlama", 50, 10);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setName("C# + ANGULAR");
		course2.setDetail("Yaz�l�m geli�tirici yeti�tirme kursu.");
		course2.setUnitPrice(60);
		course2.setDiscount(10);
		
		Course course3 = new Course();
		course3.setId(3);
		course3.setName("Java + REACT");
		course3.setDetail("Yaz�l�m geli�tirici yeti�tirme kursu.");
		course3.setUnitPrice(75);
		course3.setDiscount(15);
		
		
		Course[] Courses = {course1,course2,course3};
		for(Course course : Courses) {
			System.out.println(course.getName());
			
		}
		
		System.out.println("�ndirimde!  " + course2.getName()+ " " + course2.getUnitPriceAfterDiscount() +"TL" );
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Veri taban� tasarlama ve geli�tirme");
		
		Category[] Categories = {category1,category2};
		for(Category category : Categories ) {
			System.out.println(category.getName());
		}
		 
		 Instructor instructor1 = new Instructor();
		 instructor1.id=1;
		 instructor1.name="Engin";
		 instructor1.lastName="Demiro�";
		 instructor1.Email="engindemirog@gmail.com";
		 instructor1.password="123456";
		 instructor1.userName="EnginD";
		 instructor1.profession="Yaz�l�m M�hendisi";
		 
		 Student student = new Student();
		 student.id=1;
		 student.name="Mine";
		 student.lastName="Yi�iz";
		 student.userName="Mineyiiz";
		 student.theChapterYouAreReading="Co�rafi Bilgi Sistemleri";
		 
		 UserManager userManager = new UserManager(); 
		
//		 userManager.add(student);
//		 userManager.add(instructor1);
		 
		 User[] users= {instructor1,student};
		 userManager.addMultiple(users);
		 
		 StudentManager studentManager = new StudentManager();
		 studentManager.add(student);
	}

}
