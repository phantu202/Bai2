package lesson_1;

import java.util.Scanner;

public class BaiTap2 {
	//Viết chương trình tính tổng hai số nguyên x và y

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số nguyên x: ");
		int x = scanner.nextInt();
		System.out.println("Mời bạn nhập số nguyên y: ");
		int y = scanner.nextInt();
		int sum = x + y;
		System.out.println("Tổng của 2 số nguyên là: " + sum);
		
	}

}
