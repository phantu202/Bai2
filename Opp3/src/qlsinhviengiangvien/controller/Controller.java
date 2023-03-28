package qlsinhviengiangvien.controller;

import java.util.Scanner;

import qlsinhviengiangvien.model.Student;
import qlsinhviengiangvien.model.Teacher;
import qlsinhviengiangvien.service.StudentService;
import qlsinhviengiangvien.service.TeacherService;

public class Controller {
	TeacherService tService = new TeacherService();
	Scanner scanner = new Scanner(System.in);

	public void createTeacher() {
		System.out.println("Nhập ID giáo viên:");
		int iDTeacher = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên giáo viên: ");
		String teacherName = scanner.nextLine();
		System.out.println("Nhập môn dạy: ");
		String subjectTeach = scanner.nextLine();
		System.out.println("Nhập lớp chủ nghiệm: ");
		String classOwn = scanner.nextLine();
		Teacher teacher = new Teacher(iDTeacher, teacherName, subjectTeach, classOwn);
		tService.createTeacher(teacher);
	}

	public void readAllTeacher() {
		tService.readAllTeacher();
	}

	public void updateTeacher() {
		System.out.println("Nhập ID giáo viên:");
		int iDTeacher = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên giáo viên: ");
		String teacherName = scanner.nextLine();
		System.out.println("Nhập môn dạy: ");
		String subjectTeach = scanner.nextLine();
		System.out.println("Nhập lớp chủ nghiệm: ");
		String classOwn = scanner.nextLine();
		Teacher teacher = new Teacher(iDTeacher, teacherName, subjectTeach, classOwn);
		tService.updateTeacher(teacher);
	}

	public void deleteTeacher() {
		System.out.println("Mời bạn nhập vào ID giáo viên cần xoá: ");
		int idTeacher = Integer.parseInt(scanner.nextLine());
		tService.deleteTeacher(idTeacher);
	}

	StudentService sService = new StudentService();

	public void createStudent() {
		System.out.println("Nhập ID sinh viên:");
		int idStudent = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sinh viên: ");
		String studentName = scanner.nextLine();
		System.out.println("Nhập lớp sinh viên: ");
		String classRoom = scanner.nextLine();

		Student student = new Student(idStudent, studentName, classRoom);
		sService.createStudent(student);
	}

	public void readAllStudent() {
		sService.readAllStudents();
	}

	public void updateStudent() {
		System.out.println("Nhập ID sinh viên:");
		int idStudent = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập tên sinh viên: ");
		String studentName = scanner.nextLine();
		System.out.println("Nhập lớp sinh viên: ");
		String classRoom = scanner.nextLine();

		Student student = new Student(idStudent, studentName, classRoom);
		sService.updateStudent(student);
	}

	public void deleteStudent() {
		System.out.println("Mời bạn nhập vào ID sinh viên cần xoá: ");
		int idStudent = Integer.parseInt(scanner.nextLine());
		sService.deleteStudent(idStudent);
	}
	
	public void findStudentId () {
		System.out.println("Nhập Id");
		int iD = Integer.parseInt(scanner.nextLine());
		sService.findStudentID(iD);
	}
	public void findTeacherID() {
		System.out.println("Nhập Id");
		int iD = Integer.parseInt(scanner.nextLine());
		tService.findTeacherID(iD);
	}
	public void findInfoID() {
		int iD = Integer.parseInt(scanner.nextLine());
		sService.findStudentID(iD);
		tService.findTeacherID(iD);
	}
	public void findStudentName() {
		System.out.println("Nhập tên:");
		String name = scanner.nextLine();
		sService.findStudentName(name);
	}
	
	public void findTeacherName() {
		System.out.println("Nhập tên:");
		String name = scanner.nextLine();
		tService.findTeacherName(name);
	}
	
	public void findInfoName() {
		System.out.println("Nhập tên:");
		String name = scanner.nextLine();
		tService.findTeacherName(name);
		sService.findStudentName(name);
	}
}
