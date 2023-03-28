package com;

import java.util.Scanner;

import controller.Controller;
import service.ProduceService;

public class App {

	public static void main(String[] args) {
		Controller controller = new Controller();
		ProduceService pService = new ProduceService();
		pService.start();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. Để thêm sản phẩm");
			System.out.println("2. Để xem toàn bộ sản phẩm");
			System.out.println("3. Để sửa sản phẩm");
			System.out.println("4. Để xoá sản phẩm");
			System.out.println("5. Tìm sản phẩm");
			System.out.println("6. Bán sản phẩm");
			System.out.println("7. Báo cáo bán hàng");
			System.out.println("8. Thoát chương trình");
			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				controller.createProduct();
				break;
			case 2:
				controller.readAll();
				break;
			case 3: 
				controller.updateProduct();
				break;
			case 4: 
				controller.deleteProduct();
				break;
			case 5:
				boolean condition=true;
				do {
					System.out.println("1. Để tìm sản phẩm theo ID");
					System.out.println("2. Để tìm sản phẩm theo tên");
					System.out.println("3. Để thoát tìm kiếm");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.findIdProduct();
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
				} while (condition);
				break;
			case 6:
				controller.sellProduct();
				break;
			case 7:
				controller.salesReport();
				break;
			case 8:
				return;
			default:
				break;
			}
			
		}while (true);

	}

}
