package lesson_3;

import java.security.PublicKey;
import java.util.Scanner;

public class BaiTap1 {
	//Viết chương trình nhập vào n số nguyên và thực xuất các giá trị của mảng,tìm min,max
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Mời bạn nhập số phần tử cho mảng (n > 0): ");
			n = scanner.nextInt();
		} while (n <= 0);
		
		//Nhập phần tử trong mảng
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Mời bạn nhập phần tử vị trí " + i + " trong mảng");
			arr[i] = scanner.nextInt();
		}
		
		//Xuất giá trị trong mảng
		System.out.println("Các giá trị trong mảng là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		//Tìm min max trong mảng
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("\n4Giá trị min là: " + min + ", max là: " + max);
		
		
		
		
	}
}
