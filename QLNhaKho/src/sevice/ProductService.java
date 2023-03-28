package sevice;

import java.util.ArrayList;

import model.Product;

public class ProductService {
	public static ArrayList<Product> listProducts;

	public void start() {
		if (listProducts == null) {
			listProducts = new ArrayList<>();
			listProducts.add(new Product(1, "Quần", 10, "A1"));
			listProducts.add(new Product(2, "Áo", 20, "A2"));
			listProducts.add(new Product(3, "Bút", 15, "A3"));
			listProducts.add(new Product(4, "Sách", 30, "A4"));
		}
	}

	public void createProduct(Product product) {
		boolean cond = true;
		for (Product product1 : listProducts) {
			if (product1.getId() == product.getId()) {
				System.out.println("Đã tồn tại id sản phẩm");
				cond = false;
				break;
			}
		}
		if (cond) {
			listProducts.add(product);
		}
	}

	public void readAllProduct() {
		for (Product product : listProducts) {
			System.out.println(product.toString());
		}
	}

	public void updateProduct(Product product) {
		boolean cond = true;
		for (Product product1 : listProducts) {
			if (product1.getId() == product.getId()) {
				product1.setName(product.getName());
				product1.setQuanti(product.getQuanti());
				product1.setLocation(product.getLocation());
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại id sản phẩm");
		}
	}

	public void deleteProduct(int id) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == id) {
				listProducts.remove(product);
				System.out.println("Xoá thành công");
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại mã ID này");
		}
	}

	public void findIDProduct(int id) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == id) {
				System.out.println(product.toString());
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại sản phẩm mã id này");
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
			System.out.println("Không tồn tại sản phẩm tên như vậy");
		}
	}

	public void importProduct(int id, int quanti) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == id) {
				product.setQuanti(product.getQuanti() + quanti);
				System.out.println("Nhập thành công");
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại id sản phẩm");
		}
	}

	public void exportProduct(int id, int quanti) {
		boolean cond = true;
		for (Product product : listProducts) {
			if (product.getId() == id) {
				if (product.getQuanti() >= quanti) {
					product.setQuanti(product.getQuanti() - quanti);
					System.out.println("Xuất kho thành công");
				} else {
					System.out.println("Xuất kho vượt quá tồn kho");
				}
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại id sản phẩm");
		}
	}

}
