package lesson_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BaiTap3 {
	//Viết chương trình tính điểm trung bình 3 môn toán lý hoá

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dcf = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Điểm môn toán = ");
		float x = scanner.nextFloat();
		System.out.println("Điểm môn lý = ");
		float y = scanner.nextFloat();
		System.out.println("Điểm môn hoá = ");
		float z = scanner.nextFloat();
		float average = (x + y + z) / 3;
		System.out.println("Điểm trung bình 3 môn là: " + dcf.format(average));
		
	}

}
