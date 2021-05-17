
public class User {
	
	 public User() {
			System.out.println("Kullanýcý ");
		}


	 int id ;
	 String userName;
	 String Email;
	 String password;
	 
	 
	public User(int id, String userName, String email, String password) {

		this.id = id;
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
