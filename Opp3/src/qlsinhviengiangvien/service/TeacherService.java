package qlsinhviengiangvien.service;

import java.util.ArrayList;

import qlsinhviengiangvien.model.Teacher;

public class TeacherService {

	private static ArrayList<Teacher> listTeachers;

	public void createTeacher(Teacher teacher) {
		boolean cond = true;
		for (int i = 0; i < listTeachers.size(); i++) {
			if (listTeachers.get(i).getiDGV() == teacher.getiDGV()) {
				System.out.println("Đã tồn tại ID giáo viên, thêm không thành công");
				cond = false;
				break;
			}
		}
		if (cond) {
			listTeachers.add(teacher);
			System.out.println("Bạn đã tạo thông tin giáo viên thành công");
		}
	}

	void start() {
		if (listTeachers == null) {
			listTeachers = new ArrayList<>();
			listTeachers.add(new Teacher(1, "Hùng", "Toán", "12A"));
			listTeachers.add(new Teacher(2, "Đạt", "Lý", "12B"));
			listTeachers.add(new Teacher(3, "Quang", "Hoá", "12C"));
		}
	}

	public void readAllTeacher() {
		start();
		for (Teacher teacher : listTeachers) {
			System.out.println(teacher.toString());
		}
	}

	public void updateTeacher(Teacher teacher) {
		boolean cond = true;
		for (int i = 0; i < listTeachers.size(); i++) {
			if (teacher.getiDGV() == listTeachers.get(i).getiDGV()) {
				listTeachers.get(i).setClassOwn(teacher.getClassOwn());
				listTeachers.get(i).setSubjectTeach(teacher.getSubjectTeach());
				listTeachers.get(i).setTeacherName(teacher.getTeacherName());
				cond = false;
				break;
			}
			if (cond) {
				System.out.println("Không tồn tại ID giáo viên");
			}
		}
	}

	public void deleteTeacher(int idTeacher) {
		boolean cond = true;
		for (int i = 0; i < listTeachers.size(); i++) {
			if (idTeacher == listTeachers.get(i).getiDGV()) {
				listTeachers.remove(i);
				cond = false;
				break;
			}
		}
		if (cond) {
			System.out.println("Không tồn tại ID giáo viên");
		}
	}

	public void findTeacherID(int id) {
		for (Teacher teacher : listTeachers) {
			if (teacher.getiDGV() == id) {
				System.out.println(teacher.toString());

			}
		}
	}

	public void findTeacherName(String name) {
		for (Teacher teacher : listTeachers) {
			if (name.equals(teacher.getTeacherName())) {
				System.out.println(teacher.toString());
			}
		}
	}

}
