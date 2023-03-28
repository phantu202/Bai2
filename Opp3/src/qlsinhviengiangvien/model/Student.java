package qlsinhviengiangvien.model;

public class Student {
	private int iDStudent;
	private String studentName;
	private String classRoome;

	public int getiDStudent() {
		return iDStudent;
	}

	public void setiDStudent(int iDStudent) {
		this.iDStudent = iDStudent;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassRoome() {
		return classRoome;
	}

	public void setClassRoome(String classRoome) {
		this.classRoome = classRoome;
	}

	public Student(int iDStudent, String studentName, String classRoome) {
		this.iDStudent = iDStudent;
		this.studentName = studentName;
		this.classRoome = classRoome;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [iDStudent=" + iDStudent + ", studentName=" + studentName + ", classRoome=" + classRoome + "]";
	}
	
}
