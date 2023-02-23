package lesson_2;

import java.util.Scanner;

public class BaiTap1 {
	//viết chương trình xếp loại học viên dựa vào điểm trung bình 3 môn toán, lý, anh

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double diemTrungBinh = -1;
		System.out.println("Mời bạn nhập điểm môn toán: ");
		double diemToan = scanner.nextDouble();
		System.out.println("Mời bạn nhập điểm môn lý: ");
		double diemLy = scanner.nextDouble();
		System.out.println("Mời bạn nhập điểm môn anh: ");
		double diemAnh = scanner.nextDouble();
		if(diemToan >= 0 ^ diemToan <= 10 ^ diemAnh >=0 ^ diemAnh <= 10 ^ diemLy >= 0 ^ diemLy <= 10) {
			
		} else {
			diemTrungBinh = (diemAnh + diemLy + diemToan)/3;	
		}
		
		if (diemTrungBinh < 0) {
			System.out.println("Điểm nhập không hợp lệ");
		} else if (diemTrungBinh <=5 ) { 
			System.out.println("học lực trung bình");
			
		} else if (diemTrungBinh <= 8) {
			System.out.println("học lực khá");
			
		} else  {
			System.out.println("học lực giỏi");
			
		}
		
		
		
		
	}

}
