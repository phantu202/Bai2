package lesson_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BaiTap5 {
	//Viet chương trình tính diện tích hình tròn
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float PI = 3.14F;
		DecimalFormat dcf = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập bán kính đường tròn: ");
		float r = sc.nextFloat();
		float area = PI * r * r;
		System.out.println("Diện tích hình tròn là: " + dcf.format(area));
		
		
		

	}

}
