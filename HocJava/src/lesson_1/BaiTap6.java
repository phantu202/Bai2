package lesson_1;

import java.util.Scanner;

public class BaiTap6 {
	//Viết chương trình đổi USD sang VND

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập tỷ giá đổi 1 usd sang vnd: ");
		float tyGia = scanner.nextFloat();
		System.out.println("Mời bạn nhập số usd cần đổi: ");
		float amount = scanner.nextFloat();
		float soTenQuyDoi = amount * tyGia;
		System.out.println(amount + " usd = " + soTenQuyDoi + " vnd" );
	}

}
