package com;

public class Student {
	private String fullName;
	private String classRoom;
	private String group;
	private double literatureScore;
	private double mathScore;
	private double englishScore;
	
	public Student() {
		
	}

	public Student(String fullName, String classRoom, String group) {
		this.fullName = fullName;
		this.classRoom = classRoom;
		this.group = group;
	}

	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getLiteratureScore() {
		return literatureScore;
	}

	public void setLiteratureScore(double literatureScore) {
		this.literatureScore = literatureScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public String toString() {
		return "Student [fullName = " + fullName + ", classRoom = " + classRoom + ", group = " + group +  "]";
	}
	
	public void getInfo() {
		System.out.println(toString());
	}
	
	
	public double averageScore (double scoreFactor1, double scoreFactor2, double scoreFactor3) {
		double averageScore = (scoreFactor1 + scoreFactor2*2 + scoreFactor3 * 3)/6;
		return averageScore;
	}
	
	public void enterSubjectScore (int subject, double scoreFactor1, double scoreFactor2, double scoreFactor3) {
		double averageScore = averageScore(scoreFactor1, scoreFactor2, scoreFactor3);
		switch (subject) {
		case 1: 
			this.literatureScore = averageScore;
			break;
		case 2:
			this.mathScore  = averageScore;
			break;
		case 3: 
			this.englishScore = averageScore;
			break;
		default:
			System.out.println("Môn không hợp lệ");
			return;
		}
	}
	
	public double finalAverageScore (double literatureScore, double mathScore, double englishScore) {
		double finalAverageScore = (literatureScore + mathScore + englishScore)/3;
		return finalAverageScore;
	}
	
	public String rating (double finalAverageScore) {
		String rating;
		if (finalAverageScore < 5) {
			rating = "Trung bình";
		} else if (finalAverageScore < 8) {
			rating = "Khá";
		} else {
			rating = "Giỏi";
		}
		return rating;
	}
	
	public void finalStudentSummaries() {
		double finalAverageScore = finalAverageScore(literatureScore, mathScore, englishScore);
		String rating = rating(finalAverageScore);
		System.out.println("Sinh viên: " + fullName + ", lớp: " + classRoom + ", khối: " + group);
		System.out.println("Điểm trung bình môn văn: " + literatureScore);
		System.out.println("Điểm trung bình môn toán: " + mathScore);
		System.out.println("Điểm trung bình môn anh: " + englishScore);
		System.out.println("Điểm trung bình cả năm: " + finalAverageScore);
		System.out.println("Xếp hạng: " + rating);
	}
	
	
	
}
