

public class UserManager {
	public void add(User user) {

		System.out.println("Sistem kayýt saðlandý");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}

	public void changePassword() {
		System.out.println("Þifreniz deðiþtirildi");
	}

	public void uploadPhoto() {
		System.out.println("Fotoðraf yüklendi");
	}
}
