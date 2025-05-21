package pkg_homework.homework05.model.vo;

public class Member {
	
	// field
	private String memberId;
	private String memberPw;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	//method
	public Member() {}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("Name: " + memberName);
	}
	
	
	
	
	
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
