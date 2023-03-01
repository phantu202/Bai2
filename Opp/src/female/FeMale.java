package female;

import persion.Human;

public class FeMale {

	protected String name = "Tu";
	protected String id;
	
	void test2() {
		System.out.println(name);
		System.out.println(id);	
	}
	
	public FeMale () {
		
	}
	public FeMale(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public FeMale(String id) {
		this.id = id;
	}

}
