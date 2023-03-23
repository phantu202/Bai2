package sinhvien.com;

import java.util.Scanner;

import sinhvien.com.controller.Controller;
import sinhvien.com.impl.StudentImpl;
import sinhvien.com.model.Student;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controller controller = new Controller();
		StudentImpl.data();
		do {
			System.out.println("1. Xem sinh viên");
			System.out.println("2. Tạo sinh viên");
			System.out.println("3. Sửa sinh viên");
			System.out.println("4. Xoá sinh viên");
			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				controller.read();
				break;
			case 2:
				controller.create();
				break;
			case 3:
				controller.update();
				break;
			case 4:
				controller.delete();
				break;
			default:
				System.out.println("Yêu cầu không hợp lệ");
				return;
			}
		} while (true);

	}

}
