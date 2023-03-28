package model;

public class Product {
	private int id;
	private String name;
	private int price;
	private int quantSold;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantSold() {
		return quantSold;
	}

	public void setQuantSold(int quantSold) {
		this.quantSold = quantSold;
	}

	public Product(int id, String name, int price, int quantSold) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantSold = quantSold;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantSold=" + quantSold + "]";
	}

	
}
