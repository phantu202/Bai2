package qlsinhviengiangvien.com;

import java.util.Scanner;

import qlsinhviengiangvien.controller.Controller;

public class App {

	public static void main(String[] args) {

		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		boolean condition = false;
		do {
			System.out.println("1. Để thao tác với dữ liệu giáo viên");
			System.out.println("2. Để thao tác với dữ liệu sinh viên");
			System.out.println("3. Để tìm kiếm thông tin sinh viên và giáo viên");
			System.out.println("4. Thoát chương trình");
			int input = Integer.parseInt(scanner.nextLine());
			switch (input) {
			case 1:
				do {
					condition = true;
					System.out.println("1. Để thêm giáo viên");
					System.out.println("2. Để đọc toàn bộ thông tin giáo viên");
					System.out.println("3. Để sửa thông tin giáo viên");
					System.out.println("4. Để xoá thông tin giáo viên");
					System.out.println("5. Để thoát thao tác với dữ liệu giáo viên");
					int choice1 = Integer.parseInt(scanner.nextLine());
					switch (choice1) {
					case 1:
						controller.createTeacher();
						break;
					case 2:
						controller.readAllTeacher();
						break;
					case 3:
						controller.updateTeacher();
						break;
					case 4:
						controller.deleteTeacher();
						break;
					case 5:
						condition = false;
						break;
					default:
						System.out.println("Lựa chọn không đúng");
						break;
					}

				} while (condition);
				break;
			case 2:
				do {
					condition = true;
					System.out.println("1. Để thêm sinh viên");
					System.out.println("2. Để đọc toàn bộ thông tin sinh viên");
					System.out.println("3. Để sửa thông tin sinh viên");
					System.out.println("4. Để xoá thông tin sinh viên");
					System.out.println("5. Để thoát thao tác với dữ liệu sinh viên");
					int choice1 = Integer.parseInt(scanner.nextLine());
					switch (choice1) {
					case 1:
						controller.createStudent();
						break;
					case 2:
						controller.readAllStudent();
						break;
					case 3:
						controller.updateStudent();
						break;
					case 4:
						controller.deleteStudent();
						break;
					case 5:
						condition = false;
						break;
					default:
						System.out.println("Lựa chọn không đúng");
						break;
					}

				} while (condition);
				break;
			case 3:
				do {
					condition = true;
					System.out.println("1. Để tìm sinh viên theo id");
					System.out.println("2. Để tìm giáo viên theo id");
					System.out.println("3. Để thông tin theo id");
					System.out.println("4. Để tìm sinh viên theo tên");
					System.out.println("5. Để tìm giáo viên theo tên");
					System.out.println("6. Để thông tin theo tên");
					System.out.println("7. Để thoát thao tác tìm kiếm");
					int choice1 = Integer.parseInt(scanner.nextLine());
					switch (choice1) {
					case 1:
						controller.findStudentId();
						break;
					case 2:
						controller.findTeacherID();
						break;
					case 3:
						controller.findInfoID();
						break;
					case 4:
						controller.findStudentName();
						break;
					case 5:
						controller.findTeacherName();
						break;
					case 6:
						controller.findInfoName();
						break;
					case 7:
						condition = false;
						break;
					default:
						System.out.println("Lựa chọn không đúng");
						break;
					}

				} while (condition);
				break;
			case 4:
				return;
			default:
				System.out.println("Lựa chọn không tồn tại");
				break;
				
			}
		} while (true);
	}

}
