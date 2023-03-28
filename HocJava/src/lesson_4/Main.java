package lesson_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		arr[2] = 10;

		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		names.add("Tú");
		names.add("Phi");
		names.add("Duy Anh");
		names.add("Đức");
		names.add("Sơn");
		names.add("Tiến");
		names.add("Vinh");
		System.out.println(names.get(0));
		System.out.println(names.size());

		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			nums.add(10 - i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(nums.get(i));
		}
	}

}
