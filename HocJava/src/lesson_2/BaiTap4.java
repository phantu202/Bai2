package lesson_2;

import java.util.Scanner;

public class BaiTap4 {
	//Giải hệ phương trình bậc 2 với ẩn x: ax2 + bx + c = 0 (a!=0)
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a = ");
		float a = scanner.nextFloat();
		System.out.println("b = ");
		float b = scanner.nextFloat();
		System.out.println("c = ");
		float c = scanner.nextFloat();
		float temp = b * b - (4 * a * c);
		if (a==0) {
			System.out.println("Không phải phương trình bậc 2");
		}
		else if (temp > 0) {
			float x1 = (float) ((-b + Math.sqrt(temp))/a/2);
			float x2 = (float) ((-b - Math.sqrt(temp))/a/2);
			System.out.println("Nghiệm của phương trình là " + x1 + " và " + x2);
			
		} else {
			if (temp == 0) {
				float x3 = -b/2/a;
				System.out.println("Phương trình có nghiệm kép là: " + x3);
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		
		
		
		
	}

}
