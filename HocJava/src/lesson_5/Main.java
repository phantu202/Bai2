package lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("g");
		list2.add("h");
		arrayList.addAll(list2);
		
		LinkedList<String> linkedList = new LinkedList<>();
		
	Queue queue = new LinkedList();
	Map<String, String> map = new HashMap<>();
	map.put("A", "Vinh");
	map.put("B", "Duc");
	map.put("C", "Phi");
	map.put("C", "Son");
	
	String name = map.get("C");
	System.out.println(name);
	}

}
