package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentA = new Student();
		studentA.setName("Phan Tú");
		studentA.setClassRoom("10A1");
		studentA.setGroup("Khối A");
		System.out.println("Bạn nhập 1 để tính điểm môn văn");
		System.out.println("Bạn nhập 2 để tính điểm môn toán");
		System.out.println("Bạn nhập 3 để tính điểm môn anh");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String tenMon = "";
		if(input.equals("1")) {
			tenMon = "Môn Văn";
		} else if (input.equals("2")) {
			tenMon = "Môn Toán";
		} else if (input.equals("3")) {
			tenMon = "Môn Anh";
		} else {
			System.out.println("tên môn không hợp lệ");
			return;
		}
		System.out.println("Nhập điểm " + tenMon);
		System.out.println("Điểm 15'");
		double diem15Phut = scanner.nextDouble();
		System.out.println("Điểm 1 tiết");
		double diem1Tiet = scanner.nextDouble();
		System.out.println("Điểm cuối kỳ");
		double diemCK = scanner.nextDouble();
		double diemTB = studentA.tinhDiemTB(input, diem15Phut, diem1Tiet, diemCK);
		System.out.println("Điểm trung bình " + tenMon + " là: " + diemTB);
		
		
		
	}

}
