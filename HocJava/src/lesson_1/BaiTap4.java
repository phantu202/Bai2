package lesson_1;

import java.util.Scanner;

public class BaiTap4 {
	//Viết chương trình tính diện tích hình vuông

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào chiều dài cạnh hình vuông");
		float x = sc.nextFloat();
		float square = x * x;
		System.out.println("Diện tích hình vuông là: " + square);
		
		
	}

}
