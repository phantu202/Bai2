package lesson_2;

import java.util.Scanner;

public class BaiTap3 {
	//Viết chương trình nhập vào 1 số, xác định xem số đó là số chẵn hay lẻ, âm hay dương
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số cần xác định: ");
		int num = scanner.nextInt();
		if (num < 0) {
			System.out.println("Số này là số âm");
		} else {
			System.out.println("Số này là số dương");
		}
		if (num % 2 == 0) {
			System.out.println("Số này là số chẵn");
		} else {
			System.out.println("Số này là số lẻ");
		}
	}

}
