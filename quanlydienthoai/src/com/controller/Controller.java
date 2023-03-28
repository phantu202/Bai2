package com.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.model.SmartPhone;
import com.service.PhoneSevice;

public class Controller {
	private PhoneSevice service = new PhoneSevice();
	
	public void read(){
		ArrayList<SmartPhone> list = service.readAll();
		for (int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public void add () {
		SmartPhone smartPhone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ID");
		smartPhone.setId(scanner.nextInt());
		System.out.println("Nhập tên điện thoại");
		smartPhone.setName(scanner.nextLine());
		System.out.println("Nhập loại điện thoại");
		smartPhone.setCategory(scanner.nextLine());
		System.out.println("Nhập hãng");
		smartPhone.setTenHang(scanner.nextLine());
		System.out.println("Nhập giá");
		smartPhone.setGia(scanner.nextLong());
		service.create(smartPhone);
	}
	public void update () {
		SmartPhone smartPhone = new SmartPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập ID");
		smartPhone.setId(scanner.nextInt());
		System.out.println("Nhập tên điện thoại");
		smartPhone.setName(scanner.nextLine());
		System.out.println("Nhập loại điện thoại");
		smartPhone.setCategory(scanner.nextLine());
		System.out.println("Nhập hãng");
		smartPhone.setTenHang(scanner.nextLine());
		System.out.println("Nhập giá");
		smartPhone.setGia(scanner.nextLong());
		service.update(smartPhone);
	}
	public void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập id cần xoá");
		int id = scanner.nextInt();
		service.delete(id);
		
	}
	
}
