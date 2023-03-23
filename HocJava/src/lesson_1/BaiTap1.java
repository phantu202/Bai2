package lesson_1;

import java.util.Scanner;

public class BaiTap1 {
	// Viết chương trình cho phép người dùng nhập và xuất ra tên mình

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào tên của mình");
		String ten = scanner.nextLine();
		System.out.println("Tên của bạn là: " + " " + ten);
		int i = 5;
		switch (i) {
		case 1: 
			System.out.println("1");
			break;
		case 2: 
			System.out.println("2");
			break;
		default: System.out.println("Khác");
		}
		System.out.println("Độc lập tự do");
	}

}
