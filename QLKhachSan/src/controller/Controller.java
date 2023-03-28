package controller;

import java.util.Scanner;

import model.Custom;
import model.Room;
import service.CustomService;
import service.RoomService;

public class Controller {
	CustomService cService = new CustomService();
	Scanner scanner = new Scanner(System.in);
	public void createCustom() {
		System.out.println("Nhập ID");
		int idCustom = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên khách hàng");
		String customName = scanner.nextLine();
		System.out.println("Nhập giới tính khách hàng");
		String customSex = scanner.nextLine();
		System.out.println("Nhập điện thoại khách hàng");
		String customFone = scanner.nextLine();
		Custom custom = new Custom(idCustom, customName, customSex, customFone);
		cService.createCustom(custom);
		
	}
	public void readAllCustom() {
		cService.readAllCustom();
	}
	public void updateCustom () {
		System.out.println("Nhập ID");
		int idCustom = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên khách hàng");
		String customName = scanner.nextLine();
		System.out.println("Nhập giới tính khách hàng");
		String customSex = scanner.nextLine();
		System.out.println("Nhập điện thoại khách hàng");
		String customFone = scanner.nextLine();
		Custom custom = new Custom(idCustom, customName, customSex, customFone);
		cService.updateCustom(custom);
	}
	
	public void deleteCustom() {
		System.out.println("Nhập id khách cần xoá:");
		int idCustom = Integer.parseInt(scanner.nextLine());
	}
	RoomService rService = new RoomService();
	public void createRoom () {
		System.out.println("Nhập số phòng");
		int numbRoom = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập loại phòng");
		String kindOfRoom = scanner.nextLine();
		System.out.println("Nhập ID khách đang thuê (nếu không có khách thuê nhập 0)");
		int tenantID = Integer.parseInt(scanner.nextLine());
		Room room = new Room(numbRoom, kindOfRoom, tenantID);
		rService.createRoom(room);
	}
	public void readAllRoom () {
		rService.readAllRoom();
	}
	public void updateRoom() {
		System.out.println("Nhập số phòng");
		int numbRoom = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập loại phòng");
		String kindOfRoom = scanner.nextLine();
		System.out.println("Nhập ID khách đang thuê (nếu không có khách thuê nhập 0)");
		int tenantID = Integer.parseInt(scanner.nextLine());
		Room room = new Room(numbRoom, kindOfRoom, tenantID);
		rService.updateRoom(room);
	}
	public void deleteRoom() {
		System.out.println("Nhập số phòng cần xoá");
		int numbRoom = Integer.parseInt(scanner.nextLine());
		rService.deleteRoom(numbRoom);
	}
	public void findCustom() {
		System.out.println("Mời nhập ID khách cần tìm:");
		int idCustom = Integer.parseInt(scanner.nextLine());
		cService.findCusom(idCustom);
	}
	public void findRoom() {
		System.out.println("Mời nhập vào số phòng cần tìm");
		int numbRoom = Integer.parseInt(scanner.nextLine());
		rService.findRoom(numbRoom);
	}
	public void bookRoom() {
		System.out.println("Nhập ID khách đặt phòng");
		int idCustom = Integer.parseInt(scanner.nextLine());
		boolean temp = cService.bookRoom(idCustom);
		if (temp) {
			System.out.println("Nhập số phòng khách đặt");
			int numbRoom = Integer.parseInt(scanner.nextLine());
			rService.bookRoom(numbRoom, idCustom);
		}
		
	}
	public void checkRoom() {
		System.out.println("Mời nhập vào số phòng cần trả");
		int numbRoom = Integer.parseInt(scanner.nextLine());
		rService.checkRoom(numbRoom);
	}
	public void findEmtyRoom() {
		rService.findEmtyRoom();
	}
	public void findRentedRoom() {
		rService.findRentedRoom();
	}
	
}
