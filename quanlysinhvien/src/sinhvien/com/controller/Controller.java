package sinhvien.com.controller;

import java.util.Scanner;

import sinhvien.com.impl.StudentImpl;
import sinhvien.com.model.Student;
import sinhvien.com.service.StudentService;

public class Controller {

	StudentService service = new StudentImpl();
	Scanner scanner = new Scanner(System.in);
	Student student = new Student();

	public void create() {
		System.out.println("Nhập eID:");
		student.seteId(scanner.nextLine());
		System.out.println("Nhập tên:");
		student.setName(scanner.nextLine());
		System.out.println("Nhập tuổi:");
		student.setAge(scanner.nextLine());
		System.out.println("Nhập mSV");
		student.setMsv(scanner.nextLine());
		System.out.println("Nhập lớp");
		student.setClassId(scanner.nextLine());
		System.out.println("Nhập khoá");
		student.setTenKhoa(scanner.nextLine());
		service.create(student);
	}

	public void read() {
		service.readAll();
	}

	public void update() {
		System.out.println("Nhập eID:");
		student.seteId(scanner.nextLine());
		System.out.println("Nhập tên:");
		student.setName(scanner.nextLine());
		System.out.println("Nhập tuổi:");
		student.setAge(scanner.nextLine());
		System.out.println("Nhập mSV");
		student.setMsv(scanner.nextLine());
		System.out.println("Nhập lớp");
		student.setClassId(scanner.nextLine());
		System.out.println("Nhập khoá");
		student.setTenKhoa(scanner.nextLine());
		service.update(student);
	}

	public void delete() {
		System.out.println("Nhập mã sinh viên cần xoá thông tin");
		String mSV = scanner.nextLine();
		service.delete(mSV);
	}

}
