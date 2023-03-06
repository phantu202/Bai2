package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thứ 1: ");
		double elementA = scanner.nextDouble();
		System.out.println("Nhập số thứ 2: ");
		double elementB = scanner.nextDouble();
		System.out.println("Nhập 1 để thực hiện phép cộng");
		System.out.println("Nhập 2 để thực hiện phép trừ");
		System.out.println("Nhập 3 để thực hiện phép nhân");
		System.out.println("Nhập 4 để thực hiện phép chia");
		int caculation = scanner.nextInt();
		Method method = new Method();
		method.setElementA(elementA);
		method.setElementB(elementB);
		method.setCaculation(caculation);
		
		method.result(elementA, elementB, caculation);
			
		
	}
}
