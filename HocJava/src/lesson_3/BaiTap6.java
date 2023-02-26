package lesson_3;

import java.util.Scanner;

public class BaiTap6 {
//	Viết hàm nhập vào 1 mảng số nguyên và một số nguyên , 
//	nếu số nguyên đấy tồn tại trong mảng thì xóa phần tử đấy 
//	(vd: input [1,2,3,4,5] và số nguyên 3, output [1,2,4,5]

	public static void main(String[] args) {
		//Tạo và nhập dữ liệu mảng n số nguyên
		int n;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Mời bạn nhập số phần tử cho mảng (n > 0): ");
			n = scanner.nextInt();
		} while (n <= 0);
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("Mời bạn nhập phần tử vị trí " + i + " trong mảng");
			arr[i] = scanner.nextInt();
		}
		System.out.println("Các phần tử mảng ban đầu là: ");
		for (int i : arr) {
			System.out.print(i + "\t");
			
		}
		System.out.println("\n");
		
		//Nhập vào 1 số nguyên nếu số đó tồn tại thì xoá phần tử đó trong mảng
		System.out.println("Mời nhập số nguyên cần xoá");
		int numDel = scanner.nextInt();
		int amountArr2 = n;
		for (int i = 0; i<n; i++) {
			if (arr[i] == numDel) {
				amountArr2--;
			}
		}
		int [] arr2 = new int [amountArr2];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != numDel) {
				arr2[j] = arr[i];
				j++;
			}	
		}
		System.out.println("Mảng mới sau xoá là: ");
		for (int i : arr2) {
			System.out.print(i + "\t");
		}
		
		
		
		

	}

}
