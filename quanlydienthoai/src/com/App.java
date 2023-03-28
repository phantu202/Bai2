package com;

import java.util.Scanner;

import com.controller.Controller;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller();
		do {
			System.out.println("1. Để xem toàn bộ thông tin điện thoại");
			System.out.println("2. Để thêm thông tin điện thoại");
			System.out.println("3. Để cập nhật thông tin điện thoại");
			System.out.println("4. Để xoá thông tin điện thoại");
			System.out.println("0. Để thoát");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				controller.read();
				break;
			case 2:
				controller.add();
				break;
			case 3:
				controller.update();
				break;
			case 4:
				controller.delete();
				break;
			case 0: 
				System.exit(1);
			default:
				System.out.println("Yêu cầu không hợp lệ");
			}
				
		} while (true);
		}

}
