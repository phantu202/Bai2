package sinhvien.com.impl;

import java.util.ArrayList;

import sinhvien.com.model.Student;
import sinhvien.com.service.StudentService;

public class StudentImpl implements StudentService {

	private static ArrayList<Student> students = new ArrayList<>();

	// Dữ liệu mẫu
	public static void data() {
		Student student1 = new Student("01", "Tú", "30", "123", "Java1", "K01");
		Student student2 = new Student("02", "Long", "28", "234", "Java2", "K02");
		Student student3 = new Student("03", "Hiếu", "22", "456", "Java3", "K03");
		Student student4 = new Student("04", "Tùng", "29", "567", "Java4", "K04");
		Student student5 = new Student("05", "Tiến", "26", "678", "Java5", "K05");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	}

	@Override
	public void create(Student student) {
		students.add(student);
	}

	@Override
	public void update(Student student) {
		for (int i = 0; i < students.size(); i++) {
			if (student.getMsv().equals(students.get(i).getMsv())) {
				students.add(i, student);
				break;
			}
		}
		System.out.println("Không tồn tại mã sinh viên này");
	}

	@Override
	public void readAll() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	@Override
	public void delete(String msv) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getMsv().equals(msv)) {
				students.remove(i);
				System.out.println("Xoá thành công");
				break;
			} else {
				System.out.println("Không có mã sinh viên cần xoá");
				return;
			}
		}

	}

}
