package qlsinhviengiangvien.service;

import java.util.ArrayList;

import qlsinhviengiangvien.model.Student;

public class StudentService<listStudents> {
	private static ArrayList<Student> listStudents;

	public void createStudent(Student student) {
		boolean cond = true;
		for (int i = 0; i < listStudents.size(); i++) {
			if (listStudents.get(i).getiDStudent() == student.getiDStudent()) {
				System.out.println("Đã tồn tại ID Sinh viên, thêm không thành công");
				cond = false;
				break;
			}
		}
		if (cond) {
			listStudents.add(student);
			System.out.println("Bạn đã tạo thông tin giáo viên thành công");
		}
	}

	void start() {
		if (listStudents == null) {
			listStudents = new ArrayList<>();
			listStudents.add(new Student(1, "Hùng", "12A"));
			listStudents.add(new Student(2, "Đạt", "12B"));
			listStudents.add(new Student(3, "Quang", "12C"));
		}
	}

	public void readAllStudents() {
		start();
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}

	public void updateStudent(Student student) {
		boolean cond = true;
		for (int i = 0; i < listStudents.size(); i++) {
			if (student.getiDStudent() == listStudents.get(i).getiDStudent()) {
				listStudents.get(i).setClassRoome(student.getClassRoome());
				;
				listStudents.get(i).setStudentName(student.getStudentName());
				cond = false;
				break;
			}
			if (cond) {
				System.out.println("Không tồn tại ID sinh viên");
			}
		}
	}

	public void deleteStudent(int idStudent) {
		boolean cond = true;
		for (int i = 0; i < listStudents.size(); i++) {
			if (idStudent == listStudents.get(i).getiDStudent()) {
				listStudents.remove(i);
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại ID sinh viên");
		}
	}

	public void findStudentID(int id) {
		for (Student student : listStudents) {
			if (student.getiDStudent() == id) {
				System.out.println(student.toString());
			}
		}
	}

	public void findStudentName(String name) {
		for (Student student : listStudents) {
			if (student.getStudentName().equals(name)) {
				System.out.println(student.toString());
			}
		}
	}

}
