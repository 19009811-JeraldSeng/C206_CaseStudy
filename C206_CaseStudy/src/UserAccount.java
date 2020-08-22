
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19009811, Aug 18, 2020 12:22:49 PM
 */

public class UserAccount {

	private String name;
	private String role;
	private String email;
	private String password;
	private String status;

	public UserAccount(String name, String role, String email, String password) {
		this.name = name;
		this.role = role;
		this.email = email;
		this.password = password;
		this.status = "new";
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void viewUser() {
		System.out.println(String.format("Name: %s\nRole: %s\nEmail: %s\nStatus: %s", name, role, email, status));
	}

}
