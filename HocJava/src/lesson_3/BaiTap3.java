package lesson_3;

import java.util.Scanner;

public class BaiTap3 {
	//Nhập vào 1 số nguyên tìm số nguyên đó trong mảng
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = {23,43,56,76,34,23,65,44};
		int x = -1;
		System.out.println("Nhập số nguyên cần tìm: ");
		int n = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(n == arr[i]) {
				x=i;
				break;
			}
		}
		if (x <0) {
			System.out.println("Trong mảng không có số cần tìm");
		} else {
			System.out.println("Vị trí số cần tìm trong mảng là: " + x);
		}
		
		
		
		
	}

}
