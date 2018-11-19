package sample;

public class contact {
	String fname, lname, title, mobile;
	int age;

	public contact(String name, String title, String mobile) {
		fname = name;
		lname = name;
		this.title = title;
		this.mobile = mobile;

	}

	@Override
	public String toString() {
		return "contact [fname=" + fname + ", lname=" + lname + ", title="
				+ title + ", mobile=" + mobile + ", age=" + age + "]";
	}

	
}
