package female;

public class Student {
	private String name;
	private String age;
	public String getName() {
		return this.name;
	}
	public void setAge(String age) {
		if (Integer.parseInt(age)>100 || Integer.parseInt(age)<0) {
			System.out.println("tuổi sai");
			return;
		}
		this.age = age;
	}
	
}
