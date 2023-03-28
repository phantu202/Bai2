package service;

import java.util.ArrayList;

import model.Custom;

public class CustomService {
	public static ArrayList<Custom> listCustoms;

	public void createCustom(Custom custom) {
		boolean cond = true;
		for (Custom custom1 : listCustoms) {
			if (custom.getIdCustom() == custom1.getIdCustom()) {
				System.out.println("ID đã tồn tại");
				cond = false;
				break;
			}
		}
		if (cond) {
			listCustoms.add(custom);
		}

	}

	public void start() {
		if (listCustoms == null) {
			listCustoms = new ArrayList<>();
			listCustoms.add(new Custom(1, "Tú", "male", "01243"));
			listCustoms.add(new Custom(2, "Long", "male", "01453"));
			listCustoms.add(new Custom(3, "Trang", "female", "31443"));
			listCustoms.add(new Custom(4, "Ngân", "female", "01543"));
		}
	}

	public void readAllCustom() {
		start();
		for (Custom custom : listCustoms) {
			System.out.println(custom.toString());
		}
	}

	public void updateCustom(Custom custom) {
		boolean cond = true;
		for (Custom custom1 : listCustoms) {
			if (custom.getIdCustom() == custom1.getIdCustom()) {
				custom1.setCustomName(custom.getCustomName());
				custom1.setCustomeSex(custom.getCustomeSex());
				custom1.setCustomeFone(custom.getCustomeFone());
				cond = false;
				break;
			}
			if (cond) {
				System.out.println("Không tồn tại số id");
			}
		}

	}

	public void deleteCustom(int id) {
		for (Custom custom : listCustoms) {
			if (custom.getIdCustom() == id) {
				listCustoms.remove(custom);
			}
		}
	}

	public void findCusom(int idCustom) {
		for (Custom custom : listCustoms) {
			if (custom.getIdCustom() == idCustom) {
				System.out.println(custom.toString());
			}
		}
	}

	public boolean bookRoom(int idCustom) {

		for (Custom custom : listCustoms) {
			if (custom.getIdCustom() == idCustom) {
				System.out.println(custom.toString() + " đặt phòng ");
				return true;
			}
		}
		return false;
	}

}
