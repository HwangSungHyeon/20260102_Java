package exam30;

import java.sql.Date;
import java.util.Scanner;

public class StudentDTO {
	
	private int hakbun;
	private String name;
	private String ssn; 
	private String phone;
	private String address;
	private String createdDate;
	
	
	public StudentDTO() {
	}
	
	// method
	public void inputField(String gubun) {
		Scanner sc = new Scanner(System.in);
		
		if(gubun.equals("view") || gubun.equals("sujung") || gubun.equals("sakje")) {
			System.out.println("학번 : ");
			String hakbun_ = sc.nextLine();
			this.hakbun = Integer.parseInt(hakbun_);
		} 
		
		if (gubun.equals("chuga")) {
			System.out.print("이름 : ");
			this.name = sc.nextLine();
			System.out.print("주민번호 : ");
			this.ssn = sc.nextLine();
			System.out.print("전화번호 : ");
			this.phone = sc.nextLine();
			System.out.print("주소 : ");
			this.address = sc.nextLine();
		} else if (gubun.equals("sujung")) {
			System.out.print("전화번호 : ");
			this.phone = sc.nextLine();
			System.out.print("주소 : ");
			this.address = sc.nextLine();
		}
	}
	
	public void display() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n", hakbun, name, ssn, phone, address, createdDate);
	}
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
}
