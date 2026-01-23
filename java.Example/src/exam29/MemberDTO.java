package exam29;

public class MemberDTO {
	
	private String id;
	private String password;
	private String name;
	private String phone;
	private String address;

	public MemberDTO(String id, String password, String name, String phone, String adress) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	//method
	public void display() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\n", id, password, name, phone, address);
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = address;
	}
	
}
