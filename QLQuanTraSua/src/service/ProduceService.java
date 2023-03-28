package service;

import java.util.ArrayList;

import model.Product;

public class ProduceService {

	public static ArrayList<Product> listProducts;

	public void start() {
		if (listProducts == null) {
			listProducts = new ArrayList<>();
			listProducts.add(new Product(1, "Trà đào", 30000, 15));
			listProducts.add(new Product(2, "Trà chanh", 20000, 25));
			listProducts.add(new Product(3, "Trà quất", 25000, 30));
			listProducts.add(new Product(4, "Trà sữa", 45000, 40));
		}
	}

	public void createProduct(Product product) {
		boolean cond = true;
		for (Product product1 : listProducts) {
			if (product1.getId() == product.getId()) {
				System.out.println("Đã tồn tại sản phẩm id này");
				cond = false;
				break;
			}
		}
		if (cond) {
			listProducts.add(product);
		}
	}

	public void readAll() {
		for (Product product : listProducts) {
			System.out.println(product.toString());
		}
	}

	public void updateProduct(Product product) {
		boolean cond = true;
		for (Product product1 : listProducts) {
			if (product1.getId() == product.getId()) {
				product1.setName(product.getName());
				product1.setPrice(product.getPrice());
				product1.setQuantSold(product.getQuantSold());
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại sản phẩm id này");
		}
	}

	public void deleteProduct(int id) {
		for (Product product : listProducts) {
			if (product.getId() == id) {
				listProducts.remove(product);
			}
		}
	}

	public void findIdProduct(int id) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == id) {
				System.out.println(product.toString());
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tìm thấy sản phẩm");
		}

	}

	public void findNameProduct(String name) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getName().equals(name)) {
				System.out.println(product.toString());
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tìm thấy sản phẩm");
		}
	}

	public void sellProduct(int idProduct, int quantiSell) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == idProduct) {
				product.setQuantSold(product.getQuantSold() + quantiSell);
				System.out.println("Bán thành công");
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại sản phẩm");
		}
	}

	public int totalSold() {
		int totalSold = 0;
		for (Product product : listProducts) {
			totalSold += product.getQuantSold();
		}
		return totalSold;
	}

	public void totalSoldEachProduct() {
		System.out.println("Tổng số lượng đã bán từng loại sản phẩm là: ");
		for (Product product : listProducts) {
			System.out.println(product.getName() + " đã bán " + product.getQuantSold());
		}
	}

	public int sumRevenue() {
		int sumRevenue = 0;
		for (Product product : listProducts) {
			sumRevenue += product.getPrice() * product.getQuantSold();
		}
		return sumRevenue;
	}

	public void revenueOfEachProduct() {
		System.out.println("Tổng doanh thu từng loại sản phẩm là:");
		for (Product product : listProducts) {
			int revenue = product.getPrice() * product.getQuantSold();
			System.out.println(product.getName() + " doanh thu: " + revenue);
		}
	}

}
