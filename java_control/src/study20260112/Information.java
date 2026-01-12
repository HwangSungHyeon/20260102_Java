package study20260112;

public class Information {
	
	private String name;
	private String id;
	private String password;
	private int phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Information [name=" + name + ", id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	public Information(String name, String id, String password, int phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	
}
