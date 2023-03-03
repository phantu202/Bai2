package com;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student studentA = new Student();
		
		System.out.println("Nhập tên sinh viên: ");
		String fullName = scanner.nextLine();
		System.out.println("Nhập lớp của sinh viên: ");
		String classRoom = scanner.nextLine();
		System.out.println("Nhập khối của sinh viên: ");
		String group = scanner.nextLine();
		
		studentA.setFullName(fullName);
		studentA.setClassRoom(classRoom);
		studentA.setGroup(group);
		studentA.getInfo();
		
		System.out.println("Nhập điểm của học sinh");
		int input;
		do {
			System.out.println("Bấm số 1 để nhập điểm môn văn");
			System.out.println("Bấm số 2 để nhập điểm môn toán");
			System.out.println("Bấm số 3 để nhập điểm môn anh");
			System.out.println("Bấm số 0 để thoát nhập điểm");
			input = scanner.nextInt();
			String subject;
			switch (input) {
			case 0: 
				System.out.println("Thoát nhập");
				continue;
			case 1:
				subject = "môn văn";
				break;
			case 2:
				subject = "môn toán";
				break;
			case 3: 
				subject = "môn anh";
				break;
			default:
				System.out.println("Nhập không hợp lệ");
				return;
			}
			System.out.println("Nhập điểm 15' " + subject);
			double scoreFactor1 = scanner.nextDouble();
			if (scoreFactor1 < 0 || scoreFactor1 > 10) {
				System.out.println("Điểm không hợp lệ!");
				return;
			}
			
			System.out.println("Nhập điểm 45' " + subject);
			double scoreFactor2 = scanner.nextDouble();
			if (scoreFactor2 < 0 || scoreFactor2 > 10) {
				System.out.println("Điểm không hợp lệ!");
				return;
			}
			
			System.out.println("Nhập điểm cuối kỳ' " + subject);
			double scoreFactor3 = scanner.nextDouble();
			if (scoreFactor3 < 0 || scoreFactor3 > 10) {
				System.out.println("Điểm không hợp lệ!");
				return;
			}
			
			studentA.enterSubjectScore(input, scoreFactor1, scoreFactor2, scoreFactor3);
			
		} while (input>0);
		
		studentA.finalStudentSummaries();
		
		
		
		

	}

}
