package triutuong.com;

abstract public class Person {
	private String id;
	private String name;
	abstract public void speak();
	abstract public int tinhtoan(int x, int i);
	
	public String getNameAndID() {
		return id+name;
	}
}
