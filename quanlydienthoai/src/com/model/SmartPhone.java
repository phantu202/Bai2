package com.model;

public class SmartPhone extends Phone {
	private String tenHang;
	private long gia;
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public SmartPhone(String name, int id, String category, String tenHang, long gia) {
		super(name, id, category);
		this.tenHang = tenHang;
		this.gia = gia;
	}
	
	
	public SmartPhone() {
		
	}
	@Override
	public String toString() {
		return "SmartPhone [tenHang=" + tenHang + ", gia=" + gia + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getCategory()=" + getCategory() + "]";
	}
	

}
