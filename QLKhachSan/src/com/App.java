package com;

import java.util.Scanner;

import controller.Controller;
import service.CustomService;
import service.RoomService;

public class App {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		RoomService rService = new RoomService();
		CustomService cService = new CustomService();
		rService.start();
		cService.start();
		boolean condition = false;
		do {
			System.out.println("1. Để thao tác dữ liệu khách hàng");
			System.out.println("2. Để thao tác dữ liệu phòng");
			System.out.println("3. Để tìm kiếm thông tin khách hàng, phòng, đặt và trả phòng");
			System.out.println("4. Để xem thông tin trạng thái phòng");
			System.out.println("5. Để thoát chương trình");

			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				do {
					condition = true;
					System.out.println("1. Để tạo khách hàng");
					System.out.println("2. Để xem danh sách khách hàng");
					System.out.println("3. Để sửa thông tin khách hàng");
					System.out.println("4. Để xoá thông tin khách hàng");
					System.out.println("5. Để thoát dữ liệu khách hàng");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.createCustom();
						break;
					case 2:
						controller.readAllCustom();
						break;
					case 3:
						controller.updateCustom();
						break;
					case 4:
						controller.deleteCustom();
						break;
					case 5:
						condition=false;
						break;
					default:
						break;
					}
				} while (condition);
				
				break;
			case 2:
				do {
					condition = true;
					System.out.println("1. Để tạo phòng");
					System.out.println("2. Để xem danh sách phòng");
					System.out.println("3. Để cập nhật thông tin phòng");
					System.out.println("4. Để xoá thông phòng");
					System.out.println("5. Để thoát dữ liệu phòng");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.createRoom();
						break;
					case 2:
						controller.readAllRoom();
						break;
					case 3:
						controller.updateRoom();
						break;
					case 4:
						controller.deleteRoom();
						break;
					case 5:
						condition=false;
						break;
					default:
						break;
					}
				} while (condition);
				break;	
			case 3:
				do {
					condition = true;
					System.out.println("1. Tìm kiếm thông tin khách hàng");
					System.out.println("2. Tìm kiếm thông tin phòng");
					System.out.println("3. Đặt phòng");
					System.out.println("4. Trả phòng");
					System.out.println("5. Để thoát tìm kiếm và đặt phòng");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.findCustom();;
						break;
					case 2:
						controller.findRoom();
						break;
					case 3:
						controller.bookRoom();
						break;
					case 4:
						controller.checkRoom();
						break;
					case 5:
						condition=false;
						break;
					default:
						System.out.println("Lựa chọn không tồn tại");
						break;
					}
				} while (condition);
				break;
			case 4:
				do {
					condition = true;
					System.out.println("1. Xem thông tin phòng trống");
					System.out.println("2. Xem thông tin phòng đang thuê");
					System.out.println("3. Thoát xem");
					int choice = Integer.parseInt(scanner.nextLine());
					switch (choice) {
					case 1:
						controller.findEmtyRoom();
						break;
					case 2: 
						controller.findRentedRoom();
						break;
					case 3: 
						condition=false;
						break;
					default:
						System.out.println("Lựa chọn không tồn tại");
						break;
					}
				} while (condition);
				break;
			case 5:
				return;
			default:
				break;
			}
		} while (true);

	}

}
