package exam;

public class User {
	private String name;
	private int iD;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public User(String name, int iD, String age) {
		this.name = name;
		this.iD = iD;
		this.age = age;
	}
	
	public User() {
	
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", iD=" + iD + ", age=" + age + "]";
	}
	
	
	
	
}
