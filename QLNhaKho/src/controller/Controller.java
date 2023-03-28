package controller;

import java.util.Scanner;

import model.Product;
import sevice.ProductService;

public class Controller {
	ProductService pService = new ProductService();
	Scanner scanner = new Scanner(System.in);

	public void createProduct() {
		System.out.println("Nhập ID sản phẩm: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sản phẩm: ");
		String name = scanner.nextLine();
		System.out.println("Nhập số lượng sản phẩm: ");
		int quanti = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập vị trí để sản phẩm: ");
		String location = scanner.nextLine();
		Product product = new Product(id, name, quanti, location);
		pService.createProduct(product);
	}

	public void readAllProduct() {
		pService.readAllProduct();
	}

	public void updateProduct() {
		System.out.println("Nhập ID sản phẩm: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sản phẩm: ");
		String name = scanner.nextLine();
		System.out.println("Nhập số lượng sản phẩm: ");
		int quanti = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập vị trí để sản phẩm: ");
		String location = scanner.nextLine();
		Product product = new Product(id, name, quanti, location);
		pService.updateProduct(product);
	}

	public void deleteProduct() {
		System.out.println("Nhập ID sản phẩm cần xoá");
		int id = Integer.parseInt(scanner.nextLine());
		pService.deleteProduct(id);
	}
	
	public void findIDProduct () {
		System.out.println("Nhập ID sản phẩm cần tìm");
		int id = Integer.parseInt(scanner.nextLine());
		pService.findIDProduct(id);
	}
	public void findNameProduct () {
		System.out.println("Nhập tên sản phẩm cần tìm");
		String name = scanner.nextLine();
		pService.findNameProduct(name);
	}
	
	public void importProduct() {
		System.out.println("Nhập mã hàng nhập kho");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số lượng nhập kho");
		int quanti = Integer.parseInt(scanner.nextLine());
		pService.importProduct(id, quanti);
	}
	public void exportProduct() {
		System.out.println("Nhập mã hàng xuất kho");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số lượng xuất kho");
		int quanti = Integer.parseInt(scanner.nextLine());
		pService.exportProduct(id, quanti);
	}
}
