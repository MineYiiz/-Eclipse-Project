
public class IntructorManager extends Users {

	@Override
	public void add(User user) {
		System.out.println("E�itmen Kaydedildi : " + user.getUserName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}

	}

	@Override
	public void remove(User user) {
		System.out.println("E�itmen Silindi : " + user.getUserName());
	}

	public void removeMultiple(User[] users) {
		for (User user : users) {
			remove(user);
		}

	}

	@Override
	public void update(User user) {
		System.out.println("E�itmen G�ncellendi : " + user.getUserName());
	}

	public void updateMultiple(User[] users) {
		for (User user : users) {
			update(user);
		}

	}

}
