package qlsinhviengiangvien.model;

public class Teacher {
	private int iDGV;
	private String teacherName;
	private String subjectTeach;
	private String classOwn;

	public int getiDGV() {
		return iDGV;
	}

	public void setiDGV(int iDGV) {
		this.iDGV = iDGV;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubjectTeach() {
		return subjectTeach;
	}

	public void setSubjectTeach(String subjectTeach) {
		this.subjectTeach = subjectTeach;
	}

	public String getClassOwn() {
		return classOwn;
	}

	public void setClassOwn(String classOwn) {
		this.classOwn = classOwn;
	}

	public Teacher(int iDGV, String teacherName, String subjectTeach, String classOwn) {
		this.iDGV = iDGV;
		this.teacherName = teacherName;
		this.subjectTeach = subjectTeach;
		this.classOwn = classOwn;
	}

	public Teacher() {

	}

	@Override
	public String toString() {
		return "Teacher [iDGV=" + iDGV + ", teacherName=" + teacherName + ", subjectTeach=" + subjectTeach
				+ ", classOwn=" + classOwn + "]";
	}
	
}
