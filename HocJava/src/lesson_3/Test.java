package lesson_3;

public class Test {

	public static void main(String[] args) {
		int [] arr = {23,54,2,104,5,54,89};
	
		System.out.println(myFuntion(4, 5));
		System.out.println(test(4, "Get out "));
		
		test(45, 30, 4);
		
		
	}

	public static int myFuntion(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static String test (int i , String a) {
		return a + i;
	}
	
	public static void test(int i, String a, String b) {
		System.out.println(a);
	}
	public static void test(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Chu vi hình tam giác là: " + sum);
	}
	
}
