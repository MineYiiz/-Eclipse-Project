

public class UserManager {
	public void add(User user) {

		System.out.println("Sistem kay�t sa�land�");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}

	public void changePassword() {
		System.out.println("�ifreniz de�i�tirildi");
	}

	public void uploadPhoto() {
		System.out.println("Foto�raf y�klendi");
	}
}
