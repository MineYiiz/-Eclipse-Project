
public class User {
	public User() {
		System.out.println("Kullanýcý" + userName);
	}

	 int id;
	 String name;
	 String lastName;
	 String userName;
	 String Email;
	 String password;

	public User(int id, String name, String lastName, String userName, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		Email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
