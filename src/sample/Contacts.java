package sample;

public class Contacts {
         String fname = "priya";
         String lname = "bhavani";
         String title = "friends";
         String mobile = "oppo";
         String email = "bhavani@gmail.com";
         int age = 20;
         
	public static void main(String[] args) {
		Contacts c1 = new Contacts();
		System.out.println("name :" + c1.fname +"" +c1.lname);
		System.out.println("title :" + c1.title);
		System.out.println("mobile :" + c1.mobile);
		System.out.println("email :" + c1.email);
		System.out.println("age :" + c1.age);
		
	}

}
