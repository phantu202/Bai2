package lesson_3;

import java.util.Scanner;

public class BaiTap4 {
//	Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
//	nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		do {
			System.out.println("Mời nhập số: ");
			int n = scanner.nextInt();
			sum += n;
		} while (sum<=100);
		
		System.out.println("Tổng các số đã nhập là: " + sum);
		
		
	}

}
