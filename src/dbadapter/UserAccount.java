package dbadapter;

public class UserAccount {
        
	private String username;
	private String email;
	private String password;
	private int age;
	
	
	public UserAccount(String username, String email, String password, int age) {
		this.username= username;
		this.email=email;
		this.password=password;
		this.age=age;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
