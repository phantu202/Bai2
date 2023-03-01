package lesson_3;

public class BaiTap10 {
	//Viét chương trình liệt kê tất cả các số thuận nghịch và nguyên tố có 6 chữ số
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100000;
		do {
			if(findReversibleNum(i)) {
				System.out.println(i);
			}
			i++;
		} while (i<1000000);
		
		
		
	}
	public static boolean findPrime (int x) {
		int temp = 0;
		boolean f;
		if (x > 0) {
			temp = 1;
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					temp = 0;
				}
			}
		}
		if (temp == 1) {
			f=true;
		} else {
			f=false;
		}
		return (f);
		
	}
	public static boolean findReversibleNum (int x) {
		boolean reversible = true;
		if ((x - x%100000)/100000 != x%10) {
			reversible=false;
		}
		if ((x%100000 - x%10000)/10000 != (x%100 - x%10)/10) {
			reversible = false;
		}
		if ((x%10000 - x%1000)/1000 != (x%1000 - x%100)/100) {
			reversible = false;
		}
		
		return reversible;
		
	}
}
