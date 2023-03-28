package controller;

import java.util.Scanner;

import model.Product;
import service.ProduceService;

public class Controller {
	ProduceService pService = new ProduceService();
	Scanner scanner = new Scanner(System.in);
	
	public void createProduct() {
		System.out.println("Nhập ID sản phẩm: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sản phẩm: ");
		String name = scanner.nextLine();
		System.out.println("Nhập giá bán sản phẩm: ");
		int price = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số lượng đã bán sản phẩm");
		int quantSold = Integer.parseInt(scanner.nextLine());
		Product product = new Product(id, name, price, quantSold);
		pService.createProduct(product);
	}
	
	public void readAll() {
		pService.readAll();
	}
	public void updateProduct() {
		System.out.println("Nhập ID sản phẩm: ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sản phẩm: ");
		String name = scanner.nextLine();
		System.out.println("Nhập giá bán sản phẩm: ");
		int price = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số lượng đã bán sản phẩm");
		int quantSold = Integer.parseInt(scanner.nextLine());
		Product product = new Product(id, name, price, quantSold);
		pService.updateProduct(product);
	}
	public void deleteProduct() {
		System.out.println("Nhập id sản phẩm cần xoá");
		int id = scanner.nextInt();
		pService.deleteProduct(id);
		
	}
	public void findIdProduct() {
		System.out.println("Nhập Id sản phẩm cần tìm");
		int id = Integer.parseInt(scanner.nextLine());
		pService.findIdProduct(id);
	}
	public void findNameProduct() {
		System.out.println("Nhập tên sản phẩm cần tìm");
		String name = scanner.nextLine();
		pService.findNameProduct(name);
	}
	public void sellProduct() {
		System.out.println("Nhập Id sản phẩm cần bán");
		int idProduct = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập số lượng bán:");
		int quantiSell = Integer.parseInt(scanner.nextLine());
		pService.sellProduct(idProduct, quantiSell);
	}
	public void salesReport () {
		System.out.println("Báo cáo bán hàng: ");
		System.out.println("Tổng số lượng đã bán: " + pService.totalSold());
		pService.totalSoldEachProduct();
		System.out.println("Tổng doanh thu bán hàng: " + pService.sumRevenue());
		pService.revenueOfEachProduct();
	}
	
}
