package lesson_3;

import java.util.Scanner;

public class BaiTap9 {
	//Nhập n với 2<=n <=90 và một số k. 
	//Viết chuong trình in ra n số fibonacci đầu tiên chia hết cho k
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k;
		do {
			System.out.println("Nhập n (2<=n<=90)");
			n = scanner.nextInt();
		} while (n<2||n>90);
		do {
			System.out.println("Nhập k (k > 0)");
			k = scanner.nextInt();
		} while (k<=0);
		int fiboM=0;
		int fiboN=1;
		int fibo;
		do {
			fibo = fiboM + fiboN;
			fiboM = fiboN;
			fiboN = fibo;
			if(fibo%k ==0) {
				System.out.print(fibo+ "\t");
				n--;
			}
		} while (n>0);
		
		
		
		
	}
	
}