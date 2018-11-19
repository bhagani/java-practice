package sample;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contact mycont = new contact("bhavanipriya", "friends", "vivo");
		contact con1 = new contact("anithariya", "family", "oppo");
		System.out.println(mycont);
		System.out.println(con1);
		ArrayList<contact> list = new ArrayList<contact>();
		list.add(mycont);
		list.add(con1);
		System.out.println(list);

	}

}
