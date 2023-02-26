package lesson_3;

import java.util.Scanner;

public class BaiTap7 {
//	tìm số nguyên tố (số nguyên tố là số chỉ chia hết cho 1 và chính nó) :
//	Viết hàm không trả về nhập vào 1 mảng số nguyên , 
//	nếu số nguyên đấy là số nguyên tố thì system.out số đó
//	(vd: input [5,6,7,8,9] , system.out(5,7)  )

	public static void main(String[] args) {
		findPrimes(1,3,4,5,6,7,10);
	}
	
	public static void findPrimes (int ...arr) {
		System.out.println("Số nguyên tố trong dẫy trên là: ");
		for (int i = 0; i < arr.length; i++) {
			findPrime(arr[i]);
		}
	}
	
	public static void findPrime (int x) {
		int temp = 0;
		if (x > 0) {
			temp = 1;
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					temp = 0;
				}
			}
		}
		if (temp == 1) {
			System.out.print(x + "\t");
		}
		
		
	}
}
