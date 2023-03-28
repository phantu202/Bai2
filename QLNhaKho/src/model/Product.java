package model;

public class Product {
	private int id;
	private String name;
	private int quanti;
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuanti() {
		return quanti;
	}

	public void setQuanti(int quanti) {
		this.quanti = quanti;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Product(int id, String name, int quanti, String location) {
		this.id = id;
		this.name = name;
		this.quanti = quanti;
		this.location = location;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quanti=" + quanti + ", location=" + location + "]";
	}

}
