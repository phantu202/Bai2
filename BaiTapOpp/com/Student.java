package com;

public class Student {
	private String name;
	private String classRoom;
	private String group;
	private double monVan;
	private double monToan;
	private double monAnh;
	
	public Student () {
		
	}
	
	public Student(String name, String classRoom, String group) {
		
		this.name = name;
		this.classRoom = classRoom;
		this.group = group;	
	}
	
	public String getNameString () {
		return this.name;
	}
	
	public void setName (String name) {
		if (name.length()>10) {
			System.out.println("Tên không hợp lệ");
			return;
		}
		
		this.name = name;
	}
	
	public String getClassRoom () {
		return this.classRoom;
	}
	
	public void setClassRoom (String classRoom) {
		this.classRoom = classRoom;
	}
	
	public String getGroup () {
		return this.group;
	}
	
	public void setGroup (String group) {
		this.group = group;
	}
	
	public double getMonToan () {
		return this.monToan;
	}
	
	public void setMonToan (double monToan) {
		this.monToan = monToan;
	}
	
	public double getMonVan () {
		return this.monVan;
	}
	
	public void setMonVan (double monVan) {
		this.monVan = monVan;
	}
	
	public double getMonAnh () {
		return this.monAnh;
	}
	
	public void setMonAnh (double monAnh) {
		this.monAnh = monAnh;
	}
	
	public void getInfo () {
		System.out.println("Tên học sinh: " + name);
		System.out.println("Tên lớp: " + classRoom);
		System.out.println("Tên khối: " + group);
	}
	
	double tinhDiemTB (String tenMon, 
			double diem15Phut, double diem1Tiet, double diemCK) {
		double diemTB = (diem15Phut + diem1Tiet*2 + diemCK*3)/6;
			if(tenMon.equals("1")) {
				this.monVan = diemTB;
			} else if (tenMon.equals("2")) {
				this.monToan = diemTB;
			} else if (tenMon.equals("3")) {
				this.monAnh = diemTB;
			} else {
				System.out.println("tên môn không hợp lệ");
				return -1;
			}
		return diemTB;
	}

	
	
	
	
}
