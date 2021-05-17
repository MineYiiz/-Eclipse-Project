
public class IntructorManager extends Users {

	@Override
	public void add(User user) {
		System.out.println("Eðitmen Kaydedildi : " + user.getUserName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}

	}

	@Override
	public void remove(User user) {
		System.out.println("Eðitmen Silindi : " + user.getUserName());
	}

	public void removeMultiple(User[] users) {
		for (User user : users) {
			remove(user);
		}

	}

	@Override
	public void update(User user) {
		System.out.println("Eðitmen Güncellendi : " + user.getUserName());
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}

	}

}
