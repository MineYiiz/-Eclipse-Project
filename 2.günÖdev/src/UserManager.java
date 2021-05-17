
public class UserManager extends Users {

	@Override
	public void add(User user) {
		System.out.println("Sisteme Kay�t Sa�land� : " + user.getUserName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	@Override
	public void remove(User user) {
		System.out.println("Sisteme Kay�t Sa�land� : " + user.getUserName());
	}

	public void removeMultiple(User[] users) {
		for (User user : users) {
			remove(user);
		}
	}

	@Override
	public void update(User user) {
		System.out.println("Siisteme Kay�t Sa�land� : " + user.getUserName());
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}

	}

}

