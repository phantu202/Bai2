package com.service;

import java.util.ArrayList;

import com.model.SmartPhone;

public class PhoneSevice {
	private static ArrayList<SmartPhone> list;

	public void create(SmartPhone smartPhone) {
		list.add(smartPhone);
		System.out.println("Bạn đã tạo thành công");
	}

	public void update(SmartPhone smartPhone) {
		for (int i = 0; i < list.size(); i++) {
			if (smartPhone.getId() == list.get(i).getId()) {
				list.get(i).setCategory(smartPhone.getCategory());
				list.get(i).setGia(smartPhone.getGia());
				list.get(i).setName(smartPhone.getName());
				list.get(i).setTenHang(smartPhone.getTenHang());
				break;
			}
		}
	}

	void start() {
		if (list == null) {
			list = new ArrayList<>();
			list.add(new SmartPhone("IphoneX", 1, "Cảm ứng", "Apple", 10000));
			list.add(new SmartPhone("J7", 2, "Cảm ứng", "SamSung", 5000));
			list.add(new SmartPhone("Iphone14", 3, "Cảm ứng", "Apple", 20000));
			list.add(new SmartPhone("Iphone12", 4, "Cảm ứng", "Apple", 15000));
			list.add(new SmartPhone("Iphone13", 5, "Cảm ứng", "Apple", 18000));
		}
	}
	public ArrayList<SmartPhone> readAll() {
		start();
		return list;
	}

	public void delete(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.remove(i);
				break;
			}
		}
		
		
	}
}
