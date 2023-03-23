package com;

public class Vietnamese extends Person {
	private String quocTich;
	private String danToc;
	public Vietnamese() {
		super();
	}
	public Vietnamese(String id, String name, int age) {
		super(id, name, age);
	}
	@Override
	public void speak() {
		System.out.println("Xin chào");
	}
	
}
