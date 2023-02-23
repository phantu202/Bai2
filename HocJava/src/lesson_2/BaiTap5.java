package lesson_2;

import java.util.Scanner;

public class BaiTap5 {
	//Giải hệ phương trình ax + by = c && dx + ey = f
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("a = ");
		double a = scanner.nextDouble();
		System.out.print("b = ");
		double b = scanner.nextDouble();
		System.out.print("c = ");
		double c = scanner.nextDouble();
		System.out.print("d = ");
		double d = scanner.nextDouble();
		System.out.print("e = ");
		double e = scanner.nextDouble();
		System.out.print("f = ");
		double f = scanner.nextDouble();
		double x,y;
		
		//TH1 a và d cùng bằng 0 - ko phải hệ phương trình
		if (a == 0 && d == 0) {
			System.out.println("Không phải hệ phương trình");	
		}
		
		//TH2 b và e cùng bằng 0 - ko phải hệ phương trình
		if (b == 0 && e == 0) {
			System.out.println("Không phải hệ phương trình");	
		}
		
		//TH3 a và b cùng bằng 0 - ko phải hệ phương trình
		if (a == 0 && b == 0) {
			System.out.println("Không phải hệ phương trình");	
		}
		
		//TH4 d và e cùng bằng 0 - ko phải hệ phương trình
		if (d == 0 && e == 0) {
			System.out.println("Không phải hệ phương trình");	
		}
		
		//TH5 a == 0 và b,d,e !=0
		if (a == 0 && b != 0 && d != 0 && e != 0) {
			y = c/b;
			x = (f - (e*y))/d;
			System.out.println("Nghiệm của phương trình: x = " + x + " và y = " + y);
		}
		
		//TH6 b == 0 và a,d,e !=0
		if (b == 0 && a != 0 && d != 0 && e != 0) {
			x = c/a;
			y = (f - (d*x))/e;
			System.out.println("Nghiệm của phương trình: x = " + x + " và y = " + y);
		}
		
		//TH7 d == 0 và a,b,e != 0
		if (d == 0 && a != 0 && b != 0 && e != 0) {
			y = f/e;
			x = (c - (b*y))/a;
			System.out.println("Nghiệm của phương trình: x = " + x + " và y = " + y);
		}
		
		//TH8 e == 0 và a,b,d !=0
		if (e == 0 && a != 0 && b != 0 && d != 0) {
			x = f/d;
			y = (c - (a*x))/b;
			System.out.println("Nghiệm của phương trình: x = " + x + " và y = " + y);
		}
		
		//TH9 a,b,d,e != 0
		if (a != 0 && b != 0 && d != 0 && e != 0) {
			double temp1 = e - d*b/a;
			double temp2 = f - d*c/a;
			if (temp1 == 0) {
				if(temp2 == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phuong trình vô nghiệm");
				}
			} else {
				y = temp2/temp1;
				x = (c - (b*y))/a;
				System.out.println("Nghiệm của phương trình: x = " + x + " và y = " + y);
			}
		}
	}

}
