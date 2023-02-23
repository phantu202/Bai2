package lesson_2;

import java.util.Scanner;

public class BaiTap2 {
	//Viết chương trình nhập vào ba số tìm số lớn nhất trong 3 số

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số thứ nhất: ");
		double num1 = scanner.nextDouble();
		System.out.println("Số thứ hai: ");
		double num2 = scanner.nextDouble();
		System.out.println("Số thứ ba: ");
		double num3 = scanner.nextDouble();
		double temp = num1;
		if (temp < num2) {
			temp = num2;
		}
		if (temp < num3) {
			temp = num3;
		}
		System.out.println("Số lớn nhất trong ba số là: " + temp);
		
	}

}
