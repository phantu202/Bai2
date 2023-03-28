package exam;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		for(int i = 0; i<10; i++) {
		User user = new User("Tú", i+ 1, "25");
		users.add(user);
		}
		
//		System.out.println(users.toString());
		User abc = users.get(7);
		System.out.println(users.get(6).getName());
		users.get(2).setName("DuyAnh");
		users.get(4).setAge("15");
		users.get(6).setName("Phi");
		for (int i = 0; i< users.size(); i++) {
			System.out.println(users.get(i).toString());
		}	
		users.remove(2);
		
		
	}

}
