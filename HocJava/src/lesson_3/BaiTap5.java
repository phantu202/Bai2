package lesson_3;

import java.util.Scanner;

public class BaiTap5 {
	//Viết hàm nhập vào 1 mảng số nguyên vào đảo ngước phẩn từ đó rồi trả về một mảng mới 
	//(vd: input [1,2,3,4,5], output [5,4,3,2,1]
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
		System.out.println("Các phần tử mảng ban đầu là: ");
		for (int i : arr) {
			System.out.print(i + "\t");
			
		}
		
		//Tạo mảng đảo ngược và xuất giá trị ra màn hình
		int [] arr2 = new int [n];
		for (int i = 0; i < n; i++) {
			arr2[i] = arr[n-1-i];
		}
		System.out.println("\nCác phần tử mảng đảo ngược là:");
		for (int i : arr2) {
			System.out.print(i + "\t");
		}
		
		
	}

}
