package online_job_management;

public class candidate {
    String name;
 	int mobile;
 	String email;
 	String address;
 	String education;
 	
 	public candidate(String name, int mobile, String email, String address,String education) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address=address;
		this.education=education;
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	void email()
	{
		System.out.println("- - - - - - - - - - - - - - -");
		System.out.println("Confirmation on Email : "+getEmail());
		System.out.println("Enrollement SUCCESSFUL");
	}
	
	void mobile()
	{
		System.out.println("- - - - - - - - - - - - - - -");
		System.out.println("Confirmation through SMS : "+getMobile());
		System.out.println("Enrollement SUCCESSFUL");
	}
}
