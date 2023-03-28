package com;

import java.util.Scanner;

import controller.Controller;
import sevice.ProductService;

public class App {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		ProductService productService = new ProductService();
		productService.start();
		do {
			System.out.println("1. Để thêm sản phẩm");
			System.out.println("2. Để xem toàn bộ sản phẩm");
			System.out.println("3. Để sửa sản phẩm");
			System.out.println("4. Để xoá sản phẩm");
			System.out.println("5. Để tìm kiếm sản phẩm");
			System.out.println("6. Để nhập kho sản phẩm");
			System.out.println("7. Để xuất kho sản phẩm");
			System.out.println("8. Để thoát chương trình");
			
			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				controller.createProduct();
				break;
			case 2:
				controller.readAllProduct();
				break;
			case 3:
				controller.updateProduct();
				break;
			case 4: 
				controller.deleteProduct();
				break;
			case 5:
				boolean condition = true;
				do {
					System.out.println("1. Tìm kiếm theo ID sản phẩm");
					System.out.println("2. Tìm kiếm theo tên sản phẩm");
					System.out.println("3. Thoát tìm kiếm");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.findIDProduct();
						break;
					case 2:
						controller.findNameProduct();
						break;
					case 3:
						condition = false;
						break;
					default:
						System.out.println("Lựa chọn không tồn tại");
						break;
					}
				}while (condition);
				break;
			case 6:
				controller.importProduct();
				break;
			case 7:
				controller.exportProduct();
				break;
			case 8:
				return;
			default:
				break;
			}
		}while(true);

	}

}
